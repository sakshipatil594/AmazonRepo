package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class DressHarpaSelect {
	
	
	@FindBy (xpath="(((//div[@class='a-section a-spacing-base a-text-center'])[1]//div)[4]//span)[20]")
	private WebElement selectDress;
	
	
	
	
	private WebDriverWait wait;
	
	private WebDriver driver;
	
	
	
	

	public DressHarpaSelect(WebDriver driver)
	{
	
		PageFactory.initElements(driver, this);
		
		wait=new WebDriverWait(driver,20);
		this.driver=driver;
		
	}
	
	public void clickselectDress() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(selectDress));		
		
		Thread.sleep(2000);
		selectDress.click();
			
	}
	
	

}
