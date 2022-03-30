package automation_test;

import org.openqa.selenium.By;
//--
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
//--
import org.testng.annotations.Test;

public class testlogin {

	WebDriver driver;
	
	  @Test
	  public void f() {
		  System.setProperty("webdriver.chrome.driver", "C:/Users/iDashbaord/Downloads/chromedriver_win32/chromedriver.exe");
		  
		  driver = new ChromeDriver();
		     String url = "http://automationpractice.com/index.php";
	         driver.get(url);
	         String expectedTitle = "My Store";
	               String actualTitle = driver.getTitle();
	               Assert.assertEquals(actualTitle, expectedTitle);
	             
	               driver.manage().window().maximize();
	               driver.findElement(By.className("login")).click();
	               driver.findElement(By.id("email")).sendKeys("testlogin494@gmail.com");
	               driver.findElement(By.id("passwd")).sendKeys("login@494");
	               driver.findElement(By.id("SubmitLogin")).click();
	            
	  }
	  @BeforeClass
	  public void beforeclass() {
		  
		  System.out.println("Starting the browser session");
		  
	  }	
	  @AfterClass
	  public void afterclass() throws InterruptedException {
		  System.out.println("entering the credentials");
		  System.out.println("login into account");
		  System.out.println("Closing the browser session");
		  Thread.sleep(3000);
		  driver.close();
		        //driver.quit();
	  }

	}