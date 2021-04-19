package section_10;
//77. Scenario to automate and necessity of waits in the example
//in this program we will select and move to card
//78. Practical examples on Implicit wait

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D77_implicit_explict_wait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\eclipse_suport\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//we have to create a global 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);     //**IMPORTANT  **//
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		
		String[] ItemNeeded = { "Cucumber", "Beetroot", "Mango" };
		
	//we can execute method without creating an object by making the method static
		
		addItems(driver,ItemNeeded);
	//	D77_implicit_explict_wait b = new D77_implicit_explict_wait();
	//	b.addItems(driver, ItemNeeded);
		
		driver.findElement(By.xpath("//a[@class='cart-icon']//img[contains(@class,'')]")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		
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


