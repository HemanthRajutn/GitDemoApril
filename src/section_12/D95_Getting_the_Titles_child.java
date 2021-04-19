package section_12;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D95_Getting_the_Titles_child {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse_suport\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		System.out.println(driver.findElements(By.tagName("a")).size());
		// get me the count of the link in the footer section

		WebElement footerdriver = driver.findElement(By.xpath("//div[@id='gf-BIG']"));

		// limiting my scope to particular section by creating a class

		System.out.println(footerdriver.findElements(By.tagName("a")).size());

		// limiting my scope to particular section and also particular column

		footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));

		WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));

		System.out.println(columndriver.findElements(By.tagName("a")).size());

		// clicking on each link and checking window is open
		for (int i = 1; i < columndriver.findElements(By.tagName("a")).size(); i++) {
			// using key concept
			String clickkey = Keys.chord(Keys.CONTROL, Keys.ENTER); // important

			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickkey);
			Thread.sleep(4000L);
			// Getting the window title here
		}
		Set<String> abc = driver.getWindowHandles(); // abc now has 4
		Iterator<String> it = abc.iterator(); // it will have 5 windows

		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());

		}
	}
}
