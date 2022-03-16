package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonCreateAccountPage 
{	
	
	@FindBy (xpath="//input[@type='text']")
	private WebElement name;


	@FindBy (xpath="//span[@data-action='a-dropdown-button']")
	private WebElement mobExtension;


	@FindBy (xpath="//input[@type='tel']")
	private WebElement mobileNo;


	@FindBy (xpath="//input[@type='email']")
	private WebElement email;


	@FindBy (xpath="//input[@type='password']")
	private WebElement password;

	
	@FindBy (xpath="//input[@id='continue']")
	private WebElement continueButton;
	
	@FindBy (xpath="(//a[@class='a-link-emphasis'])[1]")
	private WebElement signIn;

	
	@FindBy (xpath="(//a[@class='a-link-emphasis'])[2]")
	private WebElement businessAccount;
	
	
	public AmazonCreateAccountPage(WebDriver driver)
	{
	
		PageFactory.initElements(driver, this);
	
	
	}

	
	
	

}
