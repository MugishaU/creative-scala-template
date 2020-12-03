package Chapter9

import doodle.core._
import doodle.image.Image.triangle
import doodle.image._
import doodle.image.syntax._
import doodle.image.syntax.core._
import doodle.java2d._

object Chp96 {
  def parametricCircle(angle: Angle): Point = Point.polar(200, angle)
  def parametricSpiral(angle: Angle): Point = Point((Math.exp(angle.toTurns) - 1)*150, angle)
  val rose7 = (angle: Angle) => Point((angle * 8).cos * 200, angle)
  def lissajous(a: Int, b: Int, offset: Angle): Angle => Point = (angle: Angle) =>
    Point(100 * ((angle * a) + offset).sin, 100 * (angle * b).sin)
  def epicycloid(a: Int, b: Int, c: Int): Angle => Point = (angle: Angle) =>
    (Point(75, angle * a).toVec + Point(32, angle * b).toVec + Point(15, angle * c).toVec).toPoint

  val dot:Image = Image.circle(3).fillColor(Color.limeGreen).strokeColor(Color.lawngreen)
  def sample(samples: Int, dot: Image,curve: Angle => Point): Image = {
    val step = Angle.one / samples

    def loop(count:Int): Image = {
      val angle = step * count
      count match {
        case 0 => Image.empty
        case n => dot.at(curve(angle)).on(loop(n-1))
      }
    }

    loop(samples)
  }

  def main(args: Array[String]): Unit = {
    sample(500,dot,epicycloid(7,13,25)).draw()
  }
}
