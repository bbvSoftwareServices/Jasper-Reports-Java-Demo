package eu.bbv;

import eu.bbv.jrdatasource.CustomDataSource;
import net.sf.jasperreports.engine.*;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws JRException {
        //Kompilieren des Reports
        JasperReport report = JasperCompileManager.compileReport("src/main/resources/testReport_A4.jrxml");
        //Festlegen von Parametern die dem Report übergeben werden sollen
        Map<String,Object> parameters = new HashMap<String,Object>();
        //Befüllen des Reports mit Daten
        JasperPrint print = JasperFillManager.fillReport(report, parameters, new CustomDataSource());
        //Ausgeben des Reports in eine PDF Dateo
        JasperExportManager.exportReportToPdfFile(print, "src/main/resources/test.pdf");
    }
}
