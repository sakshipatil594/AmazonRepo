package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DressesForWomen {
	
	
	@FindBy (xpath="(//span[text()='Harpa'])[8]")
	private WebElement selectBrand;
	
	
	@FindBy (xpath="//span[text()='Midi']")
	private WebElement selectDressType;
	
	private WebDriverWait wait;
	
	private WebDriver driver;
	
	
	
	private JavascriptExecutor js;

	public DressesForWomen(WebDriver driver)
	{
	
		PageFactory.initElements(driver, this);
		
		wait=new WebDriverWait(driver,20);
		this.driver=driver;
		js=(JavascriptExecutor)driver;
	}
	
	public void clickSelectBrand()
	{
		wait.until(ExpectedConditions.visibilityOf(selectBrand));		
		js.executeScript("arguments[0].scrollIntoView(true);",selectBrand);
		selectBrand.click();
			
	}
	
	public void clickDressType()
	{
		wait.until(ExpectedConditions.visibilityOf(selectDressType));		
		js.executeScript("arguments[0].scrollIntoView(true);",selectDressType);
		selectDressType.click();
			
	}

}
