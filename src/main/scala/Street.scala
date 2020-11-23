import doodle.core._
import doodle.image._
import doodle.image.syntax._
import doodle.image.syntax.core._
import doodle.java2d._
import packageP._

object Street{
  val check: Int =
    packageP.One.one

 val roadTile : Image =
   Image
     .rectangle(210,50)
     .fillColor(Color.black)
     .noStroke
     .below(
       Image
         .rectangle(140,15)
         .fillColor(Color.yellow)
         .noStroke
         .beside(
           Image
             .rectangle(70,15)
             .fillColor(Color.black)
             .noStroke
         )
     )

  val pavement: Image =
    roadTile beside roadTile beside roadTile

  val tree: Image =
    Image
      .rectangle(50,100)
      .fillColor(Color.brown)
      .noStroke
      .below(
        Image
          .circle(250)
          .fillColor(Color.green)
          .noStroke
      )
  val houseRoof: Image =
    Image
      .triangle(250,125)
      .fillColor(Color.brown)
      .noStroke

  val houseBody: Image =
    Image
      .rectangle(250,80)
      .fillColor(Color.red)
      .noStroke
      .above(
        Image
          .rectangle(100,145)
          .fillColor(Color.red)
          .noStroke
          .beside(
            Image
              .rectangle(50,145)
              .fillColor(Color.black)
              .noStroke
              .beside(
                Image
                  .rectangle(100,145)
                  .fillColor(Color.red)
                  .noStroke
              )
          )
      )

  val house: Image =
    houseRoof
      .above(
        houseBody
      )

  val residence: Image =
    pavement below (house beside tree)

  val scene: Image =
    residence beside residence beside residence
}