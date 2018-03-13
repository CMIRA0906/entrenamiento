package co.com.solution.test;

import org.junit.Assert;
import org.junit.Test;

import co.com.solution.common.BaseClass;

public class LoginSucessBadTest extends BaseClass{
	
	@Test
	public void loginSucces() throws Exception{
		driver.get("http://sahitest.com/demo/training/login.htm");
		
		String titulo= driver.getTitle();
		Assert.assertEquals("Login", titulo);
		System.out.println("Titulo de la pg: "+titulo);
	
		
	}
	
	

}
