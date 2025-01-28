/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JOSE DARIO CARTAGENA
 */
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class CucumberReportHandler {

    private static final String REPORT_PATH = "target/cucumber-reports/CucumberTestReport.json";

    public static JsonNode readCucumberReport() throws IOException {
        File reportFile = new File(REPORT_PATH);
        if (!reportFile.exists()) {
            throw new IOException("El archivo de reporte no existe: " + REPORT_PATH);
        }

        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readTree(reportFile);
    }

    public static void printSummary(JsonNode reportJson) {
        int totalScenarios = reportJson.size();
        System.out.println("Total de escenarios ejecutados: " + totalScenarios);
    }

    public static void main(String[] args) {
        try {
            JsonNode reportJson = readCucumberReport();
            printSummary(reportJson);
        } catch (IOException e) {
            System.err.println("Error al procesar el reporte de Cucumber: " + e.getMessage());
        }
    }
}
