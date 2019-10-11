package com.allaboutscala.chapter.eight.functions_for_mutable_immutable_ds_2

/**
  * Created by mkoduri on 10/3/2019.
  *
  * The nonEmpty function is applicable to both Scala's Mutable and Immutable collection data structures.
  * The nonEmpty method will test whether a given collection is not empty and will return either true or false
  *
  * def nonEmpty: Boolean
  *
  * The nonEmpty method is a member of the TraversableOnce trait
  *
  *
  *
  */
object NonEmptyFunction extends App{

  //1. How to initialize a Sequence of donuts

  println("Step 1: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")

  //2. How to check if a sequence is not empty using nonEmpty function
  //The code below shows how to use the nonEmpty method to test whether the donuts Sequence is not empty.

  println("\nStep 2: How to check if a sequence is not empty using nonEmpty function")
  println(s"Is donuts sequence NOT empty = ${donuts.nonEmpty}")

  //3. How to create an empty sequence
  println("\nStep 3: How to create an empty sequence")
  val emptyDonuts: Seq[String] = Seq.empty[String]
  println(s"Elements of emptyDonuts = $emptyDonuts")

  //4. How to find out if sequence is empty using nonEmpty function
  println("\nStep 4: How to find out if sequence is empty using nonEmpty function")
  println(s"Is emptyDonuts sequence empty = ${emptyDonuts.nonEmpty}")




}
