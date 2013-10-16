package coursera.lecture3_2

/**
 * @author Jan Paw
 *         Date: 10/16/13
 */
class Cons[T](val head: T, val tail: List[T]) extends List[T] {
  def isEmpty: Boolean = false
}
