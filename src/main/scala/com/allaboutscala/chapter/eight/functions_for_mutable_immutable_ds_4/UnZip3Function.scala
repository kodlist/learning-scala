package com.allaboutscala.chapter.eight.functions_for_mutable_immutable_ds_4

/**
  * Created by mkoduri on 10/4/2019.
  *
  *
  *  The unzip3 function is applicable to both Scala's Mutable and Immutable collection data structures.
  *
  *  The unzip3 method will un-merge a collection consisting of elements as Tuple3 into three separate collections.
  *
  *  def unzip3[A1, A2, A3](implicit asTriple: (A) ⇒ (A1, A2, A3)): (CC[A1], CC[A2], CC[A3])
  *
  *  The unzip3 method is a member of GenericTraversableTemplate trait.
  *
  *
  *
  */
object UnZip3Function extends App{

  //1. How to initialize a Sequence of Tuple3 elements

  println("Step 1: How to initialize a Sequence of Tuple3 elements")
  val donuts: Seq[(String, Double, String)] = Seq(("Plain Donut",1.5,"Tasty"), ("Glazed Donut",2.0,"Very Tasty"), ("Strawberry Donut",2.5,"Very Tasty"))
  println(s"Donuts tuple3 elements = $donuts")

  //2. How to call unzip3 function to unzip Tuple3 elements

  //Scala provides a convenient unzip3 method to unzip Tuple3 elements from a collection into three separate collections.

  println("\nStep 2: How to call unzip3 function to unzip Tuple3 elements")
  val unzipped: (Seq[String], Seq[Double], Seq[String]) = donuts.unzip3
  println(s"Unzipped donut names = ${unzipped._1}")
  println(s"Unzipped donut prices = ${unzipped._2}")
  println(s"Unzipped donut taste = ${unzipped._3}")




}
