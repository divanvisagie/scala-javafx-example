addSbtPlugin("io.get-coursier" % "sbt-coursier" % "1.0.0-RC12")




lazy val root = (project in file(".")).dependsOn(assemblyPlugin)
lazy val assemblyPlugin = uri("git://github.com/divanvisagie/sbt-launch4j#v0.0.12")



