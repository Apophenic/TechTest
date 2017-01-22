import sbt._

object Dependencies {
  private lazy val versions = new {
    val commons = "1.10"
    val scalaTest = "3.0.1"
  }

  private lazy val orgs = new {
    val commons = "commons-codec"
    val scalaTest = "org.scalatest"
  }

  lazy val service = Seq(
    orgs.commons % "commons-codec" % versions.commons,
    orgs.scalaTest %% "scalatest" % versions.scalaTest % "test"
  )
}