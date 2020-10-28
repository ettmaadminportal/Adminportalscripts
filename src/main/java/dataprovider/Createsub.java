package dataprovider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Createsub {
	
	private static WebDriver driver;

	public Createsub(WebDriver driver) {
		Createsub.driver = driver;
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
	
	@FindBy(how = How.XPATH, using ="//button[@class='mat-focus-indicator add-new-button ng-tns-c228-3 mat-button mat-raised-button mat-fab mat-button-base mat-accent']")
	protected WebElement create_btn;
	
	@FindBy(how = How.XPATH, using ="//mat-step-header[@id='cdk-step-label-3-0']")
	protected WebElement sub_det;
	
	@FindBy(how = How.XPATH, using ="//input[@id='mat-input-10']")
	protected WebElement first_name;
	
	@FindBy(how = How.XPATH, using ="//input[@id='mat-input-11']")
	protected WebElement last_name;
	
	@FindBy(how = How.XPATH, using ="//input[@id='mat-input-12']")
	protected WebElement company_name;
	
	@FindBy(how = How.XPATH, using ="//textarea[@id='Address']")
	protected WebElement company_address;
	
	@FindBy(how = How.XPATH, using ="//input[@id='mat-input-18']")
	protected WebElement phone_number;
	
	@FindBy(how = How.XPATH, using ="//input[@id='mat-input-19']")
	protected WebElement email;
	
	@FindBy(how = How.XPATH, using ="(//span[@class='mat-button-wrapper'])[25]")
	protected WebElement nxt_button1;
	
	@FindBy(how = How.XPATH, using ="(//div[@class='tags-column-header'])[1]")
	protected WebElement snap_head;	

	@FindBy(how = How.XPATH, using ="//input[@id='mat-input-26']")
	protected WebElement snap_search;
	
	@FindBy(how = How.XPATH, using ="(//mat-pseudo-checkbox[@class='mat-pseudo-checkbox ng-star-inserted'])[1]")
	protected WebElement snap_checkbox;
	
	@FindBy(how = How.XPATH, using ="((//button[@class='mat-focus-indicator mat-button mat-raised-button mat-button-base mat-primary'])[2]")
	protected WebElement get_pack;
	
	@FindBy(how = How.XPATH, using ="(//div[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[1]")
	protected WebElement pack_checkbox;
	
	@FindBy(how = How.XPATH, using ="(//span[@class='mat-button-wrapper'])[26]")
	protected WebElement nxt_button2;
	
	@FindBy(how = How.XPATH, using ="//mat-tab-body/div[1]/div[1]/div[1]/mat-form-field[2]/div[1]/div[1]/div[2]/mat-datepicker-toggle[1]/button[1]/span[1]/*[1]")
	protected WebElement sub_calendar1;
	
	@FindBy(how = How.XPATH, using ="//mat-tab-body/div[1]/div[1]/div[1]/mat-form-field[3]/div[1]/div[1]/div[2]/mat-datepicker-toggle[1]/button[1]/span[1]/*[1]")
	protected WebElement sub_calendar2;
	
	@FindBy(how = How.XPATH, using ="(//div[@class='mat-button-focus-overlay'])[29]")
	protected WebElement nxt_button3 ;
	
	@FindBy(how = How.XPATH, using ="(//div[@class='mat-button-focus-overlay'])[30]")
	protected WebElement createnew_user ;
	
	@FindBy(how = How.XPATH, using ="//*[@id=\"mat-input-27\"]")
	protected WebElement user_email ;
	
	@FindBy(how = How.XPATH, using ="//*[@id=\"mat-input-28\"]")
	protected WebElement user_firstname ;
	
	@FindBy(how = How.XPATH, using ="//*[@id=\"mat-input-29\"]")
	protected WebElement user_lastname ;
	
	@FindBy(how = How.XPATH, using ="//*[@id=\"mat-input-30\"]")
	protected WebElement user_phone ;
	
	@FindBy(how = How.XPATH, using ="//*[@id=\"mat-dialog-1\"]/app-subscriber-user-dailog/mat-dialog-content/mat-card/mat-card-content/form/mat-dialog-actions/button[1]/span")
	protected WebElement user_save ;
	
	@FindBy(how = How.XPATH, using ="//*[@id=\"cdk-step-content-0-2\"]/div/button[2]")
	protected WebElement nxt_button4;	

	@FindBy(how = How.XPATH, using ="//*[@id=\"cdk-step-content-0-3\"]/div[1]/app-dndfileupload/div/label")
	protected WebElement browse_btn ;
	
	@FindBy(how = How.XPATH, using ="//div[@class='mat-checkbox-inner-container']")
	protected WebElement paid_checkbox ;
	
	@FindBy(how = How.XPATH, using ="//*[@id=\"cdk-step-content-0-3\"]/div[2]/button[2]")
	protected WebElement finalize_btn ;

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
	
	public WebElement getSnap_head() {
		return snap_head;
	}

	public WebElement getSnap_search() {
		return snap_search;
	}

	public WebElement getSnap_checkbox() {
		return snap_checkbox;
	}

	public WebElement getGet_pack() {
		return get_pack;
	}

	public WebElement getPack_checkbox() {
		return pack_checkbox;
	}

	public WebElement getNxt_button2() {
		return nxt_button2;
	}

	public WebElement getSub_calendar1() {
		return sub_calendar1;
	}

	public WebElement getSub_calendar2() {
		return sub_calendar2;
	}

	public WebElement getNxt_button3() {
		return nxt_button3;
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
	
	public WebElement getNxt_button4() {
		return nxt_button4;
	}

	public WebElement getBrowse_btn() {
		return browse_btn;
	}

	public WebElement getPaid_checkbox() {
		return paid_checkbox;
	}

	public WebElement getFinalize_btn() {
		return finalize_btn;
	}
	
	
}
