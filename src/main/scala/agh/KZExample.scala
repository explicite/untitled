package agh

import scala.swing.{FlowPanel, MainFrame, SwingApplication}
import javax.swing.UIManager
import scalax.chart.Charting._
import scalax.chart.XYChart
import scala.math._
import scala.util.Random
import scala.compat.Platform._

/**
 * @author Jan Paw
 *         Date: 3/6/14
 */
object KZExample extends SwingApplication {
  //clean sin values
  val x: List[Double] = List.fill(20)(0.0) ::: List.tabulate(300)(n => sin((n / 300.0) * 8.0 * Pi)) ::: List.fill(20)(0.0)
  val r: Random = new Random(currentTime)
  //trashed sin values
  val tx: List[Double] = x.map {
    x => x + ((r.nextDouble() - 0.5) * 0.4)
  }

  val chartData = Seq((0, 0)).toXYSeriesCollection("default")
  chartData.removeAllSeries()

  chartData.addSeries((for (i <- 0 until x.length) yield (i, x(i))).toXYSeries("clean sin"))
  chartData.addSeries((for (i <- 0 until tx.length) yield (i, tx(i))).toXYSeries("trashed sin"))
  chartData.addSeries((for (i <- 0 until tx.length) yield (i, KZ(tx, 3, 20)(i))).toXYSeries("KZ sin"))

  val chart: XYChart = XYLineChart(chartData)

  lazy val panel = new FlowPanel() {
    contents ++= chart.toPanel :: Nil
  }

  def top = new MainFrame {
    title = "KZ test"
    contents = panel
  }

  override def startup(args: Array[String]) {
    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName)
    top.visible = true
  }

  def resourceFromClassloader(path: String): java.net.URL =
    this.getClass.getResource(path)

  def resourceFromUserDirectory(path: String): java.io.File =
    new java.io.File(util.Properties.userDir, path)
}
