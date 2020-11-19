import doodle.core._
import doodle.image._
import doodle.image.syntax._
import doodle.image.syntax.core._
import doodle.java2d._
import doodle.reactor._
import scala.concurrent.duration._

// To use this example:
//
// 1. run `sbt`
// 2. run the `run` command within `sbt`
object Example {

  val image: Image =
    Image
      .circle(100)
      .strokeWidth(5)
      .fillColor(Color.red.lighten(0.1.normalized))
      .on(
        Image
          .circle(200)
          .strokeWidth(5)
          .fillColor(Color.white)
          .on(
            Image
              .circle(300)
              .strokeWidth(5)
              .fillColor(Color.red.lighten(0.1.normalized))
          )
      )



  val triangle: Image =
    Image
      .triangle(200,200)
      .strokeWidth(30)
      .strokeColor(Color.darkSlateBlue)
      .fillColor(Color.darkSlateBlue.lighten(0.25.normalized))
      .above(
        Image
          .triangle(200,200)
          .strokeWidth(30)
          .strokeColor(Color.darkSlateBlue.spin(-20.degrees))
          .fillColor(Color.darkSlateBlue.spin(-20.degrees).lighten(0.25.normalized))
          .beside(
            Image
              .triangle(200,200)
              .strokeWidth(30)
              .strokeColor(Color.darkSlateBlue.spin(20.degrees))
              .fillColor(Color.darkSlateBlue.spin(20.degrees).lighten(0.25.normalized))
          )
      )

//  val image =
//    Image
//      .circle(10)
//      .fillColor(Color.red)
//      .on(Image.circle(20).fillColor(Color.aquamarine))
//      .on(Image.circle(30).fillColor(Color.steelBlue))

  val animation =
    Reactor
      .init(-200)
      .onTick(x => x + 1)
      .stop(x => x > 200)
      .tickRate(20.millis)
      .render{x =>
        val y = x.degrees.sin * 200
        val planet = Image.circle(20.0).noStroke.fillColor(Color.seaGreen)
        val moon = Image.circle(5.0).noStroke.fillColor(Color.slateGray).at((x * 10).degrees.cos * 50, (x * 10).degrees.sin * 50)

        moon.on(planet).at(x, y)
      }

  val frame = Frame.size(600, 600)


  def main(args: Array[String]): Unit = {
    image.draw()

    // Comment out the above and uncomment the below to display the animation
//     animation.run(frame)
  }
}
