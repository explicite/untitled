import coursera.reactive.des.{Parameters, Circuits}

/**
 * @author Jan Paw 
 *         Date: 12/4/13
 */

object test {
  object sim extends Circuits with Parameters

  import sim._

  val in1, in2, sum, carry = new Wire

  halfAdder(in1, in2, sum, carry)

  def sumProbe = probe("sum", sum)

  def carryProbe = probe("carry", carry)

  in1 setSignal true
  run()
}