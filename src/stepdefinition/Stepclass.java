package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepclass {
	
	@Given("^I login to Orange HRMS$")
	public void i_login_to_Orange_HRMS() throws Throwable {
	    System.out.println("I login to Orange HRMS");
	}

	@When("^I verify homePage$")
	public void i_verify_homePage() throws Throwable {
	    System.out.println("homePage");
	    
	}

	@Then("^I close browser$")
	public void i_close_browser() throws Throwable {
	    System.out.println("Close");
	}


}
