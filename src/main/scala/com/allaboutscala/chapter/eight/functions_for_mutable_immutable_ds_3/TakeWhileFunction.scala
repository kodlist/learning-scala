package com.allaboutscala.chapter.eight.functions_for_mutable_immutable_ds_3

/**
  * Created by mkoduri on 10/4/2019.
  *
  * The takeWhile function is applicable to both Scala's Mutable and Immutable collection data structures.
  *
  * The takeWhile method takes a predicate function and will use it to return a new collection
  * consisting of elements which match the predicate function.
  *
  * def takeWhile(p: (A) ⇒ Boolean): Repr
  *
  * The takeWhile method is a member of IterableLike trait.
  *
  *
  */
object TakeWhileFunction extends App{

  //1. How to initialize a List of donuts

  println("Step 1: How to initialize a List of donuts")
  val donuts: Seq[String] = List("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")

  //2. How to take elements from the List using the takeWhile function

  println("\nStep 2: How to take elements from the List using the takeWhile function")
  println(s"Take donut elements which start with letter P = ${donuts.takeWhile(_.charAt(0) == 'P')}")


  //3. How to declare a predicate function to be passed-through to the takeWhile function

  println("\nStep 3: How to declare a predicate function to be passed-through to the takeWhile function")
  val takeDonutPredicate: (String) => Boolean = (donutName) => donutName.charAt(0) == 'P'
  println(s"Value function takeDonutPredicate = $takeDonutPredicate")


  //4. How to take elements using the predicate function from Step 3

  println("\nStep 4: How to take elements using the predicate function from Step 3")
  println(s"Take elements using function from Step 3 = ${donuts.takeWhile(takeDonutPredicate)}")



}
