package dataprovider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Subsearchfilter {
	
	private static WebDriver driver;

	public Subsearchfilter(WebDriver driver) {
		Editsub.setDriver(driver);
		PageFactory.initElements(driver, this);
	}
	
	public static void setDriver(WebDriver driver) {
		Subsearchfilter.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using ="//span[@class='mat-expansion-indicator ng-tns-c171-5 ng-trigger ng-trigger-indicatorRotate ng-star-inserted']")
	protected WebElement expand_btn;
	
	@FindBy(how = How.XPATH, using ="//mat-select[@id='mat-select-0']")
	protected WebElement ID_txt;
	
	@FindBy(how = How.XPATH, using ="//input[@id='mat-input-5']")
	protected WebElement IDsearch_txt;
	
	@FindBy(how = How.XPATH, using ="//mat-select[@id='mat-select-1']")
	protected WebElement Name_txt;
	
	@FindBy(how = How.XPATH, using ="//input[@id='mat-input-7']")
	protected WebElement namesearch_txt;
	
	@FindBy(how = How.XPATH, using ="//button[@class='mat-focus-indicator ng-tns-c229-3 mat-raised-button mat-button-base mat-primary']")
	protected WebElement search_btn;
	
	@FindBy(how = How.XPATH, using ="//button[@class='mat-focus-indicator ng-tns-c229-3 mat-raised-button mat-button-base mat-secondary']")
	protected WebElement clear_btn;

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getExpand_btn() {
		return expand_btn;
	}

	public WebElement getID_txt() {
		return ID_txt;
	}

	public WebElement getIDSearch_txt() {
		return IDsearch_txt;
	}

	public WebElement getName_txt() {
		return Name_txt;
	}

	public WebElement getNamesearch_txt() {
		return namesearch_txt;
	}

	public WebElement getSearch_btn() {
		return search_btn;
	}

	public WebElement getClear_btn() {
		return clear_btn;
	}
	

}
