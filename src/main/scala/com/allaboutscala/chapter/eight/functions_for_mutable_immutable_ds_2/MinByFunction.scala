package com.allaboutscala.chapter.eight.functions_for_mutable_immutable_ds_2

/**
  * Created by mkoduri on 10/3/2019.
  *
  * The minBy function is applicable to both Scala's Mutable and Immutable collection data structures.
  *
  * def minBy[B](f: (A) ⇒ B): A
  *
  * The minBy method is a member of the TraversableOnce trait.
  *
  *
  *
  */
object MinByFunction extends App{

  //1. How to create case class to represent Donut object

  println("Step 1: How to create case class to represent Donut object")
  case class Donut(name: String, price: Double)

  //2. How to create a Sequence of type Donut
  println("\nStep 2: How to create a Sequence of type Donut")
  val donuts: Seq[Donut] = Seq(Donut("Plain Donut", 1.5), Donut("Strawberry Donut", 2.0), Donut("Glazed Donut", 2.5))
  println(s"Elements of donuts = $donuts")

  //3. How to find the minimum element in a sequence of case classes using the minBy function

  println("\nStep 3: How to find the minimum element in a sequence of case classes using the minBy function")
  println(s"Minimum element in sequence of case class of type Donut, ordered by price = ${donuts.minBy(donut => donut.price)}")

  //4. How to declare a value predicate function for minBy function
  println("\nStep 4: How to declare a value predicate function for minBy function")
  val donutsMinBy: (Donut) => Double = (donut) => donut.price
  println(s"Value function donutMinBy = $donutsMinBy")

  //5. How to find the minimum element using minBy function and passing through the predicate function from Step 4

  println("\nStep 5: How to find the minimum element using minBy function and passing through the predicate function from Step 4")
  println(s"Minimum element in sequence using function from Step 3 = ${donuts.minBy(donutsMinBy)}")







}
