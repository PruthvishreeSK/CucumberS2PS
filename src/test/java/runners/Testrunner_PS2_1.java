package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\java\\features\\demowebshop_login.feature",
		glue = {"steps"}
		)
public class Testrunner_PS2_1 {

}
