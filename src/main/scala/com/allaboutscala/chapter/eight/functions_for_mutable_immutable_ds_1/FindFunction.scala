package com.allaboutscala.chapter.eight.functions_for_mutable_immutable_ds_1

/**
  * Created by mkoduri on 10/2/2019.
  *
  *
  * The find function is applicable to both Scala's Mutable and Immutable collection data structures.
  *
  * The find method takes a predicate function as parameter and uses it to find the first element in the collection which matches the predicate.
  *
  * It returns an Option and as such it may return a None for the case where it does not match any
  * elements in the collection with the predicate function.
  *
  * def find(p: (A) ⇒ Boolean): Option[A]
  *
  * The find method is a member of the TraversableLike trait.
  *
  */
object FindFunction extends App{

  //1. How to initialize a Sequence of donuts

  println("Step 1: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")

  //2. How to find a particular element in the sequence using the find function

  println("\nStep 2: How to find a particular element in the sequence using the find function")
  val plainDonut: Option[String] = donuts.find(donutName => donutName == "Plain Donut")
  println(s"Find Plain Donut = ${plainDonut.get}")

  //3. How to find element Vanilla Donut which does not exist in the sequence using the find function

 /* println("\nStep 3: How to find element Vanilla Donut which does not exist in the sequence using the find function")
  val vanillaDonut: String = donuts.find(_ == "Vanilla Donut").get

  println(s"Find Vanilla Donuts = $vanillaDonut")*/

  //Since the find method returns an Option, you should be careful with simply calling .get otherwise you may get the java.util.NoSuchElementException: None.get exception

  //4. How to find element Vanilla Donut using the find function and getOrElse

  println("\nStep 4: How to find element Vanilla Donut using the find function and getOrElse")
  val vanillaDonut2: String = donuts.find(_ == "Vanilla Donut").getOrElse("Vanilla Donut was not found!")
  println(s"Find Vanilla Donuts = $vanillaDonut2")


}
