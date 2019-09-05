package com.allaboutscala.chapter.two.option_some_none_avoid_null

/**
  * Created by mkoduri on 8/29/2019.
  *
  *
  * we will show how to use Option, Some and None.
  *
  * Learn How To Use Option - Avoid Null
  *
  * Scala encourages you to write functions with no side effects as we've described in the Scala Features tutorial.
  * As a result, all your headaches with NullPointerException should go away
  *
  *
  */
object UsingOptionSomeNone extends App{


  //1. How to use Option and Some - a basic example
  //   Some : Is a class in scala
  //   Because we have wrapped our String into an Option, to retrieve its value we call the get() function as shown above.
  //   But calling get() in a production system is generally a code smell as you may end up with the same NullPointerException.
  println("Step 1: How to use Option and Some - a basic example")
  val glazedDonutTaste: Option[String] = Some("Very Tasty")

  println(s"Glazed Donut taste = ${glazedDonutTaste.get}")


  //2. How to use Option and None - a basic example
  //   None: object None extends Option[Nothing]

  println("\nStep 2: How to use Option and None - a basic example")
  val glazedDonutName: Option[String] = None
  //println(s"Glazed Donut name = ${glazedDonutName.get }")  //  println(s"Glazed Donut name = ${glazedDonutName.get }")
  println(s"Glazed Donut name = ${glazedDonutName.getOrElse("Glazed Donut")}")

  //3. How to use Pattern Matching with Option

  println("\nStep 3: How to use Pattern Matching with Option")
  glazedDonutName match {
    case Some(name) => println(s"Received donut name = $name")
    case None       => println(s"No donut name was found!")
  }


}
