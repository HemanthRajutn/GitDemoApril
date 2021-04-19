package section11;
//89. How to handle Frames?
//frame are different from locators we can not identify the frames uning normal way
//there is a method for that 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class D89_handle_Frames_Drag_Drop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse_suport\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		//to get the total num of frames
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		//below is the frame method and we should give the frame location
		//we can also naviagte by giving number index of frame
		//
	//	driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
				
		//using action to perform action inside the frame
		Actions a = new Actions(driver);
		//we have to give source and destination
		WebElement source =  driver.findElement(By.id("draggable"));
		WebElement target =  driver.findElement(By.id("droppable"));
		a.dragAndDrop(source,target ).build().perform();
		// driver.switchTo().frame(1);
		System.out.println(driver.findElement(By.xpath("//p[contains(text(),'Dropped!')]")).getText());
		//to come out of fame to our main window
		driver.switchTo().defaultContent();
		
	}

}
