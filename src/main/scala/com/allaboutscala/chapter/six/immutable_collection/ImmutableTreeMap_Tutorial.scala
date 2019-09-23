package com.allaboutscala.chapter.six.immutable_collection

/**
  * Created by mkoduri on 9/12/2019.
  *
  *  The TreeMap is sorted by default using the natural order the its key.
  *
  *   changing the order using comparator called Ordering scala class.
  *
  */
object ImmutableTreeMap_Tutorial extends App{

  //1. How to initialize a TreeMap with 3 elements using Tuples key and value

  import scala.collection.immutable.TreeMap
  println("Step 1: How to initialize a TreeMap with 3 elements using Tuples key and value")
  val treeMap1: TreeMap[String, String] = TreeMap(("PD","Plain Donut"),("SD","Strawberry Donut"),("CD","Chocolate Donut"))
  println(s"Elements of treeMap1 = $treeMap1")

  //The TreeMap is sorted by default using the natural order the its key.

  //2. How to initialize TreeMap using key -> value notation

  println("\nStep 2: How to initialize TreeMap using key -> value notation")
  val treeMap2: TreeMap[String, String] = TreeMap("VD"-> "Vanilla Donut", "GD" -> "Glazed Donut")
  println(s"Elements of treeMap2 = $treeMap2")


  //3. How to access elements of TreeMap by specific key

  println("\nStep 3: How to access elements of TreeMap by specific key")
  println(s"Element by key VD = ${treeMap2("VD")}")
  println(s"Element by key GD = ${treeMap2("GD")}")


  //4. How to add elements to TreeMap using +

  println("\nStep 4: How to add elements to TreeMap using +")
  val treeMap3: TreeMap[String, String] = treeMap1 + ("KD" -> "Krispy Kreme Donut")
  println(s"Elements in treeMap3 = $treeMap3")


  //5. How to add two TreeMaps together using ++

  println("\nStep 5: How to add two TreeMaps together using ++")
  val treeMap4: TreeMap[String, String] = treeMap1 ++ treeMap2
  println(s"Elements in treeMap4 = $treeMap4")


  //6. How to remove key and its value from TreeMap using -

  println("\nStep 6: How to remove key and its value from TreeMap using -")
  val treeMap5: TreeMap[String, String] = treeMap4 - ("CD")
  println(s"TreeMap without the key CD and its value = $treeMap5")

  //7. How to change ordering of TreeMap to descending alphabet

  println("\nStep 7: How to change ordering of TreeMap to descending alphabet")
  object AlphabetOrdering extends Ordering[String] {
    def compare(key1:String, key2:String) = key2.compareTo(key1)
  }
  val treeMap6: TreeMap[String, String] = TreeMap(("PD","Plain Donut"),("SD","Strawberry Donut"),("CD","Chocolate Donut"))(AlphabetOrdering)
  println(s"Elements of treeMap6 in descending order = $treeMap6")

  //8. How to initialize an empty TreeMap

  println("\nStep 8: How to initialize an empty TreeMap")
  val emptyTreeMap: TreeMap[String,String] = TreeMap.empty[String,String]
  println(s"Empty TreeMap = $emptyTreeMap")

}
