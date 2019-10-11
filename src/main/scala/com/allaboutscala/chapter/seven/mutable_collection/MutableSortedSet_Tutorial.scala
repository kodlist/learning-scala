package com.allaboutscala.chapter.seven.mutable_collection

/**
  * Created by mkoduri on 9/26/2019.
  *
  *  Set is a data structure which allows you to store elements which are not repeatable.
  *
  *  While a Set also does not guarantee the ordering of elements, a SortedSet will produce elements in a given order.
  *
  *  SortedSet is a trait which provides the Set semantics but also allows you to drive the ordering of the elements within the SortedSet.
  *
  */
object MutableSortedSet_Tutorial extends App{

  import scala.collection.mutable.SortedSet


  //1. How to initialize a SortedSet with 3 elements

  println("\nStep 1: How to initialize a SortedSet with 3 elements")
  val sortedSet1: SortedSet[String] = SortedSet("Plain Donut","Strawberry Donut","Chocolate Donut")
  println(s"Elements of sortedSet1 = $sortedSet1")


  //2. How to check specific elements in SortedSet

  println("\nStep 2: How to check specific elements in SortedSet")
  println(s"Element Plain Donut = ${sortedSet1("Plain Donut")}")
  println(s"Element Strawberry Donut = ${sortedSet1("Strawberry Donut")}")
  println(s"Element Chocolate Donut = ${sortedSet1("Chocolate Donut")}")

  //3. How to add elements to SortedSet using +=

  println("\nStep 3: How to add elements to SortedSet using +=")
  sortedSet1 += "Vanilla Donut"
  println(s"Elements of sortedSet1 after adding Vanilla Donut element = $sortedSet1")

  //4. How to add two SortedSets together using ++=

  println("\nStep 4: How to add two SortedSets together using ++=")
  sortedSet1 ++= SortedSet[String]("Vanilla Donut", "Glazed Donut")
  println(s"Elements of sortedSet1 after adding second SortedSet = $sortedSet1")

  //5. How to remove element from SortedSet using -=

  println("\nStep 5: How to remove element from SortedSet using -=")
  sortedSet1 -= "Plain Donut"
  println(s"sortedSet1 without Plain Donut element = $sortedSet1")

  //6. How to find the intersection between two SortedSets using &

  println("\nStep 6: How to find the intersection between two SortedSets using &")
  val sortedSet2: SortedSet[String] = SortedSet("Vanilla Donut", "Glazed Donut", "Plain Donut")
  println(s"Intersection of sortedSet1 and sortedSet5 = ${sortedSet1 & sortedSet2}")

  //7. How to find the difference between two SortedSets using &~

  println("\nStep 7: How to find the difference between two SortedSets using &~")
  println(s"Difference of sortedSet1 and sortedSet5 = ${sortedSet1 &~ sortedSet2}")

  //8. How to change ordering to descending alphabet in SortedSet

  println("\nStep 8: How to change ordering to descending alphabet in SortedSet")

  object DescendingAlphabetOrdering extends Ordering[String] {
      def compare(element1:String, element2:String) = element2.compareTo(element1)
  }

  val sortedSet6: SortedSet[String] = SortedSet("Plain Donut", "Strawberry Donut", "Chocolate Donut")(DescendingAlphabetOrdering)

  println(s"Elements of sortedSet6 = $sortedSet6")

  //The elements are printed in descending order first with Strawberry Donut, then Plain Donut and finally Chocolate Donut


  //9. How to initialize an empty SortedSet

  println("\nStep 9: How to initialize an empty SortedSet")
  val emptySortedSet: SortedSet[String] = SortedSet.empty[String]
  println(s"Empty SortedSet = $emptySortedSet")

}
