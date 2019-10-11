package com.allaboutscala.chapter.eight.functions_for_mutable_immutable_ds_1

/**
  * Created by mkoduri on 10/1/2019.
  *
  *
  * The drop function is applicable to both Scala's Mutable and Immutable collection data structures.
  *
  * The drop method takes an integer parameter N and will return a new collection that does not contain the first N elements.
  *
  * def drop(n: Int): Repr
  *
  * The drop method is a member of the IterableLike trait.
  *
  */
object DropFunction extends App{

  //1. How to initialize a Sequence of donuts

  println("Step 1: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")

  //2. How to drop the first element using drop function

  println("\nStep 2: How to drop the first element using drop function")
  println(s"Drop the first element in the sequence = ${donuts.drop(1)}")

  //3. How to drop the first two elements using the drop function
  println("\nStep 3: How to drop the first two elements using the drop function")
  println(s"Drop the first and second elements in the sequence = ${donuts.drop(2)}")

}
