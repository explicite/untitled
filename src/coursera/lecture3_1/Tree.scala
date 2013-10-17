package coursera.lecture3_1

/**
 * @param elem
 * @param left
 * @param right
 * @tparam T
 * @author Jan Paw
 *         Date: 10/15/13
 */
class Tree[T <: Ordered[T]](elem: T, left: Set[T], right: Set[T]) extends Set[T] {
  def incl(x: T): Set[T] =
    if (x < elem) new Tree(elem, left incl x, right)
    else if (x > elem) new Tree(elem, left, right incl x)
    else this

  def contains(x: T): Boolean =
    if (x < elem) left contains x
    else if (x > elem) right contains x
    else true

  def union(other: Set[T]): Set[T] =
    ((left union right) union other) incl elem

  override def toString: String = s"{$left$elem${right}}"

  def apply(): Tree[T]#S = ???
}
