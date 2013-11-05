package coursera.lecture3_2

/**
 * @author Jan Paw
 *         Date: 10/16/13
 */
object Nil extends List[Nothing] {
  def isEmpty: Boolean = true

  def head: Nothing = throw new NoSuchElementException("Nil.head")

  def tail: Nothing = throw new NoSuchElementException("Nil.tail")
}
