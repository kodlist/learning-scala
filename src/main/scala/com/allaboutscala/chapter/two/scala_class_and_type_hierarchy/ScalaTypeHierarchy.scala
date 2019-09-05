package com.allaboutscala.chapter.two.scala_class_and_type_hierarchy

/**
  * Created by mkoduri on 8/30/2019.
  *
  * If you are coming from Java or .NET, you can think of the Any type as the Object class.
  * In other words, Any is the root type and it has two sub-classes namely AnyVal and AnyRef as per the above diagram.
  */

object ScalaTypeHierarchy extends App{



  println("Step 1: Declare a variable of type Any")
  val favoriteDonut: Any = "Glazed Donut"
  println(s"favoriteDonut of type Any = $favoriteDonut")


  println("\nStep 2: Declare a variable of type AnyRef")
  val donutName: AnyRef = "Glazed Donut"
  println(s"donutName of type AnyRef = $donutName")


  println("\nStep 3: Declare a variable of type AnyVal")
  val donutPrice: AnyVal = 2.50
  println(s"donutPrice of type AnyVal = $donutPrice")
  // if we wanted to print the 2 decimal places for the donutPrice variable. This can be achieved by using the f interpolator.
  //println(f"donutPrice of type AnyVal = $donutPrice%.2f")


}
