package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLoginPage 
{
	
	@FindBy (xpath="//input[@type='email']")
	private WebElement emailOrMobileNo;

	@FindBy (xpath="//input[@id='continue']")
	private WebElement continueButton;

	@FindBy (xpath="//input[@type='password']")
	private WebElement sendPassword;
	
	@FindBy (xpath="//input[@id='signInSubmit']")
	private WebElement signInButton;
	
	
	@FindBy (xpath="//a[text()='Conditions of Use']")
	private WebElement conditionsLink;


	@FindBy (xpath="//a[text()='Privacy Notice']")
	private WebElement privacyLink;


	@FindBy (xpath="//span[@class='a-expander-prompt']")
	private WebElement needHelp;

	
	@FindBy (xpath="//a[@id='createAccountSubmit']")
	private WebElement createAccount;
	
	
	public AmazonLoginPage(WebDriver driver)
	{
	
		PageFactory.initElements(driver, this);
		
	}
	
	public void sendEmailOrMobileNo()
	{
			
		emailOrMobileNo.sendKeys("ankitaghanate797@gmail.com");
	}

	public void clickContinueButton()
	{
			
		continueButton.click();
	}
	
	public void sendPassword()
	{
			
		sendPassword.sendKeys("Dazzler123@!");
	}
	
	public void clickSignInButton()
	{
			
		signInButton.click();
	}
}
