package westpac;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import resources.base;


public class listeners implements ITestListener {
    base b=new base();
	public void onTestStart(ITestResult result) {
		
		//message on start of test
		
	}

	public void onTestSuccess(ITestResult result) {
		
		
	}

	public void onTestFailure(ITestResult result) {
		
		//screenshot concept
		
		try {
			b.getScreenshot(result.getName());
		} catch (IOException e) {
			// Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void onTestSkipped(ITestResult result) {
		
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	public void onStart(ITestContext context) {
		
		
	}

	public void onFinish(ITestContext context) {
		
		//hey i am done
		
	}

}
