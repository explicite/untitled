package book.concurrent

import java.util.concurrent.{Callable, Executors}

/**
 * @author Jan Paw
 *         Date: 04.10.13
 */
object ThreadPoolStrategy extends ThreadStrategy {
  val pool = Executors.newFixedThreadPool(
    java.lang.Runtime.getRuntime.availableProcessors()
  )

  def execute[A](func: () => A): () => A = {
    val future = pool.submit(new Callable[A] {
      def call(): A = {
        Console.println("Thread number: %s".format(Thread.currentThread().getName))
        func()
      }
    })
    () => future.get()
  }
}
