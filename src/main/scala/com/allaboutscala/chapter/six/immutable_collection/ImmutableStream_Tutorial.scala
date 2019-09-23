package com.allaboutscala.chapter.six.immutable_collection

/**
  * Created by mkoduri on 9/13/2019.
  *
  *
  * Scala's Immutable Stream to perform common operations such as initialize an infinite Stream, use the cons operator,
  * take elements from a Stream and create an empty Stream.
  *
  * What is a Stream?
  *
  * a Stream is a similar data structure to a list except that the elements of the Stream will be lazily computer.
  * As a result, you can have infinitely long Streams!
  *
  */
object ImmutableStream_Tutorial extends App{

  //1. How to create a Stream with 3 numbers using #::


  println("Step 1: How to create a Stream with 3 numbers using #::")
  val stream1: Stream[Int] = 1 #:: 2 #:: 3 #:: Stream.empty
  println(s"Elements of stream1 = $stream1")

  //When we tried to print the elements of the Stream, only the first element of the Stream was printed!
  //As mentioned earlier, the elements of Streams are lazily computed.


  //2. How to create a Stream with 3 numbers using Stream.cons

  import scala.collection.immutable.Stream.cons

  println("\nStep 2: How to create a Stream with 3 numbers using Stream.cons")
  val stream2: Stream[Int] = cons(1, cons(2, cons(3, Stream.empty) ) )
  println(s"Elements of stream2 = ${stream2}")

  //3. How to print all 3 numbers from stream2 using the take function

  println("\nStep 3: How to print all 3 numbers from stream2 using the take function")
  print("Take first 3 numbers from stream2 = ")
  stream2.take(3).print

  print("\nTake first 10 numbers from stream2 = ")
  stream2.take(10).print


  //4. How to define an infinite Stream of numbers using Stream.cons

  println("\n\nStep 4: How to define an infinite Stream of numbers using Stream.cons")
  def inifiniteNumberStream(number: Int): Stream[Int] = Stream.cons(number, inifiniteNumberStream(number + 1))
  print("Take only the first 20 numbers from the infinite number stream = ")
  inifiniteNumberStream(1).take(20).print

  //5. How to define an infinite stream of numbers using Stream.from

  println("\n\nStep 5: How to define an infinite stream of numbers using Stream.from")
  val stream3: Stream[Int] = Stream.from(1)
  print("Take only the first 20 numbers from the infinite number stream = ")
  stream3.take(20).print


  //6. How to initialize an empty Stream

  println("\n\nStep 6: How to initialize an empty Stream")
  val emptyStream: Stream[Int] = Stream.empty[Int]
  println(s"Empty Stream = $emptyStream")


}
