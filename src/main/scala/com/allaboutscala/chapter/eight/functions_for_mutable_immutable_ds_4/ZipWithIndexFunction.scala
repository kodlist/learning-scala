package com.allaboutscala.chapter.eight.functions_for_mutable_immutable_ds_4

/**
  * Created by mkoduri on 10/4/2019.
  *
  * The zipWithIndex function is applicable to both Scala's Mutable and Immutable collection data structures.
  *
  * The zipWithIndex method will create a new collection of pairs or Tuple2 elements consisting of the element and its corresponding index
  *
  * def zipWithIndex: Iterable[(A, Int)]
  *
  * The zipWithIndex method is a member of IterableLike trait.
  *
  */
object ZipWithIndexFunction extends App{

  //1. How to initialize a Sequence of donuts

  println("Step 1: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")


  //2. How to zip the donuts Sequence with their corresponding index using zipWithIndex method

  //In the previous tutorials, we have shown how to you can easily merge and un-merge Scala collections using the zip and unzip methods respectively.
  //In addition, zipping and unzipping of collection is a fairly common practice with Tuples that Scala also provides an unzip3 method.

  println("\nStep 2: How to zip the donuts Sequence with their corresponding index using zipWithIndex method")
  val zippedDonutsWithIndex: Seq[(String, Int)] = donuts.zipWithIndex

  zippedDonutsWithIndex.foreach{ donutWithIndex =>
    println(s"Donut element = ${donutWithIndex._1} is at index = ${donutWithIndex._2}")
  }




}
