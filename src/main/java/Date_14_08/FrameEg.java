package Date_14_08;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class FrameEg {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions chromeOption = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOption);
		driver.get("https://jqueryui.com/droppable/");
		
		
		driver.manage().window().maximize();
      //identify the iframe and switch to it 
      //index or xpath can be used here 
      WebElement Frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
      driver.switchTo().frame(Frame);
      //driver.switchTo().frame(0);
      Thread.sleep(4000);
      WebElement drag = driver.findElement(By.id("draggable"));
      WebElement drop = driver.findElement(By.id("droppable"));
		
		Actions act  = new Actions(driver);
		act.dragAndDrop(drag, drop).perform();
	Thread.sleep(2000);
	}
	


}