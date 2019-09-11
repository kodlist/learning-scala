package com.allaboutscala.chapter.four.companion_objects

/**
  * Created by mkoduri on 9/7/2019.
  *
  * In the next tutorial, we will go over Companion Objects which will allow you create objects without having to use the new keyword.
    We will also go over case classes which is a feature of Scala that will help you reduce boiler plate code by automatically
    generating accessors functions, hashCode and equals() methods.

  * Notice that class name and Companion Object name inside scale object are same and compiler is not complaining.


  */
object CompanionObject_Tutorial extends App{


  println("Step 1: How to define a simple class to represent a Donut object")
  class Donut(name: String, productCode: Long) {

    def print = println(s"Donut name = $name, productCode = $productCode")

  }

  println("\nStep 2: How to declare a companion object for the Donut class")
  object Donut {

    def apply(name: String, productCode: Long): Donut = {
      new Donut(name, productCode)
    }

  }


  println("\nStep 3: How to create instances of the Donut class using the companion object")
  val glazedDonut: Donut = Donut("Glazed Donut", 1111)
  val vanillaDonut = Donut("Vanilla Donut", 2222)

  //Sure you could argue that the companion object is not really adding any special value other than not having to use the new keyword.

  println("\nStep 4: How to call function on each Donut object")
  glazedDonut.print
  vanillaDonut.print


}
