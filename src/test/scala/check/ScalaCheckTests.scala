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

  val propMakeList = forAll {
    n: Int => (n >= 0 && n < 10000) ==> (List.make(n, "").length == n)
  }

  def main(args: Array[String]) {
    propReverseList.check
    propConcatString.check
    propSmallInteger.check
    propMakeList.check
  }
}
