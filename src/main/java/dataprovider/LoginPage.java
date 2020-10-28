package dataprovider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	protected static WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		LoginPage.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(how = How.XPATH, using ="//input[@type=\"email\"]")
	protected WebElement txt_email;
	
	public WebElement enter_email() {
		return txt_email;
		
	}
	
	@FindBy(how = How.XPATH, using ="//input[@type=\"submit\"]")
	protected WebElement btn_next;
	
	public WebElement click_next() {
		return btn_next;
		
	}
	
	@FindBy(id = "i0118")
	protected WebElement pass;
	
	@FindBy (how = How.XPATH, using ="//input[@id='idSIButton9']")
	protected WebElement btn_signin;	
	
	public WebElement click_signin() {
		return btn_signin;
		
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getTxt_email() {
		return txt_email;
	}

	public WebElement getBtn_next() {
		return btn_next;
	}

	public WebElement getPass() {
		return pass;
	}
	
	
}
