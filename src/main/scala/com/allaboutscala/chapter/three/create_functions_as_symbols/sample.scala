package com.allaboutscala.chapter.three.create_functions_as_symbols

/**
  * Created by mkoduri on 9/2/2019.
  *
  *
  *
  */
object sample extends App{

  //Next, let's create an instance of the DonutCostCalculator as follows:
  println("Step 1: How to create and instantiate a class")
  val donutCostCalculator = new DonutCostCalculator()

  //2. How to call a function from an instantiated class

  println("\nStep 2: How to call a function from an instantiated class")
  println(s"Calling minusDiscount() function = ${donutCostCalculator.minusDiscount(10.5)}")


  //4. How to call function whose name is just a symbol
  println("\nStep 4: How to call function whose name is just the symbol -")
  println(s"Calling function - = ${donutCostCalculator.-(10.5)}")


  //6. How to define function whose name is just the symbols +++
  //     let us create another function named +++.
  println("\nHow to define function whose name is just the symbols +++")
  println(s"Calling function - with operator style notation = ${donutCostCalculator.+++ (10.5)}")

}
