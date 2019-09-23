package com.allaboutscala.chapter.six.immutable_collection

/**
  * Created by mkoduri on 9/13/2019.
  *
  * such as initialize a Vector, access elements at specific index, append and prepend elements to Vector, and create an empty Vector.
  *
  * a Vector is data structure which is similar to a List. However, it addresses the inefficiencies of random access within a List.
  *
  */
object ImmutableVector_Tutorial extends App{


  //1. How to initialize a Vector with 3 elements

  println("Step 1: How to initialize a Vector with 3 elements")
  val vector1: Vector[String] = Vector("Plain Donut", "Strawberry Donut", "Chocolate Donut")
  println(s"Elements of vector1 = $vector1")

  //2. How to access elements of Vector at specific index

  println("\nStep 2: How to access elements of Vector at specific index")
  println(s"Element at index 0 = ${vector1(0)}")
  println(s"Element at index 1 = ${vector1(1)}")
  println(s"Element at index 2 = ${vector1(2)}")


  //3. How to append elements at the end of Vector using :+

  println("\nStep 3: How to append elements at the end of Vector using :+")
  val vector2 = vector1 :+ "Vanilla Donut"
  println(s"Adding elements to Vector using :+ = $vector2")

  //4. How to prepend elements in front of Vector using +:

  println("\nStep 4: How to prepend elements in front of Vector using +:")
  val vector3 = "Vanilla Donut" +: vector1
  println(s"Adding elements to Vector using :+ = $vector3")


  //5. How to add two Vectors together using ++

  println("\nStep 5: How to add two Vectors together using ++")
  val vector4 = vector1 ++ Vector[String]("Glazed Donut")
  println(s"Add two vectors together using ++ = $vector4")
  // NOTE: this return a new Vector(...), elements from the second vector


  //6. How to initialize an empty Vector

  println("\nStep 6: How to initialize an empty Vector")
  val emptyVector: Vector[String] = Vector.empty[String]
  println(s"Empty vector of type String = $emptyVector")



}
