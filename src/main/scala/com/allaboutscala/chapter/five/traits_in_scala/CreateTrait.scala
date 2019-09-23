package com.allaboutscala.chapter.five.traits_in_scala

/**
  * Created by mkoduri on 9/11/2019.
  *
  * http://allaboutscala.com/tutorials/chapter-5-traits/scala-extend-trait/
  *
  *  we will learn how to create trait which defines methods that a consuming class should implement.
  *
  *  This is similar to implementing an interface if you come from an Object Oriented background and have used Java or .NET in the past.
  *
  *  You create a trait in Scala by making use of the keyword trait.
  *
  *  also see TraitWithTypeParameters
  *
  *  keywords: trait
  *
  */
object CreateTrait extends App{


  //1. Create a trait which will define the methods for a data access layer

  /*Let's start with defining a simple trait called DonutShoppingCartDao
    and it will provide the method signatures to represent a Data Access Layer.*/


  println("Step 1: Create a trait which will define the methods for a data access layer")

  trait DonutShoppingCartDao {

    def add(donutName: String): Long

    def update(donutName: String): Boolean

    def search(donutName: String): String

    def delete(donutName: String): Boolean

  }


  //2. Create a DonutShoppingCart class which extends the trait from Step 1 and implements its methods

  println("\nStep 2: Create a DonutShoppingCart class which extends the trait from Step 1 and implements its methods")
  class DonutShoppingCart extends DonutShoppingCartDao {

    override def add(donutName: String): Long = {
      println(s"DonutShoppingCart-> add method -> donutName: $donutName")
      1
    }

    override def update(donutName: String): Boolean = {
      println(s"DonutShoppingCart-> update method -> donutName: $donutName")
      true
    }

    override def search(donutName: String): String = {
      println(s"DonutShoppingCart-> search method -> donutName: $donutName")
      donutName
    }

    override def delete(donutName: String): Boolean = {
      println(s"DonutShoppingCart-> delete method -> donutName: $donutName")
      true
    }
  }


  //3. Create an instance of DonutShoppingCart and call the add, update, search and delete methods


  println("\nStep 3: Create an instance of DonutShoppingCart and call the add, update, search and delete methods")
  val donutShoppingCart1: DonutShoppingCart = new DonutShoppingCart()
  donutShoppingCart1.add("Vanilla Donut")
  donutShoppingCart1.update("Vanilla Donut")
  donutShoppingCart1.search("Vanilla Donut")
  donutShoppingCart1.delete("Vanilla Donut")


  //4. Create an instance of DonutShoppingCart and assign its type to the trait DonutShoppingCartDao

  println("\nStep 4: Create an instance of DonutShoppingCart and assign its type to the trait DonutShoppingCartDao")
  val donutShoppingCart2: DonutShoppingCartDao = new DonutShoppingCart()
  donutShoppingCart2.add("Vanilla Donut")
  donutShoppingCart2.update("Vanilla Donut")
  donutShoppingCart2.search("Vanilla Donut")
  donutShoppingCart2.delete("Vanilla Donut")



  //we will also show how to use traits to build some pure Functional Programming constructs such as Monoids and Functors and much more!


}
