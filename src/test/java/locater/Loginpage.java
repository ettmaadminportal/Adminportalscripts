package locater;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage  {
	
public Loginpage(WebDriver driver) {
	//Loginpage.driver = driver; 
	PageFactory.initElements(driver, this);

}


@FindBy (id = "i0116")
protected WebElement user1;

@FindBy (id = "idSIButton9")
private WebElement next;

@FindBy (id = "i0118")
private WebElement pass;

@FindBy (id = "idSIButton9")
private WebElement signin;

@FindBy (id = "passwordError")
private WebElement error;

public WebElement getError() {
	return error;
}

public WebElement getPass() {
	return pass;
}

public WebElement getSignin() {
	return signin;
}
public WebElement getUser1() {
	return user1;
}
public WebElement getNext() {
	return next;
}
}
