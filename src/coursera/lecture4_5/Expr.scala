package coursera.lecture4_5

/**
 * @author Jan Paw
 *         Date: 10/18/13
 */
trait Expr {
  def eval: Int = this match {
    case Number(n) => n
    case Sum(e1, e2) => e1.eval + e2.eval
    case Prod(e1, e2) => e1.eval * e2.eval
  }

  def show: String = this match {
    case Number(n) => n.toString
    case Sum(l, r) => l.show + " + " + r.show
    case Prod(l, r) => l.show + " * " + r.show
    case Var(s) => s
  }
}
