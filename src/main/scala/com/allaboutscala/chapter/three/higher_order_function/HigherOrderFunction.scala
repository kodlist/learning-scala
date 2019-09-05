package com.allaboutscala.chapter.three.higher_order_function

/**
  * Created by mkoduri on 9/2/2019.
  *
  *  we will learn how to create Higher Order Function which is a function that takes another function as its parameter.
  *
  *
  * In addition, we will show how to pass-through an anonymous function or a regular def function to the Higher Order Function.
  *
  *
  */
object HigherOrderFunction extends App{

  //1. Review how to define function with curried parameter groups
  //   The totalCost() function has a discount parameter which could be a potential candidate to pass-through a function to apply the discount logic.
  //   In other words, let's redefine the totalCost() function to take another function for the discount parameter a shown below in Step 2.

  println("Step 1: Review how to define function with curried parameter groups")
  def totalCost(donutType: String)(quantity: Int)(discount: Double): Double = {
    println(s"Calculating total cost for $quantity $donutType with ${discount * 100}% discount")
    val totalCost = 2.50 * quantity
    totalCost - (totalCost * discount)
  }


  //2. How to define a higher order function which takes another function as parameter
  //  A Higher Order Function is a function which takes another function as its parameters.
  println("\nStep 2: How to define a higher order function which takes another function as parameter")
  def totalCostWithDiscountFunctionParameter(donutType: String)(quantity: Int)(f: Double => Double): Double = {
    println(s"Calculating total cost for $quantity $donutType")
    val totalCost = 2.50 * quantity   /// note, totalCost will be passed into our function
    println(s"totalcost   :  ${ f(totalCost)}")
    f(totalCost)
  }


  //In the totalCostWithDiscountFunctionParameter() function, you call the function f by passing it the totalCost value
  // f(totalCost)
  //This function f will be provided at the time when you call thetotalCostWithDiscountFunctionParameter() function.

  //3. How to call higher order function and pass an anonymous function as parameter

  //we will pass through an anonymous function which will apply the discount logic to the totalCost value as shown below:
  // note: totalCost - this var is nothing to do with totalCost in totalCostWithDiscountFunctionParameter() function
  println("\nStep 3: How to call higher order function and pass an anonymous function as parameter")
  val totalCostOf5Donuts = totalCostWithDiscountFunctionParameter("Glazed Donut")(5){totalCost =>
    val discount = 2 // assume you fetch discount from database
    totalCost - discount
  }
  println(s"Total cost of 5 Glazed Donuts with anonymous discount function = $totalCostOf5Donuts")




  //4. How to define and pass a function to a higher order function
  //   To this end, let's create a function named applyDiscount as follows:
  //   A better approach to Step 3 is to pass-through a common discount function which would encapsulate
  //  the discount logic instead of providing an anonymous function.

  println("\nStep 4: How to define and pass a function to a higher order function")
  def applyDiscount(totalCost: Double): Double = {
    val discount = 3 // assume you fetch discount from database
    totalCost - discount
  }

  println(s"Total cost of 5 Glazed Donuts with discount function = ${totalCostWithDiscountFunctionParameter("Glazed Donut")(5)(applyDiscount(_))}")



}
