package Chapter9
import doodle.core._
import doodle.image.Image.triangle
import doodle.image._
import doodle.image.syntax._
import doodle.image.syntax.core._
import doodle.java2d._

object Chp98 {
  val parametricCircle: Angle => Point = {
    (angle: Angle) => Point(1.0, angle)
  }
  def scale(factor: Double): Point => Point = {
    (point: Point) => Point(point.r * factor, point.angle)}

  val circle100: Angle => Point = parametricCircle.andThen(scale(100))

  val parametricSpiral: Angle => Point =
    (angle: Angle) => Point(Math.exp(angle.toTurns - 1), angle)

  val growingDot: Point => Image =
    (pt: Point) => Image.circle(pt.angle.toTurns * 20).at(pt)

  val growingCircle: Angle => Image = parametricCircle.andThen(scale(100)).andThen(growingDot)

//  def main(args: Array[String]): Unit = {
//
//  }
}
