package com.allaboutscala.chapter.eight.functions_for_mutable_immutable_ds_1

/**
  * Created by mkoduri on 10/1/2019.
  *
  * The exists function is applicable to both Scala's Mutable and Immutable collection data structures.
  *
  * The exists method takes a predicate function and will use it to find the first element in the collection which matches the predicate.
  *
  * def exists(p: (A) ⇒ Boolean): Boolean
  *
  * The exists method is a member of the IterableLike trait.
  *
  * The predicate function is a Value Function.
  *
  */
object ExistsFunction extends App{

  //1. How to initialize a Sequence of donuts

  println("Step 1: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")


  //2. How to check if a particular element exists in the sequence using the exists function
  println("\nStep 2: How to check if a particular element exists in the sequence using the exists function")
  val doesPlainDonutExists: Boolean = donuts.exists(donutName => donutName == "Plain Donut")
  println(s"Does Plain Donut exists = $doesPlainDonutExists")

  println("\nStep 2: How to check if a particular element exists in the sequence using the exists function")
  val doesPlainDonutExists2: Boolean = donuts.exists(donutName => donutName == "Strawberry Donut")
  println(s"Does Plain Donut exists = $doesPlainDonutExists2")

  //3. How to declare a predicate value function for the exists function
  println("\nStep 3: How to declare a predicate value function for the exists function")
  val plainDonutPredicate: (String) => Boolean = (donutName) => donutName == "Plain Donut"
  println(s"Value function plainDonutPredicate = $plainDonutPredicate")

  //The predicate function is a Value Function.

  //4. How to find element Plain Donut using the exists function and passing through the predicate function from Step 3

  println("\nStep 4: How to find element Plain Donut using the exists function and passing through the predicate function from Step 3")
  println(s"Does Plain Donut exists = ${donuts.exists(plainDonutPredicate)}")

  //5.How to declare a predicate def function for the exists function

  println("\nStep 5: How to declare a predicate def function for the exists function")
  def plainDonutPredicateFunction(donutName: String): Boolean = donutName == "Plain Donut"

  //6. How to find element Plain Donut using the exists function and passing through the predicate def function from Step 5

  println("\nStep 6: How to find element Plain Donut using the exists function and passing through the predicate function from Step 5")
  println(s"Does plain Donut exists = ${donuts.exists(plainDonutPredicateFunction(_))}")








}
