package com.allaboutscala.unittest_one



import org.scalatest._


/**
  * Created by mkoduri on 10/7/2019.
  *
  *
  *
  * Throwing exceptions is generally a bad idea in programming, and even more so in Functional Programming.
  *
  *
  *
  */
class Tutorial_07_Exception_Test extends FlatSpec with Matchers{

  //you can use ScalaTest's intercept method:
  "Method DonutStore.printName()" should "throw IllegalStateException" in {
    val donutStore = new DonutStoreA()
    intercept[java.lang.IllegalStateException] {
      donutStore.printName()
    }
  }


  "Exception thrown by method printName()" should "contain message Some Error" in {
    val donutStore = new DonutStoreA()
    val exception = the [java.lang.IllegalStateException] thrownBy {
      donutStore.printName()
    }
    // here we verify that the exception class and the internal message
    exception.getClass shouldEqual classOf[java.lang.IllegalStateException]
    exception.getMessage should include ("Some Error")
    println(s"  exception.getMessage  $exception" )
  }


  //In case you only need to test the exception message, you can use ScalaTest's the(), thrownBy() and should have message methods:

  "Exception thrown by method printName()" should "contain message Some Error using ScalaTest should have message methods" in {
    val donutStore = new DonutStoreA()

    the [java.lang.IllegalStateException] thrownBy {
      donutStore.printName()
    } should have message "Some Error"
  }


  //To write a test to verify only the type of the Exception being thrown, you can make use of ScalaTest an and should be thrownBy() methods:

  an [java.lang.IllegalStateException] should be thrownBy {
    new DonutStoreA().printName()
  }


}

class DonutStoreA {
  def favouriteDonut(): String = "vanilla donut"

  def donuts(): Seq[String] = Seq("vanilla donut", "plain donut", "glazed donut")

  //dummy printName() method, which basically throws an IllegalStateException.

  def printName(): Unit = {
    throw new IllegalStateException("Some Error")
  }
}