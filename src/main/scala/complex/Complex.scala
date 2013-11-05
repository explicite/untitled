package complex

import scala.math.{pow, signum}

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

  def + (that: Complex) = new Complex(this.re + that.re, this.im + that.im)

  def - (that: Complex) = new Complex(this.re - that.re, this.im - that.im)

  def * (that: Complex) = new Complex(
    (this.re * that.re) - (this.im * that.im),
    (this.im * that.re) - (this.re * that.im)
  )

  def / (that: Complex) = new Complex(
    ((this.re * that.re) + (this.im * that.im)) / ((that.re * that.re) + (that.im * that.im)),
    ((this.im * that.re) - (this.re * that.im)) / ((that.re * that.re) + (that.im * that.im))
  )

  def gamma() = {
    scala.math.sqrt((re + scala.math.sqrt(pow(re, 2) + pow(im, 2))) / 2)
  }

  def delta() = {
    signum(im) * scala.math.sqrt((-re + scala.math.sqrt(pow(re, 2) + pow(im, 2))) / 2)
  }

  def sqrt() = {
    new Complex(gamma(), delta())
  }

  def inverse() = {
    this.conjugate() / (this * this.conjugate())
  }

  def conjugate() = {
    new Complex(re, -im)
  }

  def == (that: Complex) = this.re == that.re && this.im == that.im

  override def toString =
    s"$re${
      if (im < 0) "" else "+"
    }${im}i"
}
