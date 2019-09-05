package com.allaboutscala.chapter.three.define_use_functions

/**
  * Created by mkoduri on 8/30/2019.
  */
object DefineAndUseFunctions extends App{

  //1. How to define and use a function which has no parameters and has a return type
  //   We did not use any return keyword in favoriteDonut() as you would in say Java or .NET.
  println("Step 1: How to define and use a function which has no parameters and has a return type")
  def favoriteDonut(): String = {
    "Glazed Donut"
  }

  val myFavoriteDonut = favoriteDonut()
  println(s"My favorite donut is $myFavoriteDonut")


  //2. How to define and use a function with no parenthesis
  //   In general, you should define your functions without parenthesis if you are defining a function that does not have any side effects.
  //   Limit its usage to pure and simple functions only!
  println("\nStep 2: How to define and use a function with no parenthesis")
  def leastFavoriteDonut = "Plain Donut"
  println(s"My least favorite donut is $leastFavoriteDonut")


  //3. How to define and use a function with no return type
  //   Unit is similar to using the void keyword in a method.

  println("\nStep 3: How to define and use a function with no return type")
  def printDonutSalesReport(): Unit = {
    // lookup sales data in database and create some report
    println("Printing donut sales report... done!")
  }
  printDonutSalesReport()





}
