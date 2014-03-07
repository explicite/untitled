name := "untitled"

version := "0.1"

scalaVersion := "2.10.2"

resolvers += "Sonatype Releases" at "http://oss.sonatype.org/content/repositories/releases"

libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.11.0" % "test"

libraryDependencies += "org.scalatest" % "scalatest_2.10" % "2.0" % "test"

libraryDependencies += "com.github.wookietreiber" %% "scala-chart" % "latest.integration"