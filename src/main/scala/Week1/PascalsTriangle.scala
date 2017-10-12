/**
  * Created by dmcmahon on 12/10/2017.
  */

package Week1

object PascalsTriangle extends App{
  def hello(): Unit ={
    println("Hello World")
  }

  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c == r) 1
    else pascal(c - 1, r - 1) + pascal(c, r - 1)
  }

  println(pascal(0,1))
  println(pascal(1,2))
  println(pascal(1,3))

}
