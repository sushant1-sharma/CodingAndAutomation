package org.example;
import io.cucumber.java.*;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/org/example/features/OEAPI.feature",
        glue = "org.example.stepDefinition"
)
public class BaseTest {
}
