package com.allaboutscala.chapter.eight.functions_for_mutable_immutable_ds_3

/**
  * Created by mkoduri on 10/4/2019.
  *
  * The slice function is applicable to both Scala's Mutable and Immutable collection data structures.
  *
  * def slice(from: Int, until: Int): Repr
  *
  * The slice method is a member of IterableLike trait.
  *
  */
object SliceFunction extends App{

  //1. How to initialize a Sequence of donuts

  println("Step 1: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")

  //2. How to take a section from the sequence using the slice function

  println("\nStep 2: How to take a section from the sequence using the slice function")
  println(s"Take elements from the sequence from index 0 to 1 = ${donuts.slice(0,1)}")
  println(s"Take elements from the sequence from index 0 to 2 = ${donuts.slice(0,2)}")
  println(s"Take elements from the sequence from index 0 to 3 = ${donuts.slice(0,3)}")


  //3. Slice function where the index is out of range
  //   With the slice method, you do not have to worry about IndexOutOfBoundsException.

  println("\nStep 3: Slice function where the index is out of range")
  println(s"Take elements from the sequence from index 0 to 4 = ${donuts.slice(0,4)}")

}
