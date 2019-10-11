package com.allaboutscala.chapter.eight.functions_for_mutable_immutable_ds_2

/**
  * Created by mkoduri on 10/3/2019.
  *
  * The par function is applicable to both Scala's Mutable and Immutable collection data structures.
  *
  * The par method on collection provides a very easy high level API to allow computation to run in parallel to take advantage of multi-core processing.
  * When you call the par method on a collection, it will copy all the elements into an equivalent Scala Parallel Collection
  *
  * def par: ParRepr
  *
  * The par method is a member of the Parallelizable trait.
  *
  *
  */
object ParFunction extends App{

  //1. How to initialize an Immutable Sequence of various donut flavours

  println("Step 1: How to initialize an Immutable Sequence of various donut flavours")
  val donutFlavours: Seq[String] = Seq("Plain", "Strawberry", "Glazed")
  println(s"Elements of donutFlavours immutable sequence = $donutFlavours")

  //2. Convert the Immutable donut flavours Sequence into Parallel Collection
  //The code below shows how to call the par method on the Immutable Sequence to create an equivalent Parallel Collection of type String.

  println("\nStep 2: Convert the Immutable donut flavours Sequence into Parallel Collection")

  import scala.collection.parallel.ParSeq

  val donutFlavoursParallel: ParSeq[String] = donutFlavours.par

  //We added the import scala.collection.parallel.ParSeq in order to have the ParSeq in scope.

  //3. How to use Scala Parallel Collection

  println("\nStep 3: How to use Scala Parallel Collection")
  val donuts: ParSeq[String] = donutFlavoursParallel.map(d => s"$d donut")
  println(s"Elements of donuts parallel collection = $donuts")







}
