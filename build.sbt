name := "ChallengeStadium"
 
version := "0.1"
 
scalaVersion := "2.10.1"
 
seq(webSettings :_*)

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"
 
libraryDependencies += "org.scalatest" % "scalatest_2.10" % "1.9.1" % "test"
 
libraryDependencies += "com.typesafe" %% "scalalogging-slf4j" % "1.0.1"
 
libraryDependencies += "org.slf4j" % "slf4j-api" % "1.7.5"
 
libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.0.3"
 
libraryDependencies += "org.scalatra" %% "scalatra" % "2.2.1"
 
libraryDependencies += "org.scalatra" %% "scalatra-json" % "2.2.1"
 
libraryDependencies += "org.json4s"   %% "json4s-jackson" % "3.2.4"
 
libraryDependencies += "org.scalatra" %% "scalatra-scalatest" % "2.2.1" % "test"
 
libraryDependencies += "org.eclipse.jetty" % "jetty-webapp" % "8.1.10.v20130312" % "container"
 
libraryDependencies += "javax.servlet" % "javax.servlet-api" % "3.0.1"

