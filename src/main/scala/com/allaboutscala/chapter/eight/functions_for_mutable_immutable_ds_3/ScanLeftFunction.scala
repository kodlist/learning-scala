package com.allaboutscala.chapter.eight.functions_for_mutable_immutable_ds_3

/**
  * Created by mkoduri on 10/4/2019
  *
  * The scanLeft function is applicable to both Scala's Mutable and Immutable collection data structures.
  *
  * The order for traversing the elements in the collection is from left to right and hence the name scanLeft.
  *
  * Similar to the foldLeft method, scanLeft allows you to also specify an initial value.
  *
  * def scanLeft[B, That](z: B)(op: (B, A) ⇒ B)(implicit bf: CanBuildFrom[Repr, B, That]): That
  *
  * The scanLeft method is a member of TraversableLike trait.
  *
  */
object ScanLeftFunction extends App{

  //1. How to initialize a sequence of numbers

  println("Step 1: How to initialize a sequence of numbers")
  val numbers: Seq[Int] = Seq(1, 2, 3, 4, 5)
  println(s"Elements of numbers = $numbers")

  //2. How to create a running total using the scanLeft function

  println("\nStep 2: How to create a running total using the scanLeft function")
  val runningTotal: Seq[Int] = numbers.scanLeft(0)(_ + _)
  println(s"Running total of all elements in the collection = $runningTotal")

  //If you've never used the scanLeft method in the past, it may not be obvious on how it works.
  //The iteration below should hopefully help you visualize the inner working of the scanLeft method.

  /*
  Scan method iterations
  0 + 1             =  1
  1 + 2             =  3
  1 + 2 + 3         =  6
  1 + 2 + 3 + 4     = 10
  1 + 2 + 3 + 4 + 5 = 15
  */

  //3. How to create a running total using the scanLeft function explicitly

  println("\nStep 3: How to create a running total using the scanLeft function explicitly")
  val runningTotal2: Seq[Int] = numbers.scanLeft(0)((a, b) => a + b)
  println(s"Running total of all elements in the collection = $runningTotal2")





}
