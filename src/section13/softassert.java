package section13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class softassert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse_suport\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		SoftAssert sa = new SoftAssert();

		

	}

}
