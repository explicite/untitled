package coursera

/**
 * @author Jan Paw
 *         Date: 10/9/13
 */
package object lecture2_5 {
  def main(args: Array[String]) {
    val x = new Rational(1, 3)
    val y = new Rational(5, 7)
    val z = new Rational(3, 2)

    println(x - y - z)
  }
}
