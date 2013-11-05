package numerical

/**
 * @author Jan Paw
 *         Date: 10/5/13
 */
object Karacuba {
  implicit def intToBigInt(int: Int) = BigInt(int)

  def multiple(x: BigInt, y: BigInt): BigInt = {

    val m: BigInt = x.max(y)

    if (m <= 10000) return x * y

    val n: Int = ((m + 1) / 2).intValue()

    val b = x >> n
    val a = x - (b << n)
    val d = y >> n
    val c = y - (d << n)

    val ac = multiple(a, c)
    val bd = multiple(b, d)
    val abcd = multiple(a + b, c + d)

    ac + ((abcd - ac - bd) << n) + (bd << (2 * n))
  }
}
