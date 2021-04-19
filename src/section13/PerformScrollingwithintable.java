package section13;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PerformScrollingwithintable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse_suport\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		//below code is for scroll
		JavascriptExecutor js = (JavascriptExecutor)driver;
	
		
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		Thread.sleep(3000);
	}

}
