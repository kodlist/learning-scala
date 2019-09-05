package com.allaboutscala.chapter.three.generic_typed_functions

/**
  * Created by mkoduri on 9/1/2019.
  */
object GenericTypedFunc extends App{


  //4. How to define a generic typed function which will specify the type of its parameter
  //   we will create a typed function which will specify a generic parameter of type T as follows:

  // Also see : TypedFunctions.scala object in this tutorial

  println("\nStep 4: How to define a generic typed function which will specify the type of its parameter")

  def applyDiscount[T](discount: T) {
    discount match {
      case d: String =>
        println(s"Lookup percentage discount in database for $d")

      case d: Double =>
        println(s"$d discount will be applied")

      case _ =>
        println("Unsupported discount type")
    }
  }


  println("\nStep 5: How to call a function which has typed parameters")
  applyDiscount[String]("COUPON_123")
  applyDiscount[Double](10)

  println()
  println(s"Result of applyDiscount with Double parameter = ${applyDiscount[String]("COUPON_123")}")
}
