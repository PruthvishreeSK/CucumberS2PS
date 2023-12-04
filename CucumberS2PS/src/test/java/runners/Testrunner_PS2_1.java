package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\HP\\eclipse-workspace\\CucumberS2PS\\src\\test\\java\\features\\demowebshop_login.feature",
		glue = {"steps"},
		plugin= {"pretty","html:target/report1.html"}
		)
public class Testrunner_PS2_1 {

}
