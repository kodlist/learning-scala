package com.allaboutscala.unittest_two

/**
  * Created by mkoduri on 10/9/2019.
  *
  * http://www.scalatest.org/user_guide/selecting_a_style
  *
  * Trait FeatureSpec is primarily intended for acceptance testing,
  * including facilitating the process of programmers working alongside non-programmers to define the acceptance requirements.
  *
  *
  */


import org.scalatest._

class TVSet {
  private var on: Boolean = false
  def isOn: Boolean = on
  def pressPowerButton() {
    on = !on
  }
}


class TVSetSpecextends extends FeatureSpec with GivenWhenThen {

  info("As a TV set owner")
  info("I want to be able to turn the TV on and off")
  info("So I can watch TV when I want")
  info("And save energy when I'm not watching TV")

  feature("TV power button") {

    scenario ("User presses power button when TV is off") {

        Given ("a TV set that is switched off")
        val tv = new TVSet
        assert (! tv.isOn)

        When ("the power button is pressed")
        tv.pressPowerButton ()

        Then ("the TV should switch on")
        assert (tv.isOn)
    }



    scenario ("User presses power button when TV is on") {

      Given ("a TV set that is switched on")
      val tv = new TVSet
      tv.pressPowerButton ()
      assert (tv.isOn)

      When ("the power button is pressed")
      tv.pressPowerButton ()

      Then ("the TV should switch off")
      assert (! tv.isOn)
    }

  }
}