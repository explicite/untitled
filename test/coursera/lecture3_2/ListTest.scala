package coursera.lecture3_2

import org.scalatest.FunSuite

/**
 * @author Jan Paw
 *         Date: 10/16/13
 */
class ListTest extends FunSuite {
  val list: List[Int] = new Cons(100, new Cons(-1, new Cons(5, Nil)))

  test("Get List index") {
    assert(list(2) == 5)
  }
}
