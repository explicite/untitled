package coursera.lecture3_1

/**
 * @param elem
 * @param left
 * @param right
 * @author Jan Paw
 *         Date: 10/15/13
 */
class NonEmpty[T](elem: T, left: Set[T], right: Set[T]) extends Set[T] {
  def incl(x: T): Set =
    if (x < elem) new NonEmpty(elem, left incl x, right)
    else if (x > elem) new NonEmpty(elem, left, right incl x)
    else this

  def contains(x: T): Boolean =
    if (x < elem) left contains x
    else if (x > elem) right contains x
    else true

  def union(other: Set[T]): Set[T] =
    ((left union right) union other) incl elem

  override def toString: String = s"{$left$elem${right}}"
}
