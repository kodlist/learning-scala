package com.allaboutscala.chapter.seven.mutable_collection

/**
  * Created by mkoduri on 9/26/2019.
  *
  * A Set is a data structure which allows you to store elements which are not repeatable.
  * A Set also does not guarantee the ordering of elements.
  *
  */
object MutableSet_Tutorial extends App{

  import scala.collection.mutable.Set

  //1. How to initialize a Set with 3 elements

  println("\nStep 1: How to initialize a Set with 3 elements")
  val set1: Set[String] = Set("Plain Donut","Strawberry Donut","Chocolate Donut")
  println(s"Elements of set1 = $set1")


  //2. How to check specific elements in Set

  println("\nStep 2: How to check specific elements in Set")
  println(s"Element Plain Donut = ${set1("Plain Donut")}")
  println(s"Element Strawberry Donut = ${set1("Strawberry Donut")}")
  println(s"Element Chocolate Donut = ${set1("Chocolate Donut")}")


  //3. How to add elements to Set using +=

  println("\nStep 3: How to add elements to Set using +=")
  set1 += "Vanilla Donut"
  println(s"Elements of set1 after adding elements Vanilla Donut = $set1")


  //4. How to add all elements from another Set using ++=

  println("\nStep 4: How to add all elements from another Set using ++=")
  set1 ++= Set[String]("Vanilla Donut", "Glazed Donut")
  println(s"Elements of set1 after adding second set = $set1")


  //5. How to remove element from Set using -=

  println("\nStep 5: How to remove element from Set using -=")
  set1 -= "Plain Donut"
  println(s"Elements of set1 without Plain Donut element = $set1")


  //6. How to find the intersection between two Sets using &

  println("\nStep 6: How to find the intersection between two Sets using &")
  val set2: Set[String] = Set("Vanilla Donut", "Glazed Donut", "Plain Donut")
  println(s"Intersection of set1 and set5 = ${set1 & set2}")

  //7. How to find the difference between two Sets using &~

  println("\nStep 7: How to find the difference between two Sets using &~")
  println(s"Difference of set1 and set2 = ${set1 &~ set2}")

  //8. How to initialize an empty Set

  println("\nStep 8: How to initialize an empty Set")
  val emptySet: Set[String] = Set.empty[String]
  println(s"Empty Set = $emptySet")




}
