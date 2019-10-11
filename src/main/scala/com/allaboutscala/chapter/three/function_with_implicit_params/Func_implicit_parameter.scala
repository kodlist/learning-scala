package com.allaboutscala.chapter.three.function_with_implicit_params

/**
  * Created by mkoduri on 8/30/2019.
  *
  *
  *  As a matter of fact, dependency injection is built-into the Scala language such that you do not have
  *  to import another third party library such as Google Guice
  *
  *
  */
object Func_implicit_parameter extends App{



  //1. How to define a function which has an implicit parameter
  //   To this end, we will define the discount parameter as implicit as shown below:

  println(s"Step 1: How to define a function with an implicit parameter")


  def totalCost(donutType: String, quantity: Int)(implicit discountx: Double): Double = {
    println(s"Calculating the price for $quantity $donutType")
    println(s" discount is $discountx")
    val totalCost = 10 * quantity * (1 - discountx)
    totalCost
  }

 /* println("\nStep 2: How to define an implicit value")
  implicit val discount1: Double = 0.2
  println(s"All customer will receive a ${discount1 * 100}% discount")
  implicit val discount2: Double = 0.1
  println(s"All customer will receive a ${discount2 * 100}% discount")*/       // this will throw runtime error: ambiguous implicit values, there needs to be only one implicit value

  implicit val discount1: Double = 0.2
  println(s"All customer will receive a ${discount1 * 100}% discount")

  //3. How to call a function which has an implicit parameter
  println("\nStep 3: How to call a function which has an implicit parameter")
  println(s"""Total cost with discount of 10 Glazed Donuts = ${totalCost("Glazed Donut", 10)}""")


 /* implicit val discount2: Double = 0.1
  println(s"All customer will receive a ${discount2 * 100}% discount")*/

 /* You did not have to manually pass-through the discount value when calling the totalCost() function.
  The Scala compiler will look for an implicit value of type Double for the discount implicit parameter which you've defined in Step 2.
  If there are no implicit values in scope, you will get a compiler error.*/



  //4. How to define a function which takes multiple implicit parameters

  println("\nStep 4: How to define a function which takes multiple implicit parameters")
  def totalCost2(donutType: String, quantity: Int)(implicit discount: Double, storeName: String): Double = {
    println(s"[$storeName] Calculating the price for $quantity $donutType")
    val totalCost = 2.50 * quantity * (1 - discount)
    totalCost
  }


  // the implicit variable is defined above.
  println("\nStep 5: How to call a function which takes multiple implicit parameters")
  implicit val storeName: String = "Tasty Donut Store"
  println(s"""Total cost with discount of 5 Glazed Donuts = ${totalCost2("Glazed Donut", 5)}""")


  //6. How to manually pass-through implicit parameters
  //   In rare occasions, you may have to manually pass-through the implicit parameter values.
  println("\nStep 6: How to manually pass-through implicit parameters")
  println(s"""Total cost with discount of 5 Glazed Donuts, manually passed-through = ${totalCost2("Glazed Donut", 5)(0.1, "Scala Donut Store")}""")


  //However, It is a good practice to encapsulate your implicit values into an Object or a Package Object.

}
