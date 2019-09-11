package com.allaboutscala.chapter.four.class_inheritance_abstract_class

/**
  * Created by mkoduri on 9/10/2019.
  *
  * Scala provides support for the traditional Object Oriented approach regarding class inheritance by extending classes.
  *
  * Avoid having a case class extend other case classes. Instead, encapsulate common behaviour in an abstract class
  *
  * in Chapter 5, we will show how Scala provides greater flexibility to class inheritance by making use of mix-in with traits.
  *
  * in the next tutorials, we will expand on what we've learned on type classes and go over variance in Scala - covariance and contra-variance.
  *
  * keywords: case, override, restricting eg: With the notation [D <: Donut]
  *
  * http://allaboutscala.com/tutorials/chapter-3-beginner-tutorial-using-classes-scala/scala-type-class/
  *
  * also see CompanionObject_Tutorial.scala
  */
object TypeClass_Tutorial extends App{


  //1. How to define an abstract class called Donut

  println("Step 1: How to define an abstract class to represent a Donut object")
  abstract class Donut(name: String) {

    def printName: Unit

  }


  //2. How to extend abstract class Donut and define a case class called VanillaDonut


  println("\nStep 2: How to extend abstract class Donut and define a case class called VanillaDonut")
  case class VanillaDonut(name: String) extends Donut(name) {

    override def printName: Unit = println(name)

  }

 //  3. How to extend abstract class Donut and define another case class of Donut called GlazedDonut

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

  //Since VanillaDonut and GlazedDonut are sub-classes of the base class Donut, they both have access to the printName method.



  //5. How to define a ShoppingCart typed class which expects Donut types
  //   As an example, let us define a ShoppingCart class which expects a sequence of Donut types.
  //   With the notation [D <: Donut], we are restricting only Donut types to be passed-through to the ShoppingCart class
  println("\nStep 5: How to define a ShoppingCart typed class which expects Donut types")
  class ShoppingCart[D <: Donut](donuts: Seq[D]) {

      def printCartItems: Unit = donuts.foreach(_.printName)

  }


  //6. How to create instances or objects of ShoppingCart class

  println("\nStep 6: How to create instances or objects of ShoppingCart class")
  val shoppingCart: ShoppingCart[Donut] = new ShoppingCart(Seq[Donut](vanillaDonut, glazedDonut))
  //val shoppingCart: ShoppingCart[Donut] = new ShoppingCart(Seq(vanillaDonut, glazedDonut))   // this also works.
  shoppingCart.printCartItems
  //As an example, you will get a compiler error if you tried to create ShoppingCart of type String



}
