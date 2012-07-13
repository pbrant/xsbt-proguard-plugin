resolvers += Resolver.url("Typesafe Repo", url("http://repo.typesafe.com/typesafe/ivy-releases/"))(Resolver.ivyStylePatterns)

libraryDependencies <+= sbtVersion(v => v match {
  case v@("0.11.0" | "0.11.1" | "0.11.2") => "org.scala-tools.sbt" %% "scripted-plugin" % v
  case v@"0.11.3" =>  "org.scala-sbt" %% "scripted-plugin" % v
  // scala version not used in version 0.12.0 onward
  case v@_ => "org.scala-sbt" % "scripted-plugin" % v
})
