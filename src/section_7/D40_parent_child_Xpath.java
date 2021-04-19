package section_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D40_parent_child_Xpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse_suport\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.google.com/");
	//	d.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("anbs");
		d.findElement(By.xpath("//*[@class='RNNXgb']/div/div[2]/input")).sendKeys("anbs");
		d.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']/center/input")).click();
		
		
		
		//di

	}

}
