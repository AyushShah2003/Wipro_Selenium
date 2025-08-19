package Lab_Session_18_08;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Lab1_Parameterization {

    WebDriver driver;

    @Parameters({ "browser", "platform" })
    @Test
    public void testParameters(String browser, String platform) throws InterruptedException {
        // Browser setup
        if (browser.equalsIgnoreCase("chrome")) {
            if (platform.equalsIgnoreCase("windows")) {
                ChromeOptions chromeOptions = new ChromeOptions();
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver(chromeOptions);
            }
        } else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", "C://msedgedriver.exe");
            driver = new EdgeDriver();
        }

        // Navigate to URL
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//div[@class='grippy-host']")).click();
        // Form filling
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ayush");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Shah");
        driver.findElement(By.xpath("//input[@id='sex-0']")).click();
        driver.findElement(By.xpath("//input[@id='exp-0']")).click();
        driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("18-08-2025");
        driver.findElement(By.xpath("//input[@id='profession-1']")).click();
        driver.findElement(By.xpath("//input[@id='tool-2']")).click();

        WebElement continents = driver.findElement(By.xpath("//select[@id='continents']"));
        continents.click();
        driver.findElement(By.xpath("//option[normalize-space()='Browser Commands']")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='photo']"))
              .sendKeys("C://Users//HP//Downloads//test-file.txt");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='submit']")).click();

        Thread.sleep(2000);
        driver.quit();
    }


}
