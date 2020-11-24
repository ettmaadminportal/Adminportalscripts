package stepdef;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import dataprovider.Createsub;
import dataprovider.Editsub;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Subenablesubscription {
	
	public static Createsub createsub;	
	public static Editsub editsub;
	public static WebDriver driver;	
	public static Robot r;
		
		public  Subenablesubscription() throws InterruptedException {
			driver = Hooks.driver;
			Thread.sleep(2000);
		}
	
		
	@Given("Select subscriber view edit and navigate to subscriptions tab")
	public void select_subscriber_view_edit_and_navigate_to_subscriptions_tab() throws InterruptedException, AWTException {
		editsub = new Editsub(driver);
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
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	//	editsub.getViewedit_btn().click();
		Thread.sleep(2000);		
		
	}

	@When("Select package and select enable\\/disable subscription option")
	public void select_package_and_select_enable_disable_subscription_option() throws InterruptedException {
		WebElement nxt_btn1 = driver.findElement(By.xpath("(//button[@class='mat-focus-indicator mat-button mat-raised-button mat-button-base mat-primary'])[1]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", nxt_btn1);
		js.executeScript("arguments[0].click()", nxt_btn1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='mat-focus-indicator mat-menu-trigger mat-icon-button mat-button-base'])[1]")).click();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
	}

	@Then("Verify disable button is unselected and then select effective date then save")
	public void verify_disable_button_is_unselected_and_then_select_effective_date_then_save() throws AWTException, InterruptedException {
		boolean value = driver.findElement(By.xpath("(//button[@class='mat-focus-indicator mat-icon-button mat-button-base'])[5]")).isEnabled();
		System.out.println(value);

		if (value == true) {
			System.out.println("Subscription is enable");
			driver.findElement(By.xpath("(//button[@class='mat-focus-indicator mat-icon-button mat-button-base'])[5]")).click();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}
		else {
			System.out.println("Subscription is disabled");
		}
		driver.findElement(By.xpath("//button[@class='mat-focus-indicator m-auto mat-raised-button mat-button-base mat-primary']")).click();
		Thread.sleep(2000);
		
		
	}

}
