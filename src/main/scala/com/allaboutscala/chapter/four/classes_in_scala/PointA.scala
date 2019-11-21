package com.allaboutscala.chapter.four.classes_in_scala

/**
  * Created by mkoduri on 11/1/2019.
  *
  * Private Members and Getter/Setter Syntax
  *
  *
  */
class PointA {
  private var _x = 0
  private var _y = 0
  private val bound = 100

  def x = _x
  def x_= (newValue: Int): Unit = {
    if (newValue < bound) _x = newValue else printWarning
  }

  def y = _y
  def y_= (newValue: Int): Unit = {
    if (newValue < bound) _y = newValue else printWarning
  }

  private def printWarning = println("WARNING: Out of bounds")
}

object MainX {
  def main (args : Array[String]) :Unit = {
    val point1 = new PointA
    point1.x = 99
    point1.y = 101 // prints the warning
  }
}