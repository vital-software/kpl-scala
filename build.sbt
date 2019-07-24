organization in ThisBuild := "com.streetcontxt"
scalaVersion in ThisBuild := "2.12.8"
crossScalaVersions in ThisBuild := Seq("2.11.12", "2.12.8", "2.13.0")
licenses in ThisBuild += ("Apache-2.0", url("https://www.apache.org/licenses/LICENSE-2.0.html"))
bintrayOrganization in ThisBuild := Some("streetcontxt")

name := "kpl-scala"

val slf4j = "org.slf4j" % "slf4j-api" % "1.7.25"
val amazonKinesisProducer = "com.amazonaws" % "amazon-kinesis-producer" % "0.12.11"
val typesafeConfig = "com.typesafe" % "config" % "1.3.1"

libraryDependencies ++= Seq(
  slf4j,
  amazonKinesisProducer,
  typesafeConfig
)
