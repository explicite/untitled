package coursera

/**
 * @author Jan Paw
 *         Date: 9/24/13
 */
object Lecture1_2 {
  def square(x: Double) = x * x

  def sumOfSquare(x: Double, y: Double) = square(x) + square(y)

  def main(args: Array[String]) {
    square(2)
    square(5 + 4)
    square(square(4))
    sumOfSquare(3, 2 + 2)

  }
}
