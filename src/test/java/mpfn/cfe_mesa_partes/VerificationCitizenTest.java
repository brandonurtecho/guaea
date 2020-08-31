package mpfn.cfe_mesa_partes;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/MockApp",
        plugin = {"pretty","html:target/cucumber-html-report","json:target/integration_cucumber.json","junit:target/cucumber.xml"},
        tags = {"@verificationCitizen"})
public class VerificationCitizenTest extends AbstractTestNGCucumberTests {
}
