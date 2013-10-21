package coursera.lecture3_1

import org.scalatest.FunSuite

/**
 * @author Jan Paw
 *         Date: 10/16/13
 */
class TreeTest extends FunSuite {
  val t: Tree[Int] = new Tree(1, new Empty(), new Empty());
  test("Tree test") {
    assert(t.toString == "{.1.}")
  }
}
