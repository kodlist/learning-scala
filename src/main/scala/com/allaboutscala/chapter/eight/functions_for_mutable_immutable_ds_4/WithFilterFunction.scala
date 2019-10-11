package com.allaboutscala.chapter.eight.functions_for_mutable_immutable_ds_4

/**
  * Created by mkoduri on 10/4/2019.
  *
  * The withFilter function is applicable to both Scala's Mutable and Immutable collection data structures.
  *
  *  withFilter does not create a new collection while filter() method will create a new collection.
  *
  *  def withFilter(p: (A) ⇒ Boolean): FilterMonadic[A, Repr]
  *
  *  The withFilter method is a member of TraversableLike trait.
  *
  */
object WithFilterFunction extends App{

  //1. How to initialize a Sequence of donuts

  println("Step 1: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = List("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")


  //2. How to filter elements using the withFilter function

  println("\nStep 2: How to filter elements using the withFilter function")
  donuts
    .withFilter(_.charAt(0) == 'P')
    .foreach(donut => println(s"Donut starting with letter P = $donut"))




}
