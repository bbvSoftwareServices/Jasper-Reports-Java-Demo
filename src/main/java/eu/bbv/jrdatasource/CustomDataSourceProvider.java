package eu.bbv.jrdatasource;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.base.JRBaseField;
import net.sf.jasperreports.engine.base.JRBaseObjectFactory;

public class CustomDataSourceProvider implements JRDataSourceProvider{

    private class MyField extends JRBaseField{
        private MyField(String name,String description,Class<?> type) {
            this.name = name;
            this.description = description;
            this.valueClass = type;
            this.valueClassName = type.getName();
        }
    }
    @Override
    public boolean supportsGetFieldsOperation() {
        return true;
    }

    @Override
    public JRField[] getFields(JasperReport report) throws JRException, UnsupportedOperationException {
        JRField age = new MyField("Age","The age of a person",Integer.class);
        JRField name = new MyField("Name","The Name of a person",String.class);
        return new JRField[]{age,name};
    }

    @Override
    public JRDataSource create(JasperReport report) throws JRException {
        return new CustomDataSource();
    }

    @Override
    public void dispose(JRDataSource dataSource) throws JRException {

    }
}
