package coursera.lecture3_1

/**
 * @author Jan Paw
 *         Date: 10/15/13
 */
class Empty[T <: Ordered[T]] extends Set[T] {
  def incl(x: T): Set[T] = new Tree(x, new Empty(), new Empty())

  def contains(x: T): Boolean = false

  def union(other: Set[T]): Set[T] = other

  override def toString: String = "."
}
