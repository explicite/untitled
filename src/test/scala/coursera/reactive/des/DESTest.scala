package coursera.reactive.des

import org.scalatest.FunSuite

/**
 * @author Jan Paw 
 *         Date: 12/6/13
 */
class DESTest extends FunSuite {
  test("Half Adder test") {
    object sim extends Circuits with Parameters {
      val in1, in2, sum, carry = new Wire

      halfAdder(in1, in2, sum, carry)

      probe("sum", sum)
      probe("carry", carry)

      in1 setSignal true
      run()

      in2 setSignal true
      run()

      in1 setSignal false
      run()
      assert(carry.getSignal)
      assert(!sum.getSignal)
    }
  }
}
