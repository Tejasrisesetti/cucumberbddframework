package nopcommerece.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions ( features="src/test/resources/Feature", glue= {"nopcommerce.stepdefinition"},
plugin = { "pretty", "html:target/cucumber-reports.html","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
monochrome = true
)
public class Testrunner {

}
