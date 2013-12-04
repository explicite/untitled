package coursera.reactive.des

/**
 * @author Jan Paw 
 *         Date: 12/4/13
 */
class Wire extends Simulation {
  private var sigVal = false
  private var actions: List[Action] = List()

  def getSignal: Boolean = sigVal

  def setSignal(s: Boolean): Unit =
    if (s != sigVal) {
      sigVal = s
      actions foreach (_())
    }

  def addAction(a: Action): Unit = {
    actions = a :: actions
    a()
  }
}
