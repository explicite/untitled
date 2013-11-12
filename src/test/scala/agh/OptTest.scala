package agh

import scala.math.{sin, Pi}
import org.scalatest.FunSuite

/**
 * @author Jan Paw
 *         Date: 11/10/13
 */
class OptTest extends FunSuite {
  def f(x: Double) = (6 * x - 2) * (6 * x - 2) * sin(12 * x - 4)

  def trn(d: Double, p: Double) = d - (d % p)

  test("Gold Number: min x + 1/x^2 over [1,2] with ε=0.00001") {
    def f(x: Double): Double = x + (1 / (x * x))
    val optMin = Opt.goldNumber(f, (1, 2), 0.00001, 100)
    assert(optMin == 1.2599201948060852)
  }

  test("Lagrange: min x + 1/x^2 over [1,2] with ε=0.01 and γ=0.0001") {
    def f(x: Double): Double = x + (1 / (x * x))
    val optMin = Opt.lagrange(f, (1, 2), 0.01, 0.0001, 100)
    assert(trn(optMin._1, 0.0001) == 1.2599)
  }

  test("Fibonacci: min (6x-2)^2sin(12x-4) over [0,1]") {
    val optMin = Opt.fibonacci(f, (0, 1), 0.001)
    assert(optMin._1 == 0.7573530363169201 && optMin._2 == -6.020734247281986)
  }

  test("Fibonacci: min sin(x) over [π,2π]") {
    val optMin = Opt.fibonacci(sin, (Pi, 2 * Pi), 0.00001)
    assert(trn(optMin._1, 0.0001) == trn(3 * Pi / 2, 0.0001))
  }

}
