package FirstTest;

import org.testng.annotations.Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.BrowserConfig;

public class HomePage extends BrowserConfig{

	@Test(dataProvider="getdata")
	public void basePageNavigation(String username, String password, String text) throws IOException 
	{
		driver = initializeDriver();
		driver.get(landingUrl);		
		
		LandingPage l = new LandingPage(driver);
		Assert.assertEquals(l.getLogin().getText(), "Featured Courses");
	
		
		System.out.println(l.getTitle().getText());
		l.getLogin().click();
		
		
		LoginPage lp=new LoginPage(driver);
		lp.getEmail().sendKeys(username);
		lp.getPassword().sendKeys(password);
		System.out.println(text);
		lp.clickLogin().click();
		
		driver.close();
	}
	
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data = new Object[2][3];
		data[0][0]="abc@gmail.com";
		data[0][1]="abcdef";
		data[0][2]="lmao";
		
		data[1][0]="def@gmail.com";
		data[1][1]="defabc";
		data[1][2]="oaml";
		return data;
	}
	
}
