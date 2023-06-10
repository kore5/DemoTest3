package com.lisners;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.base.Baseclass;
import com.utils.DriverUtils;

public class Mylistener extends Baseclass implements ITestListener {


 
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		test=report.createTest(result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		
		test.log(Status.PASS, "Test case is pass");
	}

	public void onTestFailure(ITestResult result) {
		// screenshot code
		test.log(Status.FAIL, "Testcase is fail");
		String path = DriverUtils.getScreenshoot(result.getName());	
		
		test.addScreenCaptureFromBase64String(path);
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		test.log(Status.SKIP, "Testcase is skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		
		report.flush();
		
	}
	
	
	
	
	

}
