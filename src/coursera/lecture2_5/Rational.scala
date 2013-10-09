package coursera.lecture2_5

/**
 * @author Jan Paw
 *         Date: 10/9/13
 */
class Rational(x: Int, y: Int) {
  def numer = x

  def denom = y

  def add(that: Rational) =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )

  def -(that: Rational) = add(that.neg)

  def neg: Rational = new Rational(-numer, denom)

  override def toString = s"${numer}/${denom}"
}
