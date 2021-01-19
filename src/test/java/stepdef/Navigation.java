package stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Navigation {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sprit\\eclipse-workspace\\adp\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.manage().window().maximize(); 
		driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().back();
		driver.navigate().refresh();  
		
		  
	}

}
