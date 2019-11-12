package FirstTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;
import pageObjects.LandingPage;
import resources.BrowserConfig;


public class AssertTest extends BrowserConfig{
	
	@Test
	public void assertTest() throws IOException
	{
		driver = initializeDriver();
		driver.get(landingUrl);		
		
		LandingPage lp=new LandingPage(driver);
		Assert.assertEquals(lp.getTitle().getText(), "FEATURED COURSES");
		Assert.assertTrue(lp.contact().isDisplayed());
		driver.close();
	}
}
