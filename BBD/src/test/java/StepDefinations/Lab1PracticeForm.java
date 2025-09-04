package StepDefinations;

import org.openqa.selenium.WebDriver;

import Pages.LoginPage;
import Pages.PracticeFormPage;
import Utils.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Lab1PracticeForm {
	WebDriver driver = DriverFactory.getDriver();
	PracticeFormPage p1 = new PracticeFormPage(driver);
	
	@Given("user is on the Practice Form")
	public void user_is_on_the_practice_form() {
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        
	   
	}

	@When("User enters {string} in the Name field")
	public void user_enters_in_the_name_field(String name) throws InterruptedException {
		Thread.sleep(2000);
		p1.enterName(name);
	    
	}

	@When("User enters {string} in the Email field")
	public void user_enters_in_the_email_field(String email) throws InterruptedException {
		Thread.sleep(2000);
		 p1.enterEmail(email);
	   
	}

	@When("User selects {string} as Gender")
	public void user_selects_as_gender(String gender) throws InterruptedException {
		Thread.sleep(2000);
		p1.selectGender(); // extend later for Female/Other
	    
	}

	@When("User enters {string} in the Mobile field")
	public void user_enters_in_the_mobile_field(String mobile) throws InterruptedException {
		Thread.sleep(2000);
		p1.enterMobile(mobile);
		
	   
	}

	@When("User enters {string} in the Date of Birth field")
	public void user_enters_in_the_date_of_birth_field(String dob) throws InterruptedException {
		Thread.sleep(2000);
		p1.enterDOB(dob);
	    
	}

	@When("User enters {string} in the Subjects field")
	public void user_enters_in_the_subjects_field(String subject) throws InterruptedException {
		Thread.sleep(2000);
		p1.enterSubject(subject);
	    
	}

	@When("User selects {string} and {string} as Hobbies")
	public void user_selects_and_as_hobbies(String hobby1, String hobby2) throws InterruptedException {
		Thread.sleep(2000);
		p1.selectHobbies(); // extend if dynamic
	   
	}

	@When("User uploads a profile picture")
	public void user_uploads_a_profile_picture() throws InterruptedException {
		Thread.sleep(2000);
		String filePath = "C:\\Users\\Dell\\OneDrive\\Pictures\\Screenshots\\Screenshot (12).png"; // replace path
        p1.uploadPicture(filePath);
	    
	}

	@When("User enters {string} in Current Address field")
	public void user_enters_in_current_address_field(String address) throws InterruptedException {
		Thread.sleep(2000);
		 p1.enterCurrentAddress(address);
	    
	}

	@When("User selects {string} in State dropdown")
	public void user_selects_in_state_dropdown(String state) throws InterruptedException {
		Thread.sleep(2000);
		p1.selectState(state);
	   
	}

	@When("User selects {string} in City dropdown")
	public void user_selects_in_city_dropdown(String city) throws InterruptedException {
		Thread.sleep(2000);
		 p1.selectCity(city);
	   
	}

	@When("User clicks on the {string} button")
	public void user_clicks_on_the_button(String button) throws InterruptedException {
		Thread.sleep(2000);
		p1.clickLogin();
	    
	}

	@Then("Registration should be successful")
	public void registration_should_be_successful() {
		System.out.println("Registration Successful!"); 
        driver.quit();
	    
	}

	
}
