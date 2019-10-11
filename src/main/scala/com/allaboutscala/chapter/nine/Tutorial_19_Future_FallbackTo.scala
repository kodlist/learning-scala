package com.allaboutscala.chapter.nine


import scala.util.{Failure, Success}

/**
  * Created by mkoduri on 10/5/2019.
  *
  * we've showed how we can use the future recover() and recoverWith() methods to deal with known or expected exceptions
  *
  * Scala also provides a fallbackTo() method which allows you to provide an alternative method that can be called in the event of an exception
  *
  *
  */
object Tutorial_19_Future_FallbackTo extends App{

  println("Step 1: Define a method which returns a Future")
  import scala.concurrent.ExecutionContext.Implicits.global
  import scala.concurrent.Future

  def donutStock(donut: String): Future[Int] = Future {
    if(donut == "vanilla donut") 10
    else throw new IllegalStateException("Out of stock")
  }

  println("\nStep 2: Define another method which returns a Future to match a similar donut stock")
  def similarDonutStock(donut: String): Future[Int] = Future {
    println(s"replacing donut stock from a similar donut = $donut")
    if(donut == "vanilla donut") 20 else 5
  }

  println("\nStep 3: Call Future.fallbackTo")

  val donutStockOperation = donutStock("plain donut")
                                                    .fallbackTo(similarDonutStock("sugar donut"))
                                                    .onComplete {
                                                                case Success(donutStock)  => println(s"Results $donutStock")
                                                                case Failure(e)           => println(s"Error processing future operations, error = ${e.getMessage}")
    }

  Thread.sleep(3000)



}
