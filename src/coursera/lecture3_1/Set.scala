package coursera.lecture3_1

/**
 * @author Jan Paw
 *         Date: 10/15/13
 */
abstract class Set[T] {
  def incl(x: T): Set

  def contains(x: T): Boolean

  def union(other: Set[T]): Set[T]
}
