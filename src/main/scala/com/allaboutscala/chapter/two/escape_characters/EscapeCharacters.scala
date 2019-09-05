package com.allaboutscala.chapter.two.escape_characters

/**
  * Created by mkoduri on 8/29/2019.
  */
object EscapeCharacters extends App{

  // 1. How to escape a Json String
  // How would you define a variable to store the donut JSON String?
  println("Step 1: How to escape a Json String")
  //val donutJson: String = "{"donut_name":"Glazed Donut","taste_level":"Very Tasty","price":2.50}"
  //The Scala compiler will complain about the double quotes in the JSON field names.



  //2. Using backslash to escape quotes
  println("\nStep 2: Using backslash to escpae quotes")
  val donutJson2: String ="{\"donut_name\":\"Glazed Donut\",\"taste_level\":\"Very Tasty\",\"price\":2.50}"
  println(s"donutJson2 = $donutJson2")


  //3. Using triple quotes """ to escape characters
  //you just need to wrap the text within triple quotes """<YOUR TEXT TO ESCAPE>""" as follows:
  println("\nStep 3: Using triple quotes \"\"\" to escape characters")
  val donutJson3: String = """{"donut_name":"Glazed Donut","taste_level":"Very Tasty","price":2.50}"""
  println(s"donutJson3 = $donutJson3")
}
