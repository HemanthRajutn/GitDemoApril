package section_8;
//59. Importance of Assertions in Automation testing and how to use

//TestNg jar

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class D59_Importance_Assertions {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\eclipse_suport\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Assert.assertFalse(
				driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected()); // because
																														// it
																														// is
																														// not
																														// selected

		// System.out.print(Assert.assertFalse(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected()));
		// assert will pass if the condition is false

		System.out.println();
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		; // used regular expression
			// count the number of check boxes in the screen
			// search for the common locater

		int abc = driver.findElements(By.cssSelector("input[type='checkbox']")).size();
		Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(), 6); // comapres the
																										// condition
		// Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(),
		// 0); //fails
		System.out.print(abc);

	}

}
