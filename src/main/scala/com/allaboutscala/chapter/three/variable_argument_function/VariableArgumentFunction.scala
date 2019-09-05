package com.allaboutscala.chapter.three.variable_argument_function

/**
  * Created by mkoduri on 9/1/2019.
  *
  * Create Variable Argument Function - varargs _: * and I hope you've found it useful!
  * concept: type ascription . ex: printReport(listDonuts: _*)
  *
  */
object VariableArgumentFunction extends App{



  //1. How to define function which takes variable number of arguments

  //   The names argument is of type String, but it is also a variable argument as we've defined it using the * syntax.
  //   As a variable argument, you will be allowed to call the printReport() function by passing zero or many parameters of type String as shown in
  //   Step 2 below.

  def printReport(names: String*) {
    println(s"""Donut Report = ${names.mkString(" - ")}""")
  }


  println("\nStep 2: How to call function which takes variable number of String arguments")
  printReport("Glazed Donut", "Strawberry Donut", "Vanilla Donut")
  printReport("Chocolate Donut")



  //3. How to pass a List to a function with variable number of arguments//

  println("\nStep 3: How to pass a List to a function with variable number of arguments")
  val listDonuts: List[String] = List("Glazed Donut", "Strawberry Donut", "Vanilla Donut")
  //printReport(listDonuts)
  //Calling printReport() function by passing it the listDonuts value which is a List of type String will give you a compiler error!
  printReport(listDonuts: _*)


  //4. How to pass a Sequence to a function with variable number of arguments

  println("\nStep 4: How to pass a Sequence to a function with variable number of arguments")
  val seqDonuts: Seq[String] = Seq("Chocolate Donut", "Plain Donut")
  //printReport(listDonuts)
  printReport(seqDonuts: _*)


  //5. How to pass an Array to a function with variable number of arguments
  //   Calling printReport() function by passing it the arrDonuts value which is a Array of type String will give you a compiler error!

  println("\nStep 5: How to pass an Array to a function with variable number of arguments")
  val arrDonuts: Array[String] = Array("Coconut Donut")
  //printReport(arrDonuts)
  printReport(arrDonuts: _*)
}
