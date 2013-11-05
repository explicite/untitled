import complex.ComplexImplicit._

/**
 * @author Jan Paw
 *         Date: 27.09.13
 */
package object complex {
  def main(args: Array[String]) {
    val c = new Complex(1.0, 1.0)
    val d: Complex = 1.0
    val i: Complex = 1
    println(c + d + i)
  }
}
