package com.allaboutscala.chapter.nine


import scala.util.{Failure, Success}


/**
  * Created by mkoduri on 10/5/2019.
  *
  * future recover() function to help you work around exceptions that may arise from a future operation
  *
  * Typically, though, you would want to recover from known exceptions that your future
  * may throw as opposed to trapping any random exception.
  *
  * def recover[U >: T](pf: PartialFunction[Throwable, U])
  *
  */
object Tutorial_17_Future_Recover extends App{

  //1. Define a method which returns a Future

  println("Step 1: Define a method which returns a Future")
  import scala.concurrent.ExecutionContext.Implicits.global
  import scala.concurrent.Future

  def donutStock(donut: String): Future[Int] = Future {
    if(donut == "vanilla donut") 10
    else throw new IllegalStateException("Out of stock")
  }


  //2. Execute donutStock() future operation

  println("\nStep 2: Execute donutStock() future operation")
  donutStock("vanilla donut")
    .onComplete {
      case Success(donutStock)  => println(s"Results $donutStock")
      case Failure(e)           => println(s"Error processing future operations, error = ${e.getMessage}")
    }


  println("\nStep 3: Call Future.recover to recover from a known exception")
  donutStock("unknown donut")
                             .recover { case e: IllegalStateException if e.getMessage == "Out of stock" => 0 }
                             .onComplete {
                                      case Success(donutStock)  => println(s"Results $donutStock")
                                      case Failure(e)           => println(s"Error processing future operations, error = ${e.getMessage}")
    }

  Thread.sleep(3000)

}
