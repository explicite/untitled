package agh

import scala.annotation.tailrec
import scala.language.reflectiveCalls

/**
 * @author Jan Paw
 *         Date: 11/9/13
 */
object Opt {

  def goldNumber(f: Double => Double, lim: (Double, Double), ε: Double, N: Int): Double = {

    val a: Double = lim._1
    val b: Double = lim._2

    var i: Int = 0
    val ϕ: Double = 0.6180339887
    var ai: Double = a
    var bi: Double = b
    def c: Double = bi - (ϕ * (bi - ai))
    def d: Double = ai + (ϕ * (bi - ai))
    var ci: Double = c
    var di: Double = d

    repeat {
      if (f(ci) < f(di)) {
        bi = di
        di = ci
        ci = c
      } else {
        ai = ci
        ci = di
        di = d
      }
      i = i + 1
      if (i > N)
        throw new Error("cannot optimize in N steps")

    } until (bi - ai < ε)

    (ai + bi) / 2

  }

  def lagrange(f: Double => Double, lim: (Double, Double), ε: Double, γ: Double, N: Double): (Double, Double) = {

    val a: Double = lim._1
    val b: Double = lim._2

    var ai = a
    var bi = b
    var ci = (a + b) / 2

    def d =
      0.5 * (f(ai) * ((ci * ci) - (bi * bi)) + f(ci) * ((bi * bi) - (ai * ai)) + f(bi) * ((ai * ai) - (ci * ci))) / ((f(ai) * (ci - bi)) + (f(ci) * (bi - ai)) + (f(bi) * (ai - ci)))

    var di = d
    var i = 0

    repeat {

      di = d

      if (ai < di && di < ci) {
        if (f(di) < f(ci)) {
          bi = ci
          ci = di
        } else
          ai = di
      } else if (ci < d && d < bi) {
        if (f(di) < f(ci)) {
          ai = ci
          ci = di
        } else
          bi = di
      } else
        throw new Error("algorithm converges!")

      i = i + 1
      if (i > N)
        throw new Error("cannot reach ε!")

    } until (bi - ai < ε || Math.abs(d - di) <= γ)

    val x = d
    (x, f(x))

  }

  def fibonacci(f: Double => Double, lim: (Double, Double), ε: Double): (Double, Double) = {

    val a: Double = lim._1
    val b: Double = lim._2

    val k = φ((b - a) / ε)
    def β(k: Int): Double = φk(k - 1).toDouble / φk(k).toDouble
    var ai: Double = a
    var bi: Double = b
    var ci: Double = bi - β(k) * (bi - ai)
    var di: Double = ai + bi - ci

    for (i <- 0 to k - 3) {
      if (f(ci) < f(di))
        bi = di
      else
        ai = ci

      ci = bi - β(k - i) * (bi - ai)
      di = ai + bi - ci
    }

    val x = (ai + bi) / 2
    (x, f(x))
  }

  lazy val φk: Stream[Int] = 0 #::
    1 #::
    φk.zip(φk.tail).map {
      k => k._1 + k._2
    }

  @tailrec def findFrom(d: Double, k: Int): Int =
    if (φk(k) < d) findFrom(d, k + 1) else k

  def φ(d: Double): Int = findFrom(d, 0)


  def repeat(body: => Unit) = new {
    def until(condition: => Boolean) = {
      do {
        body
      } while (!condition)
    }
  }
}
