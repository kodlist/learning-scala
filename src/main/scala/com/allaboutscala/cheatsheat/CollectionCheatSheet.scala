package com.allaboutscala.cheatsheat

/**
  * Created by mkoduri on 10/8/2019.
  */
object CollectionCheatSheet extends App{


  // Step 1: Import converters
  import scala.collection.JavaConverters._

  // Step 2: Assume you have a Java Map
  val donutJavaMap: java.util.Map[String, Double] = new java.util.HashMap[String, Double]()
  donutJavaMap.put("Plain Donut", 2.50)
  donutJavaMap.put("Vanilla Donut", 3.50)

  // Step 3: Convert the Java Map by calling .asScala
  val donutScalaMap = donutJavaMap.asScala

  // Step 4: You now have a Scala Map
  val pricePlainDonut = donutScalaMap("Plain Donut")
  val setDonuts = donutScalaMap.map(_._1).toSet

  println(s"price : $pricePlainDonut")
  println(s" set donuts : $setDonuts")

  println(s" $donutScalaMap ")

  val x = donutScalaMap.map(_._2)
  println(s" : $x")

  val y = donutScalaMap.map(_._2).toSet
  println(s" : $y")
}
