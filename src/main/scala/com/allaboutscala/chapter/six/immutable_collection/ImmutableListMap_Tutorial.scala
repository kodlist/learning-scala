package com.allaboutscala.chapter.six.immutable_collection

/**
  * Created by mkoduri on 9/12/2019.
  *
  *
  *  Immutable ListMap and perform common operations such as initialization, appending or prepending elements and accessing elements within the ListMap.
  *
  *

  */
object ImmutableListMap_Tutorial extends App{


  //1. How to initialize a ListMap with 3 elements using key -> value notation

  println("Step 1: How to initialize a ListMap with 3 elements using key -> value notation")
  import scala.collection.immutable.ListMap
  val listMap1: ListMap[String, String] = ListMap("PD" -> "Plain Donut", "SD" ->"Strawberry Donut", "CD" -> "Chocolate Donut")
  println(s"Elements of listMap1 = $listMap1")

 //2. How to access elements by specific key in the ListMap

  println("\nStep 2: How to access elements by specific key in the ListMap")
  println(s"Element by key PD = ${listMap1("PD")}")
  println(s"Element by key SD = ${listMap1("SD")}")

  //3. How to add elements to ListMap using +

  println("\nStep 3: How to add elements to ListMap using +")
  val listMap2: ListMap[String, String] = listMap1 + ("KD" -> "Krispy Kreme Donut")
  println(s"Elements of listMap2 = $listMap2")

  //4. How to add two ListMaps together using ++

  println("\nStep 4: How to add two ListMaps together using ++")
  val listMap3: ListMap[String, String] = listMap1 ++ listMap2
  println(s"Elements of listMap3 = $listMap3")


  //5. How to remove key and value from ListMap using -

  println("\nStep 5: How to remove key and value from ListMap using -")
  val listMap4: ListMap[String, String] = listMap1 - ("CD")
  println(s"ListMap without the key CD and its value = $listMap4")


  //6. How to initialize an empty ListMap

  println("\nStep 6: How to initialize an empty ListMap")
  val emptyListMap: ListMap[String, String] = ListMap.empty[String,String]
  println(s"Empty ListMap with key type String and value also of type String= $emptyListMap")


}
