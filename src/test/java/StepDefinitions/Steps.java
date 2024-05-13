package StepDefinitions;

import io.cucumber.java.en.*;


public class Steps extends Base
{
    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
    }
    @And("^User enter username (.*)$")
    public void user_enter_username(String username) {
         loginPage.enter_username(username);
    }
    @And("^User enter password (.*)$")
    public void user_enter_password(String password) {
        loginPage.enter_password(password);
    }
    @When("User clicks the login button")
    public void user_clicks_the_login_button() {
        loginPage.btnlogin();
    }
    @Then("landing page is displayed")
    public void landing_page_is_displayed() {

    }

}
