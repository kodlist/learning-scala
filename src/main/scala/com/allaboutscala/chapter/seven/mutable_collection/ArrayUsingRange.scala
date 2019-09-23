package com.allaboutscala.chapter.seven.mutable_collection

/**
  * Created by mkoduri on 9/13/2019.
  */
object ArrayUsingRange extends App{


  //1. How to create Array using Range

  println("\nStep 1: How to create Array using Range")
  val rangeArray: Array[Int] = (1 to 10).toArray[Int]
  println(s"Array using Range from 1 to 10 = ${rangeArray.mkString(", ")}")


  //2. How to copy an Array using Array.copy

  println("\nStep 2: How to copy an Array using Array.copy")
  val copyOfRangeArray: Array[Int] = new Array(rangeArray.size)
  Array.copy(rangeArray, 0, copyOfRangeArray, 0, rangeArray.size)
  println(s"copy of range array with elements from rangeArray = ${copyOfRangeArray.mkString(", ")}")


  //3. How to clone an Array

  println("\nStep 3: How to clone an Array")
  val clonedRangeArray = rangeArray.clone
  clonedRangeArray(0) = 10 // update index 0 to value 10
  println(s"clonedRangeArray = ${clonedRangeArray.mkString(", ")}")
  println(s"original range array still unchanged = ${rangeArray.mkString(", ")}")


  //11. How to iterate over an Array using for comprehension


  println("Step 1: How to initialize a String Array with 3 elements")
  val array1: Array[String] = Array("Plain Donut","Strawberry Donut","Chocolate Donut")
  println(s"Elements of array1 = ${array1.mkString(", ")}")


  println("\nStep 11: How to iterate over an Array using for comprehension")
  for(d <- array1){
    println(s"d = $d")
  }


  //12. How to merge two Arrays using Array.concat

  println("\nStep 12: How to merge two Arrays using Array.concat")
  val moreDonutsArray: Array[String] = Array("Vanilla Donut","Glazed Donut")
  val mergedDonutArray: Array[String] = Array.concat(array1, moreDonutsArray)
  println(s"Merged Array of donuts = ${mergedDonutArray.mkString(", ")}")

  //13. How to check if two Arrays are equal

  println("\nStep 13: How to check if two Arrays are equal")
  val arrayToCompare = Array[String]("Plain Donut","Strawberry Donut","Chocolate Donut")

  println(s"using == ${array1 == moreDonutsArray}") // prints false

  println(s"using == ${array1 == arrayToCompare}") // ALSO prints false ??? what ... be careful

  println(s"using sameElement function = ${array1 sameElements arrayToCompare}") // NOW this works and returns true!


  //14. How to check if two Arrays are equal using deep function and ==

  println("\nStep 14: How to check if two Arrays are equal using deep function and == ")
  println(s"using deep function = ${array1.deep == arrayToCompare.deep}")





}
