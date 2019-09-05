package com.allaboutscala.chapter.two.multi_line_text

/**
  * Created by mkoduri on 8/29/2019.
  */
object MultiLine_Text extends App{


  val donutJson4: String =
    """
      |{
      |"donut_name":"Glazed Donut",
      |"taste_level":"Very Tasty",
      |"price":2.50
      |}
    """
      .stripMargin

  println(donutJson4)



  println("\nTip: stripMargin using a different character")
  val donutJson5: String =
    """
      #{
      #"donut_name":"Glazed Donut",
      #"taste_level":"Very Tasty",
      #"price":2.50
      #}
    """
      .stripMargin('#')

  println(s"donutJson5 = $donutJson4")

}
