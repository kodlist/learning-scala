package com.allaboutscala.chapter.eight.functions_for_mutable_immutable_ds_1

/**
  * Created by mkoduri on 10/1/2019.
  *
  * The dropWhile function is applicable to both Scala's Mutable and Immutable collection data structures.
  *
  * The dropWhile method takes a predicate function parameter that will be used to drop certain elements in a collection which satisfies the predicate function.
  * The "dropping" process, or removal of elements, will stop as soon as it encounters an element
  * that does not match the predicate function. Therefore, it will return a new collection with the
  * remaining elements from the original collection starting from the first element that did not match the predicate function.
  *
  *
  * def dropWhile(p: (A) ⇒ Boolean): Repr
  *
  * The dropWhile method is a member of the IterableLike trait.
  *
  * dropWhile takes predicate
  *
  * The predicate function is a Value Function.
  */
object DropWhileFunction extends App{

  //1. How to initialize a Sequence of donuts
  println("Step 1: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("trawberry Donut", "Plain Donut 1", "Plain Donut 2", "Strawberry Donut", "Plain Donut 3", "Glazed Donut")
  println(s"Elements of donuts = $donuts")

  //2. How to drop elements from the sequence using the dropWhile function

  println("\nStep 2: How to drop elements from the sequence using the dropWhile function")
  println(s"Drop donut elements whose name starts with letter P = ${donuts.dropWhile(_.charAt(0) == 'P')}")


  //3. How to declare a predicate function to be passed-through to the dropWhile function

  println("\nStep 3: How to declare a predicate function to be passed-through to the dropWhile function")
  val dropElementsPredicate: (String) => Boolean = (donutName) => donutName.charAt(0) == 'P'
  println(s"Value function dropElementsPredicate = $dropElementsPredicate")

  //The predicate function is a Value Function.

  //4. How to drop elements using the predicate function from Step 3

  println("\nStep 4: How to drop elements using the predicate function from Step 3")
  println(s"Drop elements using function from Step 3 = ${donuts.dropWhile(dropElementsPredicate)}")


}
