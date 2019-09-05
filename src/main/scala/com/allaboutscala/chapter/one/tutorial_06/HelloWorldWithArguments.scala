package com.allaboutscala.chapter.one.tutorial_06

/**
  * Created by mkoduri on 8/27/2019.
  *
  * Run configuration : we have given three arguments for program arguments. open edit configurations from 'Run' tab.
  *
  *  Since the args variable which we inherited from the App trait is an Array of type String,
  *  we can access say the first argument only using the following syntax: args(0)
  *
  *
  */
object HelloWorldWithArguments extends App {

  println("Hello World With Arguments Scala Application!!")
  println("command line arguments are: ")

  println(args.mkString(", "))

  println(args(0))
}
