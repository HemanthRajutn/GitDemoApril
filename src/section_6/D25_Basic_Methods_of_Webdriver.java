package section_6;
//26. Webdriver browser methods - 2

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D25_Basic_Methods_of_Webdriver {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse_suport\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	//	System.out.println(driver.getPageSource());
	//	driver.close();
		driver.get("https://www.yahoo.com/");
		System.out.println(driver.getTitle());
		
		driver.navigate().back();   // click on back button
		System.out.println(driver.getTitle());
		// driver.navigate().forward();
		driver.close();    //close is a method // it closes current browser
		driver.quit();   // quit closes all the browser
		
		

	}

}
