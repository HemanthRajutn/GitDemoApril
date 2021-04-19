package section14;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class automatebrokenLinksextended {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse_suport\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		// program to find broken links in web page
		//openConnection() method is present in url class and return type is HttpURLConnection
		//if status code in DOM network  is >400 that is broken link	
	List<WebElement> links =	driver.findElements(By.cssSelector("li[class='gf-li'] a"));
	
	for(WebElement link:links)
	{
		String url =	driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");

		HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
		
		//belwo we are telling what kind of request it iss
		conn.setRequestMethod("HEAD");
		conn.connect();
		int rescode = conn.getResponseCode();
		System.out.println(rescode);
		if(rescode>400)
		{
			Assert.assertTrue(false);// Hard assertion
			
		}
	}
	

	
	}

}
