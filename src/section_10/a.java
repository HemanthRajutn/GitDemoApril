package section_10;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse_suport\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//we have to create a global 
		
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.manage().window().maximize();
		
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
		

		/*
		 * WebElement dynamicelement = wait.until(new Function<webdriver,webElement>() {
		 * 
		 * public WebElement apply(WebDriver driver) { return
		 * driver.findElement(By.id("dynamicelement")); }
		 */
	
	}
}
