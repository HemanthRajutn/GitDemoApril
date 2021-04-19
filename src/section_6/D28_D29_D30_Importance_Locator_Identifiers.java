package section_6;
//28. Importance of Locator Identifiers in Selenium
//29. Identifying locators(id,name,linkText) with developer tools -1
//30. Identifying locators(className) with developer tools -2

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//alpha numeric ID may vary
//classes should not have spaces and compund classes connot be access
public class D28_D29_D30_Importance_Locator_Identifiers {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\eclipse_suport\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com//");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("trialemail.com");
		driver.findElement(By.name("pass")).sendKeys("paswword");
		// driver.findElement(By.id("u_0_b")).click();
		// driver.navigate().back();
		driver.findElement(By.linkText("Forgotten account?")).click();
		
	//	driver.get("https://login.salesforce.com/?locale=eu");
		
		
	}

}
