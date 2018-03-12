package co.com.solution.common;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class BaseClass {
	
	//Se instancia objeto Webdriver
	public WebDriver driver;
	
	@Before
	public void setupNavegator(){
		
		ChromeDriverManager.getInstance().setup();
		driver = new ChromeDriver();
		
	}
	
	
	@After
	public void tearDown(){
		if (driver!=null) {
			
			driver.quit();
			
		}
	}
	

}
