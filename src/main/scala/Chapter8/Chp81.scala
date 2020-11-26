package Chapter8
import doodle.core._
import doodle.image._
import doodle.image.syntax._
import doodle.image.syntax.core._
import doodle.java2d._

object Chp81 {
  val square: Image = Image
    .square(50)
    .fillColor(Color.black)
    .beside(
      Image
        .square(50)
        .fillColor(Color.red)
    ).below(
    Image
      .square(50)
      .fillColor(Color.red)
      .beside(
        Image
          .square(50)
          .fillColor(Color.black)
      )
  )

  def chessboard(count :Int): Image = {
    count match{
      case 0 => square
      case n => chessboard(n-1).beside(chessboard(n-1)).below(chessboard(n-1).beside(chessboard(n-1)))
    }
  }
  def main(args: Array[String]): Unit = {
    chessboard(0).draw()
    chessboard(1).draw()
    chessboard(2).draw()
    chessboard(3).draw()

  }
}
