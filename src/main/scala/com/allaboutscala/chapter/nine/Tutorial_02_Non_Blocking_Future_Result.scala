package com.allaboutscala.chapter.nine

/**
  * Created by mkoduri on 10/4/2019.
  */
object Tutorial_02_Non_Blocking_Future_Result extends App{

  //Instead of blocking our main program using Await.result(), we will make use of Future.onComplete() callback to capture the result of a Future.


  println("Step 1: Define a method which returns a Future")

  import scala.concurrent.Future
  import scala.concurrent.ExecutionContext.Implicits.global

  def donutStock(donut: String): Future[Int] = Future {
    // assume some long running database operation
    println("checking donut stock")
    10
  }


//With Future.onComplete() we are no longer blocking for the result from the Future but instead we will receive a callback for either a Success or a Failure.
//Surely though the Thread.sleep() is blocking our main thread so that we can see the asynchronous result from the future.
  // In a real application, you will most certainly not use Thread.sleep() but instead "react" to the result returned by the future.
  println("\nStep 2: Non blocking future result")

  import scala.util.{Failure, Success}

  donutStock("vanilla donut").onComplete {
    case Success(stock) => println(s"Stock for vanilla donut = $stock")
    case Failure(e) => println(s"Failed to find vanilla donut stock, exception = $e")
  }

  Thread.sleep(3000)

}
