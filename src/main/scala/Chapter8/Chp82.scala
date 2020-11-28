package Chapter8
import doodle.core._
import doodle.image._
import doodle.image.syntax._
import doodle.image.syntax.core._
import doodle.java2d._

object Chp82 {
  val tri: Image = Image
    .triangle(25,25)
    .strokeWidth(2)
    .strokeColor(Color.deepPink)

  def sierpinski (count: Int): Image = {
    count match {
      case 0 => tri
      case n => sierpinski(n-1) above (sierpinski(n-1) beside sierpinski(n-1))
    }
  }
//  def main(args: Array[String]): Unit = {
//    sierpinski(0).draw()
//    sierpinski(3).draw()
//    sierpinski(5).draw()
//  }
}
