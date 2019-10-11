package com.allaboutscala.chapter.eight.functions_for_mutable_immutable_ds_2

/**
  * Created by mkoduri on 10/3/2019
  *
  * The mkString function is applicable to both Scala's Mutable and Immutable collection data structures.
  *
  * The mkString method will help you create a String representation of collection elements by iterating through the collection
  *
  * The mkString method has an overloaded method which allows you to provide a delimiter to separate each element in the collection.
  * there is another overloaded method to also specify any prefix and postfix literal to e preprended or appended to the String representation..
  *
  * def mkString: String
  * def mkString(sep: String): String
  * def mkString(start: String, sep: String, end: String): String
  *
  * The mkString method is a member of the TraversableOnce trait.
  *
  *
  */
object MkStringFunction extends App{

  //1. How to initialize a Sequence of donuts

  println("Step 1: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")

  //2. How to concatenate the elements of a sequence into a String using mkString function

  println("\nStep 2: How to concatenate the elements of a sequence into a String using mkString function")
  val donutsAsString: String = donuts.mkString(" and ")
  println(s"Donuts elements using mkString function = $donutsAsString")

  //3. How to concatenate the elements of a Sequence into a String using mkString and specifying prefix and suffix

  println("\nStep 3: How to concatenate the elements of a sequence into a String using mkString and specifying prefix and suffix")
  val donutsWithPrefixAndSuffix: String = donuts.mkString("My favorite donuts namely ", " and ", " are very tasty!")
  println(s"$donutsWithPrefixAndSuffix")







}
