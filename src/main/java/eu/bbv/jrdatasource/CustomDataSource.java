package eu.bbv.jrdatasource;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;

public class CustomDataSource implements JRDataSource {

    private static final String[] names = {"Frank","Josef","Marco","Karl","Lenny","Homer","Teodor","Leopold"};
    private static final int[] ages = { 1,2,3,4,5,6,7,8};
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

    public static JRDataSource getDataSource(){
        return new CustomDataSource();
    }
}
