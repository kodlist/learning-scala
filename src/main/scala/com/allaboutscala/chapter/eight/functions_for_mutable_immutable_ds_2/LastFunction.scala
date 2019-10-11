package com.allaboutscala.chapter.eight.functions_for_mutable_immutable_ds_2

/**
  * Created by mkoduri on 10/3/2019.
  *
  * The last function is applicable to both Scala's Mutable and Immutable collection data structures.
  *
  * def last: A
  *
  * The last method is a member of the TraversableLike trait.
  *
  *
  */
object LastFunction extends App{


  //1. How to initialize a Sequence of donuts

  println("Step 1: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")

  //2. How to access the last element of the donut sequence by index

  println("\nStep 2: How to access the last element of the donut sequence by index")
  println(s"Last element of donut sequence = ${donuts(donuts.size - 1)}")

 //3. How to access the last element of the donut sequence by using the last function

  println("\nStep 3: How to access the last element of the donut sequence by using the last function")
  println(s"Last element of donut sequence = ${donuts.last}")

  //4. How to create an empty sequence

  println("\nStep 4: How to create an empty sequence")
  val donuts2: Seq[String] = Seq.empty[String]
  println(s"Elements of donuts2 = $donuts2")

 //5. How to access the last element of the donut sequence using the lastOption function

  println("\nStep 5: How to access the last element of the donut sequence using the lastOption function")
  println(s"Last element of empty sequence = ${donuts2.lastOption.getOrElse("No donut was found!")}")


  //5. How to access the last element of the donut sequence using the lastOption function

  println("\nStep 5: How to access the last element of the donut sequence using the lastOption function")
  println(s"Last element of empty sequence = ${donuts2.lastOption}")





}
