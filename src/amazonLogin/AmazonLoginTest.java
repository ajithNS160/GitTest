package amazonLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class AmazonLoginTest {
public static void amazonlogin(WebDriver wd) {
	WebElement sign = wd.findElement(By.xpath("//*[@id=\'nav-link-accountList\']/div/span"));
	sign.click();
}
public static void username(WebDriver wd , String username) {
WebElement user1 = wd.findElement(By.name("email"));
	user1.sendKeys(username);
	
}
public static void continuelog(WebDriver wd) {
	WebElement con = wd.findElement(By.id("continue"));
	con.click();}

	public  static void password1(WebDriver wd , String password) {
	WebElement password1 = 	wd.findElement(By.id("ap_password"));
	password1.sendKeys(password);	
	
}
	public static void continuelogg(WebDriver wd){
		WebElement conn = wd.findElement(By.id("signInSubmit"));
		conn.click();
	}
}
