
scalaVersion := "2.12.15"

name := "hello-world"
// organization := "ch.epfl.scala"
version := "1.0"

unmanagedBase := baseDirectory.value / "lib"

val sparkVersion = "3.1.1"
val hadoopVersion = "3.2.2"

Global / onChangedBuildSource := ReloadOnSourceChanges

lazy val root = (project in file(".")).settings(
  name := "spark-common-libs",
  organization := "org.lmarcondes",
  version := "1.0",
  libraryDependencies ++= Seq(
    "org.scala-lang.modules" %% "scala-parser-combinators" % "2.0.0",
    "org.apache.spark" %% "spark-core" % sparkVersion,
    "org.apache.spark" %% "spark-sql" % sparkVersion,
    "org.apache.hadoop" % "hadoop-aws" % hadoopVersion,
    "org.apache.hadoop" % "hadoop-cloud-storage" % hadoopVersion,
    "com.amazonaws" % "aws-java-sdk" % "1.11.375",
    "org.scalatest" %% "scalatest" % "3.2.10" % Test
  )
)
