package com.allaboutscala.chapter.four.class_inheritance_abstract_class

/**
  * Created by mkoduri on 9/10/2019.


  * we will learn the basics of Class Inheritance in Scala by creating an abstract class and then extending it to create other sub-classes.

  * Scala is both an Object Oriented and Functional programming language.
  *
  * As a result of its Object Oriented nature, it has full support of object hierarchies through the use of class inheritance.
  *
  * Also see 'CompanionObject_Tutorial'
  *
  * keypoints: override, companion object
  *
  *
  */
object CaseClassInheritance_Tutorial extends App{


 //1. How to define an abstract class called Donut

  println("Step 1: How to define an abstract class called Donut")
  abstract class Donut(name: String) {

    def printName: Unit

  }


  //Any class which extends the abstract class Donut will have to provide an implementation for the printName method

  //2. How to extend abstract class Donut and define a sub-class of Donut called VanillaDonut

  println("\nStep 2: How to extend abstract class Donut and define a sub-class of Donut called VanillaDonut")
  class VanillaDonut(name: String) extends Donut(name) {

    override def printName: Unit = println(name)

  }

  object VanillaDonut {

    def apply(name: String): Donut = {
      new VanillaDonut(name)
    }

  }

  // as stated above, We've also created a Companion Object for the VanillaDonut class


  //3. How to extend abstract class Donut and define another sub-class of Donut called GlazedDonut

  println("\nStep 3: How to extend abstract class Donut and define another sub-class of Donut called GlazedDonut")
  class GlazedDonut(name: String) extends Donut(name) {

    override def printName: Unit = println(name)

  }

  object GlazedDonut {

    def apply(name: String): Donut = {
      new GlazedDonut(name)
    }

  }


  //4. How to instantiate Donut objects

  println("\nStep 4: How to instantiate Donut objects")
  val vanillaDonut: Donut = VanillaDonut("Vanilla Donut")
  vanillaDonut.printName

  val glazedDonut: Donut = GlazedDonut("Glazed Donut")
  glazedDonut.printName


  //However, in Chapter 5, we will show how Scala provides greater flexibility to class inheritance by making use of mix-in with traits.

}
