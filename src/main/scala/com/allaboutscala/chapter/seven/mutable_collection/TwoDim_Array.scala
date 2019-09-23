package com.allaboutscala.chapter.seven.mutable_collection

/**
  * Created by mkoduri on 9/13/2019.
  *
  *
  *
  */
object TwoDim_Array extends App{

  //4. How to create a 2D Array (2 dimension array)

  println("\nStep 1: How to create a 2D Array (2 dimension array)")
  val rows = 2
  val columns = 2
  val array3: Array[Array[String]] = Array.ofDim[String](rows,columns)
  array3(0)(0) = "Plain"
  array3(0)(1) = "Donut"
  array3(1)(0) = "Strawberry"
  array3(1)(1) = "Donut"
  println(s"Elements of 2 dimensional array = ${array3.deep.toList}")


  //5. How to create 3D Array (3 Dimension Array) using Array.ofDim() method

  println("\nStep 5: How to create 3D Array (3 Dimension Array) using Array.ofDim() method")
  val array4: Array[Array[String]] = Array.ofDim[String](3,3)
  println(s"Elements of 3 dimensional array = ${array4.deep.toList}")





}
