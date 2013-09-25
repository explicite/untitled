/**
 * @author Jan Paw
 *         Date: 9/17/13
 * @param real
 * @param imaginary
 *
 */
class Complex(real: Double, imaginary: Double) {
  def re = real

  def im = imaginary

  def +(that: Complex) = new Complex(this.re + that.re, this.im + that.im)

  def -(that: Complex) = new Complex(this.re - that.re, this.im - that.im)

  override def toString() =
    "" + re + (if (im < 0) "" else "+") + im + "i"
}


