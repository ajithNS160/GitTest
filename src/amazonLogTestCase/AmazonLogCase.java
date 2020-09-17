package amazonLogTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import amazonLogin.AmazonLoginTest;

public class AmazonLogCase {
@Test
public static void confirmlogin() {
	WebDriver wd = new FirefoxDriver();
	wd.manage().window().maximize();
	wd.get("https://www.amazon.in/");
	
	AmazonLoginTest.amazonlogin(wd);
	AmazonLoginTest.username(wd, "ajithkumar454win@gmail.com");
	AmazonLoginTest.continuelog(wd);
	AmazonLoginTest.password1(wd, "ajithb.e.");
	AmazonLoginTest.continuelogg(wd);
	System.out.println("aji");
}
}
