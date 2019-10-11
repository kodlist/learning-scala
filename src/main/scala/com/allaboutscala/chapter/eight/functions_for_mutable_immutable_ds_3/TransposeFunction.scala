package com.allaboutscala.chapter.eight.functions_for_mutable_immutable_ds_3

/**
  * Created by mkoduri on 10/4/2019.
  *
  * The transpose function is applicable to both Scala's Mutable and Immutable collection data structures.
  *
  * The transpose method will pair and overlay elements from another collections into a single collection.
  *
  * def transpose[B](implicit asTraversable: (A) ⇒ GenTraversableOnce[B]): CC[CC[B]]
  *
  * The transpose method is a member of GenericTraversableTemplate trait.
  *
  *
  */
object TransposeFunction extends App{


  //1. How to initialize a Sequence of donuts
  println("Step 1: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")

  //2. How to initialize donut prices
  println("\nStep 2: How to initialize donut prices")
  val prices: Seq[Double] = Seq(1.50, 2.0, 2.50)
  println(s"Elements of prices = $prices")

  //3. How to create a List of donuts and prices
  println("\nStep 3: How to create a List of donuts and prices")
  val donutList = List(donuts, prices)
  println(s"Sequence of donuts and prices = $donutList")

  //4. How to pair each element from both donuts and prices Sequences using the transpose function

  println("\nStep 4: How to pair each element from both donuts and prices Sequences using the transpose function")
  println(s"Transposed list of donuts paired with their individual prices = ${donutList.transpose}")



}
