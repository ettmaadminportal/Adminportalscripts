package stepdef;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import dataprovider.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Execution  {
	
	public static WebDriver driver;
	
	
	@Given("Launch the browser")
	public void launch_the_browser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sprit\\git\\Adminportal\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://qa-adminportal.ettma.com/#/dashboard");
		Thread.sleep(5000);
	    	}

	@When("Enter credentials to login")
	public void enter_credentials_to_login(io.cucumber.datatable.DataTable dataTable) {
		List<String> List = dataTable.asList(String.class);
		LoginPage login = new LoginPage(driver);
	    login.enter_email().sendKeys(List.get(0));
	}

	@Then("Click Next button")
	public void click_Next_button() {
		LoginPage login = new LoginPage(driver);
		login.click_next().click();
	}

	@Then("Enter the password")
	public void enter_the_password(io.cucumber.datatable.DataTable dataTable) {
		List<String> List = dataTable.asList(String.class);
		LoginPage login = new LoginPage(driver);
		login.getPass().sendKeys(List.get(0));
	}

	@Then("click on the signin button")
	public void click_on_the_signin_button() throws InterruptedException {
		LoginPage login = new LoginPage(driver);
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


}