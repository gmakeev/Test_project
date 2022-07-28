package BDD.StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import parentTest.ParentTest;

public class LoginTest extends ParentTest {

    @Given("^Open the Chrome and launch the application$")
    public void open_the_chrome_and_launch_the_application() throws Throwable {
        System.out.println("This step opens the Chrome and launch the application");
    }

    @When("^Enter the Username and Password$")
    public void enter_the_Username_and_Password() throws Throwable {
        System.out.println("This step enters the Username and Password on login page");
    }

    @Then("^Click button Submit$")
    public void click_button_submit() throws Throwable {
        System.out.println("This step clicks button Submit");
    }


}
