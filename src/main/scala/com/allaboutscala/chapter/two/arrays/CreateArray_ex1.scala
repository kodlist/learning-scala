package com.allaboutscala.chapter.two.arrays

/**
  * Created by mkoduri on 9/5/2019.
  *
  * The @annotation.tailrec instructs the compiler to add any optimisations with regards to stack frame management as this function is recursive.
  *
  */
object CreateArray_ex1 extends App{


  //1. Using Array

  println("Step 1: How to define an Array of type String")
  val arrayDonuts: Array[String] = Array("Vanilla Donut", "Strawberry Donut", "Plain Donut", "Glazed Donut")


  //diff between tuple and array in scala

  //2. Using Tuple2 to store 2 data points

  println("Step 1: Using Tuple2 to store 2 data points")
  val glazedDonutTuple = Tuple2("Glazed Donut", "Very Tasty")
  println(s"Glazed Donut with 2 data points = $glazedDonutTuple")


  //2. How to define a tail recursive function

    /*donutName parameter of type String for the donut item to search within the Array
    donuts parameter of type String Array for the donut items Array
    index parameter of type Int for the index within the Array on which to run the search*/
  // The @annotation.tailrec instructs the compiler to add any optimisations with regards to stack frame management as this function is recursive.

  println("\nStep 2: How to define a tail recursive function")

  @annotation.tailrec
  def search(donutName: String, donuts: Array[String], index: Int): Option[Boolean] = {
    if(donuts.length == index) {
      None
    } else if(donuts(index) == donutName) {
      Some(true)
    } else {
      val nextIndex = index + 1
      search(donutName, donuts, nextIndex)
    }
  }

  //3. How to call a tail recursive function

  println("\nStep 3: How to call a tail recursive function")
  val found = search("Glazed Donut", arrayDonuts, 0)
  println(s"Find Glazed Donut = $found")

  val notFound = search("Chocolate Donut", arrayDonuts, 0)
  println(s"Find Chocolate Donut = $notFound")

}
