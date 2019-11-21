package com.allaboutscala.chapter.two.stringInterpolation

/**
  * Created by mkoduri on 11/1/2019.
  */
object InterpolatorsEx extends App{


  println("Step 1: Using String interpolation to print a variable")
  val favoriteDonut: String = "Glazed Donut"
  val price: Int = 10

  //without interpolation
  println(s"My favorite donut " + favoriteDonut)
  println(s"My favorite donut = $favoriteDonut")

  //embed an experession
  println(s"My price donut = ${price + 3 }")

  // f - interpolation
  println(f"My price donut = $price%.2f ")

  // normal tab
  println("Your electricity bill is : \t "+ price)

  //raw - interpolation
  println(raw"Your electricity bill is : \t "+ price)
}
