package com.allaboutscala.chapter.eight.functions_for_mutable_immutable_ds_2

/**
  * Created by mkoduri on 10/3/2019.
  *
  * The max function is applicable to both Scala's Mutable and Immutable collection data structures.
  *
  * def max: A
  *
  * The max method will iterate through all the elements in a collection and return the largest element.
  *
  * The max method is a member of the TraversableOnce trait.
  *
  * Since the donut elements are of type String, the max method is using the natural order of String.
  *
  */
object MaxFunction extends App{

  //1. How to initialize a Sequence of donuts

  println("Step 1: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")


  //2. How to find the maximum element in the sequence using the max function

  println("\nStep 2: How to find the maximum element in the sequence using the max function")
  println(s"Max element in the donuts sequence = ${donuts.max}")

  //Since the donut elements are of type String, the max method is using the natural order of String.

  //3. How to initialize donut prices

  println("\nStep 3: How to initialize donut prices")
  val prices: Seq[Double] = Seq(1.50, 2.0, 2.50)
  println(s"Elements of prices = $prices")


  //4. How to find the maximum element in the sequence using the max function

  println("\nStep 4: How to find the maximum element in the sequence using the max function")
  println(s"Max element in the donut prices sequence = ${prices.max}")

 //Since the donut prices elements are of type Double, the max method is using the natural order of type Double.





}
