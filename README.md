Setup
=====

Damit dieses Projekt gebaut werden kann benötigt man lediglich eine funktionierende Internetanbindung. 

jar bauen
=========

Ein jar dieses Projekts kann man erstellen indem man
 
`gradlew assembleDist`

aufruft.

Dann wird eine Datei mit dem namen 'jasperreports' im Unterverzeichnis 'build/libs/' erstellt.
Diese Datei muss man dann in JasperSoft Studio einbinden damit man damit Rumerxperimentieren kann.
Mit

`gradlew run`

führt man das Programm aus und erstellt den Demoreport.

