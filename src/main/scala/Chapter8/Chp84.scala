package Chapter8

import doodle.core._
import doodle.image._
import doodle.image.syntax._
import doodle.image.syntax.core._
import doodle.java2d._

object Chp84 {

  def chessboard(count: Int): Image = {
    val blackSquare = {
      println("black")
      Image.square(30) fillColor Color.black
    }
    val redSquare = Image.square(30) fillColor Color.red
    val base = (redSquare beside blackSquare) above (blackSquare beside redSquare)

    def draw (count: Int): Image = {
      count match {
        case 0 => base
        case n =>
          val unit = draw(n - 1)
          (unit beside unit) above (unit beside unit)
      }
    }
    draw(count)
  }

  def main(args: Array[String]): Unit = {
    chessboard(3).draw()

  }
}
