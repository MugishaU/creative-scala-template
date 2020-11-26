package Chapter7
import doodle.core._
import doodle.image._
import doodle.image.syntax._
import doodle.image.syntax.core._
import doodle.java2d._

object Chp74 {
  def stacks (num: Int):Image={
    num match{
      case 0 => Image.empty
      case n => Image.square(100).above(stacks(n - 1))
    }
  }

  val star: Image =
    Image
      .star(5,150,50,30.degrees)
      .strokeWidth(5)
      .strokeColor(Color.gold.spin(30.degrees))
      .fillColor(Color.gold)

  val box = Image
    .square(200)
    .fillColor(Color.royalBlue)
    .strokeWidth(5)
    .strokeColor(Color.royalBlue.spin(30.degrees))

  def alternatingRow (count: Int):Image={
    count match{
      case 0 => Image.empty
      case n => if(n % 2 == 0) star.beside(alternatingRow(n-1))
                else box.beside(alternatingRow(n-1))
    }
  }

  def funRow(count: Int): Image = {
    count match{
      case 0 => Image.empty
      case n =>
        funRow(n-1)
          .beside(
          Image
          .star(n+4,100/n,50/n,20.degrees)
          .strokeWidth(10)
          .strokeColor(Color.yellow.spin(-(10*n).degrees))
        )
    }
  }

  val circle: Image = Image
    .circle(10)
    .fillColor(Color.white)
    .noStroke
    .on(
      Image
        .circle(20)
        .fillColor(Color.mediumSpringGreen)
        .noStroke
        .on(
          Image
            .circle(30)
            .fillColor(Color.turquoise)
            .noStroke
            .on(
              Image
                .circle(40)
                .fillColor(Color.skyBlue)
                .noStroke
            )
        )
    )

  def cross(count: Int): Image = {
    count match {
      case 0 =>
        Image
          .regularPolygon(6,15, 60.degrees)
          .strokeColor(Color.orangeRed)
          .strokeWidth(10)
      case n =>
        circle beside cross(n-1) beside circle below circle above circle

    }


  }

//  def main(args: Array[String]): Unit = {
//    cross (10).draw()
//  }
}
