package com.allaboutscala.chapter.seven.mutable_collection

/**
  * Created by mkoduri on 9/26/2019.
  *
  * a PriorityQueue is similar to a queue data structure except that elements added to the queue are associated with a priority.
  * This priority is then used to determine which elements get dequeued or removed from the queue.
  *
  *  a mutable PriorityQueue is implemented using a heap data structure and only the method dequeue and dequeueAll will return the elements in their priority order.
  *
  *
  */
object MutablePriorityQueue_Tutorial extends App{

  //1. How to declare a case class to represent Donut object

  println("Step 1: How to declare a case class to represent Donut object")
  case class Donut(name: String, price: Double)

  //2. How to declare a function which defines the ordering of a PriorityQueue of Donut objects

  println("\nStep 2: How to declare a function which defines the ordering of a PriorityQueue of Donut objects")
  def donutOrder(d: Donut) = d.price

  //3. How to initialize a PriorityQueue of Donut objects and specify the Ordering

  println("\nStep 3: How to initialize a PriorityQueue of Donut objects and specify the Ordering")

  import scala.collection.mutable.PriorityQueue

  /*val priorityQueue1: PriorityQueue[Donut] = PriorityQueue(
                                                            Donut("Plain Donut", 1.50),
                                                            Donut("Strawberry Donut", 2.0),
                                                            Donut("Chocolate Donut", 2.50))

  println(s"Elements of priorityQueue1 = $priorityQueue1")*/

  //Error:(31, 59) No implicit Ordering defined for com.allaboutscala.chapter.seven.mutable_collection.MutablePriorityQueue_Tutorial.Donut.

  val priorityQueue2: PriorityQueue[Donut] = PriorityQueue(
                                                            Donut("Plain Donut", 1.50),
                                                            Donut("Strawberry Donut", 2.0),
                                                            Donut("Chocolate Donut", 2.50))(Ordering.by(donutOrder) )

  println(s"Elements of priorityQueue1 = $priorityQueue2")

  //4. How to add an element to PriorityQueue using enqueue function

  println("\nStep 4: How to add an element to PriorityQueue using enqueue function")
  priorityQueue2.enqueue(Donut("Vanilla Donut", 1.0))
  println(s"Elements of priorityQueue1 after enqueue function is called = $priorityQueue2")


  //5. How to add an element to PriorityQueue using +=

  println("\nStep 5: How to add an element to PriorityQueue using +=")
  priorityQueue2 += (Donut("Krispy Kreme Donut", 1.0))
  println(s"Elements of priorityQueue1 after enqueue function is called = $priorityQueue2")


  //6. How to remove an element from PriorityQueue using the dequeue function

  println("\nStep 6: How to remove an element from PriorityQueue using the dequeue function")
  val donutDequeued: Donut = priorityQueue2.dequeue()
  println(s"Donut element dequeued = $donutDequeued")
  println(s"Elements of priorityQueue1 after dequeued function is called = $priorityQueue2")


  //7. How to initialize an empty PriorityQueue

  println("\nStep 7: How to initialize an empty PriorityQueue")
  val emptyPriorityQueue: PriorityQueue[String] = PriorityQueue.empty[String]
  println(s"Empty emptyPriorityQueue = $emptyPriorityQueue")




}
