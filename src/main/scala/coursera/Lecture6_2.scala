package coursera

/**
 * @author Jan Paw
 *         Date: 10/30/13
 */
object Lecture6_2 {

  case class Person(name: String, age: Int)

  def isPrime(n: Int) = (2 until n) forall (n % _ != 0)

  def main(args: Array[String]) {
    val n = 7
    (1 until n) flatMap (i =>
      (1 until i) map (j => (i, j))) filter (pair =>
      isPrime(pair._1 + pair._2))

    for {
      i <- 1 until n
      j <- 1 until i
      if isPrime(i + j)
    } yield (i, j)

    val persons: Array[Person] = Array[Person](Person("A", 10), Person("B", 20))

    val old = for (p <- persons if p.age > 20) yield p.name

    def scalarProduct(xs: List[Double], ys: List[Double]): Double =
      (for ((x, y) <- xs zip ys) yield x * y).sum
  }
}
