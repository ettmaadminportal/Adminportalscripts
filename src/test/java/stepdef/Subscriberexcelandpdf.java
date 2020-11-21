package stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import dataprovider.Createsub;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Subscriberexcelandpdf {
	
public static WebDriver driver;	
	
	public  Subscriberexcelandpdf() throws InterruptedException {
		driver = Hooks.driver;
		Thread.sleep(2000);
	}
	
	@Given("select subscriber button from admin list")
	public void select_subscriber_button_from_admin_list() throws InterruptedException {
		Createsub createsub = new Createsub(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
		createsub.getSub_btn().click();
		Thread.sleep(2000);
	}	
	
	@When("click on excel and pdf icon to download")
	public void click_on_excel_and_pdf_icon_to_download() throws InterruptedException {
		driver.findElement(By.xpath("//button[@id='mat-button-toggle-1-button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='mat-button-toggle-2-button']")).click();
		Thread.sleep(3000);
		
	}

	@Then("select open to view the excel or pdf")
	public void select_open_to_view_the_excel_or_pdf() {
		System.out.println("Excel and PDF files download and saved in downloads");		
		
	}
	

}
