package com.allaboutscala.chapter.two.immutable

/**
  * Created by mkoduri on 8/29/2019.
  */
object ImmutableVSMutable {

  def main(args: Array[String]): Unit = {

    //Immutable
    //val <Name of our variable>: <Scala type> = <Some literal>

    val donutsToBuy: Int = 5
    //donutsToBuy = 10;   //Scala compiler will not be happy



    //Mutable
    //var <Name of our variable>: <Scala type> = <Some literal>
    var favoriteDonut: String = "Glazed Donut"
    favoriteDonut = "Vanilla Donut"



    //lazy : Sometimes you may wish to delay the initialization of some variable until at the point where it is consumed by your application.
    lazy val donutService = "initialize some donut service"


    //Declare a variable with no initialization
    //var leastFavoriteDonut: String = _ ;

  }

}
