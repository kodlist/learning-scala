package com.allaboutscala.chapter.eight.functions_for_mutable_immutable_ds_1

/**
  * Created by mkoduri on 10/2/2019.
  *
  * The foreach function is applicable to both Scala's Mutable and Immutable collection data structures.
  *
  * The foreach method takes a function as parameter and applies it to every element in the collection.
  *
  * def foreach(f: (A) ⇒ Unit): Unit
  *
  * The foreach method is a member of the IterableLike trait.
  *
  *
  *
  */
object ForEachFunction extends App{

  //1. How to initialize a Sequence of donuts

  println("Step 1: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")

  //2. How to loop through all the elements in the sequence using the foreach function

  println("\nStep 2: How to loop through all the elements in the sequence using the foreach function")
  donuts.foreach(println(_))

  //note that we are making use of the wildcard operator _ in the println method.

  //3. How to loop through and access all the elements in the sequence using the foreach function

  println("\nStep 3: How to loop through and access all the elements in the sequence using the foreach function")
  donuts.foreach(donutName => println(s"donutName = $donutName"))

  //4. How to declare a value function to format a donut names into upper case format

  println("\nStep 4: How to declare a value function to format a donut names into upper case format")
  val uppercase: (String) => String = (s) => {
                          val upper = s.toUpperCase
                          println(upper)
                          upper
  }
  println(s"Value function formatting donut names to uppercase = $uppercase")

  //5. How to format all donuts to uppercase using value function from Step 4

  println("\nStep 5: How to format all donuts to uppercase using value function from Step 4")
  donuts.foreach(uppercase)





}
