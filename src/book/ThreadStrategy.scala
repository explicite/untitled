package book

/**
 * @author Jan Paw
 *         Date: 03.10.13
 */
trait ThreadStrategy {
  def execute[A](func: Function0[A]): Function0[A]
}
