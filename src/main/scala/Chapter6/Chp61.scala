package Chapter6

import doodle.core._
import doodle.image._
import doodle.image.syntax._
import doodle.image.syntax.core._
import doodle.java2d._

object Chp61{
  def boxes(color: Color): Image =
    Image
      .rectangle(400, 400)
      .strokeWidth(5)
      .strokeColor(color.spin(30.degrees))
      .fillColor(color)

//  def main(args: Array[String]): Unit = {
//    boxes(Color.paleGoldenrod).draw()
//    boxes(Color.lightSteelBlue).draw()
//    println(boxes(Color.mistyRose))
//  }
}