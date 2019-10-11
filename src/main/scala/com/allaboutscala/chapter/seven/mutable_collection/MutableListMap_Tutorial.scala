package com.allaboutscala.chapter.seven.mutable_collection

/**
  * Created by mkoduri on 9/24/2019.
  *
  * As per the Scala Documentation, a ListMap is a collection of key and value pairs where the keys are backed by a List data structure.
  *
  */
object MutableListMap_Tutorial extends App{

  import scala.collection.mutable.ListMap

  println("\nStep 1: How to initialize a ListMap with 3 elements")
  val listMap1: ListMap[String, String] = ListMap("PD" -> "Plain Donut", "SD" ->"Strawberry Donut", "CD" -> "Chocolate Donut")
  println(s"Elements of listMap1 = $listMap1")

  //2. How to initialize ListMap using key -> value notation

  println("\nStep 2: How to initialize ListMap using key -> value notation")
  val listMap2: ListMap[String, String] = ListMap("VD"-> "Vanilla Donut", "GD" -> "Glazed Donut")
  println(s"Elements of listMap1 = $listMap2")

  //3. How to access elements of ListMap by specific key

  println("\nStep 3: How to access elements of ListMap by specific key")
  println(s"Element by key VD = ${listMap2("VD")}")
  println(s"Element by key GD = ${listMap2("GD")}")

  //4. How to add elements to ListMap using +=

  println("\nStep 4: How to add elements to ListMap using +")
  listMap1 += ("KD" -> "Krispy Kreme Donut")
  println(s"Element of listMap1 = ${listMap1}")


  //5. How to add elements from a ListMap to an existing ListMap using ++=

  println("\nStep 5: How to add elements from a ListMap to an existing ListMap using ++=")
  listMap1 ++= listMap2
  println(s"Element of listMap1 = ${listMap1}")


  //6. How to remove key and its value from ListMap using -=

  println("\nStep 6: How to remove key and its value from ListMap using -=")
  listMap1 -= ("CD")
  println(s"ListMap without the key CD and its value = $listMap1")


  //7. How to initialize an empty ListMap

  println("\nStep 7: How to initialize an empty ListMap")
  val emptyListMap: ListMap[String, String] = ListMap.empty[String,String]
  println(s"Empty ListMap of type String = $emptyListMap")






}
