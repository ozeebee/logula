organization := "com.codahale"

name := "logula"

version := "2.1.4"

scalaVersion := "2.10.3"

resolvers += "Codahale repo" at "http://repo.codahale.com"

libraryDependencies ++= Seq(
	"log4j" % "log4j" % "1.2.17",
	// testing
	"com.simple" % "simplespec_2.10.2" % "0.8.4"
)

scalacOptions ++= Seq("-deprecation", "-unchecked")
