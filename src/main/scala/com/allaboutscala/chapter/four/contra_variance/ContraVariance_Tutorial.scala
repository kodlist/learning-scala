package com.allaboutscala.chapter.four.contra_variance

/**
  * Created by mkoduri on 9/11/2019.
  *
  *  we will also define a class which expects a given type - type class.
  *
  * To follow on from the previous tutorials on Type Class and Covariance Type Parameter,
  * we will show example of enforcing type hierarchies through the use of variance - in particular contra-variance.
  *
  * We've enabled contra-variance of type Donuts using the notation [-D <: Donut]
  *
    In other words, you can now have a ShoppingCart of type VainllaDonut ShoppingCart[VanillaDonut] reference ShoppingCart of type Donut ShoppingCart2[Donut]
  *
  */
object ContraVariance_Tutorial extends App{

  //1. How to define an abstract class called Donut

  println("Step 1: How to define an abstract class called Donut")
  abstract class Donut(name: String) {

    def printName: Unit

  }

  //2. How to extend abstract class Donut and define a case class called VanillaDonut

  println("\nStep 2: How to extend abstract class Donut and define a case class called VanillaDonut")
  case class VanillaDonut(name: String) extends Donut(name) {

    override def printName: Unit = println(name)

  }


  //3. How to extend abstract class Donut and define another case class of Donut called GlazedDonut

  println("\nStep 3: How to extend abstract class Donut and define another case class called GlazedDonut")
  case class GlazedDonut(name: String) extends Donut(name) {

    override def printName: Unit = println(name)

  }

  //4. How to instantiate Donut objects

  println("\nStep 4: How to instantiate Donut objects")
  val vanillaDonut: Donut = VanillaDonut("Vanilla Donut")
  vanillaDonut.printName

  val glazedDonut: Donut = GlazedDonut("Glazed Donut")
  glazedDonut.printName



  //5. How to define a ShoppingCart type class which expects Donut types

  println("\nStep 5: How to define a ShoppingCart type class which expects Donut types")
  class ShoppingCart[D <: Donut](donuts: Seq[D]) {

    def printCartItems: Unit = donuts.foreach(_.printName)

  }
  //With the notation [D <: Donut], we are restricting only Donut types to be passed-through to the ShoppingCart class.

  //6. How to create instances or objects of ShoppingCart class

  println("\nStep 6: How to create instances or objects of ShoppingCart class")
  val shoppingCart: ShoppingCart[Donut] = new ShoppingCart(Seq[Donut](vanillaDonut, glazedDonut))
  shoppingCart.printCartItems


  //Assume you want a ShoppingCart of VanillaDonut but would also like to inject Donut types.
  //You will get a compiler error when trying to have a ShoppingCart[VanillaDonut] reference a ShoppingCart[Donut]

  //val shoppingCart: ShoppingCart[VanillaDonut] = new ShoppingCart[Donut](Seq(glazedDonut))


  //7. How to enable contra-variance on ShoppingCart

  println(s"\nStep 7: How to enable contra-variance on ShoppingCart")
  class ShoppingCart2[-D <: Donut](donuts: Seq[D]) {

    def printCartItems: Unit = donuts.foreach(_.printName)

  }

  val shoppingCart2: ShoppingCart2[VanillaDonut] = new ShoppingCart2[Donut](Seq(glazedDonut))
  shoppingCart2.printCartItems






}
