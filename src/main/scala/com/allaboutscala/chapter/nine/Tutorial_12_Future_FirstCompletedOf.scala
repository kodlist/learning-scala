package com.allaboutscala.chapter.nine

/**
  * Created by mkoduri on 10/5/2019.
  *
  * There may be times when you'd be looking to fire a bunch of futures and continue processing as soon as you've received the first result from any one of them.
  * This behaviour is perhaps observed in micro-services architecture for sharding traffic. With this in mind,
  * Scala provides a handy Future.firstCompletedOf() function to achieve just that.
  *
  */
object Tutorial_12_Future_FirstCompletedOf extends App{

  //1. Define a method which returns a Future Option

  println("Step 1: Define a method which returns a Future Option")
  import scala.concurrent.ExecutionContext.Implicits.global
  import scala.concurrent.Future

  def donutStock(donut: String): Future[Option[Int]] = Future {
    println("checking donut stock")

    if(donut == "vanilla donut") Some(10) else None
  }


  //2. Create a List of future operations
  //   we will create an Immutable List of donutStock() futures.
  println(s"\nStep 2: Create a List of future operations")
  val futureOperations = List(
    donutStock("vanilla donut"),
    donutStock("plain donut"),
    donutStock("chocolate donut"),
    donutStock("vanilla donut")
  )


  println(" \n Non blocking future result")

  import scala.util.{Failure, Success}


  //3. Call Future.firstCompletedOf to get the results of the first future that completes

  println(s"\nStep 3: Call Future.firstCompletedOf to get the results of the first future that completes")
  val futureFirstCompletedResult = Future.firstCompletedOf(futureOperations)
  futureFirstCompletedResult.onComplete {
    case Success(results) => println(s"Results $results")
    case Failure(e)       => println(s"Error processing future operations, error = ${e.getMessage}")
  }

  Thread.sleep(3000)









}
