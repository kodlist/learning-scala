package com.allaboutscala.chapter.seven.mutable_collection

/**
  * Created by mkoduri on 9/24/2019.
  *
  * a Queue is a data structure which follows the FIFO (First In First Out) semantics.
  * In other words, the first element that was added to the queue will be the first one to be removed.
  *
  */
object MutableQueue_Tutorial extends App{

  import scala.collection.mutable.Queue

  //1. How to initialize a Queue with 3 elements

  println("\nStep 1: How to initialize a Queue with 3 elements")
  val queue1: Queue[String] = Queue("Plain Donut", "Strawberry Donut", "Chocolate Donut")
  println(s"Elements of queue1 = $queue1")

  //2. How to access elements of Queue at specific index

  println("\nStep 2: How to access elements of Queue at specific index")
  println(s"Element at index 0 = ${queue1(0)}")
  println(s"Element at index 0 = ${queue1(1)}")
  println(s"Element at index 0 = ${queue1(2)}")

  //3. How to add elements to Queue using +=

  println("\nStep 3: How to add elements to Queue using +=")
  queue1 += "Glazed Donut"
  println(s"Elements of queue1 = $queue1")

  //4. How to add elements to Queue using enqueue

  println("\nStep 4: How to add elements to Queue using enqueue")
  queue1.enqueue("Vanilla Donut")
  println(s"Enqueue element Vanilla Donut onto queue1 = $queue1")

  //5. How to take the first element or head from the Queue

  println("\nStep 5: How to take the first element or head from the Queue")
  val dequeuedElement: String = queue1.dequeue
  println(s"Dequeued element = $dequeuedElement")
  println(s"Elements of queue1 after dequeue = $queue1")

  //6. How to initialize an empty Queue

  println("\nStep 6: How to initialize an empty Queue")
  val emptyQueue: Queue[String] = Queue.empty[String]
  println(s"Empty Queue = $emptyQueue")





}
