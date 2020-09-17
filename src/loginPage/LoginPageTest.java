package loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class LoginPageTest {


public static void loginpage(WebDriver wd  ) {

WebElement log = wd.findElement(By.partialLinkText("Log"));
log.click();
}
 public static void username1(WebDriver wd, String username) {
	 WebElement user = wd.findElement(By.name("username"));
	 user.sendKeys(username);
 }
public static void password(WebDriver wd, String password) {
	WebElement pass = wd.findElement(By.name("password"));
	pass.sendKeys(password);
}
	public  static void login(WebDriver wd) {
		WebElement login= wd.findElement(By.linkText("Login"));
		login.click();
		System.out.println("completed");
	}}