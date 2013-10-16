package coursera.lecture2_5

import org.scalatest.FunSuite

/**
 * @author Jan Paw
 *         Date: 10/10/13
 */
class RationalTest extends FunSuite {
  val x = new Rational(1, 2)
  val y = new Rational(2, 1)

  test("Rational less") {
    assert(x < y)
  }

  test("Rational greater") {
    assert(y > x)
  }

  test("Rational equal") {
    assert(x == new Rational(1, 2))
  }

  test("Rational less or equal") {
    assert(x <= y)
    assert(x <= new Rational(1, 2))
  }

  test("Rational grater or equal") {
    assert(y >= x)
    assert(new Rational(1, 2) >= x)
  }

  test("Rational sum") {
    assert(x + y == new Rational(5, 2))
  }

  test("Rational subtraction") {
    assert(x - y == new Rational(-3, 2))
  }

  test("Rational multiplication") {
    assert(x * y == new Rational(2, 2))
  }

  test("Rational max") {
    assert(x.max(y) == y)
  }

  test("Rational neg") {
    assert(-x == new Rational(-1, 2))
  }

  test("Rational inverse") {
    assert(x.inverse() == new Rational(2, 1))
  }
}
