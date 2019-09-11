package com.allaboutscala.chapter.three.partial_function_trait

/**
  * Created by mkoduri on 9/6/2019.
  *
  *
  * With pattern matching, if you recall from the Pattern Matching tutorial, you provide a series of case blocks.
  * However, a Partial Function provides some but not all the possible case blocks.
  *
  *
  *  Review of Pattern Matching in Scala
     How to define a Partial Function
     How to call a Partial Function
     How to compose Partial Function

     Let's go ahead and use the orElse() function which is inherited from the PartialFunction trait and create another PartialFunction named donutTaste.
  *
  */
object CreatePartialFunctionWithPartialFunctionTrait extends App{


    //1. Review of Pattern Matching in Scala

  println("Step 1: Review of Pattern Matching in Scala")
  val donut = "Glazed Donut"

  val tasteLevel = donut match {
    case "Glazed Donut" | "Strawberry Donut" => "Very tasty"
    case "Plain Donut" => "Tasty"
    case _ => "Tasty"
  }
  println(s"Taste level of $donut = $tasteLevel")


  //2. How to define a Partial Function named isVeryTasty

  println("\nStep 2: How to define a Partial Function named isVeryTasty")
  val isVeryTasty: PartialFunction[String, String] = {
    case "Glazed Donut" | "Strawberry Donut" => "Very Tasty"
  }
  //Note that we are using the PartialFunction trait
  //In this example isVeryTasty takes an input of type String which is the donut and produces a String for the taste level.
  // This is specified by PartialFunction[String, String]



  //3. How to call the Partial Function named isVeryTasty
  //   You will get scala.MatchError if the partial function does not have a case which matches the provided input.

  println("\nStep 3: How to call the Partial Function named isVeryTasty")
  println(s"Calling partial function isVeryTasty = ${isVeryTasty("Glazed Donut")}")



  //4. How to define PartialFunction named isTasty and unknownTaste

  println("\nStep 4: How to define PartialFunction named isTasty and unknownTaste")

  val isTasty: PartialFunction[String, String] = {
    case "Plain Donut" => "Tasty"
  }

  val unknownTaste: PartialFunction[String, String] = {
    case donut @ _ => s"Unknown taste for donut = $donut"
  }


  //5. How to compose PartialFunction using orElse

  // Let's go ahead and use the orElse() function which is inherited from the PartialFunction trait and create another PartialFunction named donutTaste.

  println("\nStep 5: How to compose PartialFunction using orElse")
  val donutTaste = isVeryTasty orElse isTasty orElse unknownTaste
  println(donutTaste("Glazed Donut"))
  println(donutTaste("Plain Donut"))
  println(donutTaste("Chocolate Donut"))







}
