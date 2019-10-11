package com.allaboutscala.chapter.nine

/**
  * Created by mkoduri on 10/5/2019.
  *
  *
  * we will show how to fire a bunch of future operations and wait for their results by using the Future.sequence() function.
  *
  *
  * the sequence function is useful when you have to reduce a number of futures into a single future.
  *
  * Moreover, these futures will be non-blocking and run in parallel which also imply that the order of the futures is not guaranteed as they can be interleaved.
  *
  */
object Tutorial_08_Future_Sequence extends App{

  //1. Define a method which returns a Future Option of Int

  println("Step 1: Define a method which returns a Future Option of Int")
  import scala.concurrent.ExecutionContext.Implicits.global
  import scala.concurrent.Future

  def donutStock(donut: String): Future[Option[Int]] = Future {
    println("checking donut stock ... sleep for 2 seconds")
    Thread.sleep(2000)
    if(donut == "vanilla donut") Some(10) else None
  }

  //2. Define another method which returns a Future[Boolean]

  println("\nStep 2: Define another method which returns a Future[Boolean]")
  def buyDonuts(quantity: Int): Future[Boolean] = Future {
    println(s"buying $quantity donuts ... sleep for 3 seconds")
    Thread.sleep(3000)
    if(quantity > 0) true else false
  }


  //3. Define another method for processing payments and returns a Future[Unit]

  println("\nStep 3: Define another method for processing payments and returns a Future[Unit]")
  def processPayment(): Future[Unit] = Future {
    println("processPayment ... sleep for 1 second")
    Thread.sleep(1000)
  }

  //4. Combine future operations into a List

  //For Step 4, we combine the futures from Step 1, 2 and 3 into a Immutable List.

  println("\nStep 4: Combine future operations into a List")
  val futureOperations: List[Future[Any]] = List(donutStock("vanilla donut"), buyDonuts(10), processPayment())

  println(s"\nStep 5: Call Future.sequence to run the future operations in parallel")

  println(" \n Non blocking future result")
  import scala.util.{Failure, Success}

  val futureSequenceResults = Future.sequence(futureOperations)

  futureSequenceResults.onComplete {
    case Success(results) => println(s"Results $results")
    case Failure(e)       => println(s"Error processing future operations, error = ${e.getMessage}")
  }

  Thread.sleep(10000)



}
