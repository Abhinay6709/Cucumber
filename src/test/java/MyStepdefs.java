import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class MyStepdefs {
    @When("user enters username and password")
    public void userEntersUsernameAndPassword() {
        System.out.println("Enter username and password");

    }

    @Given("user is on Login page")
    public void userIsOnLoginPage() {
        System.out.println("user is on login page");

    }

    @And("clicks on login button")
    public void clicksOnLoginButton() {
        System.out.println("Clicks on login page");
    }

    @Then("User is navigated to Login page")
    public void userIsNavigatedToLoginPage() {
        System.out.println("User navigated to login page");

    }


}
