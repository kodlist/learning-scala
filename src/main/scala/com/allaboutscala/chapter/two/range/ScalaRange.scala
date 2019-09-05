package com.allaboutscala.chapter.two.range

/**
  * Created by mkoduri on 8/29/2019.
  */
object ScalaRange extends App{



  //1. Create a simple numeric range from 1 to 5 inclusive

  println("Step 1: Create a simple numeric range from 1 to 5 inclusive")
  val from1To5 = 1 to 5
  println(s"Range from 1 to 5 inclusive = $from1To5")
  // It prints: Range from 1 to 5 inclusive = Range(1, 2, 3, 4, 5)

  //2. Create a numeric range from 1 to 5 but excluding the last integer number 5
  println("\nStep 2: Create a numeric range from 1 to 5 but excluding the last integer number 5")
  val from1Until5 = 1 until 5
  println(s"Range from 1 until 5 where 5 is excluded = $from1Until5")
 //It prints: Range from 1 until 5 where 5 is excluded = Range(1, 2, 3, 4)

  //3. Create a numeric range from 0 to 10 but increment with multiples of 2 : We are using the 'by' keyword to increment by the number 2
  println("\nStep 3: Create a numeric range from 0 to 10 but increment with multiples of 2")
  val from0To10By2 = 0 to 10 by 2
  println(s"Range from 0 to 10 with multiples of 2 = $from0To10By2")

  //4. Create an alphabetical range to represent letter a to z: We are using single quotes and not double quotes
  println("\nStep 4: Create an alphabetical range to represent letter a to z")
  val alphabetRangeFromAToZ = 'a' to 'z'
  println(s"Range of alphabets from a to z = $alphabetRangeFromAToZ")



  //6. Convert the Scala Range into collections: such as List, Set, Sequence or an Array.
  //   We are calling the .toList, .toSet and .toSeq functions to convert our ranges into List, Set and Sequence accordingly.
  //   We are also calling the .mkString() function to create a string representation of each collection type
  //   The .mkString() function takes in a delimiter which in our case is just an empty space.
  //   However, to access and print each element in the collection, you could just as easily used the foreach() function.

  println("\nStep 6: Storing our ranges into collections")
  val listFrom1To5 = (1 to 5).toList
  println(s"Range to list = ${listFrom1To5.mkString(" ")}")

  val setFrom1To5 = (1 to 5).toSet
  println(s"Range to set = ${setFrom1To5.mkString(" ")}")

  val sequenceFrom1To5 = (1 to 5).toSeq
  println(s"Range to sequence = ${sequenceFrom1To5.mkString(" ")}")

  val arrayFrom1To5 = (1 to 5).toArray
  println(s"Range to array = `${arrayFrom1To5.mkString(" ")}")

  arrayFrom1To5.foreach(  print(_)); // not clear on this. The key thing to remember here is that we used the wildcard _ as part of the print() function parameter.


}
