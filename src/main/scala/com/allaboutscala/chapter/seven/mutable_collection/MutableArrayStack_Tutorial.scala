package com.allaboutscala.chapter.seven.mutable_collection

/**
  * Created by mkoduri on 9/13/2019.
  *
  *
  * a Stack is a data structure which follows the LIFO (Last In First Out)
  *
  *  It typically provides a push() method to add element at the top of the Stack and
  *  a pop() method to take the most recently added element from the top of the Stack.
  *
  *  an ArrayStack provides the Stack semantics while internally being backed by an Array data structure.
  *
  *
  */
object MutableArrayStack_Tutorial extends App{


  //1. How to initialize ArrayStack with 3 elements

  import scala.collection.mutable.ArrayStack

  println("Step 1: How to initialize ArrayStack with 3 elements")
  val arrayStack1: ArrayStack[String] = ArrayStack("Plain Donut", "Strawberry Donut", "Chocolate Donut")
  println(s"Elements of arrayStack1 = $arrayStack1")

  //2. How to check elements at specific index of an ArrayStack
  println("\nStep 2: How to check elements at specific index of an ArrayStack")
  println(s"Element at index 0 = ${arrayStack1(0)}")
  println(s"Element at index 1 = ${arrayStack1(1)}")
  println(s"Element at index 2 = ${arrayStack1(2)}")


  //3. How to add elements to an ArrayStack using +=

  println("\nStep 3: How to add elements to an ArrayStack using +=")
  arrayStack1 += "Vanilla Donut"
  println(s"Elements of arrayStack1 = $arrayStack1")


  //4. How to add elements from a List to an ArrayStack using ++=
  println("\nStep 4: How to add elements from a List to an ArrayStack using ++=")
  arrayStack1 ++= List[String]("Glazed Donut", "Krispy creme")
  println(s"Elements of arrayStack1 = $arrayStack1")

  //5. How to take an element from an ArrayStack using pop function
  println("\nStep 5: How to take an element from an ArrayStack using pop function")
  println(s"Pop element from stack = ${arrayStack1.pop}")
  println(s"Elements of stack1 = $arrayStack1")


  //6. How to push one element at the top of the ArrayStack using push function

  println("\nStep 6: How to push one element at the top of the ArrayStack using push function")
  arrayStack1.push("Krispy Creme")
  println(s"Elements after push = $arrayStack1")


  //7. How to initialize an empty ArrayStack

  println("\nStep 7: How to initialize an empty ArrayStack")
  val emptyArrayStack: ArrayStack[Nothing] = ArrayStack.empty
  println(s"Empty Stack = $emptyArrayStack")

  //8. How to initialize an empty ArrayBuffer

  import scala.collection.mutable.ArrayBuffer


  println("\nStep 7: How to initialize an empty ArrayBuffer")
  val emptyArrayBuffer: ArrayBuffer[String] = ArrayBuffer.empty[String]
  println(s"Empty array buffer = $emptyArrayBuffer")

}
