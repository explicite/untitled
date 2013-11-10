package agh

import scala.annotation.tailrec

/**
 * @author Jan Paw
 *         Date: 11/9/13
 */
object Opt {

  def fibonacci(f: Double => Double, a: Double, b: Double, ε: Double): (Double, Double) = {
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
}
