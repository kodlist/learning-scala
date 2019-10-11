package com.allaboutscala.chapter.nine

/**
  * Created by mkoduri on 10/5/2019.
  *
  * So far, in our previous code snippets using future, we've introduced the Scala global
  * ExecutionContext: scala.concurrent.ExecutionContext.Implicits.global
  *
  * There may be situations where you have a need to control your threading behaviour.
  *
  *
  */

import java.util.concurrent.Executors

import scala.util.{Success, Failure}

object Tutorial_16_Future_Configure_ThreadPool extends App{


  //1. Define an ExecutionContext
  //    let's make use of java.util.concurrent.Executors class which will provide us with an Executor
  //     For the purpose of this example, we are using a single thread pool executor (Executors.newSingleThreadExecutor)



  println("Step 1: Define an ExecutionContext")
  val executor = Executors.newSingleThreadExecutor()
  implicit val ec = scala.concurrent.ExecutionContext.fromExecutor(executor)


  println("\nStep 2: Define a method which returns a Future")
  import scala.concurrent.Future
  def donutStock(donut: String): Future[Int] = Future {
    // assume some long running database operation
    println("checking donut stock")
    10
  }

  println("\nStep 3: Call method which returns a Future")
  val donutStockOperation = donutStock("vanilla donut")

  donutStockOperation.onComplete {
    case Success(donutStock)  => println(s"Results $donutStock")
    case Failure(e)           => println(s"Error processing future operations, error = ${e.getMessage}")
  }

  Thread.sleep(3000)
  executor.shutdownNow()





}
