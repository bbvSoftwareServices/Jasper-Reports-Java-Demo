name := "Jasper Reports Java DataSource"

version := "0.1"

//Jaspersoft Library
libraryDependencies += "net.sf.jasperreports" % "jasperreports" % "6.3.0"

//Notwendig da wir eine SVG eingebunden haben in den Report
libraryDependencies += "org.apache.xmlgraphics" % "batik-bridge" % "1.8"
libraryDependencies += "org.apache.xmlgraphics" % "xmlgraphics-commons" % "2.1"

//Wird gesetzt, da bei mir JaspersoftStudio sich mit Java6 instaliert. Nicht notwendig wenn jaspersoftStudio mit
//neuerem Java läuft.
//javacOptions ++= Seq("-target","6", "-source", "6")

//Jaspersofts Repository, damit auch die von jaspersoft benötigten Abhängiggkeiten aufgelöst werden können
resolvers += "jasperSoft Repository" at "http://jaspersoft.artifactoryonline.com/jaspersoft/third-party-ce-artifacts/"

resolvers += "JasperReports Repository" at "http://jasperreports.sourceforge.net/maven2/"

fork in run := true