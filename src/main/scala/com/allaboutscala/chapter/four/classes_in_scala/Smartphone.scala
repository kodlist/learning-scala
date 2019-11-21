package com.allaboutscala.chapter.four.classes_in_scala

/**
  * Created by mkoduri on 11/1/2019.
  */
class Smartphone {


  // Class variables
  var number: Int = 16
  var nameofcompany: String = "Apple"

  // Class method
  def display()
  {
    println("Name of the company : " + nameofcompany);
    println("Total number of Smartphone generation: " + number);
  }

}

object MainY
{

  // Main method
  def main(args: Array[String])   {

    // Class object
    var obj = new Smartphone();
    obj.display();
  }
}
