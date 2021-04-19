package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class day3Carloan {

	@Test
	public void WebloaginCarloan() {
		System.out.println("WebloaginCarloan");
	}

	
	 @Parameters({"URL","UserName"})
	 
	 @Test public void globalvaribaleloaginCarloan(String urlname,String usrname)
	 { System.out.println("I am calling the global varibale" + " " + urlname);
	 
	 System.out.println("I am calling the global varibale" + " " + usrname); }
	 
	@Test(groups = { "Smoke" })
	public void LoginAPi() {
		System.out.println("LoginAPi @Test(groups={\"Smoke\"})");
	}

	@BeforeClass
	public void beforeclass() {
		System.out.println("I am executing @BeforeClass");
	}

	@Test(groups = { "Smoke" })
	public void loaginCarloan2() {
		System.out.println("I am executing @Test(groups={\"Smoke\"})");
	}

	@BeforeSuite
	public void beforesuitemethod() {
		System.out.println("I am executing beforesuitemethod");
	}

	@Test(groups = { "Smoke" })
	public void loaginCarloan3() {
		System.out.println("I amexecuting @Test(groups={\"Smoke\"})");
	}

	@Test(timeOut = 4000, groups = { "Smoke" }, dependsOnMethods = { "WebloaginCarloan",
			"loaginCarloan3" }, enabled = false, priority = 1)
	public void MobileloaginCarloan4() {
		System.out.println("MobileloaginCarloan4 Apium");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am executin @beforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("I am executin @@AfterMethod");
	}

	@Test(dependsOnMethods = { "WebloaginCarloan", "loaginCarloan3" })
	public void MobileloaginCarloan5() {
		System.out.println("@Test(dependsOnMethods={\"WebloaginCarloan\"})");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("I am executing beforeTest");
	}

	@AfterSuite
	public void aftersuitemethod() {
		System.out.println("I am executing aftersuitemethod");
	}

	@AfterTest
	public void AfterTest1() {
		System.out.println("AfterTest1");
	}

	@Test(enabled = false)
	public void Enabled() {
		System.out.println("AfterTest1");
	}
}
