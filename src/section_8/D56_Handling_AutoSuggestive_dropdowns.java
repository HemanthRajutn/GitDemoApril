package section_8;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D56_Handling_AutoSuggestive_dropdowns {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse_suport\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		driver.manage().window().maximize();
		driver.findElement(By.id("autosuggest")).sendKeys("IND");
		Thread.sleep(3000L);
		//findelements is WEB elements
		
		
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
        
		List<String> list = new ArrayList<>();
		
		list.add("HEMANT");
		
			 
        for (WebElement count:options)
        {
        	if(count.getText().equalsIgnoreCase("india"))
        			{
        		// System.out.println( option.toString());
        		
        		count.click();
        		      break;
        		      
        			}
        	        	
        }
	}

}
