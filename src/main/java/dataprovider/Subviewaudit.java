package dataprovider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Subviewaudit {
	
	private static WebDriver driver;

	public Subviewaudit(WebDriver driver) {
		Editsub.setDriver(driver);
		PageFactory.initElements(driver, this);
	}
	
	public static void setDriver(WebDriver driver) {
		Subviewaudit.driver = driver;
	}
	
	

}
