package section14;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StrategytoautomatebrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse_suport\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
	String url =	driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
	// program to find broken links in web page
	//openConnection() method is present in url class and return type is HttpURLConnection
	//if status code in DOM network  is >400 that is broken
	HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
	
	//belwo we are telling what kind of request it iss
	conn.setRequestMethod("HEAD");
	conn.connect();
	int rescode = conn.getResponseCode();
	System.out.println(rescode);
	
	
	
	}

}
