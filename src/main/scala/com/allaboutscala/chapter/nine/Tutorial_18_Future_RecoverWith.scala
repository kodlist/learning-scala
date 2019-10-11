package com.allaboutscala.chapter.nine

/**
  * Created by mkoduri on 10/5/2019.
  *
  *
  * previous section, we introduced future recover() method. Similarly, Scala provides a future recoverWith() method but it requires a return type of Future.
  *
  * def recoverWith[U >: T](pf: PartialFunction[Throwable, Future[U]])
  *
  */

import scala.util.{Success, Failure}


object Tutorial_18_Future_RecoverWith extends App{

  println("Step 1: Define a method which returns a Future")

  import scala.concurrent.ExecutionContext.Implicits.global
  import scala.concurrent.Future

  def donutStock(donut: String): Future[Int] = Future {
    if(donut == "vanilla donut") 10
    else throw new IllegalStateException("Out of stock")
  }

  println("\nStep 2: Execute donutStock() future operation")
  donutStock("vanilla donut")
    .onComplete {
      case Success(donutStock)  => println(s"Results $donutStock")
      case Failure(e)           => println(s"Error processing future operations, error = ${e.getMessage}")
    }


  println("\nStep 3: Call Future.recoverWith to recover from a known exception")
  donutStock("unknown donut")
                            .recoverWith { case e: IllegalStateException if e.getMessage == "Out of stock" => Future.successful(0) }
                            .onComplete {
                                           case Success(donutStock)  => println(s"Results $donutStock")
                                           case Failure(e)           => println(s"Error processing future operations, error = ${e.getMessage}")
                            }

  Thread.sleep(3000)



}
