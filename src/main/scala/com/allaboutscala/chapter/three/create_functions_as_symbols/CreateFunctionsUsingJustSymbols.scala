package com.allaboutscala.chapter.three.create_functions_as_symbols

/**
  * Created by mkoduri on 9/2/2019.
  *
  * Defining functions using symbols is a great feature of Scala to allow you to create Domain Specific Language (DSL).
    However, as shown in Step 6, make sure that the symbols you use are clear to the consumer of your API.


  */


class DonutCostCalculator {

  // We are hard-coding the totalCost value for simplicity.
  val totalCost = 100


  def minusDiscount(discount: Double): Double = {
    totalCost+2 - discount
  }



  //3. How to define function whose name is just the symbol minus
  // Step 3: How to define function whose name is just the symbol minus -
  def -(discount: Double): Double = {
    totalCost - discount
  }


  // Step 6: How to define function whose name is just the symbols +++
  def +++(taxAmount: Double): Double = {
    totalCost + taxAmount
  }



}



class CreateFunctionsUsingJustSymbols extends App{

  /* //Next, let's create an instance of the DonutCostCalculator as follows:
   println("Step 1: How to create and instantiate a class")
   val donutCostCalculator = new DonutCostCalculator()

   //2. How to call a function from an instantiated class

   println("\nStep 2: How to call a function from an instantiated class")
   println(s"Calling minusDiscount() function = ${donutCostCalculator.minusDiscount(10.5)}")


   //4. How to call function whose name is just a symbol
   println("\nStep 4: How to call function whose name is just the symbol -")
   println(s"Calling function - = ${donutCostCalculator.-(10.5)}")*/


}

