package coursera.reactive.recap

/**
 * @author Jan Paw
 *         Date: 11/4/13
 */
trait Tree

case class Inner(left: Tree, right: Tree) extends Tree

case class Leaf(x: Int) extends Tree
