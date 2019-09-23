package com.allaboutscala.chapter.six.immutable_collection

/**
  * Created by mkoduri on 9/13/2019.
  *
  *  such as push new elements to the top of the Stack and remove or pop elements from the Stack.
  *
  *  a Stack is a data structure which follows the LIFO (Last In First Out)
  *
  *
  *  It typically provides a push() method to add element at the top of the Stack and a pop() method to take the most recently added element from the top of the Stack.
  *
  */
object ImmutableStack_Tutorial extends App{

  //1. How to initialize Stack with 3 elements

  import scala.collection.immutable.Stack
  println("Step 1: How to initialize Stack with 3 elements")
  val stack1: Stack[String] = Stack("Plain Donut", "Strawberry Donut", "Chocolate Donut")
  println(s"Elements of stack1 = $stack1")

  //Immutable Stack is deprecated...  so do not use it!
  //Instead let's use an Immutable List as per the Scala API documentation to achieve the same Stack behaviour.


  //2. How to initialize a Stack using an Immutable List
  println("\nStep 2: How to initialize a Stack using an Immutable List")
  val stack2: List[String] = List("Plain Donut","Strawberry Donut","Chocolate Donut")
  println(s"Using an Immutable List for stack, elements are = $stack2")

  //3. Push one element at the top of the stack using :: of Immutable List

  println("\nStep 3: Push one element at the top of the stack using :: of Immutable List")
  val stack3: List[String] = "Vanilla Donut" :: stack2
  println(s"Using an Immutable List for stack, elements after push = $stack3")


  //4. Push N elements at the top of the stack using :: of Immutable List

  println("\nStep 4: Push N elements at the top of the stack using :: of Immutable List")
  val stack4: List[String] = "Glazed Donut" :: "Vanilla Donut" :: stack2
  println(s"Using an Immutable List for stack, elements after pushing N elements = $stack4")


  //5. Pop element from the Stack using tail function of Immutable List

  println("\nStep 5: Pop element from the Stack using tail function of Immutable List")
  val stack5: List[String] = stack2.tail
  println(s"Using an Immutable List for stack, elements after tail function to simulate Stack pop = $stack5")

  //6. How to initialize an empty Stack using Immutable List

  println("\nStep 6: How to initialize an empty Stack using Immutable List")
  val emptyStack: List[String] = List.empty[String]
  println(s"Using an Immutable List for stack, the empty stack = $emptyStack")



}
