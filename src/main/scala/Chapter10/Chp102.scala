package Chapter10

import scala.annotation.tailrec

object Chp102 {

  def ones (n: Int): List[Int]={
    n match {
      case 0 => Nil
      case n => 1 :: ones(n-1)
    }
  }

  def descending(n: Int): List[Int]={
    n match{
      case 0 => Nil
      case n => n :: descending(n-1)
    }
  }

  def fill[A](n: Int, a: A): List[A] = {
    n match {
      case 0 => Nil
      case n => a :: fill(n-1, a)
    }
  }

  def double (list: List[Int]): List[Int] = {
    list match {
      case Nil => Nil
      case hd :: tl => hd*2::double(tl)
    }
  }

  def product (list: List[Int]): Int = {
    list match{
      case Nil => 1
      case hd :: tl => hd * product(tl)
    }
  }


  def contains [A](list: List[A], n: A): Boolean = {
    list match {
      case Nil => false
      case hd :: tl =>
        if (hd == n) {
          true
        }
        else {
          contains(tl, n)
        }
    }
  }

  def first [A](list: List[A], n: A): A = {
    list match {
      case Nil => n
      case hd :: tl => hd
    }
  }

  def reverse [A](list: List[A]): List[A] = {
    def iters [A](list: List[A], revList: List[A]): List[A] = {
      list match {
        case Nil => revList
        case hd :: tl => iters(tl, hd::revList)
      }
    }

    iters(list, Nil)
  }

//  def main(args: Array[String]): Unit = {
//    println(contains(List(1,2,"three",4,5),"three"))
//    println(first(List(1,2,3),4))
//    println(reverse((List(1,2,3,4))))
//  }
}
