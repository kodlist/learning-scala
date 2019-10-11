package com.allaboutscala.chapter.eight.functions_for_mutable_immutable_ds_4

/**
  * Created by mkoduri on 10/4/2019.
  *
  * The unzip function is applicable to both Scala's Mutable and Immutable collection data structures.
  *
  * def unzip[A1, A2](implicit asPair: (A) ⇒ (A1, A2)): (CC[A1], CC[A2])
  *
  * The unzip method is a member of GenericTraversableTemplate trait.
  *
  * The unzip method will unzip and un-merge a collection consisting of element pairs or Tuple2 into two separate collections.
  *
  */
object UnZipFunction extends App{

  //1. How to initialize a Sequence of donuts

  println("Step 1: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")

  //2. How to initialize a Sequence of donut prices
  println("\nStep 2: How to initialize a Sequence of donut prices")
  val donutPrices = Seq[Double](1.5, 2.0, 2.5)
  println(s"Elements of donut prices = $donutPrices")

  //3. How to zip the donuts Sequence with their corresponding prices
  println("\nStep 3: How to zip the donuts Sequence with their corresponding prices")
  val zippedDonutsAndPrices: Seq[(String, Double)] = donuts zip donutPrices
  println(s"Zipped donuts and prices = $zippedDonutsAndPrices")

  //4. How to unzip the zipped donut sequence into separate donuts names and prices Sequences

  //contrast to the zip method, calling unzip on the tupled collection

  println("\nStep 4: How to unzip the zipped donut sequence into separate donuts names and prices Sequences")
  val unzipped: (Seq[String], Seq[Double]) = zippedDonutsAndPrices.unzip
  println(s"Donut names unzipped = ${unzipped._1}")
  println(s"Donut prices unzipped = ${unzipped._2}")







}
