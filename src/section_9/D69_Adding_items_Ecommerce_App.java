package section_9;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D69_Adding_items_Ecommerce_App {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse_suport\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		// check whether the name extracted is in the array or not

		String[] ItemNeeded = { "Cucumber", "Beetroot", "Mango" };

		for (int i = 0; i < products.size(); i++)

		{
			// by using the for loop i am checking each text of the products

			String[] name = products.get(i).getText().split("-"); // after splitting name[0]=Cucumber and name[1]= - 1kg
			String formatedName = name[0].trim(); // trim is used to trim the SPACE
			// this name has 1kg also we need to trim the name
			System.out.println(formatedName);
			// converting array to array list to validate

			List ItemNeededList = Arrays.asList(ItemNeeded);

			// here i am checking the name with our input arrayl list
			int j = 0;
			if (ItemNeededList.contains(formatedName)) 
			{
				// click on add to cart
				// Thread.sleep(2000L);
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
