package book.network.simulation

/**
 * @author Jan Paw
 *         Date: 10/5/13
 */
trait NetworkEntity extends SimulationEntity {
  def getMacAddress(ip: String): String

  def hasIpAddress(addr: String): Boolean

  def handleMessage(msg: SimulationMessage, ctx: SimulationContext): Unit =
    msg match {
      case PingRequest(ip, sender) if hasIpAddress(ip) =>
        ctx respond(sender, PingResponse(getMacAddress(ip)))
      case _ =>
        super.handleMessage(msg, ctx)
    }
}
