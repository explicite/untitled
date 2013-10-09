package numerical

import scala.util.Random

/**
 * @author http://rosettacode.org/wiki/Monte_Carlo_methods#Scala
 */
object MonteCarlo {
  val generator = new Random(System.currentTimeMillis())

  def nextThrow: Double = (generator.nextDouble * 2.0) - 1.0

  def insideCircle(pt: (Double, Double)): Boolean = pt match {
    case (x, y) => (x * x) + (y * y) <= 1.0
  }

  def simulate(times: Int): Double = {
    val inside = Iterator.tabulate(times)(_ => (nextThrow, nextThrow)) count insideCircle
    inside.toDouble / times.toDouble * 4.0
  }
}
