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

public class AboutUsLInks {
 

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
	public void AboutNKOCETLink() throws InterruptedException {

		WebElement mainMenu = driver.findElement(By.xpath("//*[@id=\"masthead\"]/div/div/div/nav/ul/li[1]/a"));
		// Instantiating Actions class
		Actions actions = new Actions(driver);

		// Hovering on main menu

		actions.moveToElement(mainMenu);
		actions.moveToElement(mainMenu).click();
		Thread.sleep(2000);
//              actions.

//              // Locating the element from Sub Menu
		WebElement subMenu = driver.findElement(By.xpath("//*[@id=\"masthead\"]/div/div/div/nav/ul/li[1]/ul/li[1]/a"));
//
//              //To mouseover on sub menu
		actions.moveToElement(subMenu);

		actions.moveToElement(subMenu).click();
		// build()- used to compile all the actions into a single step
		actions.click().build().perform();

		//// *[@id="wpcf7-f8057-p87-o1"]/form/p[1]/span/input


	}
	
	@Test
	public void AboutPNESLink() throws InterruptedException {

		WebElement mainMenu = driver.findElement(By.xpath("//*[@id=\"masthead\"]/div/div/div/nav/ul/li[1]/a"));
		// Instantiating Actions class
		Actions actions = new Actions(driver);

		// Hovering on main menu

		actions.moveToElement(mainMenu);
		actions.moveToElement(mainMenu).click();
//              actions.

//              // Locating the element from Sub Menu
		WebElement subMenu = driver.findElement(By.xpath("//*[@id=\"masthead\"]/div/div/div/nav/ul/li[1]/ul/li[2]/a"));
//
//              //To mouseover on sub menu
		actions.moveToElement(subMenu);

		actions.moveToElement(subMenu).click();
		// build()- used to compile all the actions into a single step
		actions.click().build().perform();

		Thread.sleep(2000);

		//// *[@id="wpcf7-f8057-p87-o1"]/form/p[1]/span/input


	}
	

	@Test
	public void VisionMissionLink() throws InterruptedException {

		WebElement mainMenu = driver.findElement(By.xpath("//*[@id=\"masthead\"]/div/div/div/nav/ul/li[1]/a"));
		// Instantiating Actions class
		Actions actions = new Actions(driver);

		// Hovering on main menu

		actions.moveToElement(mainMenu);
		actions.moveToElement(mainMenu).click();
//              actions.

//              // Locating the element from Sub Menu
		WebElement subMenu = driver.findElement(By.xpath("//*[@id=\"masthead\"]/div/div/div/nav/ul/li[1]/ul/li[3]/a"));
//
//              //To mouseover on sub menu
		actions.moveToElement(subMenu);

		actions.moveToElement(subMenu).click();
		// build()- used to compile all the actions into a single step
		actions.click().build().perform();

		//// *[@id="wpcf7-f8057-p87-o1"]/form/p[1]/span/input


		Thread.sleep(2000);
	}

	@Test
	public void CoreValuesLink() throws InterruptedException {

		WebElement mainMenu = driver.findElement(By.xpath("//*[@id=\"masthead\"]/div/div/div/nav/ul/li[1]/a"));
		// Instantiating Actions class
		Actions actions = new Actions(driver);

		// Hovering on main menu

		actions.moveToElement(mainMenu);
		actions.moveToElement(mainMenu).click();
//              actions.

//              // Locating the element from Sub Menu
		WebElement subMenu = driver.findElement(By.xpath("//*[@id=\"masthead\"]/div/div/div/nav/ul/li[1]/ul/li[4]/a"));
//
//              //To mouseover on sub menu
		actions.moveToElement(subMenu);

		actions.moveToElement(subMenu).click();
		// build()- used to compile all the actions into a single step
		actions.click().build().perform();

		//// *[@id="wpcf7-f8057-p87-o1"]/form/p[1]/span/input


		Thread.sleep(2000);
	}

	@Test
	public void PrincipalsDeskLink() throws InterruptedException {

		WebElement mainMenu = driver.findElement(By.xpath("//*[@id=\"masthead\"]/div/div/div/nav/ul/li[1]/a"));
		// Instantiating Actions class
		Actions actions = new Actions(driver);

		// Hovering on main menu

		actions.moveToElement(mainMenu);
		actions.moveToElement(mainMenu).click();
//              actions.

//              // Locating the element from Sub Menu
		WebElement subMenu = driver.findElement(By.xpath("//*[@id=\"masthead\"]/div/div/div/nav/ul/li[1]/ul/li[5]/a"));
//
//              //To mouseover on sub menu
		actions.moveToElement(subMenu);

		actions.moveToElement(subMenu).click();
		// build()- used to compile all the actions into a single step
		actions.click().build().perform();

		//// *[@id="wpcf7-f8057-p87-o1"]/form/p[1]/span/input


		Thread.sleep(2000);
	}

	@Test
	public void OrganogramLink() throws InterruptedException {

		WebElement mainMenu = driver.findElement(By.xpath("//*[@id=\"masthead\"]/div/div/div/nav/ul/li[1]/a"));
		// Instantiating Actions class
		Actions actions = new Actions(driver);

		// Hovering on main menu

		actions.moveToElement(mainMenu);
		actions.moveToElement(mainMenu).click();
//              actions.

//              // Locating the element from Sub Menu
		WebElement subMenu = driver.findElement(By.xpath("//*[@id=\"masthead\"]/div/div/div/nav/ul/li[1]/ul/li[6]/a"));
//
//              //To mouseover on sub menu
		actions.moveToElement(subMenu);

		actions.moveToElement(subMenu).click();
		// build()- used to compile all the actions into a single step
		actions.click().build().perform();

		//// *[@id="wpcf7-f8057-p87-o1"]/form/p[1]/span/input


		Thread.sleep(2000);
	}

//	@Test
//	public void Link() {
//
//		WebElement mainMenu = driver.findElement(By.xpath("//*[@id=\"masthead\"]/div/div/div/nav/ul/li[1]/a"));
//		// Instantiating Actions class
//		Actions actions = new Actions(driver);
//
//		// Hovering on main menu
//
//		actions.moveToElement(mainMenu);
//		actions.moveToElement(mainMenu).click();
////              actions.
//
////              // Locating the element from Sub Menu
//		WebElement subMenu = driver.findElement(By.xpath("//*[@id=\"masthead\"]/div/div/div/nav/ul/li[1]/ul/li[1]/a"));
////
////              //To mouseover on sub menu
//		actions.moveToElement(subMenu);
//
//		actions.moveToElement(subMenu).click();
//		// build()- used to compile all the actions into a single step
//		actions.click().build().perform();
//
//		//// *[@id="wpcf7-f8057-p87-o1"]/form/p[1]/span/input
//
//
//	}
	
  
}
