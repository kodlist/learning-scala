package com.allaboutscala.chapter.eight.functions_for_mutable_immutable_ds_1

/**
  * Created by mkoduri on 10/2/2019
  *
  *
  *  The foldLeft function is applicable to both Scala's Mutable and Immutable collection data structures.
  *
  *  The foldLeft method takes an associative binary operator function as parameter and will use it to collapse elements from the collection.
  *
  *  The order for traversing the elements in the collection is from left to right and hence the name foldLeft.
  *
  *  The foldLeft method allows you to also specify an initial value.
  *
  * Using foldLeft is fundamental in recursive function and will help you prevent stack-overflow exceptions.
  *
  * def foldLeft[B](z: B)(op: (B, A) ⇒ B): B
  *
  * The foldLeft method is a member of the TraversableOnce trait.
  *
  */
object FoldLeftFunction extends App{

  //1. How to initialize a sequence of donut prices
  println("Step 1: How to initialize a sequence of donut prices")
  val prices: Seq[Double] = Seq(1.5, 2.0, 2.5)
  println(s"Donut prices = $prices")


  //2. How to sum all the donut prices using foldLeft function
  println("\nStep 2: How to sum all the donut prices using foldLeft function")
  val sum = prices.foldLeft(0.0)(_ + _)
  println(s"Sum = $sum")
  //Note that we passed in a default or initial value of 0.0 to the foldLeft method because the sequence of Donuts was of type Double.

  //3. How to initialize a Sequence of donuts

  println("\nStep 3: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain", "Strawberry", "Glazed")
  println(s"Elements of donuts1 = $donuts")

  //4. How to create a String of all donuts using foldLeft function

  println("\nStep 4: How to create a String of all donuts using foldLeft function")
  println(s"All donuts = ${donuts.foldLeft("")((a, b) => a + b + " Donut ")}")


  //5. How to declare a value function to create the donut string

  println("\nStep 5: How to declare a value function to create the donut string")
  val concatDonuts: (String, String) => String = (a, b) => a + b + " Donut "
  println(s"Value function concatDonuts = $concatDonuts")

  //6. How to create a String of all donuts using value function from Step 5 and foldLeft function

  println("\nStep 6: How to create a String of all donuts using value function from Step 5 and foldLeft function")
  println(s"All donuts = ${donuts.foldLeft("")(concatDonuts)}")






}
