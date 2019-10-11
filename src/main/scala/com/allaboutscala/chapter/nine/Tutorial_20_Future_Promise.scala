package com.allaboutscala.chapter.nine

/**
  * Created by mkoduri on 10/5/2019.
  *
  * So far we've been using future's return type to mark our methods to run asynchronously.
  *
  * Scala provides an abstraction over future and it is called a Promise
  * Promises can be useful when you want to capture the intent of your operation versus its behaviour.
  *
  * look into this link : https://stackoverflow.com/questions/14541975/whats-the-difference-between-a-future-and-a-promise?rq=1 by Vladimir Nabokov
  *
  * to understand btw Promise vs Future.
  *
  *
  *
  *
  */


import scala.concurrent.Promise
import scala.util.{Success, Try, Failure}

object Tutorial_20_Future_Promise extends App{

  //1. Define a method which returns a Future

  println("Step 1: Define a method which returns a Future")

  import scala.concurrent.ExecutionContext.Implicits.global

  def donutStock(donut: String): Int = {
                                          if(donut == "vanilla donut") 10
                                          else throw new IllegalStateException("Out of stock")
                                        }


  //2. Define a Promise of type Int
  println(s"\nStep 2: Define a Promise of type Int")
  val donutStockPromise = Promise[Int]()

  println(s" docunetStockPromise  $donutStockPromise  ")
  //3. Define a future from Promise

  println("\nStep 3: Define a future from Promise")
  val donutStockFuture = donutStockPromise.future

  println(s" donutStockFuture  $donutStockFuture  ")

  donutStockFuture.onComplete {
    case Success(stock) => println(s" -----------line 41 ------- Stock for vanilla donut = $stock")
    case Failure(e)     => println(s"Failed to find vanilla donut stock, exception = $e")
  }

  println(s" donutStockFuture  $donutStockFuture  ")
  //4. Use Promise.success or Promise.failure to control execution of your future
  //  On the other hand, calling donutStock() with a parameter other than vanilla donut will throw an IllegalStateException.

  println("\nStep 4: Use Promise.success or Promise.failure to control execution of your future")

  val donut = "vanilla donut"

  if(donut == "vanilla donut")
  {
                  println(s"-----------line 53 -------")
                  donutStockPromise.success(donutStock(donut))
  } else {
                  donutStockPromise.failure(Try(donutStock(donut)).failed.get)
  }

  //5. Completing Promise using Promise.complete() method

  println("\nStep 5: Completing Promise using Promise.complete() method")

  val donutStockPromise2 = Promise[Int]()
  val donutStockFuture2 = donutStockPromise2.future

  donutStockFuture2.onComplete {
    case Success(stock) => println(s"Stock for vanilla donut = $stock")
    case Failure(e)     => println(s"Failed to find vanilla donut stock, exception = $e")
  }
  donutStockPromise2.complete(Try(donutStock("unknown donut")))

  Thread.sleep(3000)


}
