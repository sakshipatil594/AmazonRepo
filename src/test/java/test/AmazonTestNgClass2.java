package test;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Base.Browser;
import pom.AmazonMainWindow;
import pom.DressChildBrowserClass;
import pom.DressHarpaSelect;
import pom.DressesForWomen;

public class AmazonTestNgClass2 extends Browser {
	
	
	private WebDriver driver;
	
	private AmazonMainWindow amazonMainWindow;
	
	private DressesForWomen dressesForWomen;
	
	private DressHarpaSelect dressHarpaSelect;
	
	private DressChildBrowserClass dressChildBrowserClass;
	
	@BeforeTest
	@Parameters("browser")
	public void selectBrowser(String browserName)
	{
		if(browserName.equals("Chrome"))
		{
			driver=launchChromeBrowser();
			
		}
		
		
		if(browserName.equals("Opera"))
		{
			driver=launchOperaBrowser();
			
		}
		
		driver.manage().window().maximize();
		System.out.println("Select browser");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@BeforeClass
	public void CreateObjectOfPomClasses()
	{
		System.out.println("CreateObjectOfPomClasses");
		amazonMainWindow=new AmazonMainWindow(driver);
		
		dressesForWomen=new DressesForWomen(driver);
		
		dressHarpaSelect=new DressHarpaSelect(driver);
		
		dressChildBrowserClass=new DressChildBrowserClass(driver);
		
	}
	
	@BeforeMethod
	public void enterUrl()
	{
		System.out.println("enterUrl");
		driver.get("https://www.amazon.in/");
		
		String url1=driver.getCurrentUrl();
		System.out.println(url1);
		
		String title1=driver.getTitle();
		System.out.println(title1);
		
	
	}
	
	@Test
	public void test1275376() throws InterruptedException
	{
		amazonMainWindow.clickselectAddress();

		amazonMainWindow.sendPincode();

		amazonMainWindow.clickApplyButton();
		
		Thread.sleep(4000);
		
		//amazonMainWindow.selectSearchInDropDown();
		
		amazonMainWindow.sendSearchText();
		amazonMainWindow.searchClick();
		
		Thread.sleep(6000);
		
		dressesForWomen.clickSelectBrand();
		
		dressesForWomen.clickDressType();
		
		Thread.sleep(9000);
		
		dressHarpaSelect.clickselectDress();
		
		ArrayList<String> dressChildBrowserPage=new ArrayList<String>(driver.getWindowHandles());
		
		System.out.println(dressChildBrowserPage.get(1));
		
		driver.switchTo().window(dressChildBrowserPage.get(1));
		
		dressChildBrowserClass.clickSelectSizeSmall();
		
		Thread.sleep(5000);
		
		dressChildBrowserClass.clickAddToCart();
		Thread.sleep(5000);

		dressChildBrowserClass.clickCheckCart();
	}
	
	
	
	@AfterMethod
	public void navigateToUrl() throws InterruptedException
	{
		System.out.println("navigateToUrl");
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(4000);
	}
	
	@AfterClass
	public void clearPomObject()
	{
		System.out.println("clear pom object");
		
		amazonMainWindow=null;
		
		dressesForWomen=null;
		
		dressHarpaSelect=null;
		
		dressChildBrowserClass=null;
		
	}
	
	@AfterTest
	public void browserClose()
	{
		System.out.println("Close browser");
		driver.quit();
		
		driver=null;
		
		System.gc();
	}

}
