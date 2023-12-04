package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\HP\\eclipse-workspace\\CucumberS2PS\\src\\test\\java\\features\\demowebshop_search.feature",
		glue = {"steps"},
				plugin= {"pretty","html:target/report2.html"}
		)
public class TestRunner_PS2_2 {

}
