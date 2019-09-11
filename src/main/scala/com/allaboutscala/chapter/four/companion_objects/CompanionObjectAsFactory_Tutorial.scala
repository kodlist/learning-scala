package com.allaboutscala.chapter.four.companion_objects

/**
  * Created by mkoduri on 9/7/2019.
  */
object CompanionObjectAsFactory_Tutorial extends App{


  println("Step 1: How to define a simple class to represent a Donut object")
  class Donut(name: String, productCode: Option[Long] = None){

    def print = println(s"Donut name = $name, productCode = ${productCode.getOrElse(0)}")

  }

  println("\nStep 2: How to declare class hierarchy through inheritance using extends keyword")
  //With inheritance in mind, let's create two sub-classes of the Donut class name GlazedDonut and VanillaDonut respectively.
  class GlazedDonut(name: String) extends Donut(name)

  class VanillaDonut(name: String) extends Donut(name)


  println("\nStep 3: How to declare apply method of companion object as a factory")
  object Donut {

    def apply(name: String): Donut = {
      name match {
        case "Glazed Donut" => new GlazedDonut(name)
        case "Vanilla Donut" => new VanillaDonut(name)
        case _ => new Donut(name)
      }
    }

  }


  //To keep the example simple, we also use the wildcard _ to return a new Donut type for anything that is not a Glazed or Vanilla Donut.

  println("\nStep 4: How to call apply method of companion object which is a factory")
  //Calling the Donut's apply() factory method is not different than calling the Donut Companion Object.
  val glazedDonut = Donut("Glazed Donut")
  println(s"The class type of glazedDonut = ${glazedDonut.getClass}")
  glazedDonut.print

  val vanillaDonut = Donut("Vanilla Donut")
  println(s"The class type of vanillaDonut = ${vanillaDonut.getClass}")
  vanillaDonut.print


}
