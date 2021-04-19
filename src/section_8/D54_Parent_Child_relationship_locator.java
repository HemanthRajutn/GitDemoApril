package section_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//54. Parent-Child relationship locator 
public class D54_Parent_Child_relationship_locator {

	public static void main(String[] args) throws InterruptedException {
	
		//using the parent child traverse i am clicking
		// parentxpath//childXpath
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse_suport\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000L);
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		Thread.sleep(3000L);
		driver.findElement(By.xpath("//a[@text='Bengaluru (BLR)']")).click();
		Thread.sleep(3000L);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='IXG']")).click(); //using parentchld
		
		
	}

}
