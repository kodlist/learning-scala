package com.allaboutscala.chapter.eight.functions_for_mutable_immutable_ds_1

/**
  * Created by mkoduri on 10/2/2019.
  *
  * The filter and filterNot functions are applicable to both Scala's Mutable and Immutable collection data structures.
  *
  * The filter method takes a predicate function as its parameter and uses it to select all the elements in the collection which matches the predicate.
  *  It will return a new collection with elements that matched the predicate.
  *
  * def filter(p: (A) ⇒ Boolean): Repr
  * def filterNot(p: (A) ⇒ Boolean): Repr
  *
  * The filterNot method is similar to the filter method except that it will create a new collection
  * with elements that do not match the predicate function.
  *
  * The filter and filterNot method is a member of the TraversableLike trait.
  *
  */
object FilterAndFilterNotFunction extends App{

  //1. How to initialize a Sequence of donuts

  println("Step 1: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut", "Vanilla Donut")
  println(s"Elements of donuts = $donuts")

  //2. How to keep only Plain and Glazed Donuts using the filter method

  println("\nStep 2: How to keep only Plain and Glazed Donuts using the filter method")
  val sequenceWithPlainAndGlazedDonut = donuts.filter { donutName =>  donutName.contains("Plain") || donutName.contains("Glazed")   }
  println(s"Sequence with Plain and Glazed donuts only = $sequenceWithPlainAndGlazedDonut")

  //3. How to filter out element Vanilla Donut using the filterNot function

  println("\nStep 3: How to filter out element Vanilla Donut using the filterNot function")
  val sequenceWithoutVanillaDonut = donuts.filterNot(donutName => donutName == "Vanilla Donut" )
  println(s"Sequence without vanilla donut = $sequenceWithoutVanillaDonut")





}
