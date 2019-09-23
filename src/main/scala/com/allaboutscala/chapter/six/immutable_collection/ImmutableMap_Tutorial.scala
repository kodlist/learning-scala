package com.allaboutscala.chapter.six.immutable_collection

/**
  * Created by mkoduri on 9/12/2019.
  *
  *
  */
object ImmutableMap_Tutorial extends App{

  //1. How to initialize a Map with 3 elements using Tuples of key and value

  println("Step 1: How to initialize a Map with 3 elements")
  val map1: Map[String, String] = Map(("PD","Plain Donut"),("SD","Strawberry Donut"),("CD","Chocolate Donut"))
  println(s"Elements of map1 = $map1")

  //2. Using TupleN classes to store more than 2 data points

  println("\nStep 3: Using TupleN classes to store more than 2 data points")
  val glazedDonut = Tuple3("Glazed Donut", "Very Tasty", 2.50)
  println(s"${glazedDonut._1} taste level is ${glazedDonut._2} and it's price is ${glazedDonut._3}")



  //2. How to initialize Map using key -> value notation

  println("\nStep 2: How to initialize Map using key -> value notation")
  val map2: Map[String, String] = Map("VD"-> "Vanilla Donut", "GD" -> "Glazed Donut")
  println(s"Elements of map = $map2")


  //3. How to access elements by specific key

  println("\nStep 3: How to access elements by specific key")
  println(s"Element by key VD = ${map2("VD")}")
  println(s"Element by key GD = ${map2("GD")}")


  //4. How to add elements to Map using +

  println("\nStep 4: How to add elements using +")
  val map3: Map[String, String] = map1 + ("KD" -> "Krispy Kreme Donut")
  println(s"Element in map3 = $map3")

  //5. How to add two Maps together using ++

  println("\nStep 5: How to add two Maps together using ++")
  val map4: Map[String, String] = map1 ++ map2
  println(s"Elements in map4 = $map4")

  //6. How to remove key and its value from map using -
  println("\nStep 6: How to remove key and its value from map using -")
  val map5: Map[String, String] = map4 - ("CD")
  println(s"Map without the key CD and its value = $map5")



}
