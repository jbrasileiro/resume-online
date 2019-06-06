package ti.resumeonline.cucumber.download.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ResumeDonwnload {
	
	@Given("^an employee \"([^\"]+)\"\\.$")
	public void withEmployee(String employee) {
		System.out.println(employee);
	}
	
	@And("^the type format to download \"([^\"]+)\"\\.$")
	public void withType(String type) {
		System.out.println(type);
	}
	
	@When("^sending request to the web service service.$")
	public void send() {
		System.out.println("sending");
	}
	
	@Then("^should return a response.$")
	public void response() {
		System.out.println("response");
	}
}
