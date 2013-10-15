package coursera.lecture3_1

/**
 * @author Jan Paw
 *         Date: 10/15/13
 */
abstract class IntSet {
  def incl(x: Int): IntSet

  def contains(x: Int): Boolean

  def union(other: IntSet): IntSet
}
