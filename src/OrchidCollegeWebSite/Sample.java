package OrchidCollegeWebSite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Sample {


//	WebDriver driver=new ChromeDriver();

	
	@Test
	public void searchButton() {	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sourabh\\git\\G20UITesting\\src\\drivers\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
	
		driver.get("https://www.orchidengg.ac.in");
		driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@class=\"search-field\"]")).sendKeys("Computer");
	

	 driver.findElement(By.className("search-submit")).click(); 
	
	}
	
	
	
	
}
