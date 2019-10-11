package com.allaboutscala.chapter.nine

/**
  * Created by mkoduri on 10/5/2019.
  *
  *
  *  Note however that using map is useful when you are most certainly working with a single Future as opposed to multiple Futures which require chaining.
  *
  *
  *
  */
object Tutorial_06_Future_Option_Map extends App{


  //1. Define a method which returns a Future Option

  println("Step 1: Define a method which returns a Future Option")
  import scala.concurrent.Future
  import scala.concurrent.ExecutionContext.Implicits.global


  def donutStock(donut: String): Future[Option[Int]] = Future {
    // assume some long running database operation
    println("checking donut stock")
    if(donut == "vanilla donut") Some(10) else None
  }

  //2. Access value returned by future using map() method

  println(s"\nStep 2: Access value returned by future using map() method")
  donutStock("vanilla donut")
                          .map(someQty => println(s"Buying ${someQty.getOrElse(0)} vanilla donuts"))

  Thread.sleep(3000)

}
