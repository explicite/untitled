package book

import book.concurrent.ThreadStrategy

/**
 * @author Jan Paw
 *         Date: 03.10.13
 */
object MatrixUtils {
  def multiply(a: Matrix, b: Matrix)(implicit threading: ThreadStrategy): Matrix = {
    assert(a.colRank == b.rowRank)
    val buffer = new Array[Array[Double]](a.rowRank)
    for (i <- 0 until a.rowRank) {
      buffer(i) = new Array[Double](b.colRank)
    }

    def computeValue(row: Int, col: Int): Unit = {
      val pairwiseElements =
        a.row(row).zip(b.col(col))
      val products =
        for ((x, y) <- pairwiseElements)
        yield x * y

      val result = products.sum
      buffer(row)(col) = result
    }

    val computations = for {
      i <- 0 until a.rowRank
      j <- 0 until b.colRank
    } yield threading.execute { () => computeValue(i, j) }

    computations.foreach(_())
    new Matrix(buffer)
  }
}
