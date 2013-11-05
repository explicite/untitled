name := "untitled"

version := "0.1"

scalaVersion := "2.10.2"

ideaExcludeFolders += ".idea"

ideaExcludeFolders += ".idea_modules"

resolvers ++= Seq(
  "Sonatype Releases" at "http://oss.sonatype.org/content/repositories/releases"
)

libraryDependencies ++= Seq(
  "org.scalacheck" %% "scalacheck" % "1.11.0" % "test"
)

libraryDependencies += "org.scalatest" % "scalatest_2.10" % "2.0" % "test"