package com.allaboutscala.chapter.two.if_and_else_expressions

/**
  * Created by mkoduri on 8/29/2019.
  *
  * It's a good practice to enclose your if, else, else if statements with curly braces {} as they get more complex.
  *
  *
  */
object IfandElseExpressions extends App{


  println("Step 1: Using if clause as a statement")
  val numberOfPeople = 10
  val donutsPerPerson = 2

  if(numberOfPeople > 10)
    println(s"Number of donuts to buy = ${numberOfPeople * donutsPerPerson}")


  //2. Using if and else clause as a statement
  println(s"\nStep 2: Using if and else clause as a statement")
  val defaultDonutsToBuy = 8

  if(numberOfPeople > 10)
    println(s"Number of donuts to buy = ${numberOfPeople * donutsPerPerson}")
  else
    println(s"Number of donuts to buy = $defaultDonutsToBuy")


  //3. Using if, else if, and else clause as a statement
  //  It's a good practice to enclose your if, else, else if statements with curly braces {} as they get more complex.
  println("\nStep 3: Using if, else if, and else clause as a statement")
  if(numberOfPeople > 10) {
    println(s"Number of donuts to buy = ${numberOfPeople * donutsPerPerson}")
  } else if (numberOfPeople == 0) {
    println("Number of people is zero.")
    println("No need to buy donuts.")
  } else {
    println(s"Number of donuts to buy = $defaultDonutsToBuy")
  }



  //4. Using if and else clause as expression
  //   What if you had to store the result of the if and else expressions above into a variable.
  println("\nStep 4: Using if and else clause as expression")
  val numberOfDonutsToBuy = if(numberOfPeople > 10) (numberOfPeople * donutsPerPerson) else defaultDonutsToBuy
  println(s"Number of donuts to buy = $numberOfDonutsToBuy")


}
