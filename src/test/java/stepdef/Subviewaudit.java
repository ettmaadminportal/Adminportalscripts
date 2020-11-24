package stepdef;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import dataprovider.Createsub;
import dataprovider.Editsub;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Subviewaudit {
	
	public static Createsub createsub;	
	public static WebDriver driver;	
	public static Robot r;
		
		public  Subviewaudit() throws InterruptedException {
			driver = Hooks.driver;
			Thread.sleep(2000);
		}	
	
	
	@When("Filter the subscriber and select view audit from actions")
	public void filter_the_subscriber_and_select_view_audit_from_actions() throws InterruptedException, AWTException {
		Editsub editsub = new Editsub(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		editsub.getFilter_box().sendKeys("morgan");
		Thread.sleep(1000);
		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		editsub.getAction_btn().click();
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
	}

	@Then("Verify the audit log from audit trail")
	public void verify_the_audit_log_from_audit_trail() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		boolean display = driver.findElement(By.xpath("//h2[@class='main-block-title']")).isDisplayed();
		System.out.println(display);
		boolean value = url.contains("AuditTrail");
		if (value = true) {
			System.out.println("User is on Audit trail page");
		}
		else {
			System.out.println("Audit trail page is not opened");
		}

		
	}
	

}
