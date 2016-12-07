package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Google {
	
	
	
	@Given("^user is on google Homepage$")
	public void user_is_on_google_Homepage() throws Throwable {
	    System.out.println("user is on homepage");
	}

	@When("^user enter a valid keyword$")
	public void user_enter_a_valid_keyword() throws Throwable {
	   System.out.println("user entered a valid keyword");
	}

	@When("^click on the search button$")
	public void click_on_the_search_button() throws Throwable {
	  System.out.println("user clicked on search button");
	}

	@Then("^search results should be displayed$")
	public void search_results_should_be_displayed() throws Throwable {
	    System.out.println("resut displayed");
	}

}
