package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

	public WebDriver driver;
	//By signin=By.cssSelector("a[href*='sign in']");
	//By signin=By.xpath("//div[@class='tools']//li[4]//a[1]");

	@FindBy(xpath="//div[@class='tools']//li[4]//a[1]")
	WebElement login;
	
	@FindBy(xpath="//div[@class='text-center']//h2")
	WebElement title;
	
	@FindBy(xpath="//a[contains(text(),'Contact')]")
	WebElement contact;
	
	public LandingPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getLogin() 
	{
		//return driver.findElement(signin);
		return login;
	
	}
	public WebElement getTitle()
	{
		return title;
	}
	
	public WebElement contact()
	{
		return contact;
	}

}