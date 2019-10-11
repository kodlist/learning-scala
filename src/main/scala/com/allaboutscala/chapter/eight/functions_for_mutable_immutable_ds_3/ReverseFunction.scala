package com.allaboutscala.chapter.eight.functions_for_mutable_immutable_ds_3

/**
  * Created by mkoduri on 10/4/2019.
  *
  * The reverse function is applicable to both Scala's Mutable and Immutable collection data structures.
  *
  * The reverse method will create a new sequence with the elements in reversed order.
  *
  * def reverse: Repr
  *
  * The reverse method is a member of SeqLike trait.
  *
  *
  */
object ReverseFunction extends App{

  //1. How to initialize a sequence of donut prices
  println("Step 1: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")

  //2. How to get the elements of the sequence in reverse using the reverse method

  println("\nStep 2: How to get the elements of the sequence in reverse using the reverse method")
  println(s"Elements of donuts in reversed order = ${donuts.reverse}")

  //3. How to access each reversed element using reverse and foreach methods
  println("\nStep 3: How to access each reversed element using reverse and foreach methods")
  donuts.reverse.foreach(donut => println(s"donut = $donut"))



}
