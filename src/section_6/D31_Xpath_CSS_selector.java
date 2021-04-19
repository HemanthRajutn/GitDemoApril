package section_6;
//32. Identifying CSS locators with chrome and firefox Addons
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D31_Xpath_CSS_selector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse_suport\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com//");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("skdnsknsk");
		driver.findElement(By.cssSelector("#password")).sendKeys("paswwwww");
		driver.findElement(By.cssSelector("#Login")).click();
	//	driver.findElement(By.cssSelector("#mydomainLink")).click();
	//	driver.findElement(By.cssSelector("#hint_back_domain")).click();
	
		Thread.sleep(2000L);
		String src =	driver.findElement(By.xpath("//div[@id='error']")).getText();
		System.out.print(src);
		
	}

}
