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
	
	@Test
	public void entcDepartment() {	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sourabh\\git\\G20UITesting\\src\\drivers\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.orchidengg.ac.in");
//
//        WebElement hoverable = driver.findElement(By.className("tc-menu-inner"));
//       Actions a= new Actions(driver);
//       
//                a.moveToElement(hoverable).click().perform();
//	
                
             // Locating the Main Menu (Parent element)
//                WebElement mainMenu = driver.findElement(By.xpath("//input[@class=\"thim-widget-link\"]"));

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
	
	
	
	
}
