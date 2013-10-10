/**
 * @author Jan Paw
 *         Date: 10/6/13
 */
package object numerical {
  def main(args:Array[String]){
    //Karacuba - Exception in thread "main" java.lang.StackOverflowError
    println(Karacuba.multiple(1234, 5678))

    //PI - Monte Carlo
    println(MonteCarlo.simulate(10000000))
  }
}
