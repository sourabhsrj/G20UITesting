package OrchidCollegeWebSite;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test
public class Sample {


//	WebDriver driver=new ChromeDriver();


	WebDriver driver;
	WebDriverWait wait;

	// This method is to navigate flipkart URL
	@BeforeClass
	public void init() {

		System.setProperty("webdriver.chrome.driver","src\\drivers\\chromedriver.exe");

		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.navigate().to("https://www.orchidengg.ac.in");

//        wait=new WebDriverWait(driver, 30);
	}
	
	
	
	
	@Test
	public void searchButton() {	
	
		driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@class=\"search-field\"]")).sendKeys("Computer");
	

	 driver.findElement(By.className("search-submit")).click(); 
	
	}
	@Test
	public void entcDepartment() throws InterruptedException {	



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
                
//                driver.get("https://www.orchidengg.ac.in/electronics-telecommunication-engineering/#profile");
//                WebElement hod = driver.findElement(By.xpath("//*[@id=\"profile\"]/div[2]/div/div/div/table/tbody/tr[3]/td[2]"));
//
//                assertEquals(hod.getText(),"Prof. S. S. Dhotre");
                
//                WebDriverWait wait ;
                
//               driver.get( driver.getCurrentUrl());


//        		wait=new WebDriverWait(driver, Duration.ofMillis(30000));
//                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\\\"post-7917\\\"]/div/div[1]/div/div/div/div[2]/div/div[1]/ul/li[2]/a/span")));
//                
//                driver.wait(1000000);
              //*[@id="post-7917"]/div/div[1]/div/div/div/div[2]/div/div[1]/ul/li[2]/a/span
               

                actions.click().build().perform();  
//                Actions actions2 = new Actions(driver);
//                WebElement Staff = driver.findElement(By.xpath("//*[@id=\"post-7917\"]/div/div[1]/div/div/div/div[2]/div/div[1]/ul/li[2]/a/span"));
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
//
//                actions.click().build().perform();       
//                
//                WebElement staffName=driver.findElement(By.xpath("//*[@id=\"faculty-and-staff\"]/div[2]/div/div/div/table/tbody/tr[2]/td[2]/a"));
//                System.out.println(staffName.getText());
//                assertEquals(staffName.getText(), "Mr.  Dhotre  S. S.");
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
	
	
	@Test
	public void entcDepartmentStaff1() throws InterruptedException {	


 
                Actions actions = new Actions(driver);
                WebElement Staff = driver.findElement(By.xpath("//*[@id=\"post-7917\"]/div/div[1]/div/div/div/div[2]/div/div[1]/ul/li[2]/a/span"));
//                WebElement Staff = driver.findElement(By.className("vc_tta-title-text"));
                
//                new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(Staff));               
                //

//                                //To mouseover on sub menu
                actions.moveToElement(Staff);

                actions.moveToElement(Staff).click();  
                

                actions.click().build().perform();       
                
                WebElement staffName=driver.findElement(By.xpath("//*[@id=\"faculty-and-staff\"]/div[2]/div/div/div/table/tbody/tr[2]/td[2]/a"));

                System.out.println("Testing Hod Name");
                System.out.println(staffName.getText());
                assertEquals(staffName.getText(), "Mr.  Dhotre  S. S.");
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
                
        actions.moveToElement(Staff).click();  
                

                actions.click().build().perform();    
                
//                WebElement staffName2=driver.findElement(By.xpath("//*[@id=\"faculty-and-staff\"]/div[2]/div/div/div/table/tbody/tr[13]/td[2]/a"));
//
//                System.out.println("Testing Mr. Bakare R. S. Name");
//                System.out.println(staffName2.getText());
//                assertEquals(staffName2.getText(), "Mr. Bakare R. S.");
                
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
