package section14;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HTTPScertifications {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//ssl certificates
		
		//Desired capabilities
		DesiredCapabilities ch = DesiredCapabilities.chrome();
		ch.acceptInsecureCerts();
		//or to accept the insecute certifications
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		//below to your loca brwosers
		ChromeOptions c = new ChromeOptions();
		c.merge(ch);
		
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse_suport\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(c);
		
	//	taking screen shot
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\Dell\\Desktop\\screenshot.png"));

	}

}
