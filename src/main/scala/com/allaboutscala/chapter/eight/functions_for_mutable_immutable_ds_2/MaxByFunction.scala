package com.allaboutscala.chapter.eight.functions_for_mutable_immutable_ds_2

/**
  * Created by mkoduri on 10/3/2019.
  *
  * The maxBy function is applicable to both Scala's Mutable and Immutable collection data structures.
  *
  * The maxBy method takes a predicate function as its parameter and applies it to every element in the collection to return the largest element.
  *
  * def maxBy[B](f: (A) ⇒ B): A
  *
  * The maxBy method is a member of the TraversableOnce trait.
  */
object MaxByFunction extends App{

  //1. How to create a case class to represent Donut object

  println("Step 1: How to create a case class to represent Donut object")
  case class Donut(name: String, price: Double)

  //2. How to create a Sequence of type Donut

  println("\nStep 2: How to create a Sequence of type Donut")
  val donuts: Seq[Donut] = Seq(Donut("Plain Donut", 1.5), Donut("Strawberry Donut", 2.0), Donut("Glazed Donut", 2.5))
  println(s"Elements of donuts = $donuts")

  //3. How to find the maximum element in a sequence of case classes objects using the maxBy function

  println("\nStep 3: How to find the maximum element in a sequence of case classes objects using the maxBy function")
  println(s"Maximum element in sequence of case class of type Donut, ordered by price = ${donuts.maxBy(donut => donut.price)}")

  //4. How to declare a value predicate function for maxBy function

  println("\nStep 4: How to declare a value predicate function for maxBy function")
  val donutsMaxBy: (Donut) => Double = {(donut) => donut.price}
  println(s"Value function donutMaxBy = $donutsMaxBy")

  //The value function takes a Donut type as input parameter and returns a Double
  //which in this example is the Double value as specified by the Donut's price property.

  //5. How to find the maximum element using maxBy function and pass through the predicate function from Step 4

  println("\nStep 5: How to find the maximum element using maxBy function and pass through the predicate function from Step 4")
  println(s"Maximum element in sequence using function from Step 3 = ${donuts.maxBy(donutsMaxBy)}")




}
