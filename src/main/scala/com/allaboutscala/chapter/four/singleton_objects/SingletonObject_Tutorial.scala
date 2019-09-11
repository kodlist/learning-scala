package com.allaboutscala.chapter.four.singleton_objects

/**
  * Created by mkoduri on 9/7/2019.
  *
  * The Singleton Pattern is so commonly used that Scala has made it very easy to create single instances of an object.
  * All you need to do is to make use of the keyword object as we will show in the steps below.
  *
  * But, Scala does not have a static keyword! Instead, you can simply encapsulate a global field using the val keyword inside a Singleton Object.
  *
  *
  */
object SingletonObject_Tutorial extends App{



  //1. How to declare a Singleton Object

  // we've actually made use of Singleton Objects without even mentioning it! So as a reminder, to create Singleton Objects in Scala,
  // you need to make use of the keyword "Object" as shown below.

  /*println("Step 1: How to declare a Singleton Object")
  object DonutShoppingCartCalculator {

  }*/

  //2. How to define a global field
  //   But, Scala does not have a static keyword! Instead, you can simply encapsulate a global field using the val keyword inside a Singleton Object.

  println("Step 1: How to declare a Singleton Object")

  object DonutShoppingCartCalculator {

    println("\nStep 2: How to define a global field")
    val discount: Double = 0.01

    // Step 3: How to define utility function called calculateTotalCost
    // Scala does not exposed a static keyword.
    // But you can encapsulate functions and methods inside a Singleton Object if you would like to expose some globally accessible utility function or method.
    def calculateTotalCost(donuts: List[String]): Double = {
      // calculate the cost of donuts
      return 1
    }

  }



  //4. How to call global discount field from Step 2

  println("\nStep 4: How to call global discount field from Step 2")
  println(s"Global discount = ${DonutShoppingCartCalculator.discount}")

  println("\nStep 5: How to call the utility function calculateTotalCost from Step 3")
  //To access a global utility function or method, you simply call the Singleton Object with the dot operator and followed by the utility function or method.
  println(s"Call to calculateTotalCost function = ${DonutShoppingCartCalculator.calculateTotalCost(List())}")
}
