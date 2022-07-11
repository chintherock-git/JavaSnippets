package WaitExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class LoginAndSearch {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().getBrowserPath();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in");
		
		//LOADS AND WAITS FOR 100 SECONGS FOR PAGE TO FULLY LOAD BEFORE ERRORTING OUT
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		WebElement search = driver.findElement(By.id("src"));
		search.sendKeys("del");
		Thread.sleep(3000);//thread is class in java and wait time is in  MILLISECONDS
		
		driver.manage().timeouts().implicitlyWait(6000,TimeUnit.MILLISECONDS);
		System.out.println("The start time when implicit wait is 6 seconds "+ new Date());
		WebElement searchdropdown= driver.findElement(By.xpath("//ul[@class='autoFill homeSearch']/li"));
		System.out.println("The end time  time when implicit wait is 6 seconds "+ new Date());
		searchdropdown.isDisplayed();
		
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
		
		System.out.println("The start time when implicit wait is 3 seconds "+ new Date());
		WebElement item= driver.findElement(By.xpath("//li[@select-id='results[0]']"));
		System.out.println("The end time  time when implicit wait is 3 seconds "+ new Date());
		//Select select = new Select(searchdropdown);
		item.click();
		String Selectedcity= search.getAttribute("value");
		System.out.println("The selected city is "+Selectedcity);
		//select.selectByValue("Delhi");
		driver.quit();
	

	}

}
