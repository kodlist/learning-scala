package com.allaboutscala.chapter.four.package_object

import com.allaboutscala.chapter.four.{DateTime, Donut}

/**
  * Created by mkoduri on 9/10/2019.
  *
  *
  * In this tutorial,
  * we will import the popular JodaTime library so that we can later alias a new type called DateTime to refer to JodaTime as opposed to default Scala DateTime.
  *
  * next lesson, we will learn about traits which you can use to mix-in functionality with Package Object.
  *
  * http://allaboutscala.com/tutorials/chapter-3-beginner-tutorial-using-classes-scala/scala-package-object/
  *
  *
  */
object PackageObject_Tutorial extends App{


  //1. How to add JodaTime dependency in build.sbt"


  println("\nStep 1: How to add JodaTime dependency in build.sbt")
  //  libraryDependencies ++= Seq(
  //    "joda-time"     % "joda-time"     % "2.9.3",
  //    "org.joda"      % "joda-convert"  % "1.8"
  //  )


  //2. How to define a case class to represent a Donut object in a package object
  //    Before we can declare a case class inside a Package Object you must first create it!

  // go to package object in this package. you will find package object. and it is named default with four.
  // bcz we created in package four

  println("\nStep 5: How to create instances or objects for the Donut case class from package object")
  // also see line 3 (import stmt)
  val vanillaDonut: Donut = Donut("Vanilla", 1.50)
  println(s"Vanilla donut name = ${vanillaDonut.name}")
  println(s"Vanilla donut price = ${vanillaDonut.price}")
  println(s"Vanilla donut produceCode = ${vanillaDonut.productCode}")
  println(s"Vanilla donut uuid = ${vanillaDonut.uuid}")

  //In this tutorial, we will import the popular JodaTime library so that we can later alias a new type called
  // DateTime to refer to JodaTime as opposed to default Scala DateTime.

  println("\nStep 6: How to create new JodaTime instance using DateTime alias from package object")
  // also see line 3 (import stmt)
  val today = new DateTime() // check package object four. we have seen - How to alias JodaTime to a DateTime type. an alias object of joda time
  println(s"today = $today, datetime class = ${today.getClass}")



}
