package com.allaboutscala.chapter.eight.functions_for_mutable_immutable_ds_2

/**
  * Created by mkoduri on 10/3/2019.
  *
  * The isEmpty function is applicable to both Scala's Mutable and Immutable collection data structures.
  *
  * The isEmpty method is a member of the TraversableLike trait, but there are other concrete implementations for corresponding collection types.
  *
  * abstract def isEmpty: Boolean
  *
  * There is a diff btwn Seq and Set
  *
  */
object IsEmptyFunction extends App{


  //1. How to initialize a Sequence of donuts

  println("Step 1: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")

  println("Step 1: How to initialize a Set with 3 elements")
  val set1: Set[String] = Set("Plain Donut","Strawberry Donut","Chocolate Donut")
  println(s"Elements of set1 = $set1")


  //2. How to find out if a sequence is empty using isEmpty function

  println("\nStep 2: How to find out if a sequence is empty using isEmpty function")
  println(s"Is donuts sequence empty = ${donuts.isEmpty}")


  //3. How to create an empty sequence

  println("\nStep 3: How to create an empty sequence")
  val donuts2: Seq[String] = Seq.empty[String]
  println(s"Elements of donuts2 = $donuts2")


  //4. How to find out if a sequence is empty using isEmpty function

  println("\nStep 4: How to find out if a sequence is empty using isEmpty function")
  println(s"Is donuts2 sequence empty = ${donuts2.isEmpty}")





}
