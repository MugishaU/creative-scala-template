scalaVersion := "2.13.1"

// resolvers += Resolver.bintrayRepo("underscoreio", "training")

initialCommands in console := """
      |import doodle.core._
      |import doodle.image._
      |import doodle.image.syntax._
      |import doodle.image.syntax.core._
      |import doodle.java2d._
    """.trim.stripMargin

libraryDependencies ++= Seq(
  "org.creativescala" %% "doodle" % "0.9.20",
)
