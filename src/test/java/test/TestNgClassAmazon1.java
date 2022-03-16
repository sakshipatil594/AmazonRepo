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
import pom.AmazonMobilePage;
import pom.MobileClickChildBrowserPage;
import pom.MobileDisplayPage;

public class TestNgClassAmazon1 extends Browser{
	
	
	private WebDriver driver;
	
	private AmazonMainWindow amazonMainWindow;
	
	private AmazonMobilePage amazonMobilePage;
	
	private MobileDisplayPage mobileDisplayPage;
	
	private MobileClickChildBrowserPage mobileClickChildBrowserPage;
	
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
	public void createPomObject()
	{
		System.out.println("createPomObject");
		amazonMainWindow=new AmazonMainWindow(driver);
		amazonMobilePage=new AmazonMobilePage(driver);
		mobileDisplayPage=new MobileDisplayPage(driver);
		mobileClickChildBrowserPage=new MobileClickChildBrowserPage(driver);

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
	public void test() throws InterruptedException
	{
		
		
		amazonMainWindow.clickMobile();
		
		
		amazonMobilePage.searchTenThousandMobile();
		
		String url2=driver.getCurrentUrl();
		System.out.println(url2);
		
		String title2=driver.getTitle();
		System.out.println(title2);
		
		
		mobileDisplayPage.clickMobilePrice();
		
		ArrayList<String> mobileChildBroswerPage=new ArrayList<String>(driver.getWindowHandles());
		
		System.out.println(mobileChildBroswerPage.get(1));
		
		driver.switchTo().window(mobileChildBroswerPage.get(1));
		

		mobileClickChildBrowserPage.clickcheckBoxWithOutExchange();
		
		mobileClickChildBrowserPage.clickselectFirstCheckbox();
		
		mobileClickChildBrowserPage.clickAddToCart();
		
		Thread.sleep(4000);
	}
	
	
	
	@AfterMethod
	public void navigateToUrl()
	{
		System.out.println("navigateToUrl");
		driver.navigate().to("https://www.amazon.in/");
	}
	
	@AfterClass
	public void clearPomObject()
	{
		System.out.println("clearPomObject");
		amazonMainWindow=null;
		amazonMobilePage=null;
		mobileDisplayPage=null;
		mobileClickChildBrowserPage=null;

	}
	
	@AfterTest
	public void closeBrowser()
	{
		System.out.println("close browser");
		driver.quit();
		driver=null;
		System.gc();
	}
	

}
