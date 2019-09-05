package com.allaboutscala.chapter.three.functions_with_val_not_def

/**
  * Created by mkoduri on 9/5/2019.
  *
  * val functions are instances of FunctionN classes
  *
  * Val functions inherit the compose function and we will show how to use the compose function to compose two functions together.
  *
  * Mathematically speaking, f(x) compose g(x) = f(g(x)). The second function g(x) is ran first and its result is passed along to the function f(x).
  *
  * Note however that the ordering when composing function using the compose method is different to using andThen
  *
  *
  * Ordering using andThen: f(x) andThen g(x) = g(f(x))
    Ordering using compose: f(x) compose g(x) = f(g(x))


  */
object UseComposeFunctionToComposeTwoFunctions extends App{



  //1. Assume a pre-calculated total cost amount

  println("Step 1: Assume a pre-calculated total cost amount")
  val totalCost: Double = 10

  //2. How to define a val function to apply discount to total cost

  println("\nStep 2: How to define a val function to apply discount to total cost")
  val applyDiscountValFunction = (amount: Double) => {
    println("Apply discount function")
    val discount = 2 // fetch discount from database
    amount - discount
  }


  //3. How to call a val function

  println("\nStep 3: How to call a val function")
  println(s"Total cost of 5 donuts with discount = ${applyDiscountValFunction(totalCost)}")


  //4. How to define a val function to apply tax to total cost

  println("\nStep 4: How to define a val function to apply tax to total cost")
  val applyTaxValFunction = (amount: Double) => {
    println("Apply tax function")
    val tax = 1 // fetch tax from database
    amount + tax
  }


  //5. How to call compose on a val function

  println("\nStep 5: How to call compose on a val function")
  println(s"Total cost of 5 donuts = ${ (applyDiscountValFunction compose applyTaxValFunction)(totalCost) }")


}
