package com.baeldung.calculator;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:features/calculator.feature"}
        , plugin = {"pretty", "json:target/reports/json/calculator.json"}
        )
public class CalculatorUnitTest {
//fake name just to have my own class.  it should be call CalculatorIntegrationTest
}
