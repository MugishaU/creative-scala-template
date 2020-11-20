import doodle.core._
import doodle.image._
import doodle.image.syntax._
import doodle.image.syntax.core._
import doodle.java2d._

object Street{
 val roadTile : Image =
   Image
     .rectangle(300,50)
     .fillColor(Color.black)
     .noStroke
     .below(
       Image
         .rectangle(200,15)
         .fillColor(Color.yellow)
         .noStroke
         .beside(
           Image
             .rectangle(100,15)
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
}