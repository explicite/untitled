package coursera.lecture4_2

/**
 * @author Jan Paw
 *         Date: 10/17/13
 */
object Zero extends Nat {
  def isZero: Boolean = true

  def predecessor: Nat = throw new Error("0.predecessor")

  def +(that: Nat): Nat = that

  def -(that: Nat): Nat = if (that.isZero) this else throw new Error("negative number")
}
