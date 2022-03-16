package test;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.AmazonLoginPage;
import pom.AmazonMainWindow;
import pom.AmazonMobilePage;
import pom.MobileClickChildBrowserPage;
import pom.MobileDisplayPage;

public class AmazonTestClass 
{
	
		public static void main(String[] args) throws InterruptedException 
		{
		
			System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		
			WebDriver driver=new ChromeDriver();
		
			driver.get("https://www.amazon.in/");
			
		
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			
				
			AmazonMainWindow amazonMainWindow=new AmazonMainWindow(driver);
			
			amazonMainWindow.clickselectAddress();

			amazonMainWindow.sendPincode();

			amazonMainWindow.clickApplyButton();
			
			Thread.sleep(3000);
		//	amazonMainWindow.selectSearchInDropDown();
			
			amazonMainWindow.sendSearchText();

			amazonMainWindow.searchClick();
		
			
	/*		amazonMainWindow.accountAndList();
			
			amazonMainWindow.clickSignInButton();*/
			
			String url1=driver.getCurrentUrl();
			System.out.println(url1);
			
			String title1=driver.getTitle();
			System.out.println(title1);
				
			
		/*	AmazonLoginPage amazonLoginPage=new AmazonLoginPage(driver);
			
			amazonLoginPage.sendEmailOrMobileNo();
			
			amazonLoginPage.clickContinueButton();
			
			amazonLoginPage.sendPassword();
			
			amazonLoginPage.clickSignInButton();*/
			
			
			amazonMainWindow.clickMobile();
			
			AmazonMobilePage amazonMobilePage=new AmazonMobilePage(driver);
			
			amazonMobilePage.searchTenThousandMobile();
			
			String url2=driver.getCurrentUrl();
			System.out.println(url2);
			
			String title2=driver.getTitle();
			System.out.println(title2);
			
			MobileDisplayPage mobileDisplayPage=new MobileDisplayPage(driver);
			
			mobileDisplayPage.clickMobilePrice();
			
			//child broswer 
			
			ArrayList<String> mobileChildBroswerPage=new ArrayList<String>(driver.getWindowHandles());
			
			System.out.println(mobileChildBroswerPage.get(1));
			
			driver.switchTo().window(mobileChildBroswerPage.get(1));
			
			MobileClickChildBrowserPage mobileClickChildBrowserPage=new MobileClickChildBrowserPage(driver);

			mobileClickChildBrowserPage.clickcheckBoxWithOutExchange();
			
			mobileClickChildBrowserPage.clickselectFirstCheckbox();
			
			mobileClickChildBrowserPage.clickAddToCart();
			
		}

}
