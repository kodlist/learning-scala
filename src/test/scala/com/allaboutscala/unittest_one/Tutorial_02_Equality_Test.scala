package com.allaboutscala.unittest_one

import org.scalatest._

/**
  * Created by mkoduri on 10/7/2019.
  */
class Tutorial_02_Equality_Test extends FlatSpec with Matchers{


  //Equality Test



  behavior of "DonutStore class"

  "favourite donut" should "match vanilla donut" in {

    val donutStore = new DonutStore()

    donutStore.favouriteDonut() shouldEqual "vanilla donut"
    donutStore.favouriteDonut() === "vanilla don"  // this doesnt work
    donutStore.favouriteDonut() should not equal "plain donut"
    donutStore.favouriteDonut() should not be "plain donut"
    donutStore.favouriteDonut() !== "Plain donut"  // this doesnt work

  }

}

// The DonutStore class which we are testing using ScalaTest
class DonutStore {
  def favouriteDonut(): String = "vanilla donut"
  def donuts(): Seq[String] = Seq("vanilla donut", "plain donut", "glazed donut")
}
