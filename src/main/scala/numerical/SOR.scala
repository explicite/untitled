package numerical

import scala.math.{pow, sqrt}

/**
 * @author Jan Paw
 *         Date: 10/6/13
 */
class SOR(m: Array[Array[Double]], v: Array[Double], o: Double) {
  def matrix = m

  def vector = v

  def omega = o

  def solve = ???

  def subtractVectors(first: Array[Double], second: Array[Double]) {
    val result = new Array[Double](first.length)
    result.indices.foreach(i => result(i) = first(i) - second(i))
  }

  def vectorNorm(vector: Array[Double]) {
    sqrt(vector.view.map(pow(_, 2d)).sum)
  }
}
