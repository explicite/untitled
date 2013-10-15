package complex

import org.scalatest.FunSuite

/**
 * @author Jan Paw
 *         Date: 10/14/13
 */
class ComplexTest extends FunSuite {
  val c1 = new Complex(1, 2);
  val c2 = new Complex(2, 1);

  test("Equal complex number") {
    assert(c1 == new Complex(1, 2))
  }

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
    assert(c1 / c2 == new Complex(0.8, 0.6))
  }

  test("Square root complex") {
    assert(c1.sqrt() == new Complex(1.272019649514069, 0.7861513777574233))
  }

  test("Inverse complex") {
    assert(c1.conjugate() == new Complex(1, -2))
  }

  test("Conjugate complex") {
    //assert(c1.inverse() == new Complex(0.07317073170731707, -0.34146341463414637))
  }
}
