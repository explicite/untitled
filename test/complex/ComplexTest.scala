package complex

import org.scalatest.FunSuite

/**
 * @author Jan Paw
 *         Date: 10/14/13
 */
class ComplexTest extends FunSuite {
  val c1 = new Complex(1, 2);
  val c2 = new Complex(2, 1);

  test("Sum complex number") {
    assert(c1 - c2 == new Complex(-1, 1))
  }

  test("Subtraction complex") {
    assert(c1 + c2 == new Complex(3, 3))
  }

  test("Multiplication complex") {
    assert(c1 * c2 == new Complex(0, 3))
  }

  test("Division complex") {
    assert(c1 / c2 == new Complex(0, (3 / 5)))
  }
}
