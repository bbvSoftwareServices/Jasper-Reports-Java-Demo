package eu.bbv.jrdatasource;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;

public class CustomDataSource implements JRDataSource {

    /*
    Testdaten für den Demo Report
     */
    private static final String[] names = {"Frank","Josef","Marco","Karl","Lenny","Homer","Teodor","Leopold"};
    private static final Integer[] ages = { 1,2,3,4,5,6,7,8};
    private int pos = -1;

    @Override
    public boolean next() throws JRException {
        if(pos<names.length-1){
            pos++;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Object getFieldValue(JRField jrField) throws JRException {
        if(jrField.getName().equals("Name")) return names[pos];
        else if(jrField.getName().equals("Age")) return ages[pos];
        else return "";
    }

    /*
     * Diese Methode dient dazu die DataSource im Report Designer zu initialisieren.
     * Man bindet das ganze als Data Adapter in JasperSoft Studio ein.
     * Hier wählt man Custom JRDatasource. Damit das ganze funktioniert muss man das Jar Fiel dieses Projekts
     * zum ClassPath hinzufügen. JaspersoftStudio sollte diese Option im laufe des Setup Prozesses anbieten.
     * Dort giebt man den vollen Pfad dieser Klasse an und den Namen dieser Methode, ohne die Klammern.
     */
    public static JRDataSource getDataSource(){
        return new CustomDataSource();
    }
}
