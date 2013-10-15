package coursera.lecture3_1

/**
 * @author Jan Paw
 *         Date: 10/15/13
 */
object Empty extends IntSet {
  def incl(x: Int): IntSet = new NonEmpty(x, Empty, Empty)

  def contains(x: Int): Boolean = false

  override def toString: String = "."

  def union(other: IntSet): IntSet = other
}
