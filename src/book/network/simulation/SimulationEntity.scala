package book.network.simulation

/**
 * @author Jan Paw
 *         Date: 10/5/13
 */
trait SimulationEntity {
  def handleMessage(msg: SimulationMessage, ctx: SimulationContext): Unit
}
