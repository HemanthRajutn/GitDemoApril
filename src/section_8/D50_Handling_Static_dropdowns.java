package section_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class D50_Handling_Static_dropdowns {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse_suport\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		//selenium has select class to perform this operation
		driver.manage().window().maximize();
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		s.selectByValue("AED");
		s.selectByIndex(3);
		
		
	}

}
