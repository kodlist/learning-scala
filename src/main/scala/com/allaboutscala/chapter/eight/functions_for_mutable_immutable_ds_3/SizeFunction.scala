package com.allaboutscala.chapter.eight.functions_for_mutable_immutable_ds_3

/**
  * Created by mkoduri on 10/4/2019.
  *
  * The size function is applicable to both Scala's Mutable and Immutable collection data structures.
  *
  * The size method calculates the number of elements in a collection and return its size.
  *
  * def size: Int
  *
  * The size method is a member of TraversableOnce trait.
  *
  *
  *
  */
object SizeFunction extends App{

  //1. How to initialize a Sequence of donuts

  println("Step 1: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")


  //2. How to count the number of elements in the sequence using size function

  println("\nStep 2: How to count the number of elements in the sequence using size function")
  println(s"Size of donuts sequence = ${donuts.size}")

  //3. How to use the count function

  //The size method should not be confused with the count method
  //count method to count the number of times the element Plain Donut appear in the donut Sequence.

  println("\nStep 3: How to use the count function")
  println(s"Number of times element Plain Donut appear in donuts sequence = ${donuts.count(_ == "Plain Donut")}")


}
