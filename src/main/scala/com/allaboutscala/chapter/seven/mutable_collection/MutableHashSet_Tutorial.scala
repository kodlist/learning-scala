package com.allaboutscala.chapter.seven.mutable_collection

/**
  * Created by mkoduri on 9/26/2019.
  *
  * Set is a data structure which allows you to store elements which are not repeatable. A Set also does not guarantee the ordering of elements.
  *
  * A Mutable HashSet is the concrete implementation of the mutable Set trait.
  *
  *
  *
  */
object MutableHashSet_Tutorial extends App{

  import scala.collection.mutable.HashSet

  println("\nStep 1: How to initialize a HashSet with 3 elements")
  val hashSet1: HashSet[String] = HashSet("Plain Donut","Strawberry Donut","Chocolate Donut")
  println(s"Elements of hashSet1 = $hashSet1")


  //2. How to check specific elements in HashSet

  println("\nStep 2: How to check specific elements in HashSet")
  println(s"Element Plain Donut = ${hashSet1("Plain Donut")}")
  println(s"Element Strawberry Donut = ${hashSet1("Strawberry Donut")}")
  println(s"Element Chocolate Donut = ${hashSet1("Chocolate Donut")}")

  //3. How to add elements to HashSet using +=

  println("\nStep 3: How to add elements to HashSet using +=")
  hashSet1 += "Vanilla Donut"
  println(s"Elements of hashSet1 after adding Vanilla Donut element = $hashSet1")

  //4. How to add two HashSets together using ++=

  println("\nStep 4: How to add two HashSets together using ++=")
  hashSet1 ++= HashSet[String]("Vanilla Donut", "Glazed Donut")
  println(s"Elements of hashSet1 after adding another HashSet = $hashSet1")


  //5. How to remove element from HashSet using -=

  println("\nStep 5: How to remove element from HashSet using -=")
  hashSet1 -= "Plain Donut"
  println(s"HashSet without Plain Donut element = $hashSet1")

  //6. How to find the intersection between two HashSets using &

  println("\nStep 6: How to find the intersection between two HashSet using &")
  val hashSet2: HashSet[String] = HashSet("Vanilla Donut", "Glazed Donut", "Plain Donut")
  println(s"Intersection of hashSet1 and hashSet2 = ${hashSet1 & hashSet2}")

  //7. How to find the difference between two HashSets using &~

  println("\nStep 7: How to find the difference between two HashSets using &~")
  println(s"Difference of hashSet1 and hashSet5 = ${hashSet1 &~ hashSet2}")


  //8. How to initialize an empty HashSet

  println("\nStep 8: How to initialize an empty HashSet")
  val emptyHashSet: HashSet[String] = HashSet.empty[String]
  println(s"Empty HashSet = $emptyHashSet")




}
