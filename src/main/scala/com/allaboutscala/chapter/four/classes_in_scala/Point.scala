package com.allaboutscala.chapter.four.classes_in_scala

/**
  * Created by mkoduri on 11/1/2019.
  */
class Point (var x: Int, var y: Int) {

  def move(dx: Int, dy: Int): Unit = {
    x = x + dx
    y = y + dy
  }

  override def toString: String = s"($x, $y)"
}
object Main {
  val point1 = new Point(2, 3)
  point1.x // 2
  println(point1) // prints (2, 3)
}

//Constructors can have optional parameters by providing a default value like so:

/*

class Point(var x: Int = 0, var y: Int = 0)

val origin = new Point  // x and y are both set to 0
val point1 = new Point(1)
println(point1.x)  // prints 1
*/
