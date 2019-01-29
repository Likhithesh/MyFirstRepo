package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {
	
	public WebDriver driver;
	 
	  @Test
	  public void openMyBlog() {
	 driver.get("https://www.google.co.in");
	 System.out.println("Edited to test ...");
	 System.out.println("  --> WebPage opened.");
	  }
	  
	  @BeforeClass
	  public void beforeClass() {
	   
//	   System.setProperty("webdriver.chrome.driver", "D:\\PandG\\BI_Automation\\OBIEE_Automation\\drivers\\chromedriver.exe");
		  System.setProperty("webdriver.chrome.driver", "./src/main/java/Drivers/chromedriver.exe");
		 	
	   driver = new ChromeDriver();
	   
	  }
	 
	  @AfterClass
	  public void afterClass() {
	   driver.quit();
	   System.out.println("  --> WebPage Closed.");
	   
	  }
	  
	  /////sadadadas

}
