package coursera.lecture3_1

/**
 * @author Jan Paw
 *         Date: 10/15/13
 */
object Empty extends Set {
  def incl(x: Nothing): Set = new NonEmpty(x, Empty, Empty)

  def contains(x: Nothing): Boolean = false

  def union(other: Set[Nothing]): Set[Nothing] = other

  override def toString: String = "."

}
