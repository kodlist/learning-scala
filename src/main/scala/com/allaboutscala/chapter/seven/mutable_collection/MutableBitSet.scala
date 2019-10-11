package com.allaboutscala.chapter.seven.mutable_collection

/**
  * Created by mkoduri on 9/26/2019.
  *
  *
  *  BitSet represents a collection of small integers as the bits of a larger integer.
  *
  *   Set is a data structure which allows you to store elements which are not repeatable.
  *   A Set also does not guarantee the ordering of elements.
  *
  *
  */
object MutableBitSet extends App{

  import scala.collection.mutable.BitSet

  //1. How to initialize a BitSet

  println("\nStep 1: How to initialize a BitSet")
  val bitSet1: BitSet = BitSet(0, 2, 4, 6, 8)
  println(s"Elements of bitSet1 = $bitSet1")

  //2. How to check specific elements in BitSet

  println("\nStep 2: How to check specific elements in BitSet")
  println(s"Element 0 = ${bitSet1(0)}")
  println(s"Element 1 = ${bitSet1(1)}")
  println(s"Element 2 = ${bitSet1(2)}")

  //3. How to add elements to BitSet using +=

  println("\nStep 3: How to add elements to BitSet using +=")
  bitSet1 += 10
  println(s"Elements of bitSet1 after adding element 10 = $bitSet1")

  //4. How to add two BitSets together using ++=

  println("\nStep 4: How to add two BitSets together using ++=")
  bitSet1 ++= BitSet(12, 14, 16, 18, 20)
  println(s"Elements of bitSet1 after adding second BitSet = $bitSet1")


  //5. How to remove element from BitSet using -=

  println("\nStep 5: How to remove element from BitSet using -=")
  bitSet1 -= 0
  println(s"bitSet1 without element 0 = $bitSet1")


  //6. How to find the intersection between two BitSets using &

  println("\nStep 6: How to find the intersection between two BitSets using &")
  val bitSetEven2: BitSet = BitSet(6, 8, 10)
  println(s"Intersection of bitSet1 and bitSetEven2 = ${bitSet1 & bitSetEven2}")

  //7. How to find the difference between two BitSets using &~

  println("\nStep 7: How to find the difference between two BitSets using &~")
  println(s"Difference of bitSet1 and bitSetEven2 = ${bitSet1 &~ bitSetEven2}")

  //8. How to initialize an empty BitSet

  println("\nStep 8: How to initialize an empty BitSet")
  val emptyBitSet: BitSet = BitSet.empty
  println(s"Empty BitSet = $emptyBitSet")




}
