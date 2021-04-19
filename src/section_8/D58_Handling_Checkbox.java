package section_8;
//How to check the checbox anad radio button

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D58_Handling_Checkbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse_suport\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).click();
		boolean src = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected();;
		System.out.println(src);
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();;   //used regular expression
		//count the number of check boxes in the screen
		//search for the common locater
		
		int abc = driver.findElements(By.cssSelector("input[type='checkbox']")).size();
		System.out.print(abc);
        
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_2']")).click();
		
	}

}
