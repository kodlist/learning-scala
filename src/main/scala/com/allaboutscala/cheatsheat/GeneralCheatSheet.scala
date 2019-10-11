package com.allaboutscala.cheatsheat


import scala.io.Source

/**
  * Created by mkoduri on 10/8/2019.
  */
object GeneralCheatSheet extends App{

  /** Add line break or separator for given platform **/
  val lineBreak = scala.compat.Platform.EOL
  println(s"First line $lineBreak second line")

  /** Convert multi-line string to single line **/
  // Step 1: Define an implicit class to strip out line endings
  implicit class StringConversion(str: String) {

    def inline(): String = str.replaceAll(scala.compat.Platform.EOL," ")

  }

  // Step 2: Create a multi-line string
  val multilineStr =
    """
      |Plain Donut
      |Vanilla Donut
    """.stripMargin

  println(s" mult ${multilineStr} ")
  println(s"Multi-line as single line = ${multilineStr.inline()}")


  /** Check the value of an Option **/
  Some(5).contains(5)


  /** Function to read a file and return a String of its contents **/
  def readFile(file: String): String = {
    Source
      .fromInputStream(getClass.getResourceAsStream(file))
      .getLines
      .mkString("\n")
  }


  /** Create enum using sealed trait **/
  sealed trait Donut
  case object Vanilla extends Donut
  case object Chocolate extends Donut
  case object Plain extends Donut

  def isValidDonut(donut: Donut) = {
    donut match {
      case Vanilla | Chocolate | Plain => println("Valid donut")
      case _ => println("Unknown donut!")
    }
  }

  val v = Vanilla
  isValidDonut(v)

  val c = Chocolate
  isValidDonut(c)



  /*object Margin extends Enumeration {
    type Margin = Value
    val TOP, BOTTOM, LEFT, RIGHT = Value
  }



  // use an enumeration value in a test
  var currentMargin = TOP

  // later in the code ...
  if (currentMargin == TOP) println("working on Top")

  // print all the enumeration values
  import com.acme.app.Margin
  Margin.values foreach println*/



  /** Int division in Scala and return a float which keeps the decimal values: **/
  val donutQuantity: Int = 10
  val donutTotalCost: Int = 25
  val donutPrice = donutTotalCost.toFloat / donutQuantity
  println(s"Cost of one donut = $donutPrice")



}
