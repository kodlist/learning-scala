package com.allaboutscala.chapter.four.companion_objects

/**
  * Created by mkoduri on 9/7/2019.
  */
object CompanionObjectFields_Tutorial extends App{


  println("Step 1: How to define a simple class to represent a Donut object")
  class Donut(name: String, productCode: Option[Long] = None){

    def print = println(s"Donut name = $name, productCode = ${productCode.getOrElse(0)}, uuid = ${Donut.uuid}")

  }


  //2. How to declare fields and values in Companion Object

  //But within the print statement above, we also print a unique ID for each donut as represented by the uuid field: uuid = ${Donut.uuid}
  //But where does the uuid field come from? Let's proceed to Step 2 below which shows the Donut Companion Object.


  println("\nStep 2: How to declare fields and values in companion object")
  object Donut {

    private val uuid = 1 // we've declared a uuid value and it is also marked as private.

    def apply(name: String, productCode: Option[Long]): Donut = {
      new Donut(name, productCode)
    }

    def apply(name: String): Donut = {
      new Donut(name)
    }
  }



  //3. How to create instances of the Donut class using the Companion Object

  println("\nStep 3: How to create instances of the Donut class using the companion object")
  val glazedDonut = Donut("Glazed Donut", Some(1111))
  val vanillaDonut = Donut("Vanilla Donut")


  //4. val to: Nothing = null val function: Nothing = null

  println("\nStep 4: How to call function on each Donut object")
  glazedDonut.print
  vanillaDonut.print
}
