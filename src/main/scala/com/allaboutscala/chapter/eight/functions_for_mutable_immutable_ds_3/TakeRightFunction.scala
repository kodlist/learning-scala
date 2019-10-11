package com.allaboutscala.chapter.eight.functions_for_mutable_immutable_ds_3

/**
  * Created by mkoduri on 10/4/2019.
  *
  * The takeRight function is applicable to both Scala's Mutable and Immutable collection data structures.
  *
  * The takeRight method takes an integer N as parameter and will use it to return a new collection consisting of the last N elements.
  *
  * def takeRight(n: Int): Repr
  *
  * The takeRight method is a member of IterableLike trait.
  */
object TakeRightFunction extends App{


  //1. How to initialize a Sequence of donuts

  println("Step 1: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")

  //2. How to take the last N elements using the takeRight function

  println("\nStep 2: How to take the last N elements using the takeRight function")
  println(s"Take the last donut element in the sequence = ${donuts.takeRight(1)}")
  println(s"Take the last two donut elements in the sequence = ${donuts.takeRight(2)}")
  println(s"Take the last three donut elements in the sequence = ${donuts.takeRight(3)}")


}
