package dataprovider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;



public class Editsub {
	
	private static WebDriver driver;

	public Editsub(WebDriver driver) {
		Editsub.setDriver(driver);
		PageFactory.initElements(driver, this);
	}
	
	public static void setDriver(WebDriver driver) {
		Editsub.driver = driver;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	@FindBy(how = How.XPATH, using ="//input[@id='mat-input-3']")
	protected WebElement filter_box;

	@FindBy(how = How.XPATH, using ="//button[@class='mat-focus-indicator mat-menu-trigger ng-tns-c228-3 mat-icon-button mat-button-base']")
	protected WebElement action_btn;
	
	@FindBy(how = How.XPATH, using ="(//div[@class='mat-ripple mat-menu-ripple'])[1]")
	protected WebElement viewedit_btn;

	
	public WebElement getFilter_box() {
		return filter_box;
	}

	public WebElement getAction_btn() {
		return action_btn;
	}

	public WebElement getViewedit_btn() {
		return viewedit_btn;
	}
	

	
}
