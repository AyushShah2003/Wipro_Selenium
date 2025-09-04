/*package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
public class RegisterPage {
	WebDriver driver;

    // Locators
    By firstNameField = By.id("firstname");   
    By lastNameField  = By.id("lastname");    
    By userNameField  = By.id("username");    
    By passwordField  = By.id("password");    
    By registerButton = By.xpath("//input[@value='Register']");
    By successMsg     = By.id("successMessage"); 

    // Constructor
    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public void enterFirstName(String fname) {
        driver.findElement(firstNameField).sendKeys(fname);
    }

    public void enterLastName(String lname) {
        driver.findElement(lastNameField).sendKeys(lname);
    }

    public void enterUserName(String uname) {
        driver.findElement(userNameField).sendKeys(uname);
    }

    public void enterPassword(String pass) {
        driver.findElement(passwordField).sendKeys(pass);
    }

    public void clickRegister() {
        driver.findElement(registerButton).click();
    }

    public void verifyRegistrationSuccess() {
        WebElement msg = driver.findElement(successMsg);
        Assert.assertTrue(msg.isDisplayed(), "Registration was not successful!");
    }

}*/
