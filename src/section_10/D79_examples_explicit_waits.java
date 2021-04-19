package section_10;
//79. Practical examples on explicit waits
//explicit wait will only for some particular block

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class D79_examples_explicit_waits {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\eclipse_suport\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		
		String[] ItemNeeded = { "Cucumber", "Beetroot", "Mango" };
		
		
		addItems(driver,ItemNeeded);
		//defining Explicit wait here thorugh class here we have to pass driver and time
		
		
				
		WebDriverWait explicitwait = new WebDriverWait(driver,7);
		
		driver.findElement(By.xpath("//a[@class='cart-icon']//img[contains(@class,'')]")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		
		//putting the locator inside the visibleity
		explicitwait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@placeholder='Enter promo code']")));
	
		driver.findElement(By.xpath("//input[@placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		
		
		//putting the locator inside the visibleity
		explicitwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));
		
		System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());
		
		driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
		
	}


	//created method outside
	

public static  void addItems(WebDriver driver, String[] ItemNeeded)
{
	List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
	for (int i = 0; i < products.size(); i++)

	{
		

		String[] name = products.get(i).getText().split("-"); // after splitting name[0]=Cucumber and name[1]= - 1kg
		String formatedName = name[0].trim(); // trim is used to trim the SPACE
		// this name has 1kg also we need to trim the name
	//	System.out.println(formatedName);
		// converting array to array list to validate

		List ItemNeededList = Arrays.asList(ItemNeeded);

		
		int j = 0;
		if (ItemNeededList.contains(formatedName)) 
		{
			
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			j++;
			if (j == ItemNeeded.length) 
			{
				break;
			}

		}
	}
}
}


