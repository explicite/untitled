package coursera.reactive.recap

/**
 * @author Jan Paw
 *         Date: 11/4/13
 */
abstract class JSON {
 /* def show(json: JSON): String = json match {
    case JSeq(elems) =>
      "[" + (elems map show mkString ", ") + "]"
    case JObj(bindings) =>
      val assocs = bindings map {
        case (key, value) => "\"" + key + "\": " + show(value)
      }
      "{" + (assocs mkString ", ") + "}"
    case JNum(num)  => num.toString
    case JStr(str)  => '\"' + str + '\"'
    case JBool(b)   => b.toString
    case JNull      => "null"
  }*/
}
