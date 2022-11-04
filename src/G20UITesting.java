import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class G20UITesting {

	public static void main(String[] args) {
		
		
		
		// Set Executable Broswer path
		System.setProperty("webdriver.chrome.driver", 
				"C:\\SeleniumJarAndDriver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();

		
		driver.get("https://stackoverflow.com/questions/63996047/eclipse-incompatible-jvm-version-1-8-0-261-of-the-jvm-is-not-suitable-for-th");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
