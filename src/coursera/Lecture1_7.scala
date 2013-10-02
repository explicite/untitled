package coursera

import scala.annotation.tailrec

/**
 * @author Jan Paw
 *         Date: 10/2/13
 */
object Lecture1_7 {
  @tailrec
  def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)

  def factorial(n: Int): Int = {
    @tailrec
    def loop(acc: Int, n: Int): Int =
      if (n == 0) acc
      else loop(acc * n, n - 1)
    loop(1, n)
  }
}
