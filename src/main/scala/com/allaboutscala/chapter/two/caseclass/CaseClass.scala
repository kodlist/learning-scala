package com.allaboutscala.chapter.two.caseclass

/**
  * Created by mkoduri on 8/29/2019.
  */
object CaseClass extends App{

  println("\nStep 1: Using String interpolation on object properties")
  case class Donut(name: String, tasteLevel: String)
  val favoriteDonut2: Donut = Donut("Glazed Donut", "Very Tasty")
  println(s"My favorite donut name = ${favoriteDonut2.name}, tasteLevel = ${favoriteDonut2.tasteLevel}")


}
