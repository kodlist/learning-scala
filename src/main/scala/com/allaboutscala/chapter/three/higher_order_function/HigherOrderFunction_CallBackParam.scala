package com.allaboutscala.chapter.three.higher_order_function

/**
  * Created by mkoduri on 9/4/2019.
  *
  *  http://allaboutscala.com/tutorials/chapter-3-beginner-tutorial-using-functions-scala/scala-tutorial-learn-create-function-callback-parameter/
  */
object HigherOrderFunction_CallBackParam extends App{

  //1. How to define a function with a callback parameter
  //   Let's say that you have a function named printReport() which needs to be passed in a function for sending email once the report is completed.
  //   You can define the printReport() function to have a call-by-name parameter of type unit that will essentially be the email callback function.

  println("Step 1: How to define a function with a callback parameter")
  def printReport(sendEmailCallback: () => Unit) {
    println("Printing report ... started")
    // look up some data in database and create a report
    println("Printing report ... finished")
    sendEmailCallback()
  }


  //2. How to call a function which has a callback parameter

  println("\nStep 2: How to call a function which has a callback parameter")

  printReport(() =>    println("Sending email ... finished") )

  // calling the same with empty anonymous function
  printReport(() => {}) // Not that elegant.

  printReport(() => {}) // Not that elegant.
  //3. How to call a function without providing its callback parameter
  println("\nStep 3: How to call a function without providing its callback parameter")
  //printReport() // You get compile time error


  //4. How to define a function with an Option callback

  println("\nStep 4: How to define a function Function with an Option callback")
  def printReportWithOptionCallback(sendEmailCallback: Option[() => Unit] = None) {
    println("Printing report ... started")
    // look up some data in database and create a report
    println("Printing report ... finished")
    sendEmailCallback.map(callback => callback())
  }

  println("\nStep 5: How to call a function without providing its callback parameter")
  printReportWithOptionCallback() // more elegant



  //6. How to call a function with Option callback parameter

  println("\nStep 6: How to call a function with Option callback parameter")
  printReportWithOptionCallback(Some(() =>
    println("Sending email wrapped in Some() ... finished")
  ))

}
