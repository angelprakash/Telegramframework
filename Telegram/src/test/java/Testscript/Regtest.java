package Testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Regtest {
	
	@Test
public void regtest_001() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://google.com");
	driver.quit();
	
}
	public void regtest_002() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("https://yahoo.com");
	}

}
