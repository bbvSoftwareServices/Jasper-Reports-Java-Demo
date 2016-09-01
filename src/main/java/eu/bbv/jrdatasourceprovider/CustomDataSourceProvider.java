package eu.bbv.jrdatasourceprovider;

import eu.bbv.jrdatasource.CustomDataSource;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.base.JRBaseField;
import net.sf.jasperreports.engine.base.JRBaseObjectFactory;

public class CustomDataSourceProvider implements JRDataSourceProvider{

    /*
        Hilfsklasse um die Metadaten eines Reportfeldes zu beschreiben
     */
    private class MyField extends JRBaseField{
        private MyField(String name,String description,Class<?> type) {
            this.name = name;
            this.description = description;
            this.valueClass = type;
            this.valueClassName = type.getName();
        }
    }

    //Gibt an ob metadaten zur Verfügung gestellt werden oder nicht
    @Override
    public boolean supportsGetFieldsOperation() {
        return true;
    }


    //Metadaten bezüglichd er verfügbaren Felder
    @Override
    public JRField[] getFields(JasperReport report) throws JRException, UnsupportedOperationException {
        JRField age = new MyField("Age","The age of a person",Integer.class);
        JRField name = new MyField("Name","The Name of a person",String.class);
        return new JRField[]{age,name};
    }

    //Erzeugt die tatsächliche datenquelle
    @Override
    public JRDataSource create(JasperReport report) throws JRException {
        return new CustomDataSource();
    }


    //Wird von JasperReportStudio aufgerufen wenn der report erzeugt wurde.
    //Kann verwendet werden um die Datasource zu bereinigen! Z.B. Schließen von resourcen
    @Override
    public void dispose(JRDataSource dataSource) throws JRException {

    }
}
