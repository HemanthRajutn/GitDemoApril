package section_6;
//35. Generating customized xpath from html attributes
//36. Generating customized CSS from html attributes
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D35_Generating_customized_xpath {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse_suport\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		d.get("https://www.facebook.com/");
		d.manage().window().maximize();
		d.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Hemanth");
		d.findElement(By.xpath("//input[@name='lastname']")).sendKeys("raj");
		d.findElement(By.cssSelector("input#password_step_input")).sendKeys("pasgdfgdfg");
		
	}

}
