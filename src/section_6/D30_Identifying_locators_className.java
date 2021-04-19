package section_6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D30_Identifying_locators_className {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse_suport\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com//");
		driver.manage().window().maximize();
        driver.findElement(By.name("username")).sendKeys("login_name");
        driver.findElement(By.id("password")).sendKeys("login_password");
        driver.findElement(By.id("Login")).click();
       
        System.out.println(driver.findElement(By.className("loginError")).getText());
        
        
        
	}

}
