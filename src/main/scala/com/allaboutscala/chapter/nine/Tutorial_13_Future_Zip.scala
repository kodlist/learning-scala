package com.allaboutscala.chapter.nine

/**
  * Created by mkoduri on 10/5/2019.
  *
  *
  * Future.zip to combine the results of two future operations into a single tuple.
  *
  * the result is tuple
  *
  */
object Tutorial_13_Future_Zip extends App{

  //1. Define a method which returns a Future Option

  println("Step 1: Define a method which returns a Future Option")
  import scala.concurrent.ExecutionContext.Implicits.global
  import scala.concurrent.Future


  def donutStock(donut: String): Future[Option[Int]] = Future {
    println("checking donut stock")
    if(donut == "vanilla donut") Some(10) else None
  }


  //2. Define a method which returns a Future Double for donut price

  println(s"\nStep 2: Define a method which returns a Future Double for donut price")
  def donutPrice(): Future[Double] = Future.successful(3.25)

  //3. Zip the values of the first future with the second future

  //To combine the results of the two future operations, donutStock() and donutPrice(), into a single tuple,
  //you can make use of the zip method as shown below.

  println(" \n Non blocking future result")

  import scala.util.{Failure, Success}

  println(s"\nStep 3: Zip the values of the first future with the second future")
  val donutStockAndPriceOperation = donutStock("vanilla donut") zip donutPrice()

  val res = donutStockAndPriceOperation.onComplete {
    case Success(results) => println(s"Results $results")
    case Failure(e)       => println(s"Error processing future operations, error = ${e.getMessage}")
  }


  Thread.sleep(3000)

  println(s" return value checking : $res ")

}
