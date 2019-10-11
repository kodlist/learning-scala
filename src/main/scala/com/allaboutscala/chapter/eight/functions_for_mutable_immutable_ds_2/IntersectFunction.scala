package com.allaboutscala.chapter.eight.functions_for_mutable_immutable_ds_2

/**
  * Created by mkoduri on 10/3/2019.
  *
  * The intersect function is applicable to both Scala's Mutable and Immutable collection data structures
  *
  * The intersect method will find the common elements between two Sets.
  *
  * def intersect(that: GenSet[A]): Repr
  *
  * The intersect method is a member of the GenSetLike trait
  *
  *
  */
object IntersectFunction extends App{


  //1. How to initialize a Set of donuts

  println("Step 1: How to initialize a Set of donuts")
  val donuts1: Set[String] = Set("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts1 = $donuts1")


  //2. How to initialize another Set of donuts

  println("\nStep 2: How to initialize another Set of donuts")
  val donuts2: Set[String] = Set("Plain Donut", "Chocolate Donut", "Vanilla Donut")
  println(s"Elements of donuts2 = $donuts2")

 //3. How to find the common elements between two Sets using intersect function

  println("\nStep 3: How to find the common elements between two Sets using intersect function")
  println(s"Common elements between donuts1 and donuts2 = ${donuts1 intersect donuts2}")
  println(s"Common elements between donuts2 and donuts1 = ${donuts2 intersect donuts1}")


  //4. How to find the common elements between two Sets using & function

  println("\nStep 4: How to find the common elements between two Sets using & function")
  println(s"Common elements between donuts1 and donuts2 = ${donuts1 & donuts2}")
  println(s"Common elements between donuts2 and donuts1 = ${donuts2 & donuts1}")





}
