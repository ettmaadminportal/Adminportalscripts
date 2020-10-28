package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dataprovider.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	


	public static WebDriver driver;
	
	
	
	@Before
	public static void beforeScenario() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sprit\\git\\Adminportal\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://qa-adminportal.ettma.com/#/dashboard");
		Thread.sleep(5000);
		
		LoginPage login = new LoginPage(driver);
		
	    login.enter_email().sendKeys("TestSuperAdmin@ettma.com");
	    
		login.click_next().click();
		
		login.getPass().sendKeys("Karmwave2020");
		
		Thread.sleep(5000);
		
		login.click_signin().click();
		Thread.sleep(2000);
		if (driver.getPageSource().contains("Stay signed in?")) {
			driver.findElement(By.id("KmsiCheckboxField")).click();
			driver.findElement(By.id("idBtn_Back")).click();
		} else {
			System.out.println("There is no stay in page");
		}
	
	}
	
	@After
	public static void afterScenario() {
		driver.close();
		
	}

}
