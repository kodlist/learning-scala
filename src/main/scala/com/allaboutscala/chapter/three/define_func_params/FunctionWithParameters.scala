package com.allaboutscala.chapter.three.define_func_params

import scala.util.Random
/**
  * Created by mkoduri on 8/30/2019.
  *
  * how to create functions that take parameters as input in Scala.
  *
  *
  */
object FunctionWithParameters extends App{

  //1. How to define function with parameters

  println("Step 1: How to define function with parameters")

  def calculateDonutCost(donutName: String, quantity: Int): Double = {
    println(s"Calculating cost for $donutName, quantity = $quantity")

    // make some calculations ...
    2.50 * quantity
  }

  // stored the value which is returned from our calculateDonutCost function into an immutable variable called totalCost.
  println("\nStep 2: How to call a function with parameters")
  val totalCost = calculateDonutCost("Glazed Donut", 5)
  println(s"Total cost of donuts = $totalCost")


  //3. How to add default values to function parameters
  println("\nStep 3: How to add default values to function parameters")

  def calculateDonutCost2(donutName: String, quantity: Int, couponCode: String = "NO CODE"): Double = {
    println(s"Calculating cost for $donutName, quantity = $quantity, couponCode = $couponCode")
    // make some calculations ...

    if( couponCode == "NO CODE"){
      2.50 * quantity
    }else{
      2.50 * quantity - 2
    }

  }

  println("\nStep 4: How to call a function with parameters that has default values")
  val totalCostWithDiscount = calculateDonutCost2("Glazed Donut", 4, "COUPON_12345")
  val totalCostWithoutDiscount = calculateDonutCost2("Glazed Donut", 4)

  println(s"  totalCostWithDiscount = $totalCostWithDiscount")
  println(s"  totalCostWithoutDiscount = $totalCostWithoutDiscount")



  // 5. function with no params.
  //    this kind of declaration is useful with call-by-name function
  val randomExchangeRate = new Random(10)
  def usdToGbp: Double = {
    val rate = randomExchangeRate.nextDouble()
    println(s"Fetching USD to GBP exchange rate = $rate")
    rate
  }


}
