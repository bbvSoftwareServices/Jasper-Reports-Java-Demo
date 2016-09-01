name := "Jasper Reports Java DataSource"

version := "0.1"

scalaVersion := "2.11.8"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.0" % "test"

libraryDependencies += "net.sf.jasperreports" % "jasperreports" % "6.3.0"

libraryDependencies += "org.apache.xmlgraphics" % "batik-bridge" % "1.8"

libraryDependencies += "org.apache.xmlgraphics" % "xmlgraphics-commons" % "2.1"

scalacOptions ++= Seq("-unchecked", "-feature")

javacOptions ++= Seq("-target","6", "-source", "6")

jacoco.settings

useJGit

resolvers += "jasperSoft Repository" at "http://jaspersoft.artifactoryonline.com/jaspersoft/third-party-ce-artifacts/"

