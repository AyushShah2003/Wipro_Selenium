package Pages;

import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Page Object Model for Substore Page.
 */
public class substore_page extends StartupPage {
	WebDriver driver;

    // Locators
    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By signInButton = By.id("loginBtn");

    /**
     * Constructor
     * @param driver WebDriver instance
     */
    public substore_page(WebDriver driver) {
        super(driver);
    }

    /**
     * Test Case 1.1: Verify login functionality using valid credentials
     * 
     * @method loginToHealthAppByGivenValidCredetial
     * @param expectedData A map containing valid login credentials:
     *                     - "username": the username to enter
     *                     - "password": the password to enter
     * @return true if login steps executed successfully
     * @throws Exception if any step fails
     */
    public boolean loginToHealthAppByGivenValidCredetial(Map<String, String> expectedData) throws Exception {
        try {
            // Step 1: Locate username field
            WebElement usernameElement = driver.findElement(usernameField);
            highlightElement(usernameElement);
            usernameElement.clear();
            usernameElement.sendKeys(expectedData.get("username"));

            // Step 2: Locate password field
            WebElement passwordElement = driver.findElement(passwordField);
            highlightElement(passwordElement);
            passwordElement.clear();
            passwordElement.sendKeys(expectedData.get("password"));

            // Step 3: Locate & click sign-in button
            WebElement signInElement = driver.findElement(signInButton);
            highlightElement(signInElement);
            signInElement.click();

            return true; // Success
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Login failed due to element interaction issue.", e);
        }
    }
}