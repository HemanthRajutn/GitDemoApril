package section21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValuesDrive {

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\1SeleniumCompleteUdemyRahul\\src\\section21\\data.properties");
		//After that we have to tell the information to our prop
		prop.load(fis);
		prop.getProperty("browser");
		System.out.println(prop.getProperty("browser"));
		
		System.out.println(prop.getProperty("url"));
		
		//to set the property in properties. files
		//In the below m line data will be updated only in run time it wont update the .properties file
		prop.setProperty("browser","firefox");
		System.out.println(prop.getProperty("browser"));
		
		//to write in the properties file
		//all the code changes will be writtenn to properties files
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Dell\\eclipse-workspace\\1SeleniumCompleteUdemyRahul\\src\\section21\\data.properties");
		prop.store(fos, null);
		
		
	}

}
