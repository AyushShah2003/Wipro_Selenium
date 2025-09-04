package StepDefinitions2;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import Pages.LoginPage;
import Utils.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class login {
	WebDriver driver = DriverFactory.getDriver();
    LoginPage lp = new LoginPage(driver);
  
	@Given("user is on the login page")
	public void user_is_on_the_login_page() throws InterruptedException {
		
			// launch the application on the chrome browser
					Thread.sleep(10000);
	 
					driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 
					Thread.sleep(2000);
	 
	}
	@When("user enters credentials")
	public void user_enters_credentials(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> users = dataTable.asMaps(String.class, String.class);
   	 
		for (Map<String, String> user : users) {

 
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
 
			Thread.sleep(10000);
 
			String username = user.get("username");
			String password = user.get("password");
 
			WebElement username1 = driver.findElement(By.name("username"));
 
			Thread.sleep(4000);
 
			username1.sendKeys(username);
 
			Thread.sleep(2000);
 
			WebElement password1 = driver.findElement(By.name("password"));
 
			password1.sendKeys(password);
 
			Thread.sleep(2000);
    }
    
	
	}
	@When("user clicks on the login button")
	public void user_clicks_on_the_login_button() throws InterruptedException {
		        WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		        button.click();
		        Thread.sleep(2000);
	    	}
	@Then("user is naqvigated to home page")
	public void user_is_naqvigated_to_home_page() {
        WebElement admin = driver.findElement(By.xpath("//li[1]//a[1]//span[1]"));

        if (admin.isDisplayed()) {
            System.out.println("User is on the home page");
        } else {
            System.out.println("User is not on the home page");
        }
	}

}
