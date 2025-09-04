package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeFormPage {

    private WebDriver driver;

    public PracticeFormPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    private By nameField = By.id("name");
    private By emailField = By.id("email");
    private By genderMale = By.id("gender"); // Adjust if multiple gender inputs
    private By mobileField = By.id("mobile");
    private By dobField = By.id("dob");
    private By subjectField = By.id("subjects");
    private By hobbySports = By.xpath("//input[@id='hobbies']");
    private By hobbyReading = By.xpath("//div[7]//div[1]//div[1]//div[2]//input[1]");
    private By uploadPicture = By.id("picture");
    private By currentAddress = By.xpath("//textarea[@id='picture']");
    private By stateDropdown = By.id("state");
    private By cityDropdown = By.id("city");
    private By loginButton = By.cssSelector("input[value='Login']");

    // Actions
    public void enterName(String name) throws InterruptedException {
    	Thread.sleep(4000);
        driver.findElement(nameField).sendKeys(name);
    }

    public void enterEmail(String email) throws InterruptedException {
    	Thread.sleep(4000);
        driver.findElement(emailField).sendKeys(email);
    }

    public void selectGender() throws InterruptedException {
    	Thread.sleep(4000);
        driver.findElement(genderMale).click();
    }

    public void enterMobile(String mobile) throws InterruptedException {
    	Thread.sleep(4000);
        driver.findElement(mobileField).sendKeys(mobile);
    }

    public void enterDOB(String dob) throws InterruptedException {
    	Thread.sleep(4000);
        driver.findElement(dobField).sendKeys(dob);
    }

    public void enterSubject(String subject) throws InterruptedException {
    	Thread.sleep(4000);
        driver.findElement(subjectField).sendKeys(subject);
    }

    public void selectHobbies() throws InterruptedException {
    	Thread.sleep(4000);
        driver.findElement(hobbySports).click();
        Thread.sleep(4000);
        driver.findElement(hobbyReading).click();
    }

    public void uploadPicture(String filePath) throws InterruptedException {
    	Thread.sleep(4000);
        driver.findElement(uploadPicture).sendKeys(filePath);
    }

    public void enterCurrentAddress(String address) throws InterruptedException {
    	Thread.sleep(4000);
        driver.findElement(currentAddress).sendKeys(address);
    }

    public void selectState(String state) throws InterruptedException {
    	Thread.sleep(4000);
        driver.findElement(stateDropdown).sendKeys(state);
    }

    public void selectCity(String city) throws InterruptedException {
    	Thread.sleep(4000);
        driver.findElement(cityDropdown).sendKeys(city);
    }

    public void clickLogin() throws InterruptedException {
    	Thread.sleep(4000);
        driver.findElement(loginButton).click();
    }
}
