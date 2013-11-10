package check

/**
 * @author Jan Paw
 *         Date: 11/7/13
 */
object ScalaCheckTests {

  import org.scalacheck.Prop.{forAll, BooleanOperators}
  import org.scalacheck._

  val propReverseList = forAll {
    l: List[String] => l.reverse.reverse == l
  }
  val propConcatString = forAll {
    (s1: String, s2: String) =>
      (s1 + s2).endsWith(s2)
  }

  val smallInteger = Gen.choose(0, 100)

  val propSmallInteger = Prop.forAll(smallInteger)(n => n >= 0 && n <= 100)

  val propAdd = Prop.forAll(smallInteger, smallInteger)((x, y) => x + y == y + x)

  val propProduct = Prop.forAll(smallInteger, smallInteger)((x, y) => x * y == y * x)

  val propProdSum = Prop.forAll(smallInteger, smallInteger, smallInteger)((x, y, z) => (x + y) + z == x + (y + z))

  val propMakeList = forAll {
    n: Int => (n >= 0 && n < 10000) ==> (List.fill(n)("").length == n)
  }

  def main(args: Array[String]) {
    propReverseList.check
    propConcatString.check
    propSmallInteger.check
    propAdd.check
    propProdSum.check
    propProduct.check
    propMakeList.check
  }
}
