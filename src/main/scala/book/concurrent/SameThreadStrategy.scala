package book.concurrent

/**
 * @author Jan Paw
 *         Date: 04.10.13
 */
object SameThreadStrategy extends ThreadStrategy {
  def execute[A](func: () => A): () => A = func
}
