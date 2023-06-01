ThisBuild / scalaVersion := "3.3.0"

lazy val root = project.in(file(".")).
  aggregate(ss.js, ss.jvm).
  settings(
    publish := {},
    publishLocal := {},
  )

lazy val ss = crossProject(JSPlatform, JVMPlatform).in(file(".")).
  settings(
    name := "signage-scala",
    version := "0.1-SNAPSHOT",
  ).
  jvmSettings(
    // Add JVM-specific settings here
  ).
  jsSettings(
    // Add JS-specific settings here
    scalaJSUseMainModuleInitializer := true,
    libraryDependencies ++= Seq(
        "org.scala-js" %%% "scalajs-dom" % "2.2.0", 
    )
  )