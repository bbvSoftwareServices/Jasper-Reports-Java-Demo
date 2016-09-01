package eu.bbv.jrdatasource;

import net.sf.jasperreports.engine.*;

import java.util.Collections;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws JRException {
        JasperReport report = JasperCompileManager.compileReport("src/main/resources/testReport_A4.jrxml");
        JasperPrint print = JasperFillManager.fillReport(report, new HashMap<String,Object>(),new CustomDataSource());
        JasperExportManager.exportReportToPdfFile(print,"src/main/resources/test.pdf");
    }
}
