package section11;
//86. Handling Multiple Windows
//87. Window Handle concepts-real time example

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D86_Handling_Multiple_Windows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse_suport\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();
	//	driver.findElement(By.xpath("//a[contains(text(),'Terms')]")).click();
		
		//Set is used to store the windows and then using iterator we are navigating to the child window
		
		Set<String> ids = driver.getWindowHandles();
		
		System.out.println(driver.getTitle());
		
		Iterator<String> it = ids.iterator();
		
		String parentid = it.next();
		
		String child =it.next();
		
	//	String childnxt = it.next();
		
	driver.switchTo().window(child);
		
		System.out.println(driver.getTitle());
		//performing action in the child window
		driver.findElement(By.cssSelector("input.promoted-search__input")).sendKeys("hacking");
		
		//going back to parent window
		
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());
		
		System.out.println(driver.findElement(By.xpath("//h1[@id='headingText']")).getText());
		
		
				
		

	}

}
