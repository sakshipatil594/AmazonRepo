package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DressChildBrowserClass {
	
	@FindBy (xpath="//select[@name='dropdown_selected_size_name']")
	private WebElement selectSizeSmall;
	
	@FindBy (xpath="//input[@id='add-to-cart-button']")
	private WebElement addToCart;
	
	@FindBy (xpath="//span[@id='nav-cart-count']")
	private WebElement checkCart;
	
	
	private WebDriverWait wait;
	
	private WebDriver driver;
	
	
	
	

	public DressChildBrowserClass(WebDriver driver)
	{
	
		PageFactory.initElements(driver, this);
		
		wait=new WebDriverWait(driver,20);
		this.driver=driver;
		
	}
	
	public void clickSelectSizeSmall() 
	{
		wait.until(ExpectedConditions.visibilityOf(selectSizeSmall));		
		Select selectSize=new Select(selectSizeSmall);
		
		selectSize.selectByIndex(1);
			
	}
	
	public void clickAddToCart() 
	{
		wait.until(ExpectedConditions.visibilityOf(addToCart));		
		addToCart.click();
			
	}
	
	public void clickCheckCart() 
	{
		wait.until(ExpectedConditions.visibilityOf(checkCart));			
		checkCart.click();
			
	}
}
