package com.allaboutscala.chapter.three.nested_functions

/**
  * Created by mkoduri on 9/6/2019.
  *
  *
  * In Functional Programming, you should try to break your logic into other smaller functions.
  *
  * But sometimes you have logic that is tightly coupled with a particular function and Scala provides you with the ability to nest functions
  *
  * so that you can still benefit from functional style of coding.
  *
  *
  */
object Nested_Functions extends App{

 //1. How to define a function: let us review our previous work on creating functions

  println("Step 1: How to define a function")
  def checkDonutAvailability(donutName: String): Boolean = {
    // retrieve donut list that is currently in stock
    val listDonutsFromStock: List[String] = List("Vanilla Donut", "Strawberry Donut", "Plain Donut", "Glazed Donut")

    val iDonutInStock = (donutName.nonEmpty && donutName.length > 0) && (listDonutsFromStock contains donutName)

    iDonutInStock
  }

 //2. How to call a function
  println("\nStep 2: How to call a function")
  println(s"Calling checkDonutAvailability with Vanilla Donut = ${checkDonutAvailability("Vanilla Donut")}")


  //3. How to define a Nested Function

  //If you look closely at the function defined in step 1, you could easily encapsulate the validation logic into a separate function.
  //For the sake of this example, let's assume that the validation logic is tightly coupled with the function itself and should not be visible by any other functions.
  //As a result, we can use a Nested Function as shown below.


  println("\nStep 3: How to define a Nested Function")

  def checkDonutAvailabilityWithNestedFunction(donutName: String): Boolean = {
    // retrieve donut list that is currently in stock
    val listDonutsFromStock = List[String]("Vanilla Donut", "Strawberry Donut", "Plain Donut", "Glazed Donut")

    // validate the donutName parameter by some business logic
    val validate = (name: String) => {
      name.nonEmpty && name.length > 0
    }

    // first run validate and then check if we have a matching donut from our list
    val isDonutInStock = validate(donutName) && (listDonutsFromStock contains donutName)

    isDonutInStock
  }


   //4. How to call a Nested Function

  println("\nStep 4: How to call a Nested Function")
  println(s"Calling checkDonutAvailabilityWithNestedFunction with Vanilla Donut = ${checkDonutAvailabilityWithNestedFunction("Vailla Donut")}")

}
