package WaitExamples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {
	
	public static RemoteWebDriver driver;
	
	@SuppressWarnings("deprecation")
	   public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try {

			
			int implicitwait=5;
			Duration d = Duration.ofSeconds(5); 	// 1 hour with java.time
			long millis = d.toMillis();
			WebDriverManager.chromedriver().setup();
			WebDriverManager.chromedriver().getBrowserPath();
			RemoteWebDriver driver = new ChromeDriver();
			
			driver.get("https://www.flipkart.com/");

			//LOADS AND WAITS FOR 100 SECONGS FOR PAGE TO FULLY LOAD BEFORE ERRORTING OUT
			driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
			driver.manage().window().maximize();


			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(millis));
			WebElement loginCrossButton = driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2doB4z')]"));
			wait.until(ExpectedConditions.visibilityOf(loginCrossButton));
			loginCrossButton.click();


			// Save the text of the product for later verify
			WebElement productSearchInputBox = driver.findElement(By.xpath("//input[contains(@class,'_3704LK')]"));
			wait.until(ExpectedConditions.visibilityOf(productSearchInputBox));
			Assert.assertTrue(productSearchInputBox.isDisplayed());
			String productSearchOnScreenText = productSearchInputBox.getAttribute("title");
			String expectedTitle= "Search for products, brands and more";
			//Verify the text in search input box
			Assert.assertEquals(expectedTitle,productSearchOnScreenText);

			// Click on add to cart button
			productSearchInputBox.click();
			productSearchInputBox.sendKeys("Samsung Galaxy S10");

			WebElement productSearchResult = driver.findElement(By.xpath("//ul[contains(@class,'col-12-12 _1MRYA1')]"));
			wait.until(ExpectedConditions.visibilityOf(productSearchResult));
			//Verify the SearchResult List is displayed
			Assert.assertTrue(productSearchResult.isDisplayed());

			WebElement productSearchSubmit = driver.findElement(By.xpath("//button[contains(@class,'L0Z3Pu')]"));
			Assert.assertTrue(productSearchResult.isDisplayed());
			productSearchSubmit.click();


			driver.manage().timeouts().implicitlyWait(implicitwait, TimeUnit.SECONDS);

			WebElement Filter = driver.findElement(By.xpath("//span[contains(text(),'Filters')]"));
			wait.until(ExpectedConditions.visibilityOf(Filter));


			driver.manage().timeouts().implicitlyWait(implicitwait, TimeUnit.SECONDS);

			WebElement productSearchMobileCategory = driver.findElement(By.linkText("Mobiles"));


			//Verify the SearchResult List for Mobile Category is displayed
			Assert.assertTrue(productSearchMobileCategory.isDisplayed());
			productSearchMobileCategory.click();
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.flipkart.com/mobiles/pr?sid=tyy,4io&q=Samsung+Galaxy+S10&otracker=categorytree";
			Assert.assertEquals(expectedURL, actualURL);



			WebElement filterBrand = driver.findElement(By.xpath("(//div[contains(@class,'_2gmUFU _3V8rao') and contains(text(),'Brand')])[1]"));
			//Verify the Band Filter is displayed
			Assert.assertTrue(filterBrand.isDisplayed());



			WebElement filterBrandSamsungCheckbox = driver.findElement(By.xpath("(//div[contains(@class,'_4921Z t0pPfW')]/div/label/div[contains(@class,'_24_Dny')])[1]"));
			//Verify the Band Filter checkbox  is displayed
			Assert.assertTrue(filterBrandSamsungCheckbox.isDisplayed());
			filterBrandSamsungCheckbox.click();



			WebElement sortPriceHightoLow = driver.findElement(By.xpath("//div[contains(@class,'_10UF8M') and contains(text(),'Price -- High to Low')]"));
			//Verify the Sort by price High to Low  checkbox  is displayed
			Assert.assertTrue(sortPriceHightoLow.isDisplayed());
			sortPriceHightoLow.click();


			WebElement sortSelectedPriceHightoLow = driver.findElement(By.xpath("//div[contains(@class,'_10UF8M _3LsR0e') and contains(text(),'Price -- High to Low')]"));
			wait.until(ExpectedConditions.visibilityOf(sortSelectedPriceHightoLow));
			//Verify the Sort by price High to Low is selected
			Assert.assertTrue(sortPriceHightoLow.isDisplayed());

			List<WebElement> productsDisplayed = driver.findElements(By.xpath("//div[contains(@class,'_13oc-S')]"));
			List<WebElement> productsName= driver.findElements(By.xpath("//div[contains(@class,'_13oc-S')]//div[contains(@class,'_4rR01T')]"));
			List<WebElement> productsPrice= driver.findElements(By.xpath("//div[contains(@class,'_13oc-S')]//div[contains(@class,'_30jeq3 _1_WHN1')]"));
			List<WebElement> productsLink= driver.findElements(By.xpath("//div[contains(@class,'_13oc-S')]//a[contains(@class,'_1fQZEK')]"));

			//Verify pagination is displayed
			Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@class,'_2MImiq')]/span[contains(text(),'Page 1 of 8')]")).isDisplayed());

			WebElement navigatedPageIndex = driver.findElement(By.xpath("//nav[contains(@class,'yFHi8N')]/a[1]"));
			String pagenumber= navigatedPageIndex.getText();
			String expectedpagenumber="1";
			//Verify if its the first page of the cart
			Assert.assertEquals(expectedpagenumber,pagenumber);
			System.out.println("LIST OF PRODUCTS DETAILS ON "+pagenumber+" page");

			for (int i=0;i<productsDisplayed.size();i++){
				System.out.println("**************************************************************************************************************************************************");
				System.out.println("Product              : "+i+1);
				System.out.println("Product Name         : "+productsName.get(i).getText());
				System.out.println("Product Price        : "+productsPrice.get(i).getText());
				// System.out.println("Product Link "+productsLink.get(i).getText());
				System.out.println("Product Details Link : "+productsLink.get(i).getAttribute("href"));
				System.out.println("*************************************************************************************************************************************************");   
			}
			driver.quit();
		}
		
		catch(Exception e) {
			System.out.printf("Exception has occured :");
			e.printStackTrace();
		}
	
		
	}



}

