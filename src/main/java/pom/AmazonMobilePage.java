package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonMobilePage {
	
	
	
	@FindBy (xpath="//div[@id='s-refinements']//div[9]//ul//li[3]")
	private WebElement tenThousand;


	
	
	private WebDriverWait wait;
	
	private JavascriptExecutor js;
	
	public AmazonMobilePage(WebDriver driver)
	{
	
		PageFactory.initElements(driver, this);
		js=(JavascriptExecutor)driver;
		wait=new WebDriverWait(driver,20);

	}
	
	public void searchTenThousandMobile()
	{
		wait.until(ExpectedConditions.visibilityOf(tenThousand));
	
		js.executeScript("arguments[0].scrollIntoView(true);",tenThousand);
	
		tenThousand.click();
	}
	
	
	
}
