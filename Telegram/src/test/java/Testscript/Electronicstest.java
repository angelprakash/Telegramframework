package Testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Electronicstest {
	@Test
//  	@Test(priorty=0)
	public void register() {
		WebDriver driver=new ChromeDriver();
		System.out.println("register");
	//	driver.get("yfhjgfg");
		driver.quit();
		
	}
	@Test(dependsOnMethods = "register")
	public void login() {
		WebDriver driver=new ChromeDriver();
		System.out.println("login");
		driver.quit();
	}
	@Test(dependsOnMethods = "login")
	
	public void addtocart () {
		WebDriver driver=new ChromeDriver();
		System.out.println("addtocart");
		driver.quit();
	}
	@Test(dependsOnMethods = "addtocart")
	public void payment() {
		WebDriver driver=new ChromeD river();
		System.out.println("payment");
		driver.quit();
	}
	@Test(dependsOnMethods = "payment")
	public void conformorder() {
		WebDriver driver=new ChromeDriver();
		System.out.println("conformorder");
		driver.quit();
	}
	
	
	
	
	write 30 test case  including function ,system  for any appliaction  conver all  the test case into testscript by using  selnium,page object module and tsetng 
	creat testng.xml file to excete all the test case in batch 
		
		
	
		
	
	
	

}
