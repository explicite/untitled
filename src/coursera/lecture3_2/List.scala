package coursera.lecture3_2

/**
 * @author Jan Paw
 *         Date: 10/16/13
 */
trait List[+T] {
  def isEmpty: Boolean

  def head: T

  def tail: List[T]

  def apply(n: Int): T =
    if (isEmpty) throw new IndexOutOfBoundsException()
    else if (n == 0) head
    else tail(n - 1)
}
