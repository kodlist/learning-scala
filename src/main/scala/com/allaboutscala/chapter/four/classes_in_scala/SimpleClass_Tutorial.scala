package com.allaboutscala.chapter.four.classes_in_scala

/**
  * Created by mkoduri on 9/7/2019.
  */
object SimpleClass_Tutorial extends App{


  //1.. How to define a simple class to represent a Donut object

  println("Step 1: How to define a simple class to represent a Donut object")

  class Donut(name: String, productCode: Long) {

    def print = println(s"Donut name = $name, productCode = $productCode")

  }


  println("\nStep 2: How to create instances of Donut class")
  val glazedDonut = new Donut("Glazed Donut", 1111)
  val vanillaDonut = new Donut("Vanilla Donut", 2222)


  println("\nStep 3: How to call the print function for each of the donut object")
  glazedDonut.print
  vanillaDonut.print



  //4. How to access the properties of class Donut

  println("\nStep 4: How to access the properties of class Donut")
  /*glazedDonut.name
  glazedDonut.productCode*/

  //You will get a compiler error if you try to access either the name or productCode properties from the donut objects.
  //Sure you could define getter functions to expose these properties, but
  // in upcoming tutorials we will show how to make use of case class to automatically provide accessors for your objects.



}
