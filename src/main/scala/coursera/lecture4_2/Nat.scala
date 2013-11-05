package coursera.lecture4_2

/**
 * @author Jan Paw
 *         Date: 10/17/13
 */
abstract class Nat {
  def isZero: Boolean

  def predecessor: Nat

  def successor = new Succ(this)

  def +(that: Nat): Nat

  def -(that: Nat): Nat
}
