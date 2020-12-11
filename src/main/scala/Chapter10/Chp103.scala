package Chapter10

object Chp103 {
  def ones (n: Int): List[Int] = {
    (0 until n).toList.map(x => 1)
  }

  def descending (n: Int): List[Int] = {
    if(n == 0){
      Nil
    }else{
      (0 until n).toList.map(x => n-x)
    }
  }

  def descending2 (n: Int): List[Int] = {
    (n until 0 by -1).toList
  }

  def ascending (n: Int): List[Int] = {
    (0 until n).toList.map(x => x + 1)
  }

  def double (list: List[Int]): List[Int] = {
    list.map(x => x*2)
  }

  def main(args: Array[String]): Unit = {
    println(double(List(4,5,6)))
  }
}
