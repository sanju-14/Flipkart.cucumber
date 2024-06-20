package stepDefinition;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import com.flipkart.pages.flipkartLoginPage;
import com.flipkart.testdata.FlipkartTestDataObject;
import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginPagestepDefinition {
	
	public void verifyLoginPage() {

	}

	RemoteWebDriver driver = null;

	@Given("^open the browser$")
	public void open_the_browser() throws Throwable {

		//System.setProperty("webdriver.chrome.driver",
				//"C:\\Users\\kalyanachari.s\\OneDrive - NSGroup\\Documents\\SFDC\\Flipkart.cucumber\\Drivers\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
				
		driver = new ChromeDriver();
		
		Thread.sleep(2000);
		driver.manage().window().maximize();

		System.out.println("InsideSteps-user is on login page");
	}

	@When("^user is on google search page$")
	public void user_in_on_google_search_page() throws Throwable {
		driver.navigate().to("https://google.com/");
		Thread.sleep(2000);
		System.out.println("Usaer is on google search bar");
	}

	@When("^user enters a text in the search box$")
	public void user_enters_a_text_in_the_search_box() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("https://www.flipkart.com");

	}

	@And("^Click on Google search button$")
	public void Click_on_Google_search_button() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@And("^Select one url$")
	public void Select_one_url() throws Throwable {
		driver.findElement(flipkartLoginPage.slturl).click();
		Thread.sleep(3000);
	}

	@Then("^enter usaername and password$")
	public void enter_username_and_password() throws Throwable {

		Thread.sleep(3000);
		driver.findElement(flipkartLoginPage.userName).sendKeys(FlipkartTestDataObject.username);
		Thread.sleep(3000);
		driver.findElement(flipkartLoginPage.Password).sendKeys(FlipkartTestDataObject.password);
		Thread.sleep(3000);
		driver.findElement(flipkartLoginPage.Login).click();
	}

	@Then("^Select the search bar and search mobiles$")
	public void select_the_search_bar_and_search_mobiles() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(flipkartLoginPage.searchMobile).sendKeys(FlipkartTestDataObject.SearchMobile);
		Thread.sleep(2000);
	}

	@Then("^Click on search$")
	public void click_on_search() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(flipkartLoginPage.clksearch).click();
	}

	@Then("^select mobile$")
	public void select_mobile() throws Throwable {
		WebElement element;
		Thread.sleep(6000);
		element = driver.findElement(flipkartLoginPage.sltmobile);
		element.click();
	}

	@Then("^click on buy now$")
	public void click_on_buy_now() throws Throwable {
		Thread.sleep(3000);
		ArrayList<String> browserTab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(browserTab.get(1));
		if (driver.findElement(flipkartLoginPage.btnbuyNow).isDisplayed()) {
			System.out.println("page switch to next tabe");
			Thread.sleep(3000);
			
		}
		
		driver.findElement(flipkartLoginPage.btnbuyNow).click();
		Thread.sleep(3000);
		driver.manage().deleteAllCookies(); //delete all cookies
		Thread.sleep(3000);
		WebElement PH = driver.findElement(flipkartLoginPage.rdobtncashondelivery1);
	     // Actions class
	      Actions a = new Actions(driver);
	      // moveToElement() and then click()
	      a.moveToElement(PH).clickAndHold(PH).pause(8000).release(PH).perform();
	      

	     /* Actions Act = new Actions(driver);
	      newActions(SeleniumDriver.getDriver()).clickAndHold(l).pause(2000).build().perform();
	     // clickOnElementAndHold.moveToElement(toElement).clickAndHold(toElement).perform();

	       // sleep(millisecondsOfWaitTime);

		/*driver.findElement(flipkartLoginPage.rdobtncashondelivery1).clickAndHold();
		System.out.println("clicked by user");*/
		
		/* ArrayList arrayList = new ArrayList(driver.findElements(By.xpath("//*[text()='Press & Hold']")));
		for(int k=0;k<arrayList.size();k++) {
			System.out.println(arrayList.get(k));
			} */
		/*int framesCount = driver.findElements(By.tagName("iframe")).size();
		System.out.println(framesCount);*/
		//new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='uir-item-edit' and starts-with(@aria-label, 'Edit Sales Order')][contains(@id, 'transactions') and text()='Edit']"))).click();
		/*new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//p[@class='acmOWwFIBWwcRTj'][contains(@id, 'iutByNUQTpvrxDb') and text()='Press & Hold']"))).click();
		System.out.println("User click on Press & Hold");*/
		}
	

	@Then("^click on Delivery here$")
	public void click_on_Delivery_here() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(flipkartLoginPage.btnDeliver).click();
	}

	@Then("^click on continue$")
	public void click_on_continue() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(flipkartLoginPage.btncontinue).click();

	}

	@Then("^click on Accept&continue$")
	public void click_on_Accept_continue() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(flipkartLoginPage.btnAcceptcontinue).click();

	}

	@Then("^click on cash on delivery button$")
	public void click_on_cash_on_delivery_button() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(flipkartLoginPage.rdobtncashondelivery).click();

	}

}
