package com.allaboutscala.chapter.eight.functions_for_mutable_immutable_ds_4

/**
  * Created by mkoduri on 10/4/2019.
  *
  * The zip function is applicable to both Scala's Mutable and Immutable collection data structures.
  *
  * The zip method takes another collection as parameter and will merge its elements
  * with the elements of the current collection to create a new collection
  * onsisting of pairs or Tuple2 elements from both collections.
  *
  * def zip[B](that: GenIterable[B]): Iterable[(A, B)]
  *
  * The zip method is a member of IterableLike trait.
  *
  *
  */
object ZipFunction extends App{

  //1. How to initialize a Sequence of donuts

  println("Step 1: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")

  //2. How to initialize a Sequence of donut prices

  println("\nStep 2: How to initialize a Sequence of donut prices")
  val donutPrices: Seq[Double] = Seq(1.5, 2.0, 2.5)
  println(s"Elements of donut prices = $donutPrices")

  //3. How to use zip method to zip two collections

  println("\nStep 3: How to use zip method to zip two collections")
  val zippedDonutsAndPrices: Seq[(String, Double)] = donuts zip donutPrices
  println(s"Zipped donuts and prices = $zippedDonutsAndPrices")


  //4. How to use unzip method to un-merge a zipped collections

  println("\nStep 4: How to use unzip method to un-merge a zipped collections")
  val unzipped: (Seq[String], Seq[Double]) = zippedDonutsAndPrices.unzip
  println(s"Donut names unzipped = ${unzipped._1}")
  println(s"Donut prices unzipped = ${unzipped._2}")


}
