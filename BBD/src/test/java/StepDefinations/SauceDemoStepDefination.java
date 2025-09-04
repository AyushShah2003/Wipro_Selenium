package StepDefinations;
import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;


public class SauceDemoStepDefination {
	WebDriver driver;

    @Given("User is on the Swag Labs login page")
    public void user_is_on_login_page() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(3000);
    }

    @When("User enters {string} and {string}")
    public void user_enters_credentials(String username, String password) throws InterruptedException {
        driver.findElement(By.id("user-name")).sendKeys(username);
        Thread.sleep(3000);
        driver.findElement(By.id("password")).sendKeys(password);
        Thread.sleep(3000);
    }

    @When("User clicks on the login button")
    public void user_clicks_login() throws InterruptedException {
    	Thread.sleep(3000);
        driver.findElement(By.id("login-button")).click();
    }

    @Then("User should be navigated to the products page")
    public void user_navigated_to_products_page() throws InterruptedException {
    	Thread.sleep(3000);
        String title = driver.findElement(By.className("title")).getText();
        Assert.assertEquals("PRODUCTS", title);
        driver.quit();
    }

    @Then("User should see an error message")
    public void user_should_see_error_message() throws InterruptedException {
    	Thread.sleep(3000);
        String errorMsg = driver.findElement(By.cssSelector("h3[data-test='error']")).getText();
        Assert.assertTrue(errorMsg.contains("Username and password do not match"));
        driver.quit();
    }

}
