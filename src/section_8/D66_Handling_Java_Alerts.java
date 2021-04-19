package section_8;
//66. Handling Java Alerts using Selenium Webdriver

//Alert page is not html basaed so we can not find the locators for that

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D66_Handling_Java_Alerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse_suport\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Hemanth");
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		// there is a method to activate to pop up window
		Thread.sleep(2000L);
		// we can also grab the alert from the pop up box
		String text = driver.switchTo().alert().getText();

		System.out.println(text);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Rajkumar");
		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		String text1 = driver.switchTo().alert().getText();
		System.out.println(text1);
		driver.switchTo().alert().dismiss();
		// driver.switchTo().alert().dismiss();
		// driver.switchTo().alert().sendKeys("text1");
	}

}
