package Scenarios;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import helpers.UiUtils;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static helpers.UiUtils.driver;

public class FacebookLogin {

    @Given("^Navigate to \"([^\"]*)\"$")
    public void navigateTo(String arg0) throws Throwable {
        String url = "https://www.facebook.com";

        ChromeDriverManager.getInstance().setup();

        driver = new ChromeDriver();
        driver.navigate().to(url);
        Assert.assertEquals("Verify that the desired page is opened", url + "/", driver.getCurrentUrl());
    }

    @And("^Enter the username as testandroid(\\d+)@gmail.com and the password as qaqaqaqa(\\d+)$")
    public void enterTheUsernamAndThePassword(int arg0, int arg1) throws Exception {
        WebElement email = UiUtils.getWebElementByID("email");
        WebElement password =  UiUtils.getWebElementByID("pass");

        // Validate the login fields
        Assert.assertTrue("The email field is not displayed", UiUtils.isWebElementIsDisplayed(email, 2));
        Assert.assertTrue("The passworld field is not displayed", UiUtils.isWebElementIsDisplayed(password, 2));

        // Enter the username and password
        UiUtils.typeTextAfterWait(email, 0, "testandroid683@gmail.com" );
        UiUtils.typeTextAfterWait(password, 0, "qaqaqaqa12" );
    }

    @And("^Click the login button$")
    public void clickTheLoginButton() throws Exception {
        UiUtils.clickWebElementAfterWait(UiUtils.getWebElementByID("loginbutton"), 1);
    }

    @Then("^Verify that the user is logged$")
    public void verifyThatTheUserIsLogged() throws Exception {
        WebElement profile =  UiUtils.getWebElementByClassName("_2s25");
        Assert.assertEquals("The user is logged in", UiUtils.getTextAfterWait(profile, 2), "John");
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
