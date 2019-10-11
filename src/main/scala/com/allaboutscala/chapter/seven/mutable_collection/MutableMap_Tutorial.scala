package com.allaboutscala.chapter.seven.mutable_collection

/**
  * Created by mkoduri on 9/24/2019.
  *
  * a Map is a collection of key and value pairs which are stored internally using a Hash Table data structure.
  *
  */
object MutableMap_Tutorial extends App{

  import scala.collection.mutable.Map


  //1. How to initialize a Map with 3 elements

  println("\nStep 1: How to initialize a Map with 3 elements")
  val map1: Map[String, String] = Map(("PD","Plain Donut"),("SD","Strawberry Donut"),("CD","Chocolate Donut"))
  println(s"Elements of map1 = $map1")

  //2. How to initialize a Map using key -> value notation

  println("\nStep 2: How to initialize a Map using key -> value notation")
  val map2: Map[String, String] = Map("VD" -> "Vanilla Donut", "GD" -> "Glazed Donut")
  println(s"Elements of map2 = $map2")

  //3. How to access elements of Map by specific key

  println("\nStep 3: How to access elements of Map by specific key")
  println(s"Element by key VD = ${map2("VD")}")
  println(s"Element by key GD = ${map2("GD")}")


  //4. How to add elements to Map using +=
  println("\nStep 4: How to add elements to Map using +=")
  map1 += ("KD" -> "Krispy Kreme Donut")
  println(s"Element in map1 = $map1")

  //5. How to add elements from a Map to an existing Map using ++=
  println("\nStep 5: How to add elements from a Map to an existing Map using ++=")
  map1 ++= map2
  println(s"Elements in map1 = $map1")


  //6. How to remove key and its value from Map using -=
  println("\nStep 6: How to remove key and its value from Map using -=")
  map1 -= "CD"
  println(s"Map without the key CD and its value = $map1")


  //7. How to initialize an empty Map
  println("\nStep 7: How to initialize an empty Map")
  val emptyMap: Map[String,String] = Map.empty[String,String]
  println(s"Empty Map = $emptyMap")


}
