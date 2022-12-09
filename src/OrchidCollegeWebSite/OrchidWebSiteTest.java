package OrchidCollegeWebSite;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

@Test
public class OrchidWebSiteTest {
	

	WebDriver driver;
	WebDriverWait wait;
 
  @BeforeClass
  public void beforeClass() {
	  
		System.setProperty("webdriver.chrome.driver","src\\drivers\\chromedriver.exe");

		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.navigate().to("https://www.orchidengg.ac.in");
		
		wait=new WebDriverWait(driver, Duration.ofMillis(3000));

  }

  
  public void test() {

  }
  
  
  
  
  
  @Test
	public void linkTestFacebookLink() {	



      WebElement mainMenu = driver.findElement(By.xpath("//*[@id=\"social-4\"]/div/div/ul/li[1]/a/i"));
              //Instantiating Actions class
              Actions actions = new Actions(driver);

              //Hovering on main menu

              actions.moveToElement(mainMenu);
//              actions.moveToElement(mainMenu).click();
//              actions.

//              // Locating the element from Sub Menu
//              WebElement subMenu = driver.findElement(By.xpath("//*[@id=\"masthead\"]/div/div/div/nav/ul/li[9]/ul/li[1]/a"));
////
////              //To mouseover on sub menu
//              actions.moveToElement(subMenu);
//
//              actions.moveToElement(subMenu).click();
              //build()- used to compile all the actions into a single step 
              actions.click().build().perform();  
              
              ////*[@id="wpcf7-f8057-p87-o1"]/form/p[1]/span/input
              
//              driver.findElement(By.xpath("//*[@id=\"wpcf7-f8057-p87-o1\"]/form/p[1]/span/input")).sendKeys("Sourabh Jadhav");
//              driver.findElement(By.xpath(" //*[@id=\"wpcf7-f8057-p87-o1\"]/form/p[2]/span/input")).sendKeys("Test@gmail.com");
//              driver.findElement(By.xpath("//*[@id=\"wpcf7-f8057-p87-o1\"]/form/p[3]/span/input")).sendKeys("Testing Project");
//              driver.findElement(By.xpath("//*[@id=\"wpcf7-f8057-p87-o1\"]/form/p[4]/span/textarea")).sendKeys("Mini project testing performed by BE Entc dept student");
//              


              
	}
	
	
	
	@Test
	public void linkTestTwitterLink() {	



      WebElement mainMenu = driver.findElement(By.xpath("//*[@id=\"social-4\"]/div/div/ul/li[2]/a/i"));
              //Instantiating Actions class
              Actions actions = new Actions(driver);

              //Hovering on main menu

              actions.moveToElement(mainMenu);
//              actions.moveToElement(mainMenu).click();
//              actions.

//              // Locating the element from Sub Menu
//              WebElement subMenu = driver.findElement(By.xpath("//*[@id=\"masthead\"]/div/div/div/nav/ul/li[9]/ul/li[1]/a"));
////
////              //To mouseover on sub menu
//              actions.moveToElement(subMenu);
//
//              actions.moveToElement(subMenu).click();
              //build()- used to compile all the actions into a single step 
              actions.click().build().perform();  
              
              ////*[@id="wpcf7-f8057-p87-o1"]/form/p[1]/span/input
              
//              driver.findElement(By.xpath("//*[@id=\"wpcf7-f8057-p87-o1\"]/form/p[1]/span/input")).sendKeys("Sourabh Jadhav");
//              driver.findElement(By.xpath(" //*[@id=\"wpcf7-f8057-p87-o1\"]/form/p[2]/span/input")).sendKeys("Test@gmail.com");
//              driver.findElement(By.xpath("//*[@id=\"wpcf7-f8057-p87-o1\"]/form/p[3]/span/input")).sendKeys("Testing Project");
//              driver.findElement(By.xpath("//*[@id=\"wpcf7-f8057-p87-o1\"]/form/p[4]/span/textarea")).sendKeys("Mini project testing performed by BE Entc dept student");
//              


              
	}
	
	@Test
	public void linkTestLinkediInLink() {	



      WebElement mainMenu = driver.findElement(By.xpath("//*[@id=\"social-4\"]/div/div/ul/li[3]/a/i"));
              //Instantiating Actions class
              Actions actions = new Actions(driver);

              //Hovering on main menu

              actions.moveToElement(mainMenu);
//              actions.moveToElement(mainMenu).click();
//              actions.

//              // Locating the element from Sub Menu
//              WebElement subMenu = driver.findElement(By.xpath("//*[@id=\"masthead\"]/div/div/div/nav/ul/li[9]/ul/li[1]/a"));
////
////              //To mouseover on sub menu
//              actions.moveToElement(subMenu);
//
//              actions.moveToElement(subMenu).click();
              //build()- used to compile all the actions into a single step 
              actions.click().build().perform();  
              
              ////*[@id="wpcf7-f8057-p87-o1"]/form/p[1]/span/input
              
//              driver.findElement(By.xpath("//*[@id=\"wpcf7-f8057-p87-o1\"]/form/p[1]/span/input")).sendKeys("Sourabh Jadhav");
//              driver.findElement(By.xpath(" //*[@id=\"wpcf7-f8057-p87-o1\"]/form/p[2]/span/input")).sendKeys("Test@gmail.com");
//              driver.findElement(By.xpath("//*[@id=\"wpcf7-f8057-p87-o1\"]/form/p[3]/span/input")).sendKeys("Testing Project");
//              driver.findElement(By.xpath("//*[@id=\"wpcf7-f8057-p87-o1\"]/form/p[4]/span/textarea")).sendKeys("Mini project testing performed by BE Entc dept student");
//              


              
	}
	
	
	
	
	@Test
	public void linkTestYoutubeLink() {	



      WebElement mainMenu = driver.findElement(By.xpath("//*[@id=\"social-4\"]/div/div/ul/li[4]/a/i"));
              //Instantiating Actions class
              Actions actions = new Actions(driver);

              //Hovering on main menu

              actions.moveToElement(mainMenu);
//              actions.moveToElement(mainMenu).click();
//              actions.

//              // Locating the element from Sub Menu
//              WebElement subMenu = driver.findElement(By.xpath("//*[@id=\"masthead\"]/div/div/div/nav/ul/li[9]/ul/li[1]/a"));
////
////              //To mouseover on sub menu
//              actions.moveToElement(subMenu);
//
//              actions.moveToElement(subMenu).click();
              //build()- used to compile all the actions into a single step 
              actions.click().build().perform();  
              
              ////*[@id="wpcf7-f8057-p87-o1"]/form/p[1]/span/input
              
//              driver.findElement(By.xpath("//*[@id=\"wpcf7-f8057-p87-o1\"]/form/p[1]/span/input")).sendKeys("Sourabh Jadhav");
//              driver.findElement(By.xpath(" //*[@id=\"wpcf7-f8057-p87-o1\"]/form/p[2]/span/input")).sendKeys("Test@gmail.com");
//              driver.findElement(By.xpath("//*[@id=\"wpcf7-f8057-p87-o1\"]/form/p[3]/span/input")).sendKeys("Testing Project");
//              driver.findElement(By.xpath("//*[@id=\"wpcf7-f8057-p87-o1\"]/form/p[4]/span/textarea")).sendKeys("Mini project testing performed by BE Entc dept student");
//              


              
	}
	
	
	

	@Test
	public void entcDepartmentStaff2() throws InterruptedException {	


 
//                Actions actions = new Actions(driver);
//                WebElement Staff = driver.findElement(By.xpath("//*[@id=\\\"post-7917\\\"]/div/div[1]/div/div/div/div[2]/div/div[1]/ul/li[2]/a/span"));
////                WebElement Staff = driver.findElement(By.className("vc_tta-title-text"));
//                
////                new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(Staff));               
//                //
//
////                                //To mouseover on sub menu
//                actions.moveToElement(Staff);
//
//                actions.moveToElement(Staff).click();  
//                
//                actions.click().build().perform();       
                
      WebElement staffName2=driver.findElement(By.xpath("//*[@id=\"faculty-and-staff\"]/div[2]/div/div/div/table/tbody/tr[13]/td[2]/a"));

      System.out.println("Testing Mr. Bakare R. S. Name");
      System.out.println(staffName2.getText());
      assertEquals(staffName2.getText(), "Mr. Bakare R. S.");
//                WebElement hod = driver.findElement(By.xpath("//*[@id=\"faculty-and-staff\"]/div[2]/div/div/div/table/tbody/tr[2]/td[2]/a"));
//                                //
////                              //To mouseover on sub menu
//                              actions.moveToElement(hod);
//
//                              actions.moveToElement(hod).click();  
//                              
                              
//                              WebElement subMenu = driver.findElement(By.xpath("//*[@id=\"masthead\"]/div/div/div/nav/ul/li[4]/ul/li[4]/a"));
//                              //
////                            //To mouseover on sub menu
//                            actions.moveToElement(subMenu);
//
//                            actions.moveToElement(subMenu).click();
                //build()- used to compile all the actions into a single step 
//                actions.click(mainMenu);
                
	}
  
  
}
