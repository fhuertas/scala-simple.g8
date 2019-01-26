import sbt._

ThisBuild / scalaVersion     := "$scalaVersion$"
ThisBuild / organization     := "$package$"
ThisBuild / organizationName := "$organization$"

  lazy val root = project
  .in(file("."))
  .settings(settings)
