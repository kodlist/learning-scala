package com.allaboutscala.chapter.four.covariance_type_class

/**
  * Created by mkoduri on 9/11/2019.
  *
  *
  * To follow on from the previous tutorial on Type Class, we will show example of enforcing type hierarchies through the use of variance - in particular covariance.
  *
  *
  * Unlike the previous tutorial on Class Inheritance, we did not have to
    create a Companion Object for the VanillaDonut case class because the case class will automatically provide a companion object.
  *
  * We've enabled covariance of type Donuts using the notation [+D <: Donut]
  * keywords: covariance eg: [+D <: Donut]
  *
  */

object Covariance_Tutorial extends App{

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
  //Unlike the previous tutorial on Class Inheritance, we did not have to
  //create a Companion Object for the VanillaDonut case class because the case class will automatically provide a companion object.


  //3. How to extend abstract class Donut and define another case class of Donut called GlazedDonut


  println("\nStep 3: How to extend abstract class Donut and define another case class called GlazedDonut")
  case class GlazedDonut(name: String) extends Donut(name) {

    override def printName: Unit = println(name)

  }


  //4. How to instantiate Donut objects

  println("\nStep 4: How to instantiate Donut objects")
  val vanillaDonut: VanillaDonut = VanillaDonut("Vanilla Donut")
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


  //7. How to enable covariance on ShoppingCart

  println(s"\nStep 7: How to enable covariance on ShoppingCart")
  class ShoppingCart2[+D <: Donut](donuts: Seq[D]) {

    def printCartItems: Unit = donuts.foreach(_.printName)

  }


  /*case class VanillaFlvDonut(name: String) extends VanillaDonut(name) {

    override def printName: Unit = println(name)

  }*/

  /*val vanillaFlvDonut: VanillaDonut = VanillaFlvDonut("Glazed Donut")
  vanillaFlvDonut.printName*/

  println("\nStep 8: How to create instances or objects for the VanillaDonut case class")
  val vanillaFlvDonut: VanillaDonut = VanillaDonut("VanillaFlv Donut")

  val shoppingCart2: ShoppingCart2[Donut] = new ShoppingCart2[VanillaDonut](Seq(vanillaDonut, vanillaFlvDonut))   // see line 79 , 86 and line 93, 108
  shoppingCart2.printCartItems

  /*val shoppingCart2: ShoppingCart2[Donut] = new ShoppingCart2[VanillaDonut](Seq(vanillaDonut))     // this two lines of code works fine.
  shoppingCart2.printCartItems*/


}
