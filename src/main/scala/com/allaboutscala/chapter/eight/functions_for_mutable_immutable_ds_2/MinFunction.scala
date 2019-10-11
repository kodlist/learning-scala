package com.allaboutscala.chapter.eight.functions_for_mutable_immutable_ds_2

/**
  * Created by mkoduri on 10/3/2019.
  *
  * The min function is applicable to both Scala's Mutable and Immutable collection data structures.
  *
  * The min method will iterate through all the elements in the collection and return the smallest element.
  *
  * def min: A
  *
  * The min method is a member of the TraversableOnce trait.
  */
object MinFunction extends App{

  //1. How to initialize a Sequence of donuts
  println("Step 1: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")

  //2. How to find the minimum element in the sequence using the min function

  //Given that the donut sequence is of type String, the min function is using the natural order of type String.
  println("\nStep 2: How to find the minimum element in the sequence using the min function")
  println(s"Min element in the donuts sequence = ${donuts.min}")

  //3. How to initialize a Sequence of donut prices

  println("\nStep 3: How to initialize a Sequence of donut prices")
  val prices: Seq[Double] = Seq(1.50, 2.0, 2.50)
  println(s"Elements of prices = $prices")

  //4. How to find the minimum element in the sequence using the min function

  println("\nStep 4: How to find the minimum element in the sequence using the min function")
  println(s"Min element in the donut prices sequence = ${prices.min}")

  //Since the prices Sequence is of type double, the min function is using the natural ordering of type Double.







}
