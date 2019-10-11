package com.allaboutscala.chapter.nine

/**
  * Created by mkoduri on 10/5/2019.
  *
  * we introduced the foldLeft function. Similarly, Scala provides a foldLeft function for futures
  * the foldLeft on your future operations will be run asynchronously from left to right
  *
  *
  *
  */
object Tutorial_10_Future_FoldLeft extends App{

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

 //3: Call Future.foldLeft to fold over futures results from left to right
 //   Using Future.foldLeft, you can easily aggregate the results returned by the future operations.

  println(s"\nStep 3: Call Future.foldLeft to fold over futures results from left to right")
  val futureFoldLeft = Future.foldLeft(futureOperations)(0){ case (acc, someQty) =>
    acc + someQty.getOrElse(0)
  }

  println(" \n Non blocking future result")
  import scala.util.{Failure, Success}


  futureFoldLeft.onComplete {
    case Success(results) => println(s"Results $results")
    case Failure(e)       => println(s"Error processing future operations, error = ${e.getMessage}")
  }



  Thread.sleep(3000)


}
