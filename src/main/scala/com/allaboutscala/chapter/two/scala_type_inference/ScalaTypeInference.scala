package com.allaboutscala.chapter.two.scala_type_inference

/**
  * Created by mkoduri on 8/29/2019.
  *
  * Type inference can be incredibly useful such as to avoid redundant code when initializing collections for some given type.
    But use it wisely. It is a good practice to be clear about the intent of your data type especially when it comes to the return type of a function.


  */
object ScalaTypeInference extends App{


  println("\nStep 2: Scala Types")
  val donutsBoughtToday = 5
  val bigNumberOfDonuts = 100000000L
  val smallNumberOfDonuts = 1
  val priceOfDonut = 2.50
  val donutPrice = 2.50f
  val donutStoreName = "Allaboutscala Donut Store"
  val donutByte = 0xa
  val donutFirstLetter = 'D'
  val nothing = ()

  //We did not specify the data types for any of the above variables.


  //The Scala compiler is also smart enough to convert from one data type into another.
  // However, you should bear in mind that this conversion is fine so long as your resulting type is not lossy.

  println("\nStep 3: Using Scala compiler to convert from one data type to another")
  val numberOfDonuts: Short = 1
  val minimumDonutsToBuy: Int = numberOfDonuts
  println(minimumDonutsToBuy)
  //Converting from a Short to an Int was fine because there was no precision loss, i.e. an Int is larger than a Short.


  println("\nStep 4: User driven conversion from one data type to another ")
  // NB: You cannot convert from an Int to a String
   //val minimumDonutsToSell: String = numberOfDonuts


  //So how then would you convert an Int to String? As expected in a fluent functional language, you have access to built in conversion functions.
  //in our example, you can call the toString function on numberOfDonuts:
  val minimumDonutsToSell: String = numberOfDonuts.toString()

}
