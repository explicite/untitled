package coursera.lecture3_1

/**
 * @author Jan Paw
 *         Date: 10/15/13
 */
trait Set[T <: Ordered[T]] {

  def incl(x: T): Set[T]

  def contains(x: T): Boolean

  def union(other: Set[T]): Set[T]
}
