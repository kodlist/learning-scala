package com.allaboutscala.chapter.three.function_currying

/**
  * Created by mkoduri on 9/2/2019.
  */
object FunctionWithCurriedParameterGroups extends App{

  //Scala also allows you to create functions where each parameter is enclosed within its own group using the () as shown below:
  //Functions defined with parameter groups are also commonly referred to as curried functions.
  println("Step 1: How to define function with curried parameter groups")
  def totalCost(donutType: String)(quantity: Int)(discount: Double): Double = {
    println(s"Calculating total cost for $quantity $donutType with ${discount * 100}% discount")
    val totalCost = 2.50 * quantity
    totalCost - (totalCost * discount)
  }


   //2. How to call a function with curried parameter groups
  println("\nStep 2: How to call a function with curried parameter groups")
  println(s"Total cost = ${totalCost("Glazed Donut")(10)(0.1)}")


  //3. How to create a partially applied function from a function with curried parameter groups
  //   one common application of curried function is to be a building block where you can reuse functions by creating partial functions.
  //   let's create a partially applied function named totalCostForGlazedDonuts which will call the curried totalCost() function from Step 1.

  println("\nStep 3: How to create a partially applied function from a function with curried parameter groups")
  val totalCostForGlazedDonuts = totalCost("Glazed Donut") _
  //totalCostForGlazedDonuts is a partially applied function because it only fills in the first parameter Glazed Donut.
  // It uses the wildcard _ as a placeholder for the other parameters.
  //Note that the return type of the partially applied function totalCostForGlazedDonuts is Int => Double => Double.
  // he first Int is for our quantity parameter, the Double is for discount parameter and the last Double the return type of the function.
  // In short, the partially applied function creates a chain of functions.


  println("\nStep 4: How to call a partially applied function")
  println(s"\nTotal cost for Glazed Donuts ${totalCostForGlazedDonuts(10)(0.2)}")


}
