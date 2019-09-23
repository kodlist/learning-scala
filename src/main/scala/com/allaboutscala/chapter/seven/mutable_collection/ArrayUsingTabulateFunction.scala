package com.allaboutscala.chapter.seven.mutable_collection

/**
  * Created by mkoduri on 9/13/2019.
  *
  *
  *
  *
  */
object ArrayUsingTabulateFunction extends App{

  //1. How to create an Array using tabulate function

  println("\nStep 1: How to create an Array using tabulate function")
  val array5: Array[Int] = Array.tabulate(5)(_ + 1)
  println(s"Array of 5 columns = ${array5.toList}")


  //7. How to create dimensional Arrays using tabulate function

  println("\nStep 7: How to create dimensional Arrays using tabulate function")
  val row1 = 1
  val column3 = 3
  val arrayOfOneRowAndThreeColumns = Array.tabulate(row1, column3)( (row, column) => row + column )
  println(s"Array with 1 row and 3 columns = ${arrayOfOneRowAndThreeColumns.deep.toString}")

  val row2 = 2
  val arrayOfTowRowsAndThreeColumns = Array.tabulate(row2, column3)( (row, column) => row + column )
  println(s"Array with 2 rows and 3 columns = ${arrayOfTowRowsAndThreeColumns.deep.toString}")





}
