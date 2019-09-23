package com.allaboutscala.chapter.five.use_trait_companionobjects_to_built_factorypattern

/**
  *
  * Created by mkoduri on 9/12/2019.
  *
  *
  * how to use traits and companion objects to implement a Factory Pattern.
  *
  *  //In a real application, you would perhaps want to control the types of cakes and pattern match on an enum as opposed to a String.
     // In upcoming tutorial, I will show you how to use sealed traits to define enum.
  *
  *  http://allaboutscala.com/tutorials/chapter-5-traits/scala-traits-companion-object-factory-pattern/
  *
  *
  */
object Factory_Pattern extends App{

  //1. Define a wrapper object called Cakes to hold various types of cakes

  // Step 1: Define a wrapper object called Cakes to hold various types of cakes
  object Cakes {

    // Step 2: Define a base trait to represent a Cake
    trait Cake {
      def name: String
    }

    // Step 3: Define class implementations for the Cake trait namely: Cupcake, Donut and UnknownCake
    class UnknownCake extends Cake {
      override def name: String = "Unknown Cake ... but still delicious!"
    }

    class Cupcake extends Cake {
      override def name: String = "Cupcake"
    }

    class Donut extends Cake {
      override def name: String = "Donut"
    }

  }


  //2. Define another object with an apply() method as factory for types of cakes

  // Step 4: Define a wrapper object called CakeFactory")
  object CakeFactory {
    import Cakes._

    // Step 5: Define an apply method which will act as a factory to produce the correct Cake implementation
    def apply(cake: String): Cake = {
      cake match {
        case "cupcake" => new Cupcake
        case "donut" => new Donut
        case _ => new UnknownCake
      }
    }
  }


  //In a real application, you would perhaps want to control the types of cakes and pattern match on an enum as opposed to a String.
  // In upcoming tutorial, I will show you how to use sealed traits to define enum.

  //3. Call the CakeFactory

  // Step 6: Call the CakeFactory
  println(s"A cupcake = ${CakeFactory("cupcake").name}")
  println(s"A donut = ${CakeFactory("donut").name}")
  println(s"Unknown cake = ${CakeFactory("coconut tart").name}")



}
