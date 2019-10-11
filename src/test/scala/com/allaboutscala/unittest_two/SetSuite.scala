package com.allaboutscala.unittest_two

/**
  * Created by mkoduri on 10/9/2019.
  *
  *
  * http://www.scalatest.org/user_guide/selecting_a_style
  *
  * ScalaTest supports different styles of testing, each designed to address a particular set of needs. To help you find the best-fit styles for your project,
  * this page will describe the intended use cases for each option.
  *
  *
  * We recommend you choose a set of testing styles for each project, then encourage everyone working on the project use the chosen styles.
  * This allows the testing styles to fit the team while maintaining uniformity in the project code base.
  *
  *
  * If you don't enjoy shopping
  * If you would rather be told which approach to take rather than pick one yourself,
  * we recommend you use FlatSpec for unit and integration testing and FeatureSpec for acceptance testing.
  *
  *
  */


import org.scalatest.FunSuite

class SetSuite extends FunSuite  {

  //For teams coming from xUnit, FunSuite feels comfortable and familiar while still giving some of the benefits of BDD

  test("An empty Set should have size 0") {
    assert(Set.empty.size == 0)
  }

  test("Invoking head on an empty Set should produce NoSuchElementException") {
    assertThrows[NoSuchElementException] {
      Set.empty.head
    }
  }

}
