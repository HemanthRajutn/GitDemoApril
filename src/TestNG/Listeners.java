package TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		arg0.getTestName();
		arg0.getName();
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		arg0.getName();
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		System.out.println("all the test cases are executed now go home.......***********$#$#$#$#$#$@@#$^%&^%*^*(&(&(");
		
		
	}
	
	

}
