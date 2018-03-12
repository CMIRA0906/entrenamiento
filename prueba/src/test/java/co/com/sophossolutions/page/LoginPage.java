package co.com.sophossolutions.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//se instancia objeto webdriver
	WebDriver driver;
	
	/**
	 * @author CRISTIAN.MIRA
	 * 
	 * Metodo constructor
	 * 
	 */
	public LoginPage(WebDriver driver){
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void todoLogin(){
		
		
	
	}

}
