package date

import java.util.{Date, Locale}
import java.text.DateFormat._

/**
 * @author Jan Paw
 *         Date: 9/17/13
 */
object FrenchDate {
  def main(args: Array[String]) {
    val now = new Date
    val df = getDateInstance(LONG, Locale.FRANCE)
    println(df format now)
  }
}
