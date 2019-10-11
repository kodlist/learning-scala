package com.allaboutscala.chapter.seven.mutable_collection

/**
  * Created by mkoduri on 9/24/2019.
  *
  *
  * a ListBuffer is resizable similar to an ArrayBuffer, except that it uses a Linked List as its internal data structure.
  *
  *
  */
object MutableListBuffer_Tutorial extends App{

  import scala.collection.mutable.ListBuffer

  //1. How to initialize a ListBuffer with 3 elements

  println("Step 1: How to initialize a ListBuffer with 3 elements")
  val listBuffer1: ListBuffer[String] = ListBuffer("Plain Donut","Strawberry Donut","Chocolate Donut")
  println(s"Elements of listBuffer1 = $listBuffer1")

  //2. How to access elements at specific index in a ListBuffer

  println("\nStep 2: How to access elements at specific index in a ListBuffer")
  println(s"Element at index 0 = ${listBuffer1(0)}")
  println(s"Element at index 1 = ${listBuffer1(1)}")
  println(s"Element at index 2 = ${listBuffer1(2)}")

  //3. How to add elements to a ListBuffer using +=

  println("\nStep 3: How to add elements to a ListBuffer using +=")
  listBuffer1 += "Vanilla Donut"
  println(s"Elements of listBuffer1 = $listBuffer1")


  // 4. How to add elements from a List to a ListBuffer using ++=

  println("\nStep 4: How to add elements from a List to a ListBuffer using ++=")
  listBuffer1 ++= List[String]("Glazed Donut", "Krispy creme")
  println(s"Elements of listBuffer1 = $listBuffer1")

  //5. How to remove elements from a ListBuffer
  println("\nStep 5: How to remove elements from a ListBuffer")
  listBuffer1 -= "Plain Donut"
  println(s"Elements of listBuffer1 = $listBuffer1")


  //6. How to remove elements from a List to a ListBuffer using --=

  println("\nStep 6: How to remove elements from a List to a ListBuffer using --=")
  listBuffer1 --= List[String]("Glazed Donut", "Krispy creme")
  println(s"Elements of listBuffer1 = $listBuffer1")

  //7. How to initialize an empty ListBuffer

  println("\nStep 7: How to initialize an empty ListBuffer")
  val emptyListBuffer: ListBuffer[String] = ListBuffer.empty[String]
  println(s"Empty list buffer = $emptyListBuffer")




}
