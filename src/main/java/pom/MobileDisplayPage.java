package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MobileDisplayPage {
	
	@FindBy (xpath="((//div[@class='sg-col-inner'])[4]//span)[19]")
	private WebElement mobilePrice;
	
	
	private WebDriverWait wait;
	
	
	public MobileDisplayPage(WebDriver driver)
	{
	
		PageFactory.initElements(driver, this);
		wait=new WebDriverWait(driver,20);

	}
	
	public void clickMobilePrice()
	{
		wait.until(ExpectedConditions.visibilityOf(mobilePrice));
	
		mobilePrice.click();
		
	}

}
