package agh

import scala.math.sin
import org.scalatest.FunSuite

/**
 * @author Jan Paw
 *         Date: 11/10/13
 */
class OptTest extends FunSuite {
  def f(x: Double) = (6 * x - 2) * (6 * x - 2) * sin(12 * x - 4)

  test("min (6x-2)^2sin(12x-4) over [0,1]") {
    val optMin = Opt.fibonacci(f, 0, 1, 0.001)
    assert(optMin._1 == 0.7573530363169201 && optMin._2 == -6.020734247281986)
  }

}
