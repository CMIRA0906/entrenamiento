package co.com.solution.common;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class BaseClass {
	
	//Se instancia objeto Webdriver
	public WebDriver driver;
	
	 public static final String USERNAME = "cristianmira1";
	 public static final String AUTOMATE_KEY = "RbtdTvtxpLsrzM2t8vbY";
	 public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	@Before
	public void setupNavegator() throws MalformedURLException{
		
		//ChromeDriverManager.getInstance().setup();
		//driver = new ChromeDriver();
		DesiredCapabilities caps = new DesiredCapabilities();
	    caps.setCapability("browser", "Chrome");
	    caps.setCapability("browser_version", "62.0");
	    caps.setCapability("os", "Windows");
	    caps.setCapability("os_version", "10");
	    caps.setCapability("resolution", "1024x768");

	     driver = new RemoteWebDriver(new URL(URL), caps);
		
	}
	
	
	@After
	public void tearDown(){
		if (driver!=null) {
			
			driver.quit();
			
		}
	}
	

}
