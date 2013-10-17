package coursera.lecture4_2

/**
 * @author Jan Paw
 *         Date: 10/17/13
 */
class Succ(n: Nat) extends Nat {
  def isZero: Boolean = false

  def predecessor: Nat = n

  def +(that: Nat): Nat = new Succ(n + that)

  def -(that: Nat): Nat = if (that.isZero) this else n - that.predecessor
}
