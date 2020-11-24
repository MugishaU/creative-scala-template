package Chapter6
import doodle.core._
import doodle.image._
import doodle.image.syntax._
import doodle.image.syntax.core._
import doodle.java2d._

object Chp62 {
  def square (num : Int) : Int = {
    num * num
  }

  def halve (num: Double) : Double = {
    num / 2.0
  }

  def main(args: Array[String]): Unit = {
    println("square: " + square(6))
    println("halve: " + halve(6))
  }
}
