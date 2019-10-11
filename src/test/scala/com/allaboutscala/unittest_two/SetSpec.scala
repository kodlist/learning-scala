package com.allaboutscala.unittest_two

/**
  * Created by mkoduri on 10/9/2019.
  *
  * http://www.scalatest.org/user_guide/selecting_a_style
  *
  * A good first step for teams wishing to move from xUnit to BDD, FlatSpec's structure is flat like xUnit, so simple and familiar,
  * but the test names must be written in a specification style: "X should Y," "A must B," etc.
  *
  */

import org.scalatest.FlatSpec


class SetSpec extends FlatSpec {

  "An empty Set" should "have size 0" in {
    assert(Set.empty.size == 0)
  }

  it should "produce NoSuchElementException when head is invoked" in {
    assertThrows[NoSuchElementException] {
      Set.empty.head
    }
  }
}
