package com.allaboutscala.chapter.six.immutable_collection

/**
  * Created by mkoduri on 9/12/2019.
  */
object ImmutableHashMap_Tutorial extends App{

    //1. How to initialize a HashMap with 3 elements using Tuples of key and value

  import scala.collection.immutable.HashMap
  println("Step 1: How to initialize a HashMap with 3 elements using Tuples of key and value")
  val hashMap1: HashMap[String, String] = HashMap(("PD","Plain Donut"),("SD","Strawberry Donut"),("CD","Chocolate Donut"))
  println(s"Elements of hashMap1 = $hashMap1")


  //2. How to initialize HashMap using key -> value notation

  println("\nStep 2: How to initialize HashMap using key -> value notation")
  val hashMap2: HashMap[String, String] = HashMap("VD"-> "Vanilla Donut", "GD" -> "Glazed Donut")
  println(s"Elements of hashMap2 = $hashMap2")

  //3. How to access elements in HashMap by specific key

  println("\nStep 3: How to access elements in HashMap by specific key")
  println(s"Element by key VD = ${hashMap2("VD")}")
  println(s"Element by key GD = ${hashMap2("GD")}")

  //4. How to add elements to HashMap using +

  println("\nStep 4: How to add elements to HashMap using +")
  val hashMap3: HashMap[String, String] = hashMap1 + ("KD" -> "Krispy Kreme Donut")
  println(s"Element in hashMap3 = $hashMap3")


  //5. How to add two HashMap together using ++

  println("\nStep 5: How to add two HashMap together using ++")
  val hashMap4: Map[String, String] = hashMap1 ++ hashMap2
  println(s"Elements in hashMap4 = $hashMap4")


  //6. How to remove key and its value from HashMap using -

  println("\nStep 6: How to remove key and its value from HashMap using -")
  val hashMap5: Map[String, String] = hashMap4 - ("CD")
  println(s"HashMap without the key CD and its value = $hashMap5")


  //7. How to initialize an empty HashMap

  println("\nStep 7: How to initialize an empty HashMap")
  val emptyHashMap: HashMap[String,String] = HashMap.empty[String,String]
  println(s"Empty HashMap = $emptyHashMap")




}
