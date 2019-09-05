package com.allaboutscala.chapter.three.create_implicit_function

/**
  * Created by mkoduri on 8/30/2019.
  *
  *
  * learn how to create implicit function which will allow you to provide extension methods or functions to pretty much any type or class.
  * As the name implies, Scala was designed from the ground up to be extensible
  * the use of implicit as one of the features which Scala provides to allow you to easily add extension methods or functions to any type or class.
  *
  * It is a good practice to encapsulate your implicit functions and values into an Object or a Package Object.
  *
  */
object CreateImplicit_Function extends App{


  //1. How to create a wrapper String class which will extend the String type
  //   Donut Store examples from the previous tutorials, we will extend the String class such that it will have an isFavoriteDonut() function.

  //Let us create a simple wrapper class called DonutString which will take the String type as its parameter and then provide an isFavoriteDonut() function.
  println("Step 1: How to create a wrapper String class which will extend the String type")
  class DonutString(s: String) {
    def isFavoriteDonut: Boolean = s == "Glazed Donut"
  }



  //How to create an implicit function to convert a String to the wrapper String class
 /* It is a good practice to encapsulate your implicit functions or conversions into a singleton using object.
  You can also make use of package object which we will see in upcoming tutorials.*/

  println("\nStep 2: How to create an implicit function to convert a String to the wrapper String class")
  object DonutConverstions {
    implicit def stringToDonutString(s: String) = new DonutString(s)
  }
  //Defining an implicit function is similar to defining any other functions except that we've prefixed the function signature using the implicit keyword.


  //3. How to import the String conversion so that it is in scope
  println("\nStep 3: How to import the String conversion so that it is in scope")

  import DonutConverstions._

  //As part of the import expression, we are using the wildcard operator _ which will import any values or implicit functions.

  //4. How to create String values
  //   Let us create two immutable values of type String, one for Glazed Donut and the other for Vanilla Donut.

  println("\nStep 4: How to create String values")
  val glazedDonut = "Glazed Donut"
  val vanillaDonut = "Vanilla Donut"


  //5. How to access the custom String function called isFavaoriteDonut

  println("\nStep 5: How to access the custom String function called isFavaoriteDonut")
  println(s"Is Glazed Donut my favorite Donut = ${glazedDonut.isFavoriteDonut}")
  println(s"Is Vanilla Donut my favorite Donut = ${vanillaDonut.isFavoriteDonut}")

  /*The custom isFavoriteDonut() function looks built-into the String class.
  However, we did not have to manually modify the source code of the String class.
  Instead, we've used the secret powers of Scala's implicit function to extend the String class.*/
 //It is a good practice to encapsulate your implicit functions and values into an Object or a Package Object.



}
