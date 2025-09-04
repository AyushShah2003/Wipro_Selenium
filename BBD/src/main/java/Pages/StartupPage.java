package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * StartupPage - Base class for all Page Object classes
 * Provides common WebDriver utilities like waits, highlight, click, type, etc.
 */
public class StartupPage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    // Constructor
    public StartupPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 sec default wait
    }

    // Wait for element visibility
    protected WebElement waitForVisibility(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    // Highlight element
    protected void highlightElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.border='3px solid red'", element);
    }

    // Click on element
    protected void click(By locator) {
        WebElement element = waitForVisibility(locator);
        highlightElement(element);
        element.click();
    }

    // Type text into input fields
    protected void type(By locator, String text) {
        WebElement element = waitForVisibility(locator);
        highlightElement(element);
        element.clear();
        element.sendKeys(text);
    }

    // Get text from element
    protected String getText(By locator) {
        WebElement element = waitForVisibility(locator);
        highlightElement(element);
        return element.getText();
    }

    // Check if element is displayed
    protected boolean isDisplayed(By locator) {
        try {
            WebElement element = waitForVisibility(locator);
            return element.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}

