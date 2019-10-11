package com.allaboutscala.chapter.eight.functions_for_mutable_immutable_ds_1

/**
  * Created by mkoduri on 10/2/2019.
  *
  * The foldRight function is applicable to both Scala's Mutable and Immutable collection data structures.
  *
  * The foldRight method takes an associative binary operator function as parameter
  * and will use it to collapse elements from the collection. The order for traversing
  * the elements in the collection is from right to left and hence the name foldRight.
  *
  *  The foldRight method allows you to also specify an initial value.
  *  Prefer using foldLeft as opposed to foldRight since foldLeft is fundamental
  * in recursive function and will help you prevent stack-overflow exceptions.
  *
  *  The foldRight method allows you to also specify an initial value.
  *
  *  The foldRightmethod is a member of the TraversableOnce trait.
  *
  *  def foldRight[B](z: B)(op: (A, B) ⇒ B): B
  *
  */
object FoldRightFunction extends App{

  //1. How to initialize a sequence of donut prices

  println("Step 1: How to initialize a sequence of donut prices")
  val prices: Seq[Double] = Seq(1.5, 2.0, 2.5)
  println(s"Donut prices = $prices")

  //2. How to sum all the donut prices using foldRight function

  println("\nStep 2: How to sum all the donut prices using foldRight function")
  val sum = prices.foldRight(0.0)(_ + _)
  println(s"Sum = $sum")

  //3. How to initialize a Sequence of donuts

  println("\nStep 3: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain", "Strawberry", "Glazed")
  println(s"Elements of donuts1 = $donuts")

  //4. How to create a String of all donuts using foldRight function

  println("\nStep 4: How to create a String of all donuts using foldRight function")
  println(s"All donuts = ${donuts.foldRight("")((a, b) => a + " Donut " + b)}")


  //5. How to declare a value function to create the donut string

  println("\nStep 5: How to declare a value function to create the donut string")
  val concatDonuts: (String, String) => String = (a, b) => { println(s"a $a  :    b  $b ")  ; a + " Donut " + b ; }
  println(s"Value function concatDonuts = $concatDonuts")

  //6. How to create a String of all donuts using value function from Step 5 and foldRight function

  println("\nStep 6: How to create a String of all donuts using value function from Step 5 and foldRight function")
  println(s"All donuts = ${donuts.foldRight("")(concatDonuts)}")
}
