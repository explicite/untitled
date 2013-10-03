package book

/**
 * @author Jan Paw
 *         Date: 03.10.13
 */
object MatrixUtils {
  def multiply(a: Matrix, b: Matrix)(implicit threading: ThreadStrategy): Matrix = {
    assert(a.colRank == b.colRank)
    val buffer = new Array[Array[Double]](a.rowRank)
    for (i <- 0 until a.rowRank) {
      buffer(i) = new Array[Double](b.colRank)
    }

  }
}
