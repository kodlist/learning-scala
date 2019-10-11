package com.allaboutscala.chapter.seven.mutable_collection

/**
  * Created by mkoduri on 9/26/2019.
  *
  *  Set is a data structure which allows you to store elements which are not repeatable. A Set also does not guarantee the ordering of elements.
  *
  *
  * LinkedHashSet will produce elements in order they were inserted to the LinkedHashSet
  *
  * TreeSet and SortedSet allow you to drive the order of the elements.
  *
  * TreeSet and SortedSet should not be confused with LinkedHashSet where the order of elements will be according to the insertion order of the elements.
  *
  */
  object MutableLinkedHashSet_Tutorial extends App{

  import scala.collection.mutable.LinkedHashSet

  //1. How to initialize a LinkedHashSet with 3 elements

  println("\nStep 1: How to initialize a LinkedHashSet with 3 elements")
  val linkedHashSet1: LinkedHashSet[String] = LinkedHashSet("Plain Donut","Strawberry Donut","Chocolate Donut")
  println(s"Elements of linkedHashSet1 = $linkedHashSet1")

  //2. How to check specific elements in LinkedHashSet

  println("\nStep 2: How to check specific elements in LinkedHashSet")
  println(s"Element Plain Donut = ${linkedHashSet1("Plain Donut")}")
  println(s"Element Strawberry Donut = ${linkedHashSet1("Strawberry Donut")}")
  println(s"Element Chocolate Donut = ${linkedHashSet1("Chocolate Donut")}")


 //3. How to add elements to LinkedHashSet using +=

  println("\nStep 3: How to add elements to LinkedHashSet using +=")
  linkedHashSet1 += "Vanilla Donut"
  println(s"Elements of linkedHashSet1 after adding Vanilla Donut element = $linkedHashSet1")


  //4. How to add two LinkedHashSets together using ++=

  println("\nStep 4: How to add two LinkedHashSets together using ++=")
  linkedHashSet1 ++= LinkedHashSet[String]("Vanilla Donut", "Glazed Donut")
  println(s"Elements of linkedHashSet1 after adding another HashSet = $linkedHashSet1")

  //5. How to remove element from LinkedHashSet using -=

  println("\nStep 5: How to remove element from LinkedHashSet using -=")
  linkedHashSet1 -= "Plain Donut"
  println(s"Set without Plain Donut element = $linkedHashSet1")


  //6. How to find the intersection between two LinkedHashSets using &

  println("\nStep 6: How to find the intersection between two LinkedHashSets using &")
  val linkedHashSet2: LinkedHashSet[String] = LinkedHashSet("Vanilla Donut", "Glazed Donut", "Plain Donut")
  println(s"Intersection of linkedHashSet1 and linkedHashSet2 = ${linkedHashSet1 & linkedHashSet2}")


  //7. How to find the difference between two LinkedHashSets using &~

  println("\nStep 7: How to find the difference between two LinkedHashSets using &~")
  println(s"Difference of linkedHashSet1 and linkedHashSet2 = ${linkedHashSet1 &~ linkedHashSet2}")


  //8. How to initialize an empty LinkedHashSet

  println("\nStep 8: How to initialize an empty LinkedHashSet")
  val emptyLinkedHashSet: LinkedHashSet[String] = LinkedHashSet.empty[String]
  println(s"Empty LinkedHashSet = $emptyLinkedHashSet")

  //9. How to print elements in order inserted to LinkedHashSet using foreach function

  println("\nStep 9: How to print elements in order inserted to LinkedHashSet using foreach function")
  val linkedHashSet3: LinkedHashSet[String] = LinkedHashSet.empty[String]
  linkedHashSet3 += "Vanilla Donut"
  linkedHashSet3 += "Glazed Donut"
  linkedHashSet3 += "Plain Donut"
  linkedHashSet3 += "Chocolate Donut"
  linkedHashSet3.foreach(donut => println(s"$donut"))


}
