package com.allaboutscala.chapter.eight.functions_for_mutable_immutable_ds_3

/**
  * Created by mkoduri on 10/4/2019.
  *
  * The scanRight function is applicable to both Scala's Mutable and Immutable collection data structures.
  *
  * The scanRight method takes an associative binary operator function as parameter and will
  * use it to collapse elements from the collection to create a running total.
  * The order for traversing the elements in the collection is from right to left and hence
  * the name scanRight.  Similar to the foldRight method, scanRight allows you to
  * also specify an initial value.
  *
  * def scanRight[B, That](z: B)(op: (A, B) ⇒ B)(implicit bf: CanBuildFrom[Repr, B, That]): That
  *
  * The scanRight method is a member of TraversableLike trait.
  *
  */
object ScanRightFunction extends App{

  //1. How to initialize a sequence of numbers

  println("Step 1: How to initialize a sequence of numbers")
  val numbers: Seq[Int] = Seq(1, 2, 3, 4, 5)
  println(s"Elements of numbers = $numbers")

  //2. How to create a running total using the scanRight function

  println("\nStep 2: How to create a running total using the scanRight function")
  val runningTotal: Seq[Int] = numbers.scanRight(0)(_ + _)
  println(s"Running total of all elements in the collection = $runningTotal")

  //If you've never used the scanRight method in the past, it may not be obvious on how it works.
  //The iteration below should hopefully help you visualize the inner working of the scanRight method.

 /*
  scanRight method iterations
  5 + 4 + 3 + 2 + 1 = 15
  5 + 4 + 3 + 2     = 14
  5 + 4 + 3         = 12
  5 + 4             =  9
  5 + 0             =  5
  0                 =  0
  */

  //3. How to create a running total using the scanRight function explicitly

  println("\nStep 3: How to create a running total using the scanRight function explicitly")
  val runningTotal2: Seq[Int] = numbers.scanRight(0)((a, b) => a + b)
  println(s"Running total of all elements in the collection = $runningTotal2")





}
