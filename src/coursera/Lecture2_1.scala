package coursera

/**
 * @author Jan Paw
 *         Date: 10/8/13
 */
object Lecture2_1 {
  def recSum(f: Int => Int, a: Int, b: Int): Int =
    if (a > b) 0
    else f(a) + recSum(f, a + 1, b)

  def id(x: Int): Int = x

  def cube(x: Int): Int = x * x * x

  def fact(x: Int): Int = if (x == 0) 1 else fact(x - 1)

  def sumId(a: Int, b: Int) = recSum(id, a, b)

  def sumCube(a: Int, b: Int) = recSum(cube, a, b)

  def sumFactorials(a: Int, b: Int) = recSum(fact, a, b)

  //Anonymous functions
  def anonId(a: Int, b: Int) = recSum(x => x, a, b)

  def anonCube(a: Int, b: Int) = recSum(x => x * x * x, a, b)

  def anonFact(a: Int, b: Int) = recSum(x => if (x == 0) 1 else fact(x - 1), a, b)

  //Tail-recursive
  def sum(f: Int => Int)(a: Int, b: Int): Int = {
    def loop(a: Int, acc: Int): Int = {
      if (a > b) acc
      else loop(a + 1, f(a) + acc)
    }
    loop(a, 0)
  }

  def main(args: Array[String]) {
    println(sumId(1, 100))
    println(sumCube(1, 100))
    println(sumFactorials(1, 100))

    println(anonId(1, 100))
    println(anonCube(1, 100))
    println(anonFact(1, 100))

    println(sum(x => x)(1, 100))
    println(sum(x => x * x * x)(1, 100))
  }
}
