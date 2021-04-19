package section_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//61. Handling Calendar UI in travel websites using Selenium
//to take the class name if you have space in between remove the space and give the .(for css selector
public class D61_Handling_CalendarUI {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse_suport\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(6000L);
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//a[@text='Bengaluru (BLR)']")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@text='Belagavi (IXG)'][contains(text(),'Belagavi (IXG)')]")).click();
		Thread.sleep(2000L);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//a[@class='ui-state-default'][contains(text(),'21')]")).click();


	}

}
