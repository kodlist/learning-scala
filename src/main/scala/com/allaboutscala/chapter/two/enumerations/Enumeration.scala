package com.allaboutscala.chapter.two.enumerations

/**
  * Created by mkoduri on 8/30/2019.
  *
  * If you have used Java or .NET in the past, I'm pretty sure that you have used the enum keyword to define your enumerations.
    But in Scala there is no enum keyword. Instead, Scala provides an Enumeration class which you can extend in order to create your enumerations.


  */
object Enumeration extends App{

 //1. How to create an Enumeration

  println("Step 1: How to create an enumeration")

  object Donut extends Enumeration {
    type Donut = Value
    val Glazed      = Value("Glazed")
    val Strawberry  = Value("Strawberry")
    val Plain       = Value("Plain")
    val Vanilla     = Value("Vanilla")
  }


  println("\nStep 2: How to print the String value of the enumeration")
  println(s"Vanilla Donut string value = ${Donut.Vanilla}")


  //3. How to print the id of the enumeration

  println("\nStep 3: How to print the id of the enumeration")
  println(s"Vanilla Donut's id = ${Donut.Vanilla.id}")


  //If you recall from Step 1, you extended the Enumeration class.
  //As a result, the Donut enumeration inherited a bunch of useful functions with the id function being one of them.


  //4. How to print all the values listed in Enumeration
  println("\nStep 4: How to print all the values listed in Enumeration")
  println(s"Donut types = ${Donut.values}")


  //5. How to pattern match on enumeration values
  println("\nStep 5: How to pattern match on enumeration values")
  Donut.values.foreach {
    case d if (d == Donut.Strawberry || d == Donut.Glazed) => println(s"Found favourite donut = $d")
    case _ => None
  }

  println(s"${Donut.Strawberry}")
  println(Donut.Strawberry)



  //6. How to change the default ordering of enumeration values

  println("\nStep 6: How to change the default ordering of enumeration values")
  object DonutTaste extends Enumeration{
    type DonutTaste = Value

    val Tasty       = Value(0, "Tasty")
    val VeryTasty   = Value(1, "Very Tasty")
    val Ok          = Value(-1, "Ok")
  }

  println(s"Donut taste values = ${DonutTaste.values}")
  println(s"Donut taste of OK id = ${DonutTaste.Ok.id}")

}
