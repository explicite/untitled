package coursera.lecture2_5

/**
 * @author Jan Paw
 *         Date: 10/9/13
 */
object Rational {
  implicit def intToRational(x: Int) = new Rational(x, 1)
}

class Rational(x: Int, y: Int) {
  def numer = x

  def denom = y

  def add(that: Rational) =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )

  def -(that: Rational) = add(that.neg)

  def *(that: Rational) = new Rational(
    numer * that.numer,
    denom * that.denom
  )

  def /(that: Rational) = this * that.inverse

  def inverse() = new Rational(
    denom, numer
  )

  def ^(n: Int) = {}

  def neg: Rational = new Rational(-numer, denom)

  override def toString = s"${numer}/${denom}"
}
