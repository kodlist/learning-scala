package com.allaboutscala.chapter.eight.functions_for_mutable_immutable_ds_3

/**
  * Created by mkoduri on 10/4/2019.
  *
  * The union function is applicable to both Scala's Mutable and Immutable collection data structures.
  *
  * The union method takes a Set as parameter and will merge its elements with the elements from the current Set.
  *
  * def union(that: GenSet[A]): This
  *
  * The union method is a member of SetLike trait.
  *
  *
  */
object UnionFunction extends App{


  //1. How to initialize a Set of donuts

  println("Step 1: How to initialize a Set of donuts")
  val donuts1: Set[String] = Set("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts1 = $donuts1")

  //2. How to initialize another Set of donuts

  println("\nStep 2: How to initialize another Set of donuts")
  val donuts2: Set[String] = Set("Plain Donut", "Chocolate Donut", "Vanilla Donut")
  println(s"Elements of donuts2 = $donuts2")


  //3. How to merge two Sets using union function
  println("\nStep 3: How to merge two Sets using union function")
  println(s"Union of Sets donuts1 and donuts2 = ${donuts1 union donuts2}")
  println(s"Union of Sets donuts2 and donuts1 = ${donuts2 union donuts1}")


  //4. How to merge two Sets using ++ function

  println("\nStep 4: How to merge two Sets using ++ function")
  println(s"Union of Sets donuts1 and donuts2 = ${donuts1 ++ donuts2}")
  println(s"Union of Sets donuts2 and donuts1 = ${donuts2 ++ donuts1}")





}
