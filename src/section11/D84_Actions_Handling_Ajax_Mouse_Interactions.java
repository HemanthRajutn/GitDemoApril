
package section11;
//84. Handling Ajax/Mouse Interactions
//mouse move over by action class
//85. Actions class-real time example

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class D84_Actions_Handling_Ajax_Mouse_Interactions {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse_suport\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
	
		 //we have to build the entire action by giving build now it is ready to execute
		Actions a = new Actions(driver);
		
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("abcd").doubleClick().build().perform();;
		Thread.sleep(1000);
		
		//below text is for to move to specifi element mouse move over
		WebElement move = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		a.moveToElement(move).build().perform();
		Thread.sleep(1000);
		
		//right click on the element
		a.moveToElement(move).contextClick().build().perform();
      
	
		
	}

}
