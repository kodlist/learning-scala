package com.allaboutscala.chapter.two.while_loop_construct

/**
  * Created by mkoduri on 8/29/2019.
  *
  * Just a reminder that from a pure functional perspective the use of loop such as the while loop is generally less favoured.
  *
  * Instead, fold and recursive operations are preferred and if you do not know what these mean, that's OK! We will cover them in upcoming tutorials.
  *
  *
  */
object WhileLoop extends App{


  //1. How to use while loop in Scala

   //declare a mutable variable called numberOfDonutsToBake to represent the quantity of donuts that we need to bake
   //then use a while loop and keep on decrementing the numberOfDonutsToBake variable by 1 after each iteration.

  println("Step 1: How to use while loop in Scala")
  var numberOfDonutsToBake = 10
  while (numberOfDonutsToBake > 0) {
    println(s"Remaining donuts to be baked = $numberOfDonutsToBake")
    numberOfDonutsToBake -= 1
  }

  //Once again, there are better functional ways of achieving the same looping semantics using fold or recursive techniques.

  // 2. How to use do while loop in Scala

  println("\nStep 2: How to use do while loop in Scala")
  var numberOfDonutsBaked = 0
  do {
    numberOfDonutsBaked += 1
    println(s"Number of donuts baked = $numberOfDonutsBaked")
  } while (numberOfDonutsBaked < 5)


}
