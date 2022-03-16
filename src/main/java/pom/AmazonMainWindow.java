package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonMainWindow 
{

	@FindBy (xpath="//span[@id='glow-ingress-line2']")
	private WebElement selectAddress;
	
	@FindBy (xpath="//input[@class='GLUX_Full_Width a-declarative']")
	private WebElement pincodeEnter;

	@FindBy (xpath="//span[@class='a-button a-button-span12']")
	private WebElement applyButton;

	@FindBy (xpath="//select[@aria-describedby='searchDropdownDescription']")
	private WebElement searchInDropDown;

	@FindBy (xpath="(//input[@type='text'])[1]")
	private WebElement searchBar;

	@FindBy (xpath="//input[@id='nav-search-submit-button']")
	private WebElement searchClick;


	@FindBy (xpath="//span[@class='icp-nav-link-inner']")
	private WebElement selectCountry;


	@FindBy (xpath="//span[text()='Account & Lists']")
	private WebElement accountAndLists;
	
	@FindBy (xpath="(//span[@class='nav-action-inner'])[1]")
	private WebElement signInButton;

	
	@FindBy (xpath="//a[@id='nav-orders']")
	private WebElement returnOrders;

	
	@FindBy (xpath="//span[@class='nav-cart-icon nav-sprite']")
	private WebElement cart;
	
	//secondLine
	
	@FindBy (xpath="//a[@id='nav-hamburger-menu']")
	private WebElement allMenu;
	
	
	@FindBy (xpath="(//a[text()='Best Sellers'])[1]")
	private WebElement bestSellers;

	
	@FindBy (xpath="//a[text()='Mobiles']")
	private WebElement mobiles;
	

	@FindBy (xpath="(//a[@class='nav-a  '])[3]")
	private WebElement todaysDeals;
	
	
	@FindBy (xpath="(//a[text()='Customer Service'])[1]")
	private WebElement customerService;


	@FindBy (xpath="//a[text()=' Electronics ']")
	private WebElement electronics;
	
	
	@FindBy (xpath="//span[text()='Prime']")
	private WebElement prime;
	
	
	@FindBy (xpath="//a[text()='Books']")
	private WebElement books;


	@FindBy (xpath="//a[text()='Fashion']")
	private WebElement fashion;
	
	
	@FindBy (xpath="//a[text()='New Releases']")
	private WebElement newReleases;
	
	
	@FindBy (xpath="//a[text()='Home & Kitchen']")
	private WebElement homeAndKitchen;
	
	private WebDriverWait wait;

	private Actions actions;

	public AmazonMainWindow(WebDriver driver)
	{
	
		PageFactory.initElements(driver, this);
		actions=new Actions(driver);
		wait=new WebDriverWait(driver,20);
		
	}
	
	public void clickselectAddress()
	{
		wait.until(ExpectedConditions.visibilityOf(selectAddress));

		selectAddress.click();
			
	}

	public void sendPincode()
	{

		pincodeEnter.sendKeys("413004");
			
	}
	public void clickApplyButton()
	{
		applyButton.click();
			
	}
	
	public void selectSearchInDropDown()
	{
		wait.until(ExpectedConditions.visibilityOf(searchInDropDown));

		Select searchAllCatogries=new Select(searchInDropDown);
		searchAllCatogries.selectByIndex(3);
	}
	
	public void sendSearchText() 
	{
		wait.until(ExpectedConditions.visibilityOf(searchBar));
		searchBar.sendKeys("Dresses for women");
		
	}
	
	public void searchClick()
	{
		
		wait.until(ExpectedConditions.visibilityOf(searchClick));
		searchClick.click();
		
	}

	public void accountAndList()
	{
		
		wait.until(ExpectedConditions.visibilityOf(accountAndLists));
		actions.moveToElement(accountAndLists).perform();	
		
	}
	
	public void clickSignInButton()
	{
		
		wait.until(ExpectedConditions.visibilityOf(signInButton));
		actions.moveToElement(signInButton).click().build().perform();
		
	}
	
	public void clickMobile()
	{
		
		mobiles.click();
		
	}
	
	
	
	
}

