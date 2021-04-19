package section_12;
//to count the link 
//95. Getting the Titles of child tabs with optimized while loop
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D92_count_Links_ {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse_suport\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.manage().window().maximize();
			System.out.println(driver.findElements(By.tagName("a")).size());
	//get me the count of the link in the footer section
			
			WebElement footerdriver = driver.findElement(By.xpath("//div[@id='gf-BIG']"));
			
			//limiting my scope to particuylar section by creating a class
			
			System.out.println(footerdriver.findElements(By.tagName("a")).size());
			
			//limiting my scope to particuylar section and also particular column
			
			footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
			
			WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
			
			System.out.println(columndriver.findElements(By.tagName("a")).size());
			
			//clicking on each link and  checking window is open
			for(int i=1; i<columndriver.findElements(By.tagName("a")).size(); i++)
			{
				//using key concept
				String clickkey = Keys.chord(Keys.CONTROL,Keys.ENTER);  //important
				
				columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickkey);;
			}
			
			
	}

}
