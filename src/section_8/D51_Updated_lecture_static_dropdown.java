package section_8;
//51. Updated lecture on latest Dropdown looping UI
//selecting the adults in the below page

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D51_Updated_lecture_static_dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse_suport\\Eclipse Jar files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		//selenium has select class to perform this operation
		driver.manage().window().maximize();
	//	Thread.sleep(3000L);
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		//to click adult button or select 5 adults
		
		int i=1;
	//	while(i<5)
	//	{
	//		driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
	//		i++;
	//	}
				
		for(int i1=1;i1<5;i1++)
		{
			driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[@id='hrefIncChd']")).click();
			Thread.sleep(1000);
			
			
			
		}
			
		driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();
     String str =   driver.findElement(By.xpath("//*[@id='divpaxinfo']")).getText();
        System.out.println(str);
        String [] splitstr = str.split("\\s+");
        
   //     String numberOnly = str.replaceAll("[^0-9]", "");
   //     System.out.println(numberOnly);
        System.out.println(splitstr);
	
	}
}
