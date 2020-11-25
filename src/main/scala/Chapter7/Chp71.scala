package Chapter7
import doodle.core._
import doodle.image._
import doodle.image.syntax._
import doodle.image.syntax.core._
import doodle.java2d._

object Chp71{
  val aBox = Image
    .square(200)
    .fillColor(Color.royalBlue)
    .strokeWidth(5)
    .strokeColor(Color.royalBlue.spin(30.degrees))

  def boxes(count: Int): Image = {
    count match {
      case 0 => Image.empty
      case n => aBox.beside(boxes(n-1))
    }
  }

  def main(args: Array[String]): Unit = {
    boxes(5).draw()
    boxes(0).draw()
    boxes(1).draw()
  }
}
