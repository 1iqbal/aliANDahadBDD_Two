package tek.bdd.runners;

import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@testt",
        features = ("classpath:features"),
        glue="tek.bdd.steps",
        dryRun = false,
        plugin = {
                "pretty",
                "html:target/htmlReports/cucumber-pretty.html",
                "json:target/jsonReports/cucumber.json"
        },
        snippets = CAMELCASE, 
        monochrome = true)
public class TestRunner {
}
