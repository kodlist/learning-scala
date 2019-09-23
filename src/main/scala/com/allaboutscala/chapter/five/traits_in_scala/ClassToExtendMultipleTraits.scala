package com.allaboutscala.chapter.five.traits_in_scala

/**
  * Created by mkoduri on 9/11/2019.
  *
  *  keywords: override, trait, extends, with
  *
  *  eg: trait DonutShoppingCartDao[A]
  *  eg: trait DonutInventoryService[A]
  *  eg: class DonutShoppingCart[A] extends DonutShoppingCartDao[A] with DonutInventoryService[A]
  *
  */
object ClassToExtendMultipleTraits extends App{


  //1. Create a trait which will define the methods for a data access layer

  println("Step 1: Create a trait with type which will define the methods for a data access layer")
  trait DonutShoppingCartDao[A] {

    def add(donut: A): Long

    def update(donut: A): Boolean

    def search(donut: A): A

    def delete(donut: A): Boolean

  }


  //2. Create a second trait which will define the methods for checking donut inventory

  println("\nStep 2: Create a second trait which will define the methods for checking donut inventory")
  trait DonutInventoryService[A] {

    def checkStockQuantity(donut: A): Int

  }


  //3. Create a DonutShoppingCart class which extends multiple traits namely trait DonutShoppingCartDao and trait DonutInventoryService

  println("\nStep 3: Create a DonutShoppingCart class which extends multiple traits namely trait DonutShoppingCartDao and trait DonutInventoryService")
  class DonutShoppingCart[A] extends DonutShoppingCartDao[A] with DonutInventoryService[A] {

    override def add(donut: A): Long = {
      println(s"DonutShoppingCart-> add method -> donut: $donut")
      1
    }

    override def update(donut: A): Boolean = {
      println(s"DonutShoppingCart-> update method -> donut: $donut")
      true
    }

    override def search(donut: A): A = {
      println(s"DonutShoppingCart-> search method -> donut: $donut")
      donut
    }

    override def delete(donut: A): Boolean = {
      println(s"DonutShoppingCart-> delete method -> donut: $donut")
      true
    }

    override def checkStockQuantity(donut: A): Int = {
      println(s"DonutShoppingCart-> checkStockQuantity method -> donut: $donut")
      10
    }
  }



  //4. Create an instance of DonutShoppingCart and call the add, update, search and delete methods

  println("\nStep 4: Create an instance of DonutShoppingCart and call the add, update, search and delete methods")
  val donutShoppingCart: DonutShoppingCart[String] = new DonutShoppingCart[String]()
  donutShoppingCart.add("Vanilla Donut")
  donutShoppingCart.update("Vanilla Donut")
  donutShoppingCart.search("Vanilla Donut")
  donutShoppingCart.delete("Vanilla Donut")



 //5. Call the checkStockQuantity method which was inherited from trait DonutInventoryService

  println("\nStep 5: Call the checkStockQuantity method which was inherited from trait DonutInventoryService")
  donutShoppingCart.checkStockQuantity("Vanilla Donut")


 //We've kept the trait type parameters example simple but it would be good to review variance namely covariance and contra-variance type parameters.

 /* In upcoming tutorials in this Chapter, we will also show how to use traits to build some pure Functional Programming
    constructs such as Monoids and Functors and much more!*/

}
