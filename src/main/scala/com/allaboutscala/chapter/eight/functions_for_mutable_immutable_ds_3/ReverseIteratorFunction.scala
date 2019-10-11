package com.allaboutscala.chapter.eight.functions_for_mutable_immutable_ds_3

/**
  * Created by mkoduri on 10/4/2019.
  *
  * The reverseIterator function is applicable to both Scala's Mutable and Immutable collection data structures.
  *
  * The reverseIterator method returns an iterator which you can use to traverse the elements of a collection in reversed order.
  *
  * def reverseIterator: Iterator[A]
  *
  * The reverseIterator method is a member of SeqLike trait.
  *
  */
object ReverseIteratorFunction extends App{

  //1. How to initialize a sequence of donut prices

  println("Step 1: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")

  //2. How to print all elements in reversed order using reverseIterator function

  println("\nStep 2: How to print all elements in reversed order using reverseIterator function")
  println(s"Elements of donuts in reversed order = ${donuts.reverseIterator.toList}")

  //3. How to iterate through elements using foreach method

  println("\nStep 3: How to iterate through elements using foreach method")
  val reverseIterator: Iterator[String] = donuts.reverseIterator
  reverseIterator.foreach(donut => println(s"donut = $donut"))




}
