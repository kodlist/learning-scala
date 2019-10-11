package com.allaboutscala.chapter.nine

/**
  * Created by mkoduri on 10/5/2019.
  *
  * The Future.traverse() function is fairly similar to the Future.sequence() function
  *
  * the traverse function also allows you to fire a bunch of future operations in parallel and wait for their results
  *
  * The traverse function, though, has the added benefit of allowing you to apply a function over the future operations.
  *
  * The return type of futureTraverseResult is Future[List[Int]] instead of Future[List[Option[Int]]]
  */
object Tutorial_09_Future_Traverse extends App{

  //1. Define a method which returns a Future Option
  println("Step 1: Define a method which returns a Future Option")

  import scala.concurrent.Future
  import scala.concurrent.ExecutionContext.Implicits.global

  def donutStock(donut: String): Future[Option[Int]] = Future {
    println("checking donut stock")
    if(donut == "vanilla donut") Some(10) else None
  }

  //2. Create a List of future operations
  println(s"\nStep 2: Create a List of future operations")
  val futureOperations = List(
    donutStock("vanilla donut"),
    donutStock("plain donut"),
    donutStock("chocolate donut")
  )

 //3. Call Future.traverse to convert all Option of Int into Int

  println(s"\nStep 3: Call Future.traverse to convert all Option of Int into Int")
  val futureTraverseResult = Future.traverse(futureOperations){ futureSomeQty =>
                                                                                futureSomeQty.map(someQty => someQty.getOrElse(0))
  }

  println(" \n Non blocking future result")
  import scala.util.{Failure, Success}

  futureTraverseResult.onComplete {
    case Success(results) => println(s"Results $results")
    case Failure(e)       => println(s"Error processing future operations, error = ${e.getMessage}")
  }
  //The return type of futureTraverseResult is Future[List[Int]] instead of Future[List[Option[Int]]]
  //The return type of results is List[Int] instead of List[Option[Int]]
  Thread.sleep(3000)


}
