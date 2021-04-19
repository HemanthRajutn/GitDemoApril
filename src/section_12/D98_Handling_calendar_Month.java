package section_12;
//97. Handling calendar UI in Travel websites

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D98_Handling_calendar_Month {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse_suport\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.seleniumeasy.com/test/bootstrap-date-picker-demo.html");
		driver.manage().window().maximize();
		//i will provide month name and date name
		
		driver.findElement(By.xpath("//input[@placeholder='Start date']")).click();
		//here we are checking the month
		
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("October"))  //while loop keep on executing unyil it became false so it will loo until we find august
		{
			driver.findElement(By.xpath("//div[1]//table[1]//thead[1]//tr[2]//th[3]")).click();
		}
		
		//below we are picking the day
		List<WebElement> dates = driver.findElements(By.cssSelector("td.day"));
		
		int count = driver.findElements(By.cssSelector("td.day")).size();
		
		for (int i=0;i<count;i++)
		{
			String text = driver.findElements(By.cssSelector("td.day")).get(i).getText();
			if(text.equalsIgnoreCase("23"))
			{
				driver.findElements(By.cssSelector("td.day")).get(i).click();
				break;
							
			}
		}
		
	}

}
