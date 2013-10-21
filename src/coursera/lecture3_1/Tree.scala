package coursera.lecture3_1

import scala.math.Ordering

/**
 * @param elem
 * @param left
 * @param right
 * @tparam T
 * @author Jan Paw
 *         Date: 10/15/13
 */
class Tree[T](elem: T, left: Set[T], right: Set[T])(implicit ord: Ordering[T]) extends Set[T] {
  def incl(x: T): Set[T] =
    if (ord.lt(x, elem)) new Tree(elem, left incl x, right)
    else if (ord.gt(x, elem)) new Tree(elem, left, right incl x)
    else this

  def contains(x: T): Boolean =
    if (ord.lt(x, elem)) left contains x
    else if (ord.gt(x, elem)) right contains x
    else true

  def union(other: Set[T]): Set[T] =
    ((left union right) union other) incl elem

  override def toString: String = s"{$left$elem${right}}"
}

