package com.allaboutscala.chapter.eight.functions_for_mutable_immutable_ds_3

/**
  * Created by mkoduri on 10/4/2019.
  *
  * The take function is applicable to both Scala's Mutable and Immutable collection data structures.
  * The take method takes an integer N as parameter and will use it to return a new collection consisting of the first N elements.
  *
  * def take(n: Int): Repr
  *
  * The take method is a member of IterableLike trait.
  *
  * If you pass in an integer parameter N to the take method where N is larger than the size of the collection,
  * the take method will return all the elements in the collection.
  *
  */
object TakeFunction extends App{

  //1. How to initialize a Sequence of donuts

  println("Step 1: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")

  //2. How to take elements from the sequence using the take function

  println("\nStep 2: How to take elements from the sequence using the take function")
  println(s"Take the first donut element in the sequence = ${donuts.take(1)}")
  println(s"Take the first and second donut elements in the sequence = ${donuts.take(2)}")
  println(s"Take the first, second and third donut elements in the sequence = ${donuts.take(3)}")

}
