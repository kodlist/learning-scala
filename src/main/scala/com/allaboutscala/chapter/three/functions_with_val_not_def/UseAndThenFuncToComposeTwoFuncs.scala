package com.allaboutscala.chapter.three.functions_with_val_not_def

/**
  * Created by mkoduri on 9/5/2019.
  *
  * val functions are instances of FunctionN classes
  *
  * Val functions inherit the andThen function and we will show how to use the andThen function to compose two functions together.
  *
  * Mathematically speaking, f(x) andThen g(x) = g(f(x)). The results of the first function f(x) is ran first and will be passed as input to the second function g(x).
  *
  */
object UseAndThenFuncToComposeTwoFuncs extends App{


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

  println("\nStep 5: How to call andThen on a val function")
  println(s"Total cost of 5 donuts = ${ (applyDiscountValFunction andThen applyTaxValFunction)(totalCost) }")



}
