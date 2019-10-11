package com.allaboutscala.chapter.eight.functions_for_mutable_immutable_ds_4

/**
  * Created by mkoduri on 10/4/2019.
  *
  * The view function is applicable to both Scala's Mutable and Immutable collection data structures.
  *
  * The view method will create a non-strict version of the collection which means that the
  * elements of the collection will only be made available at access time.
  *
  * def view: TraversableView[A, Repr]
  *
  *
  *
  */
object ViewFunction extends App{

  //1. How to create a large numeric range and take the first 10 odd numbers

  //Instead, we will create a rather large List of Int consisting of 1 million Int

  //When creating the list, we will also make use of the convenient Numeric Range features from Scala.

  println("Step 1: How to create a large numeric range and take the first 10 odd numbers")
  val largeOddNumberList: List[Int] = (1 to 1000000).filter(_ % 2 != 0).take(10).toList


 /*
  The size of our List of Int matters here. In the above example, we only had 1 million elements. What if you had a much larger list?
  Running computation on the large list would require to eagerly build the elements of
  the list which could result in the typical OutOfMemory exception.
  */

  //2. How to lazily create a large numeric range and take the first 10 odd numbers
  //   Fortunately, Scala provides a convenient view method which will only make the collection elements available at access time.

  println(s"\nStep 2: How to lazily create a large numeric range and take the first 10 odd numbers")
  val lazyLargeOddNumberList = (1 to 1000000).view.filter(_ % 2 != 0).take(10).toList
  println(s"Lazily take the first 100 odd numbers from lazyLargeOddNumberList = ${lazyLargeOddNumberList}")




}
