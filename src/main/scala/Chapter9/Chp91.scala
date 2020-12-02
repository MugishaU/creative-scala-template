package Chapter9

import doodle.core._
import doodle.image._
import doodle.image.syntax._
import doodle.image.syntax.core._
import doodle.java2d._

object Chp91 {
  val square = (x: Int) => x*x
  val spin = (color: Color) => color.spin(15.degrees)
  val quad = (image: Image) =>
    image beside image.rotate(90.degrees) beside image.rotate(180.degrees) beside image.rotate(270.degrees)
  val roseFn = (angle: Angle) =>
    Point.cartesian((angle * 7).cos * angle.cos, (angle * 7).cos * angle.sin)

//  def main(args: Array[String]): Unit = {
//    println(roseFn(90.degrees))
//  }
}
