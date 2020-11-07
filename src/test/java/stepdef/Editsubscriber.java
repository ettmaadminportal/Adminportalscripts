package stepdef;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dataprovider.Createsub;
import dataprovider.Editsub;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Editsubscriber {
	
public static WebDriver driver;	
	
	public  Editsubscriber() throws InterruptedException {
		driver = Hooks.driver;
		Thread.sleep(2000);
	}
	
	@Given("select subscriber tab from admin portal")
	public void select_subscriber_tab_from_admin_portal() throws InterruptedException {
		Createsub createsub = new Createsub(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
		createsub.getSub_btn().click();
		Thread.sleep(2000);
	}

	@Given("Filter the subscriber and select view\\/edit subscriber")
	public void filter_the_subscriber_and_select_view_edit_subscriber() throws InterruptedException, AWTException {
		Editsub editsub = new Editsub(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		editsub.getFilter_box().sendKeys("morgan");
		Thread.sleep(1000);
		Robot r = new Robot();
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

	@When("Do changes in subscribers details and click on next")
	public void do_changes_in_subscribers_details_and_click_on_next() throws InterruptedException {
		Createsub createsub = new Createsub(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		createsub.getFirst_name().clear();
		createsub.getFirst_name().sendKeys("Auto");
		createsub.getLast_name().clear();
		createsub.getLast_name().sendKeys("Test");
		WebElement nxt_btn1 = driver.findElement(By.xpath("(//button[@class='mat-focus-indicator mat-button mat-raised-button mat-button-base mat-primary'])[1]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", nxt_btn1);
		js.executeScript("arguments[0].click()", nxt_btn1);
		Thread.sleep(2000);
	}

	@When("User can select create subscription")
	public void user_can_select_create_subscription() throws InterruptedException {
		Createsub createsub = new Createsub(driver);
		createsub.getCreate_subscription().click();
		Thread.sleep(3000);	
		
		
	}

	@When("User Enter snaps packages subscription and contracts")
	public void user_Enter_snaps_packages_subscription_and_contracts() throws InterruptedException, IOException {
		Createsub createsub = new Createsub(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		createsub.getSnap_checkbox().click();
		Thread.sleep(2000);
		WebElement Savesnaps_getpack = driver.findElement(By.xpath("//*[@id=\"mat-tab-content-0-0\"]/div/div/div[2]/div/button"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", Savesnaps_getpack);
		js.executeScript("arguments[0].click()", Savesnaps_getpack);
		createsub.getPack_checkbox().click();
		Thread.sleep(2000);
		WebElement Save_next = driver.findElement(By.xpath("//button[@class='mat-focus-indicator action-button mat-button mat-raised-button mat-button-base mat-primary']"));
		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		js2.executeScript("arguments[0].scrollIntoView(true);", Save_next);
		js2.executeScript("arguments[0].click()", Save_next);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-tab-body/div[1]/div[1]/div[1]/mat-form-field[2]/div[1]/div[1]/div[2]/mat-datepicker-toggle[1]/button[1]/span[1]/*[1]")).click();
		driver.findElement(By.xpath("(//div[@class='mat-calendar-body-cell-content'])[9]")).click();
		driver.findElement(By.xpath("//mat-tab-body/div[1]/div[1]/div[1]/mat-form-field[3]/div[1]/div[1]/div[2]/mat-datepicker-toggle[1]/button[1]/span[1]/*[1]")).click();
		driver.findElement(By.xpath("(//div[@class='mat-calendar-body-cell-content'])[29]")).click();
		createsub.getSavesubscription_next().click();
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		WebElement Browsebtn = driver.findElement(By.xpath("//*[@id=\"mat-tab-content-0-3\"]/div/div[1]/app-dndfileupload/div/label"));
		js1.executeScript("arguments[0].click()", Browsebtn);
		
		Runtime.getRuntime().exec("F:\\Autoit\\contractupload.exe");
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement paidbtn = driver.findElement(By.xpath("//div[@class='mat-checkbox-inner-container']"));
		jse.executeScript("arguments[0].scrollIntoView(true);", paidbtn);
		jse.executeScript("arguments[0].click()", paidbtn);
		
		
		WebElement saveandclose = driver.findElement(By.xpath("//button[@class='mat-focus-indicator action-button mat-button mat-raised-button mat-button-base mat-primary']"));
		jse.executeScript("arguments[0].scrollIntoView(true);", saveandclose);	
		jse.executeScript("arguments[0].click()", saveandclose);
	
		
		WebElement nxt_btn2 = driver.findElement(By.xpath("(//button[@class='mat-focus-indicator mat-button mat-raised-button mat-button-base mat-primary'])[2]"));
		jse.executeScript("arguments[0].scrollIntoView(true);", nxt_btn2);	
		jse.executeScript("arguments[0].click()", nxt_btn2);
		
		
	}

	@When("User can verify user screen launched and enter new user details if need to user")
	public void user_can_verify_user_screen_launched_and_enter_new_user_details_if_need_to_user() throws InterruptedException {
		Createsub createsub = new Createsub(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement userbtn = driver.findElement(By.xpath("//button[@class='mat-focus-indicator mat-button mat-raised-button mat-fab mat-button-base mat-primary']"));
		jse.executeScript("arguments[0].click()", userbtn);

		createsub.getUser_email().sendKeys("morgan@gmail.com");
		createsub.getUser_firstname().sendKeys("auto");
		createsub.getUser_lastname().sendKeys("test");
		createsub.getUser_phone().sendKeys("8145552907");
		createsub.getUser_save().click();
		Thread.sleep(2000);
		
		
	}

	@Then("click finish to complete edit subscriber")
	public void click_finish_to_complete_edit_subscriber() {
		Createsub createsub = new Createsub(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		createsub.getFinalize_btn().click();		
		
	}

}
