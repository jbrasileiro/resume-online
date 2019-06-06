package ti.resumeonline.cucumber.download;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = { "classpath:BDD/cucumber/features" }
		, glue = { "ti.resumeonline.cucumber.download.steps" }
	    , plugin = {
	        "pretty"
	        ,"html:target/cucumber/html"
	        ,"json:target/cucumber/json"
	    }
		, strict = true)
public class ResumeDonwnloadATest {

}
