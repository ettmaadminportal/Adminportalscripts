package dataprovider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Createsub {
	
	private static WebDriver driver;

	public Createsub(WebDriver driver) {
		Createsub.setDriver(driver);
		PageFactory.initElements(driver, this);
	}
	
	public static WebDriver getDriver() {
		return driver;
	}

	@FindBy(how = How.XPATH, using ="(//span[@class='matIconText']) [2]")
	protected WebElement sub_btn;
	
	public WebElement getSub_btn() {
		return sub_btn;
	}
	
	@FindBy(how = How.XPATH, using ="/html/body/app-root/div/div/mat-sidenav-container/mat-sidenav-content/div/app-subscriber-page/mat-card/mat-card-content/div/button")
	protected WebElement create_btn;
	
	@FindBy(how = How.XPATH, using ="//mat-step-header[@id='cdk-step-label-3-0']")
	protected WebElement sub_det;
	
	@FindBy(how = How.XPATH, using ="//input[@id='mat-input-10']")
	protected WebElement first_name;
	
	@FindBy(how = How.XPATH, using ="//*[@id=\"mat-input-11\"]")
	protected WebElement last_name;
	
	@FindBy(how = How.XPATH, using ="//input[@id='mat-input-12']")
	protected WebElement company_name;
	
	@FindBy(how = How.XPATH, using ="//textarea[@id='Address']")
	protected WebElement company_address;
	
	@FindBy(how = How.XPATH, using ="//input[@id='mat-input-18']")
	protected WebElement phone_number;
	
	@FindBy(how = How.XPATH, using ="//input[@id='mat-input-19']")
	protected WebElement email;
	
	@FindBy(how = How.XPATH, using ="(//button[@class='mat-focus-indicator mat-button mat-raised-button mat-button-base mat-primary'])[1]")
	protected WebElement nxt_button1;
	
	
	
	@FindBy(how = How.XPATH, using ="//*[@id=\"cdk-step-label-0-1\"]")
	protected WebElement subscription_head;	
	
	@FindBy(how = How.XPATH, using ="//*[@id=\"cdk-step-content-0-1\"]/app-subscription-list/mat-card/mat-card-content/div[1]/button/span/mat-icon")
	protected WebElement create_subscription;	

	@FindBy(how = How.XPATH, using ="//input[@id='mat-input-30']")
	protected WebElement snap_search;
	
	@FindBy(how = How.XPATH, using ="(//div[@class='mat-checkbox-inner-container'])[1]")
	protected WebElement snap_checkbox;
	
	@FindBy(how = How.XPATH, using ="//*[@id=\"mat-tab-content-1-0\"]/div/div/div[2]/div/button/span")
	protected WebElement savesnaps_getpack;
	
	@FindBy(how = How.XPATH, using ="(//div[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[1]")
	protected WebElement pack_checkbox;
	
	@FindBy(how = How.XPATH, using ="//*[@id=\"mat-tab-content-2-1\"]/div/div/div[2]/div/button[2]")
	protected WebElement save_next;
	
	@FindBy(how = How.XPATH, using ="//mat-tab-body/div[1]/div[1]/div[1]/mat-form-field[2]/div[1]/div[1]/div[2]/mat-datepicker-toggle[1]/button[1]/span[1]/*[1]")
	protected WebElement sub_calendar1;
	
	@FindBy(how = How.XPATH, using ="//mat-tab-body/div[1]/div[1]/div[1]/mat-form-field[3]/div[1]/div[1]/div[2]/mat-datepicker-toggle[1]/button[1]/span[1]/*[1]")
	protected WebElement sub_calendar2;
	
	@FindBy(how = How.XPATH, using ="//button[@class='mat-focus-indicator action-button mat-button mat-raised-button mat-button-base mat-primary']")
	protected WebElement savesubscription_next ;
	
	@FindBy(how = How.XPATH, using ="//*[@id=\"cdk-step-content-0-2\"]/app-subscriber-user/mat-card/mat-card-content/div[1]/button/span/mat-icon")
	protected WebElement createnew_user ;
	
	@FindBy(how = How.XPATH, using ="//input[@id='mat-input-26']")
	protected WebElement user_email ;
	
	@FindBy(how = How.XPATH, using ="//input[@id='mat-input-27']")
	protected WebElement user_firstname ;
	
	@FindBy(how = How.XPATH, using ="//input[@id='mat-input-28']")
	protected WebElement user_lastname ;
	
	@FindBy(how = How.XPATH, using ="//input[@id='mat-input-29']")
	protected WebElement user_phone ;
	
	@FindBy(how = How.XPATH, using ="(//button[@class='mat-focus-indicator mat-button mat-raised-button mat-button-base mat-primary'])[4]")
	protected WebElement user_save ;
	
	@FindBy(how = How.XPATH, using ="(//button[@class='mat-focus-indicator mat-button mat-raised-button mat-button-base mat-primary'])[3]")
	protected WebElement finalize_btn;	

	@FindBy(how = How.XPATH, using ="//*[@id=\"mat-tab-content-1-3\"]/div/div[1]/app-dndfileupload/div/label")
	protected WebElement browse_btn ;
	
	@FindBy(how = How.XPATH, using ="//div[@class='mat-checkbox-inner-container']")
	protected WebElement paid_checkbox ;
	
	@FindBy(how = How.XPATH, using ="//button[@class='mat-focus-indicator action-button mat-button mat-raised-button mat-button-base mat-primary']")
	protected WebElement save_close ;
	
	@FindBy(how = How.XPATH, using ="(//button[@class='mat-focus-indicator mat-button mat-raised-button mat-button-base mat-primary'])[2]")
	protected WebElement nxt_btn2 ;

	public WebElement getCreate_btn() {
		return create_btn;
	}

	public WebElement getSub_det() {
		return sub_det;
	}

	public WebElement getFirst_name() {
		return first_name;
	}

	public WebElement getLast_name() {
		return last_name;
	}

	public WebElement getCompany_name() {
		return company_name;
	}

	public WebElement getCompany_address() {
		return company_address;
	}

	public WebElement getPhone_number() {
		return phone_number;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getNxt_button1() {
		return nxt_button1;
	}

	public WebElement getSubscription_head() {
		return subscription_head;
	}

	public WebElement getCreate_subscription() {
		return create_subscription;
	}

	public WebElement getSnap_search() {
		return snap_search;
	}

	public WebElement getSnap_checkbox() {
		return snap_checkbox;
	}

	public WebElement getSavesnaps_getpack() {
		return savesnaps_getpack;
	}

	public WebElement getPack_checkbox() {
		return pack_checkbox;
	}

	public WebElement getSave_next() {
		return save_next;
	}

	public WebElement getSub_calendar1() {
		return sub_calendar1;
	}

	public WebElement getSub_calendar2() {
		return sub_calendar2;
	}

	public WebElement getSavesubscription_next() {
		return savesubscription_next;
	}

	public WebElement getCreatenew_user() {
		return createnew_user;
	}

	public WebElement getUser_email() {
		return user_email;
	}

	public WebElement getUser_firstname() {
		return user_firstname;
	}

	public WebElement getUser_lastname() {
		return user_lastname;
	}

	public WebElement getUser_phone() {
		return user_phone;
	}

	public WebElement getUser_save() {
		return user_save;
	}

	public WebElement getFinalize_btn() {
		return finalize_btn;
	}

	public WebElement getBrowse_btn() {
		return browse_btn;
	}

	public WebElement getPaid_checkbox() {
		return paid_checkbox;
	}

	public WebElement getSave_close() {
		return save_close;
	}

	public WebElement getNxt_btn2() {
		return nxt_btn2;
	}

	public static void setDriver(WebDriver driver) {
		Createsub.driver = driver;
	}

	 
	
	
}
