package coursera.lecture2_5
import scala.language.implicitConversions

/**
 * @author Jan Paw
 *         Date: 10/9/13
 */
object Rational {
  implicit def intToRational(x: Int) = new Rational(x, 1)
}

/**
 * @author Jan Paw
 *         Date: 10/9/13
 *
 * @param x
 * @param y
 */
class Rational(x: Int, y: Int) {
  require(y != 0, "denominator must be nonzero")

  def this(x: Int) = this(x, 1)

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  val numer = x / gcd(x, y)

  val denom = y / gcd(x, y)

  def +(that: Rational) =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )

  def - (that: Rational) = this + -that

  def == (that: Rational) = numer == that.numer && denom == that.denom

  def != (that: Rational) = !(this == that)

  def < (that: Rational) = numer * that.denom < that.numer * denom

  def <= (that: Rational) = this < that || this == that

  def > (that: Rational) = !(this <= that) && this != that

  def >= (that: Rational) = this > that || this == that

  def * (that: Rational) = new Rational(
    numer * that.numer,
    denom * that.denom
  )

  def / (that: Rational) = this * that.inverse

  def max(that: Rational) = if (this < that) that else this

  def inverse() = new Rational(
    denom, numer
  )

  def unary_- : Rational = new Rational(-numer, denom)

  override def toString = s"${numer}/${denom}"
}
