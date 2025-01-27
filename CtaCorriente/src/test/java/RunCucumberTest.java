/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JOSE DARIO CARTAGENA
 */
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",  // Ruta donde se encuentran los archivos .feature
    glue = "com.tu.paquete.stepdefs",         // Ruta de los step definitions
    plugin = {"json:target/cucumber.json"}    // Generación del reporte JSON en target/cucumber.json
)
public class RunCucumberTest {
}
