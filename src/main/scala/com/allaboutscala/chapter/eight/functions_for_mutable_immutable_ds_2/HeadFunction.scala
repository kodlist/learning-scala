package com.allaboutscala.chapter.eight.functions_for_mutable_immutable_ds_2

/**
  * Created by mkoduri on 10/2/2019.
  *
  * The head function is applicable to both Scala's Mutable and Immutable collection data structures.
  *
  * def head: A
  *
  * The head method is a member of the IterableLike trait.
  *
  *
  */
object HeadFunction extends App{

  //1. How to initialize a Sequence of donuts

  println("Step 1: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")


  //2. How to access the first element of the donut sequence

  println("\nStep 2: How to access the first element of the donut sequence")
  println(s"First element of donut sequence = ${donuts(0)}")

  //3. How to access the first element of the donut sequence using the head method

  println("\nStep 3: How to access the first element of the donut sequence using the head method")
  println(s"First element of donut sequence using head method = ${donuts.head}")

  //4. How to create an empty sequence

  println("\nStep 4: How to create an empty sequence")
  val donuts2: Seq[String] = Seq.empty[String]
  println(s"Elements of donuts2 = $donuts2")

  //5. How to access the first element of the donut sequence using the headOption function

  println("\nStep 5: How to access the first element of the donut sequence using the headOption function")
  println(s"First element of empty sequence = ${donuts2.headOption.getOrElse("No donut was found!")}")




}
