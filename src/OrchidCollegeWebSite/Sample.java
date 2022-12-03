package OrchidCollegeWebSite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Sample {


//	WebDriver driver=new ChromeDriver();


	WebDriver driver;

	// This method is to navigate flipkart URL
	@BeforeClass
	public void init() {

		System.setProperty("webdriver.chrome.driver","src\\drivers\\chromedriver.exe");

		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.navigate().to("https://www.orchidengg.ac.in");
	}
	
	
	
	
	@Test
	public void searchButton() {	
	
		driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@class=\"search-field\"]")).sendKeys("Computer");
	

	 driver.findElement(By.className("search-submit")).click(); 
	
	}
	
	@Test
	public void entcDepartment() {	



        WebElement mainMenu = driver.findElement(By.xpath("//*[@id=\"masthead\"]/div/div/div/nav/ul/li[4]/a"));
                //Instantiating Actions class
                Actions actions = new Actions(driver);

                //Hovering on main menu

                actions.moveToElement(mainMenu);
                actions.moveToElement(mainMenu).click();
//                actions.

//                // Locating the element from Sub Menu
                WebElement subMenu = driver.findElement(By.xpath("//*[@id=\"masthead\"]/div/div/div/nav/ul/li[4]/ul/li[4]/a"));
//
//                //To mouseover on sub menu
                actions.moveToElement(subMenu);

                actions.moveToElement(subMenu).click();
                //build()- used to compile all the actions into a single step 
                actions.click().build().perform();  
//                actions.click(mainMenu);
                
	}
	
	

	
	
	@Test
	public void contactUs() {	



        WebElement mainMenu = driver.findElement(By.xpath("//*[@id=\"masthead\"]/div/div/div/nav/ul/li[9]/a"));
                //Instantiating Actions class
                Actions actions = new Actions(driver);

                //Hovering on main menu

                actions.moveToElement(mainMenu);
                actions.moveToElement(mainMenu).click();
//                actions.

//                // Locating the element from Sub Menu
                WebElement subMenu = driver.findElement(By.xpath("//*[@id=\"masthead\"]/div/div/div/nav/ul/li[9]/ul/li[1]/a"));
//
//                //To mouseover on sub menu
                actions.moveToElement(subMenu);

                actions.moveToElement(subMenu).click();
                //build()- used to compile all the actions into a single step 
                actions.click().build().perform();  
                
                ////*[@id="wpcf7-f8057-p87-o1"]/form/p[1]/span/input
                
                driver.findElement(By.xpath("//*[@id=\"wpcf7-f8057-p87-o1\"]/form/p[1]/span/input")).sendKeys("Sourabh Jadhav");
                driver.findElement(By.xpath(" //*[@id=\"wpcf7-f8057-p87-o1\"]/form/p[2]/span/input")).sendKeys("Test@gmail.com");
                driver.findElement(By.xpath("//*[@id=\"wpcf7-f8057-p87-o1\"]/form/p[3]/span/input")).sendKeys("Testing Project");
                driver.findElement(By.xpath("//*[@id=\"wpcf7-f8057-p87-o1\"]/form/p[4]/span/textarea")).sendKeys("Mini project testing performed by BE Entc dept student");
                


                
	}
	
}
