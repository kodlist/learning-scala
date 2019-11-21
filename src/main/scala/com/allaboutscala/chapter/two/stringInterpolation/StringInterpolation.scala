package com.allaboutscala.chapter.two.stringInterpolation

/**
  * Created by mkoduri on 8/29/2019.
  *
  *
  * we will go over String interpolation in Scala which allows us to easily print and format variables and expressions
  *
  * For additional information on formatting numbers using the f interpolation, you can refer to the Java documentation.
  */
object StringInterpolation extends App{

  println("Step 1: Using String interpolation to print a variable")
  val favoriteDonut: String = "Glazed Donut"

  //without interpolation
  println(s"My favorite donut " + favoriteDonut)
  println(s"My favorite donut = $favoriteDonut")


  println("\nStep 2: Using String interpolation on object properties")
  case class Donut(name: String, tasteLevel: String)
  val favoriteDonut2: Donut = Donut("Glazed Donut", "Very Tasty")
  println(s"My favorite donut name = ${favoriteDonut2.name}, tasteLevel = ${favoriteDonut2.tasteLevel}")



  // you can use String interpolation with expressions by using the curly braces
  println("\nStep 3: Using String interpolation to evaluate expressions")
  val qtyDonutsToBuy: Int = 10
  println(s"Are we buying 10 donuts = ${qtyDonutsToBuy == 10}")


 //Using String interpolation for formatting text
  println("\nStep 4: Using String interpolation for formatting text")
  val donutName: String = "Vanilla Donut"
  val donutTasteLevel: String = "Tasty"
  println(f"$donutName%20s $donutTasteLevel")


  //5. Using f interpolation to format numbers
  //first print the price of one donut using the s interpolation:
  println("\nStep 5: Using f interpolation to format numbers")
  val donutPrice: Double = 2.50
  println(s"Donut price = $donutPrice")

 // if we wanted to print the 2 decimal places for the donutPrice variable. This can be achieved by using the f interpolator.
  println(f"Donut price = $donutPrice%.2f")



  //The raw String interpolation will allow you to print any symbols within your String.
  // n the example below we would like to print the donut name followed by \t, as opposed to evaluating \t to tab spaces:
  println("\nStep 6: Using raw interpolation")
  println(raw"Favorite donut\t$donutName")
}
