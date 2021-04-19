package section_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D53_Handle_Dynamic_dropdowns {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse_suport\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000L);
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		Thread.sleep(3000L);
		driver.findElement(By.xpath("//a[@text='Bengaluru (BLR)']")).click();
		Thread.sleep(3000L);
		driver.findElement(By.xpath("(//*[@id=\"dropdownGroup1\"]/div/ul[1]/li[6]/a)[2]")).click();

		// to select xpath from index
		// (//*[@id="dropdownGroup1"]/div/ul[1]/li[6]/a)[2]

	}
}
