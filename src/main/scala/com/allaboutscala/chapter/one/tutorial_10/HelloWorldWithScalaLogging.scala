package com.allaboutscala.chapter.one.tutorial_10

import com.typesafe.scalalogging.LazyLogging

/**
  * Created by mkoduri on 8/27/2019.
  *
  * To add the Scala Logging library, you need to add the following library dependencies in build.sbt:
  *
  *
  * So let's use it by adding the LazyLogging trait to our HelloWorldWithScalaLogging application as follows:
  *
  * We have used the with keyword to add the LazyLogging trait. In upcoming tutorials,
  * I will cover the trait and with keyword in more details,
  *
  * but for now think of it as adding extra functionality to our HelloWorldWithScalaLogging application.
  */
object HelloWorldWithScalaLogging extends App with LazyLogging{

  logger.info("Hello world from Scala Logging")

}
