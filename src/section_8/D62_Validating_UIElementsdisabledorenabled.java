package section_8;
//62. Validating if UI Elements are disabled or enabled with Attributes

//to check the box is enabled or not (is enalbles is not working

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class D62_Validating_UIElementsdisabledorenabled {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse_suport\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();

		Thread.sleep(6000L);
		// System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).isEnabled());
		// not working becaose for selenium if something is disabled user should not
		// able to select it but in this site we are able to select it

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style")); // by using get attibute we are
																						// checking
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click(); // clickng the round trip
		Thread.sleep(2000L);
		// System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).isEnabled());
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) // here it checking the entair text
																					// for 1
		{
			Assert.assertTrue(true);
			System.out.println("is enlabled");
		} else {
			System.out.println("is not enlabled");
			Assert.assertTrue(false);

		}

	}

}