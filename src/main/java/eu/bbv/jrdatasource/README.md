Allgemeines
============

In diesem Ordner ebfindet sich die implementierung einer eigenen Datensource  - CustomeDataSource.java.
Prinzipiell würde allein diese Komponente reichen um eine Datenquelle zu implementieren. 
Da dies allerdings zumindest für den ReportDesigner sehr unangenehm ist empfiehlt es sich 
parallel dazu einen DatasourceProvider zu implementieren. Dieser befindet sich in dem Package jrdatasourceprovider.
Warum man einen DataSourceprovide implementieren sollte wird dort erklärt.


JRDataSource
============

JRDatasoruce muss implementiert werden wenn eine Klasse als Datenquelle für eine JasperReport herhalten soll.

Dabei sind folgende methoden zu implementieren:
 
 * next()
 * getFieldValue(JRField jrField)
 
 next()
 ------
 
 next() schaltet in der Datenquelle um einen Datensatz fort. Hat JasperReports alle Felder des Reports geprüft,
 so wird mit next() zum nächsten Datensatz gesprungen und der Report mit diesen Daten angereichert
 
 
 getFieldValue(JRField jrField)
 ------------------------------
 Mit dieser Methode wird von jasperReports auf ein einzelnes Attribut eines Datensatzes zugegriffen.
 Der parameter _jrField_ repräsentiert das Feld aus dem Report dass nun mit konkreten Daten belegt werden soll.
 Über die Methode _getName()_ kann man den Feldnamen ermitteln um dann den passenden wert zurückzuliefern. 
 
 



