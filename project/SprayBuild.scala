import sbt._
import Keys._

object SprayBuild extends Build {
  import Dependencies._
  import BuildSettings._

  // configure prompt to show current project
  override lazy val settings = super.settings :+ {
    shellPrompt := { s => Project.extract(s).currentProject.id + " > " }
  }

  // -------------------------------------------------------------------------------------------------------------------
  // Root Project
  // -------------------------------------------------------------------------------------------------------------------

  lazy val stopwatch = Project("stopwatch", file("."))
    .settings(basicSettings: _*)
    .settings(noPublishing: _*)
    .aggregate(core, web)


  // -------------------------------------------------------------------------------------------------------------------
  // Modules
  // -------------------------------------------------------------------------------------------------------------------

  lazy val core = Project("core", file("core"))
    .settings(moduleSettings: _*)
    .settings(
      libraryDependencies ++= Seq(
        Test.scalaTest,
        Test.scalaCheck,
        Test.junit
  )
    )

  lazy val web = Project("web", file("web"))
    .settings(moduleSettings: _*)
    .settings(
      libraryDependencies ++= Seq(
        Test.scalaTest
      )
    )
    .dependsOn(core)



}