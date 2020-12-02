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
    sample(100,Image.circle(10).fillColor(Color.limeGreen).strokeColor(Color.lawngreen) ,parametricSpiral).draw()
  }
}
