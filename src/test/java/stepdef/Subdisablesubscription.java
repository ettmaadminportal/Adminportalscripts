package stepdef;

import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import dataprovider.Createsub;
import dataprovider.Editsub;
import io.cucumber.java.en.Then;

public class Subdisablesubscription {
	
	public static Createsub createsub;	
	public static Editsub editsub;
	public static WebDriver driver;	
	public static Robot r;
		
		public  Subdisablesubscription() throws InterruptedException {
			driver = Hooks.driver;
			Thread.sleep(2000);
		}
		
		@Then("Verify disable button check box is selected and comments added")
		public void verify_disable_button_check_box_is_selected_and_comments_added() throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);			
			driver.findElement(By.xpath("//label[@class='mat-checkbox-layout']")).click();
			Thread.sleep(2000);
	/*		JavascriptExecutor js = (JavascriptExecutor)driver;
			WebElement e = driver.findElement(By.xpath("//div[@class='mat-form-field-flex ng-tns-c91-73']"));
			js.executeScript("arguments[0].setAttribute('value','test')", e);	*/
			driver.findElement(By.id("mat-input-21")).sendKeys("test");
			String text = driver.findElement(By.xpath("//div[@class='status-test']")).getText();
			String r = "Subscription is disabled";
			if (text.equals(r)) {
				System.out.println("Subscription is disabled");
			}
			else {
				System.out.println("Subscription is not disabled");
			}
			driver.findElement(By.xpath("//button[@class='mat-focus-indicator m-auto mat-raised-button mat-button-base mat-primary']")).click();
			Thread.sleep(2000);
		}

}
