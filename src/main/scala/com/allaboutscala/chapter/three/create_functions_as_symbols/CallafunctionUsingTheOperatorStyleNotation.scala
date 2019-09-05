package com.allaboutscala.chapter.three.create_functions_as_symbols

/**
  * Created by mkoduri on 9/2/2019.
  */
object CallafunctionUsingTheOperatorStyleNotation extends App{

  //Next, let's create an instance of the DonutCostCalculator as follows:
  println("Step 1: How to create and instantiate a class")
  val donutCostCalculator = new DonutCostCalculator()


  println("\nStep 5: How to call a function using the operator style notation")
  //Using operator style is more clear when calling functions whose names are just symbols. it automatically picks the symbol function in scala class.
  println(s"Calling function - with operator style notation = ${donutCostCalculator - 10.5}")




}
