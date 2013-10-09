package coursera

import math.abs

/**
 * @author Jan Paw
 *         Date: 10/9/13
 */
object Lecture2_3 {
  val tolerance = Double.MinValue

  def isCloseEnough(x: Double, y: Double) =
    abs((x - y) / x) / x < tolerance

  def fixedPoint(f: Double => Double)(firstGuess: Double) = {
    def iterate(guess: Double): Double = {
      val next = f(guess)
      if (isCloseEnough(guess, next)) next
      else iterate(next)
    }
    iterate(firstGuess)
  }

  def averageDamp(f: Double => Double)(x: Double) = (x + f(x)) / 2

  def sqrt(x: Double) = fixedPoint(averageDamp(y => x / y))(1.0)

  def main(args: Array[String]) {
    println(fixedPoint(x => 1 + x / 2)(1))
    println(sqrt(2))
  }
}
