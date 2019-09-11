package com.allaboutscala.chapter.three.create_tail_recursive_functions

import scala.util.control.TailCalls._

/**
  * Created by mkoduri on 9/5/2019.
  *
  *  learn how to create tail recursive function by making use of utilities that Scala provides for tail recursions in the package scala.util.control.TailCalls._
  *
  *   TailRec is a abstract class
  *   tailcall()
  *
  *   Using the utilities provided by scala.util.control.TailCalls._ is perhaps a bit artificial with regards to our search() function.
  *   But, it should help you see how to make use of them.
      These utilities are the stepping stone to writing Trampoline Recursive Function which we will see in the next tutorial.


  */
object TailRecursiveFunctionUsingTailCalls extends App{


  //1. How to define an Array of type String


  println("Step 1: How to define an Array of type String")
  val arrayDonuts: Array[String] = Array("Vanilla Donut", "Strawberry Donut", "Plain Donut", "Glazed Donut")


  //2. How to define a tail recursive function

  /*donutName parameter of type String for the donut item to search within the Array
  donuts parameter of type String Array for the donut items Array
  index parameter of type Int for the index within the Array on which to run the search*/
  // The @annotation.tailrec instructs the compiler to add any optimisations with regards to stack frame management as this function is recursive.

  println("\nStep 2: How to define a tail recursive function")

  @annotation.tailrec
  def search(donutName: String, donuts: Array[String], index: Int): Option[Boolean] = {
    if(donuts.length == index) {
      None
    } else if(donuts(index) == donutName) {
      Some(true)
    } else {
      val nextIndex = index + 1
      search(donutName, donuts, nextIndex)
    }
  }

  //3. How to call a tail recursive function

  println("\nStep 3: How to call a tail recursive function")
  val found = search("Glazed Donut", arrayDonuts, 0)
  println(s"Find Glazed Donut = $found")

  val notFound = search("Chocolate Donut", arrayDonuts, 0)
  println(s"Find Chocolate Donut = $notFound")


  //4. How to define a tail recursive function using scala.util.control.TailCalls._

  println("\nStep 3: How to define a tail recursive function using scala.util.control.TailCalls._")
  def tailSearch(donutName: String, donuts: Array[String], index: Int): TailRec[Option[Boolean]] = {
    if(donuts.length == index) {
      done(None) // NOTE: done is imported from scala.util.control.TailCalls._
    } else if(donuts(index) == donutName) {
      done(Some(true))
    } else {
      val nextIndex = index + 1
      tailcall(tailSearch(donutName, donuts, nextIndex)) // NOTE: tailcall is imported from  scala.util.control.TailCalls._
    }
  }


  //4. How to call tail recursive function using scala.util.control.TailCalls._

  println("\nStep 4: How to call tail recursive function using scala.util.control.TailCalls._")
  val tailFound = tailcall(tailSearch("Glazed Donut", arrayDonuts, 0))
  println(s"Find Glazed Donut using TailCall = ${tailFound.result}") // NOTE: our returned value is wrapped so we need to get it by calling result

  val tailNotFound = tailcall(tailSearch("Chocolate Donut", arrayDonuts, 0))
  println(s"Find Chocolate Donut using TailCall = ${tailNotFound.result}")
}
