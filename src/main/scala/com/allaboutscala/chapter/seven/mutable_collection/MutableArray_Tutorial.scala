package com.allaboutscala.chapter.seven.mutable_collection

/**
  * Created by mkoduri on 9/13/2019.
  *
  *  Scala's Mutable Array to perform common operations such as initialize an Array, access elements at specific index,
  *  create 2D or 3D dimensional Arrays, and copy Arrays.
  *
  *
  *
  */
object MutableArray_Tutorial extends App{


  //1. How to initialize a String Array with 3 elements

  println("Step 1: How to initialize a String Array with 3 elements")
  val array1: Array[String] = Array("Plain Donut","Strawberry Donut","Chocolate Donut")
  println(s"Elements of array1 = ${array1.mkString(", ")}")


  //2. How to access elements at specific index in an Array

  println("\nStep 2: How to access elements at specific index in an Array")
  println(s"Element at index 0 = ${array1(0)}")
  println(s"Element at index 1 = ${array1(1)}")
  println(s"Element at index 2 = ${array1(2)}")


  //3. How to initialize an Array by specifying it's capacity

  println("\nStep 3: How to initialize an Array by specifying it's capacity")
  val array2: Array[String] = new Array(3)
  array2(0) = "Plain Donut"
  array2(1) = "Strawberry Donut"
  array2(2) = "Chocolate Donut"
  println(s"Elements of array2 = ${array2.mkString(", ")}")


  //4. How to create a 2D Array (2 dimension array)

  println("\nStep 4: How to create a 2D Array (2 dimension array)")
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
