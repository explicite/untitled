package coursera

/**
 * @author Jan Paw
 *         Date: 9/26/13
 */
object Lecture1_5 {
  //abs
  def abs(x: Double) = if (x < 0) -x else x

  //sqrt
  def sqrt(x: Double) {
    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))

    def isGoodEnough(guess: Double) =
      abs(guess * guess - x) / x < 0.001

    def improve(guess: Double) =
      (guess + x / guess) / 2

    sqrtIter(1.0)
  }

  /*println(sqrt(2))
  println(sqrt(1e-6))
  println(sqrt(1e60))*/
}
