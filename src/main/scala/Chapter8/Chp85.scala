package Chapter8

import doodle.core._
import doodle.image._
import doodle.image.syntax._
import doodle.image.syntax.core._
import doodle.java2d._

object Chp85 {

  def altChess (count: Int, color: Color = Color.red): Image = {
    val black: Image = Image.square(10).fillColor(Color.black)

    def alt(color: Color): Image = Image.square(10).fillColor(color)
    val base: Image = (black beside alt(color)) above (alt(color) beside black)

    count match {
      case 0 => base
      case n => (altChess(n-1,color.spin((n*5).degrees)) beside altChess(n-1,color.spin((n*20).degrees))) above (altChess(n-1,color.spin((n*20).degrees)) beside altChess(n-1,color.spin((n*5).degrees)))
    }
  }

//  def main(args: Array[String]): Unit = {
//    altChess(5,Color.blue).draw()
//  }
}
