package com.allaboutscala.chapter.nine

/**
  * Created by mkoduri on 10/5/2019.
  *
  * Similar to future zip() method, Scala also provides a handy future zipWith() method. In addition to combining the
  * results of two futures, the zipWith() method allows you to pass-through a function which can
  * be applied to the results.
  *
  *
  */
object Tutorial_14_Future_ZipWith extends App{



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

  //3. Define a value function to convert Tuple (Option[Int], Double) to Tuple (Int, Double)
/*
  Similar to the last tutorial on future zip, when we zip donutStock() Future with donutPrice()
  future, the return type of the result was a tuple of Option[Int] and Double. Option[Int] type
  represents the quantity from method donutStock() and Double type represents the price from
    donutPrice(). The qtyAndPriceF function below is a dummy example to map the Int value
  from an Option and we will pass this function to future zipWith().*/


  println(s"\nStep 3: Define a value function to convert Tuple (Option[Int], Double) to Tuple (Int, Double)")
  val qtyAndPriceF: (Option[Int], Double) => (Int, Double) = (someQty, price) => (someQty.getOrElse(0), price)

  //4. Call Future.zipWith and pass-through function qtyAndPriceF
  println(s"\nStep 4: Call Future.zipWith and pass-through function qtyAndPriceF")

  println(" \n Non blocking future result")

  import scala.util.{Failure, Success}

  val donutAndPriceOperation = donutStock("vanilla donut").zipWith(donutPrice())(qtyAndPriceF)
  donutAndPriceOperation.onComplete {
    case Success(result) => println(s"Result $result")
    case Failure(e)      => println(s"Error processing future operations, error = ${e.getMessage}")
  }

  Thread.sleep(3000)

}
