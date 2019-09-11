name := "learning-scala"

version := "1.0"

scalaVersion := "2.12.1"


libraryDependencies ++= Seq (
  "com.typesafe.scala-logging" %% "scala-logging" % "3.9.2",
  "ch.qos.logback" % "logback-classic" % "1.2.3",
  "joda-time" % "joda-time" % "2.9.3",
  "org.joda" % "joda-convert" % "1.8"
)