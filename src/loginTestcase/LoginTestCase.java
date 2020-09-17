package loginTestcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import loginPage.LoginPageTest;



public class LoginTestCase {
@Test
public void clickloginpage() {
	WebDriver wd = new FirefoxDriver();
	wd.manage().window().maximize();
	wd.get("http://djangovinoth.pythonanywhere.com/labhome/");
	
	LoginPageTest.loginpage(wd);
	LoginPageTest.username1(wd , "user1");
	LoginPageTest.password(wd, "password");
	LoginPageTest.login(wd);
}
}
