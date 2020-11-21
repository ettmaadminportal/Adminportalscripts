package stepdef;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dataprovider.Createsub;
import dataprovider.Subsearchfilter;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Subsearchfilters {
	
	public static WebDriver driver;
	
	public  Subsearchfilters() throws InterruptedException {
		driver = Hooks.driver;
		Thread.sleep(2000);
	}	
	
/*	@Given("select subscriber tab from admin portal")
	public void select_subscriber_tab_from_admin_portal() throws InterruptedException {
		Createsub createsub = new Createsub(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
		createsub.getSub_btn().click();
		Thread.sleep(2000);
	}	*/
	
	@Given("select search filter")
	public void select_search_filter() {
		Subsearchfilter subsearchfilters = new Subsearchfilter(driver);
		subsearchfilters.getExpand_btn().click();
	}

		@When("Search by subscriber id")
	public void search_by_subscriber_id() throws AWTException, InterruptedException {
		Subsearchfilter subsearchfilters = new Subsearchfilter(driver);	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		subsearchfilters.getID_txt().click();
		subsearchfilters.getIDSearch_txt().sendKeys("374");
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.xpath("//button[@class='mat-focus-indicator ng-tns-c229-3 mat-raised-button mat-button-base mat-primary']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(search).click().perform();
		subsearchfilters.getSearch_btn().click();
		Thread.sleep(2000);
		subsearchfilters.getClear_btn().click();		
			
	}

	@When("search by subscriber name")
	public void search_by_subscriber_name() throws AWTException, InterruptedException {
		Subsearchfilter subsearchfilters = new Subsearchfilter(driver);	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
		subsearchfilters.getName_txt().click();
		subsearchfilters.getNamesearch_txt().sendKeys("morgan inc");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='mat-option-text'])[2]")).click();
		
	/*	Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);	*/
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.xpath("//button[@class='mat-focus-indicator ng-tns-c229-3 mat-raised-button mat-button-base mat-primary']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(search).click().perform();
		subsearchfilters.getSearch_btn().click();
		Thread.sleep(2000);
		subsearchfilters.getClear_btn().click();	
		
	}

	@Then("search by subscriber start date and end date")
	public void search_by_subscriber_start_date_and_end_date() throws InterruptedException {
		Subsearchfilter subsearchfilters = new Subsearchfilter(driver);	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//button[@class='mat-focus-indicator mat-icon-button mat-button-base'])[3]")).click();
		driver.findElement(By.xpath("(//div[@class='mat-calendar-body-cell-content'])[9]")).click();
		Thread.sleep(2000);
	//	driver.findElement(By.xpath("(//div[@class='mat-ripple mat-button-ripple mat-button-ripple-round'])[7]")).click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement cal2 = driver.findElement(By.xpath("(//div[@class='mat-ripple mat-button-ripple mat-button-ripple-round'])[7]"));
		js.executeScript("arguments[0].click()", cal2);
		driver.findElement(By.xpath("(//div[@class='mat-calendar-body-cell-content'])[29]")).click();
		
		Thread.sleep(2000);
		subsearchfilters.getSearch_btn().click();
		Thread.sleep(2000);
		subsearchfilters.getClear_btn().click();
		
	}

		

}
