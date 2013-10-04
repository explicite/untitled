package book.concurrent

/**
 * @author Jan Paw
 *         Date: 03.10.13
 */
trait ThreadStrategy {
  def execute[A](func: () => A): () => A
}
