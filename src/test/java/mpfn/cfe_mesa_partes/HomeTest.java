package mpfn.cfe_mesa_partes;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/MockApp",//path to the features
        plugin = {"pretty","html:target/cucumber-html-report","json:target/integration_cucumber.json","junit:target/cucumber.xml"},//what formatters to use
        tags = {"@home"})//what tags to incluse(@)/exclude(@~)
public class HomeTest extends AbstractTestNGCucumberTests {
}
