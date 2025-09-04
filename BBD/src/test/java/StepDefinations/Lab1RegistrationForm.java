package StepDefinations;
/*import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.datatable.DataTable;
import Pages.RegisterPage;

import java.util.List;
import java.util.Map;

public class Lab1RegistrationForm {
	WebDriver driver;
    RegisterPage registerPage;

    @Given("User is on the registration page")
    public void user_is_on_the_registration_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tutorialspoint.com/selenium/practice/register.php"); // replace with your URL
        registerPage = new RegisterPage(driver);
    }

    @When("User enters the registration details")
    public void user_enters_the_registration_details(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);

        String firstName = data.get(0).get("FirstName");
        String lastName  = data.get(0).get("LastName");
        String userName  = data.get(0).get("UserName");
        String password  = data.get(0).get("Password");

        // using Page Object Model to fill form
        registerPage.enterFirstName(firstName);
        registerPage.enterLastName(lastName);
        registerPage.enterUserName(userName);
        registerPage.enterPassword(password);
    }

    @When("User clicks on the Register button")
    public void user_clicks_on_the_register_button() {
        registerPage.clickRegister();
    }

    @Then("User should be registered successfully")
    public void user_should_be_registered_successfully() {
        registerPage.verifyRegistrationSuccess();
        driver.quit();
    }

}
*/