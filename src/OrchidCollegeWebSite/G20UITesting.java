package OrchidCollegeWebSite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class G20UITesting {

	public static void main(String[] args) {
		
		// Set Executable Broswer path
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sourabh\\git\\G20UITesting\\src\\drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
 
//		driver.get("https://google.com");
//		driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).sendKeys("orchid college solapur");
		//driver.findElement(By.xpath(null))
		
		
		driver.get("https://www.orchidengg.ac.in");
		driver.findElement(By.xpath("//input[@class=\"search-field\"]")).sendKeys("Computer");
	

		WebElement search = driver.findElement(By.className("search-submit")); 
		search.click();
		
		//System.out.println(driver.getTitle());
		//driver.quit();
		
		
	}

}
