import book.concurrent.ThreadPoolStrategy

/**
 * @author Jan Paw
 *         Date: 04.10.13
 */
package object book {
  def main(args: Array[String]) {
    //implicit val ts = SameThreadStrategy
    implicit val ts = ThreadPoolStrategy
    val x = new Matrix(Array(Array(1.0, 2.0, 3.0), Array(4.0, 5.0, 6.0)))
    val y = new Matrix(Array(Array(1.0), Array(1.0), Array(1.0)))
    println(x)
    println(y)
    println(MatrixUtils.multiply(x, y))
  }
}
