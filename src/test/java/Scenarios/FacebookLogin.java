package Scenarios;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class FacebookLogin {

    @Given("^Navigate to \"([^\"]*)\"$")
    public void navigateTo(String arg0) throws Exception {
        System.out.println("Navigate to facebook");
    }

    @And("^Enter the username as testandroid(\\d+)@gmail.com and the password as qaqaqaqa(\\d+)$")
    public void enterTheUsernamAndThePassword(int arg0, int arg1) throws Exception {
        System.out.println("Enter valid credentials");
    }

    @And("^Click the login button$")
    public void clickTheLoginButton() throws Exception {
        System.out.println("Click on login button");
    }

    @Then("^Verify that the user is logged$")
    public void verifyThatTheUserIsLogged() throws Exception {
        System.out.println("Verify that the user is logged in");
    }
}
