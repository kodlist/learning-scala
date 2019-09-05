package com.allaboutscala.chapter.three.typed_functions

/**
  * Created by mkoduri on 9/1/2019.
  *
  * we will learn how to create typed functions which will allow you to specify the types of the parameters when calling the function.
  *
  *
  */
object TypedFunctions extends App{


  //1. How to define a function which takes a String parameter

  println("Step 1: How to define a function which takes a String parameter")
  def applyDiscount(couponCode: String) {
    println(s"Lookup percentage discount in database for $couponCode")
  }


  //2. How to define a function which takes a parameter of type Double

  println("\nStep 2: How to define a function which takes a parameter of type Double")
  def applyDiscount(percentageDiscount: Double) {
    println(s"$percentageDiscount discount will be applied")
  }

  println("\nStep 3: Calling applyDiscount function with String or Double parameter types")
  applyDiscount("COUPON_1234")
  applyDiscount(10)




}
