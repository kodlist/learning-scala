package com.allaboutscala.chapter.eight.functions_for_mutable_immutable_ds_1

/**
  * Created by mkoduri on 10/2/2019.
  *
  *
  * The flatMap function is applicable to both Scala's Mutable and Immutable collection data structures.
  *
  * The flatMap method takes a predicate function, applies it to every element in the collection.
  * It then returns a new collection by using the elements returned by the predicate function.
  * The flatMap method is essentially a combination of the map method being run first followed
  * by the flatten method.
  *
  * def flatMap[B](f: (A) ⇒ GenTraversableOnce[B]): TraversableOnce[B]
  *
  * The flatMap method is a member of the TraversableLike trait
  *
  *
  */
object FlatMapFunction extends App{

  //1. How to initialize a Sequence of donuts

  println("Step 1: How to initialize a Sequence of donuts")
  val donuts1: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts1 = $donuts1")


  //2. How to initialize another Sequence of donuts

  println("\nStep 2: How to initialize another Sequence of donuts")
  val donuts2: Seq[String] = Seq("Vanilla Donut", "Glazed Donut")
  println(s"Elements of donuts2 = $donuts2")

 //3. How to create a List of donuts initialized using the two Sequences from Step 1 and Step 2

  println("\nStep 3: How to create a List of donuts initialized using the two Sequences from Step 1 and Step 2")
  val listDonuts: List[Seq[String]] = List(donuts1, donuts2)
  println(s"Elements of listDonuts = $listDonuts")

  //We end up with a List containing two inner lists: List(List(Plain Donut, Strawberry Donut, Glazed Donut), List(Vanilla Donut, Glazed Donut))

  //4. How to return a single list of donut using the flatMap function

  println("\nStep 4: How to return a single list of donut using the flatMap function")
  val listDonutsFromFlatMap: List[String] = listDonuts.flatMap(g => g)
  println(s"Elements of listDonutsFromFlatMap as a flatMap as a single list = $listDonutsFromFlatMap")





}
