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

import dataprovider.Createsub;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Createsubscriber {
	
public static WebDriver driver;	
	
	public  Createsubscriber() {
		driver = Hooks.driver;
	}
	
	@Given("select subscriber and click on the create new subscriber")
	public void select_subscriber_and_click_on_the_create_new_subscriber() throws InterruptedException {
		Createsub createsub = new Createsub(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		createsub.getSub_btn().click();
		Thread.sleep(2000);
		createsub.getCreate_btn().click();
	}

	@When("Enter the subscriber details and click next")
	public void enter_the_subscriber_details_and_click_next() throws AWTException, InterruptedException {
		Createsub createsub = new Createsub(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
		createsub.getFirst_name().sendKeys("kite");
		createsub.getLast_name().sendKeys("co");
		createsub.getCompany_name().sendKeys("kite and co");
		
		Robot r = new Robot();
		createsub.getCompany_address().sendKeys("357 green park avenue");
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_TAB);		
		r.keyRelease(KeyEvent.VK_TAB);
		
		createsub.getPhone_number().sendKeys("10045557878");
		createsub.getEmail().sendKeys("kite@gmail.com");
		Thread.sleep(3000);
		createsub.getNxt_button1().click();
		
	}
	
	@When("select create subscription")
	public void select_create_subscription() throws InterruptedException {
		Createsub createsub = new Createsub(driver);
		createsub.getCreate_subscription().click();
		Thread.sleep(3000);		
		
	}

	@When("Enter snaps packages subscription and contracts")
	public void enter_snaps_packages_subscription_and_contracts() throws InterruptedException, IOException {
		Createsub createsub = new Createsub(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		createsub.getSnap_checkbox().click();
		Thread.sleep(2000);
		WebElement Savesnaps_getpack = driver.findElement(By.xpath("//*[@id=\"mat-tab-content-0-0\"]/div/div/div[2]/div/button"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", Savesnaps_getpack);
		js.executeScript("arguments[0].click()", Savesnaps_getpack);
		
	//	createsub.getSavesnaps_getpack().click();
		
		createsub.getPack_checkbox().click();
		Thread.sleep(2000);
		WebElement Save_next = driver.findElement(By.xpath("//button[@class='mat-focus-indicator action-button mat-button mat-raised-button mat-button-base mat-primary']"));
		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		js2.executeScript("arguments[0].scrollIntoView(true);", Save_next);
		js2.executeScript("arguments[0].click()", Save_next);
		Thread.sleep(2000);
		
	//	createsub.getSave_next().click();
		
		driver.findElement(By.xpath("//mat-tab-body/div[1]/div[1]/div[1]/mat-form-field[2]/div[1]/div[1]/div[2]/mat-datepicker-toggle[1]/button[1]/span[1]/*[1]")).click();
		driver.findElement(By.xpath("(//div[@class='mat-calendar-body-cell-content'])[9]")).click();
		driver.findElement(By.xpath("//mat-tab-body/div[1]/div[1]/div[1]/mat-form-field[3]/div[1]/div[1]/div[2]/mat-datepicker-toggle[1]/button[1]/span[1]/*[1]")).click();
		driver.findElement(By.xpath("(//div[@class='mat-calendar-body-cell-content'])[29]")).click();
	/*	WebElement cal1 = driver.findElement(By.xpath("//mat-tab-body/div[1]/div[1]/div[1]/mat-form-field[2]/div[1]/div[1]/div[2]/mat-datepicker-toggle[1]/button[1]/span[1]/*[1]"));
		c
		jse.executeScript("arguments[0].click();", cal1);
		WebElement date1 = driver.findElement(By.xpath("(//div[@class='mat-calendar-body-cell-content'])[9]"));
		jse.executeScript("arguments[0].click();", date1);
		WebElement cal2 = driver.findElement(By.xpath("//mat-tab-body/div[1]/div[1]/div[1]/mat-form-field[3]/div[1]/div[1]/div[2]/mat-datepicker-toggle[1]/button[1]/span[1]/*[1]"));
		jse.executeScript("arguments[0].click();", cal2);
		WebElement date2 = driver.findElement(By.xpath("//*[@id=\"mat-datepicker-14\"]/div/mat-month-view/table/tbody/tr[5]/td[6]"));
		jse.executeScript("arguments[0].click();", date2);
		Thread.sleep(2000);	*/
		
		createsub.getSavesubscription_next().click();
		
	/*	WebElement nxtbut = driver.findElement(By.xpath("(//div[@class='mat-button-focus-overlay'])[29]"));
		jse.executeScript("arguments[0].scrollIntoView(true);", nxtbut);
		jse.executeScript("arguments[0].click()", nxtbut);	
		Thread.sleep(2000);	*/
		
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
	
	@When("verify subscriber user screen launched and enter subscriber details then click the add user button")
	public void verify_subscriber_user_screen_launched_and_enter_subscriber_details_then_click_the_add_user_button() throws InterruptedException {
		Createsub createsub = new Createsub(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement userbtn = driver.findElement(By.xpath("//button[@class='mat-focus-indicator mat-button mat-raised-button mat-fab mat-button-base mat-primary']"));
		jse.executeScript("arguments[0].click()", userbtn);

		createsub.getUser_email().sendKeys("kite11@gmail.com");
		createsub.getUser_firstname().sendKeys("eight");
		createsub.getUser_lastname().sendKeys("orc");
		createsub.getUser_phone().sendKeys("8145552906");
		createsub.getUser_save().click();
		Thread.sleep(2000);
		
	}
	
	@Then("verify all updated and click on next button to finish")
	public void verify_all_updated_and_click_on_next_button_to_finish() {
		Createsub createsub = new Createsub(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		createsub.getFinalize_btn().click();
		
	/*	JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement userbtn = driver.findElement(By.xpath("//button[@class='mat-focus-indicator mat-button mat-raised-button mat-fab mat-button-base mat-primary']"));
		jse.executeScript("arguments[0].click()", userbtn);
		*/
		
	}
	
	

}
