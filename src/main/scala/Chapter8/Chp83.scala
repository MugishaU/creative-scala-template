package Chapter8
import doodle.core._
import doodle.image._
import doodle.image.syntax._
import doodle.image.syntax.core._
import doodle.java2d._

object Chp83 {

  def growingBoxes0(count: Int): Image = {
    def box(size: Int):Image = {
      Image
        .square(size)
        .strokeWidth(20)
        .strokeColor(Color.royalBlue.spin(30.degrees))
        .fillColor(Color.royalBlue)

    }
    count match {
      case 0 => Image.empty
      case n => growingBoxes0(n-1).beside(box(n*100))
    }
  }

  def growingBoxes(count: Int, size: Int): Image = {
    def box(size2: Int): Image = {
      Image
        .square(size2)
        .strokeWidth(20)
        .strokeColor(Color.royalBlue.spin(30.degrees))
        .fillColor(Color.royalBlue)

    }

    count match {
      case 0 => Image.empty
      case n =>
          box(size)
          .beside(growingBoxes(n - 1, size + 10))
    }
  }

  def gradientBox(count: Int, spinStart :Int=0): Image = {
    count match {
      case 0 => Image.empty
      case n => Image
        .square(200)
        .strokeWidth(10)
        .strokeColor(Color.royalBlue.spin((30+spinStart).degrees))
        .fillColor(Color.royalBlue.spin(spinStart.degrees))
        .beside(gradientBox(n-1, spinStart+10))
    }
  }

  def concentric(count: Int, dia: Int = 50): Image = {
    count match {
      case 0 => Image.empty
      case n => Image
        .circle(dia)
        .strokeWidth(5)
        .strokeColor(Color.royalBlue.spin((n*10).degrees))
        .on(
          concentric(n-1, dia+20)
        )
    }
  }
//  def main(args: Array[String]): Unit = {
//    concentric(20).draw()
//    concentric(20,100).draw()
//    concentric(50,5).draw()
//  }

}
