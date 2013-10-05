package book.network.simulation

/**
 * @author Jan Paw
 *         Date: 10/5/13
 */
trait SimulationContext {
  def respond(entity: NetworkEntity, response: PingResponse)
}
