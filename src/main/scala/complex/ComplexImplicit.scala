package complex
import scala.language.implicitConversions

/**
 * @author Jan Paw
 *         Date: 9/18/13
 */
object ComplexImplicit {
  implicit def Double2Complex(value: Double) = new Complex(value, 0.0)

  implicit def Int2Complex(value: Int) = new Complex(value, 0.0)
}
