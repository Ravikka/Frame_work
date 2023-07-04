package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ts1 implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("tc ic started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("tc ic passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("tc ic failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("tc ic skipped");
	}
	
	

}
