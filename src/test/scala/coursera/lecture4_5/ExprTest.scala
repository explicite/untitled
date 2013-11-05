package coursera.lecture4_5

import org.scalatest.FunSuite

/**
 * @author Jan Paw
 *         Date: 10/18/13
 */
class ExprTest extends FunSuite {
  test("Expr test") {
    val e1 = Sum(Prod(Number(2), Var("x")), Var("y"))
    assert(e1.show == "2 * x + y")

    val e2 = Prod(Sum(Number(2), Var("x")), Var("y"))
    assert(e2.show == "(2 + x) * y")
  }
}
