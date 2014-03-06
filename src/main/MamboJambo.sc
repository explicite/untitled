/**
 * @author Jan Paw
 *         Date: 11/21/13
 */

//Functions as first-class citizens
val increment = (x: Int) => x + 1: Int
val l = List(5, 10, 15, 20, 25)
l map increment

//Side effect and immutability
val tree = increment(2)
//Closure
var x = 3
val add = (y: Int) => x + y
val otherContext = (f: (Int) => Int, x: Int) => f(x) + x
otherContext(add, 5)
x = 4
otherContext(add, 5)
//Recursion
val fact: (Int, Int) => Int = (x: Int, total: Int) => if (x <= 1) total else fact(x - 1, x * total)
val factorial = (x: Int) => fact(x, 1)
factorial(0)
factorial(4)

//Qsort
def qsort[T <% Ordered[T]](list: List[T]): List[T] = list match {
  case Nil => Nil
  case x :: xs =>
    val (before, after) = xs partition (_ < x)
    qsort(before) ++ (x :: qsort(after))
}

