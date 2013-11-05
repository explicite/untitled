package timer

/**
 * @author Jan Paw
 *         Date: 9/17/13
 */
object Timer {
  def oncePerSecond(callback: () => Unit) {
    while (true) {
      callback()
      Thread sleep 1000
    }
  }

  def timesFlies() {
    println("times flies like na arrow..")
  }

  def main(args: Array[String]) {
    oncePerSecond(timesFlies)
  }
}
