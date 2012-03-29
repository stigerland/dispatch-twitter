import sbt._
object MyApp extends Build
{
  lazy val root =
    Project("", file(".")) dependsOn(dispatchLiftJson)
  lazy val dispatchLiftJson =
    uri("git://github.com/stigerland/dispatch-lift-json#0.1.2")
}
