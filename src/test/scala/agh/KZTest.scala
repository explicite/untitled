package agh

import org.scalatest.{Matchers, FunSuite}
import scala.compat.Platform.currentTime
import scala.math.{sin, Pi}
import scala.util.Random


/**
 * @author Jan Paw 
 *         Date: 3/5/14
 */
class KZTest extends FunSuite with Matchers {

  test("diff function test") {
    import KZ.diff
    val x: List[Double] = List(10, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 3, 10)
    diff(x) should contain theSameElementsAs List(-9, 0, 0, 0, 0, 0, 1, -1, 0, 0, 0, 0, 0, 0, 2, 7)
  }


  test("KZ") {
    //clean sin values
    val x: List[Double] = List.tabulate(100)(n => sin((n / 100.0) * 2.0 * Pi))
    val r: Random = new Random(currentTime)
    //trashed sin values
    val tx: List[Double] = x.map {
      x => x * (r.nextDouble() / 0.7)
    }

    println(x)
    println(tx)
    println(KZ(tx, 3, 2))
  }

}
