package traits

/**
 * @author Jan Paw
 *         Date: 27.09.13
 */
trait Ord {
  def <(that: Any): Boolean

  def <=(that: Any): Boolean = (this < that) || (this == that)

  def >(that: Any): Boolean = !(this <= that)

  def >=(that: Any): Boolean = !(this < that)
}
