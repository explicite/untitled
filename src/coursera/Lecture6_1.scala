package coursera

import scala.language.postfixOps

/**
 * @author Jan Paw
 *         Date: 10/30/13
 */
object Lecture6_1 {
  def main(args: Array[String]) {
    val xs = Array(1, 2, 3, 44)
    xs map (x => x * 2)

    val ss = "Hello World"
    ss filter (c => c.isUpper)

    //Range
    val r: Range = 1 until 5 //1,2,3,4
    val s: Range = 1 to 5 //1,2,3,4,5
    1 to 10 by 3 //1,4,7,10
    6 to 1 by -1 //6,4,2

    //Seq operations
    xs exists (p => p > 0) //true if one or more of p
    xs forall (p => p > 0) //true if all of p

    val ys = Array(4, 5, 6, 77)
    val zs = xs zip ys
    val uz = zs unzip
    val fm = xs.flatMap(x => List(1, x))
    val sum = xs.sum
    val product = xs.product
    val max = xs.max
    val min = xs.min

    def scalarProduct(xs: Vector[Double], ys: Vector[Double]): Double =
      (xs zip ys).map(xy => xy._1 * xy._2).sum

    def scalarProductPM(xs: Vector[Double], ys: Vector[Double]): Double =
      (xs zip ys).map {
        case (x, y) => x * y
      }.sum

    def isPrime(n: Int): Boolean = (2 until n).forall(d => n % d != 0)
  }
}
