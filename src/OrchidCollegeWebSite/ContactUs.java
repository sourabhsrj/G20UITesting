package OrchidCollegeWebSite;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

public class ContactUs {
 

	WebDriver driver;
	WebDriverWait wait;
	
  @BeforeClass
  public void beforeClass() {
	  
		System.setProperty("webdriver.chrome.driver", "src\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.navigate().to("https://www.orchidengg.ac.in");
  }

  
  
  @Test
	public void contactUsTest() {

		WebElement mainMenu = driver.findElement(By.xpath("//*[@id=\"masthead\"]/div/div/div/nav/ul/li[9]/a"));
		// Instantiating Actions class
		Actions actions = new Actions(driver);

		// Hovering on main menu

		actions.moveToElement(mainMenu);
		actions.moveToElement(mainMenu).click();
//              actions.

//              // Locating the element from Sub Menu
		WebElement subMenu = driver.findElement(By.xpath("//*[@id=\"masthead\"]/div/div/div/nav/ul/li[9]/ul/li[1]/a"));
//
//              //To mouseover on sub menu
		actions.moveToElement(subMenu);

		actions.moveToElement(subMenu).click();
		// build()- used to compile all the actions into a single step
		actions.click().build().perform();

		//// *[@id="wpcf7-f8057-p87-o1"]/form/p[1]/span/input

		driver.findElement(By.xpath("//*[@id=\"wpcf7-f8057-p87-o1\"]/form/p[1]/span/input")).sendKeys("Sourabh Jadhav");
		driver.findElement(By.xpath(" //*[@id=\"wpcf7-f8057-p87-o1\"]/form/p[2]/span/input"))
				.sendKeys("Test@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"wpcf7-f8057-p87-o1\"]/form/p[3]/span/input"))
				.sendKeys("Testing Project");
		driver.findElement(By.xpath("//*[@id=\"wpcf7-f8057-p87-o1\"]/form/p[4]/span/textarea"))
				.sendKeys("Mini project testing performed by BE Entc dept student");

	}
	
	@Test
	public void FaultyAndStaff() {

		WebElement mainMenu = driver.findElement(By.xpath("//*[@id=\"masthead\"]/div/div/div/nav/ul/li[9]/a"));
		// Instantiating Actions class
		Actions actions = new Actions(driver);

		// Hovering on main menu

		actions.moveToElement(mainMenu);
		actions.moveToElement(mainMenu).click();
//              actions.

//              // Locating the element from Sub Menu
		WebElement subMenu = driver.findElement(By.xpath("//*[@id=\"masthead\"]/div/div/div/nav/ul/li[9]/ul/li[1]/a"));
//
//              //To mouseover on sub menu
		actions.moveToElement(subMenu);

		actions.moveToElement(subMenu).click();
		// build()- used to compile all the actions into a single step
		actions.click().build().perform();

		//// *[@id="wpcf7-f8057-p87-o1"]/form/p[1]/span/input


	}
	

	@Test
	public void WebsiteFeedBack() {

		WebElement mainMenu = driver.findElement(By.xpath("//*[@id=\"masthead\"]/div/div/div/nav/ul/li[9]/a"));
		// Instantiating Actions class
		Actions actions = new Actions(driver);

		// Hovering on main menu

		actions.moveToElement(mainMenu);
		actions.moveToElement(mainMenu).click();
//              actions.

//              // Locating the element from Sub Menu
		WebElement subMenu = driver.findElement(By.xpath("//*[@id=\"masthead\"]/div/div/div/nav/ul/li[9]/ul/li[1]/a"));
//
//              //To mouseover on sub menu
		actions.moveToElement(subMenu);

		actions.moveToElement(subMenu).click();
		// build()- used to compile all the actions into a single step
		actions.click().build().perform();

		//// *[@id="wpcf7-f8057-p87-o1"]/form/p[1]/span/input


	}

  
}
