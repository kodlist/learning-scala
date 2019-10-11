package com.allaboutscala.unittest_one


import org.scalatest._

/**
  * Created by mkoduri on 10/7/2019.
  */
class Tutorial_03_Length_Test extends FlatSpec with Matchers{

  //behavior of "DonutStore class"

  "Length and size of donuts" should "be equal to 3" in {

    val donutStore = new DonutStore()   //DonutStore class is in Tutorial_02_Equality_Test
    val donuts = donutStore.donuts()
    donuts should have size 3
    donuts should have length 3
  }



}
/*
class DonutStore {
  def favouriteDonut(): String = "vanilla donut"

  def donuts(): Seq[String] = Seq("vanilla donut", "plain donut", "glazed donut")
}*/
