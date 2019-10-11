package com.allaboutscala.chapter.nine

/**
  * Created by mkoduri on 10/5/2019.
  *
  * we've introduced Future.foldLeft() function to allow you to operate on the results from future operations in a left to right manner.
  * Unlike foldLeft(), however, reduceLeft() does not allow you to provide a default value.
  *
  *
  */
object Tutorial_11_Future_ReduceLeft extends App{

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


  //3. Call Future.reduceLeft to fold over futures results from left to right


  println(s"\nStep 3: Call Future.reduceLeft to fold over futures results from left to right")
  val futureFoldLeft = Future.reduceLeft(futureOperations){ case (acc, someQty) =>
    acc.map(qty => qty + someQty.getOrElse(0))
  }

  println(" \n Non blocking future result")

  import scala.util.{Failure, Success}

  futureFoldLeft.onComplete {
    case Success(results) => println(s"Results $results")
    case Failure(e)       => println(s"Error processing future operations, error = ${e.getMessage}")
  }

  Thread.sleep(3000)


}
