package helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclasslogin {
	public static WebDriver driver;
	public static void launchbrowser(String s) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jayakumar\\eclipse-workspace\\ettma\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(s);
		Thread.sleep(5000);
		boolean microsoft = driver.findElement(By.xpath("//img[@class='logo']")).isDisplayed();
		System.out.println(microsoft);
		Thread.sleep(2000);
	}
public static void click(WebElement e) {
	e.click();	

}
public static void type(WebElement e, String s ) {
	e.sendKeys(s);

}
public static void closebrowser() {
	driver.quit();

}
public static void verifytitleandurl(String s) {
	String url = driver.getCurrentUrl();
	if (url.contains(s)) {
		System.out.println("URL is correct");
	}
	else {
		System.out.println("URL is not  correct");
	}
	String title = driver.getTitle();
	if (title.contains(s)) {
		System.out.println("Title is correct");
	}
	else {
		System.out.println("Title is not  correct");
	}

}
}
