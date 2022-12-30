package StepDefinitions;

import Pages.DialogContent;
import Utilities.GenWebDrv;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {

    DialogContent dc=new DialogContent();

    @Given("Navigate to campus")
    public void navigateToCampus() {
        GenWebDrv.getDriver().get("https://test.mersys.io/");
        GenWebDrv.getDriver().manage().window().maximize();
    }

    @When("Enter username and password click login button")
    public void enterUsernameAndPasswordClickLoginButton() {
        dc.findAndSend("username", "    ");                  // write username here
        dc.findAndSend("password", "     ");                 // write password here 
        dc.findAndClick("loginButton");
        dc.findAndClick("acceptCookies");
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        dc.findAndCountainsText("txtTechnoStudy","Techno Study");
    }
}
