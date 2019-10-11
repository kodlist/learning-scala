package com.allaboutscala.chapter.eight.functions_for_mutable_immutable_ds_3

/**
  * Created by mkoduri on 10/4/2019.
  *
  * The scan function is applicable to both Scala's Mutable and Immutable collection data structures.
  *
  * The scan method takes an associative binary operator function as parameter and will use it to
  * collapse elements from the collection to create a running total from each element.
  * Similar to the fold method, scan allows you to also specify an initial value.
  *
  * def scan[B >: A, That](z: B)(op: (B, B) ⇒ B)(implicit cbf: CanBuildFrom[Repr, B, That]): That
  *
  * The scan method is a member of TraversableLike trait.
  *
  */
object ScanFunction extends App{


  //1. How to initialize a sequence of numbers

  println("Step 1: How to initialize a sequence of numbers")
  val numbers: Seq[Int] = Seq(1, 2, 3, 4, 5)
  println(s"Elements of numbers = $numbers")

  //2. How to create a running total using the scan function

  println("\nStep 2: How to create a running total using the scan function")
  val runningTotal: Seq[Int] = numbers.scan(0)(_ + _)
  println(s"Running total of all elements in the collection = $runningTotal")


  //If you've never used the scan method in the past, it may not be obvious on how it works.
  //The iteration below should hopefully help you visualize the inner working of the scan method.

 /*
  Scan method iterations
  0 + 1             =  1
  1 + 2             =  3
  1 + 2 + 3         =  6
  1 + 2 + 3 + 4     = 10
  1 + 2 + 3 + 4 + 5 = 15
  */


  //3. How to create a running total using the scan function explicitly

  println("\nStep 3: How to create a running total using the scan function explicitly")
  val runningTotal2: Seq[Int] = numbers.scan(0)((a, b) => a + b)
  println(s"Running total of all elements in the collection = $runningTotal2")




}
