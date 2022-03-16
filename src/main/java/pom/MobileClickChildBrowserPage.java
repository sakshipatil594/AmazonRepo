package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MobileClickChildBrowserPage {
	
	@FindBy (xpath="//i[@class='a-icon a-accordion-radio a-icon-radio-active']")
	private WebElement checkBoxWithOutExchange;
	
	
	@FindBy (xpath="//input[@id='mbb-offeringID-1']")
	private WebElement selectFirstCheckbox;
	
	@FindBy (xpath="//input[@id='add-to-cart-button']")
	private WebElement addTocart;
	
	private WebDriverWait wait;
	
	
	public MobileClickChildBrowserPage(WebDriver driver)
	{
	
		PageFactory.initElements(driver, this);
		wait=new WebDriverWait(driver,20);

	}
	
	public void clickcheckBoxWithOutExchange()
	{
		wait.until(ExpectedConditions.visibilityOf(checkBoxWithOutExchange));

		if(!(checkBoxWithOutExchange.isSelected()))
		{
			checkBoxWithOutExchange.click();
		}
		else
		{
			System.out.println("checkBoxWithOutExchange is already selected");
		}
		
	}
	public void clickselectFirstCheckbox()
	{
		if(!(selectFirstCheckbox.isSelected()))
		{
			selectFirstCheckbox.click();
		}
		else
		{
			System.out.println("selectFirstCheckbox is already selected");
		}
		
	}
	
	public void clickAddToCart()
	{
		
		addTocart.click();
		
	}


}
