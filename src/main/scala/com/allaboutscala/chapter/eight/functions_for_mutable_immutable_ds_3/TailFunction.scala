package com.allaboutscala.chapter.eight.functions_for_mutable_immutable_ds_3

/**
  * Created by mkoduri on 10/4/2019.
  *
  * The tail function is applicable to both Scala's Mutable and Immutable collection data structures.
  * The tail method returns a collection consisting of all elements except the first one.
  *
  * def tail: Repr
  *
  * The tail method is a member of TraversableLike trait.
  *
  *
  *
  */
object TailFunction extends App{

  //1. How to initialize a Sequence of donuts

  println("Step 1: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")


  //2. How to return all elements in the sequence except the head using the tail function
  println("\nStep 2: How to return all elements in the sequence except the head using the tail function")
  println(s"Elements of donuts excluding the head = ${donuts.tail}")

  //3. How to access the last element of the donut sequence by using the last function

  println("\nStep 3: How to access the last element of the donut sequence by using the last function")
  println(s"Last element of donut sequence = ${donuts.last}")

  //4. How to access the first element of the donut sequence by using the head function

  println("\nStep 4: How to access the first element of the donut sequence by using the head function")
  println(s"First element of donut sequence = ${donuts.head}")


}
