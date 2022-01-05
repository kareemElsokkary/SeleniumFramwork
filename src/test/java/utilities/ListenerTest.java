package utilities;

import org.testng.ITestListener;
import org.testng.ITestContext;
import org.testng.ITestResult;

public class ListenerTest implements ITestListener{

	
	 
	 @Override		
	    public void onFinish(ITestContext result) {					
	    
	        		System.out.println("The test is finised : " + result.getName());
	    }		

	    @Override		
	    public void onStart(ITestContext result) {					
	     			
	    	System.out.println("The test is started : " + result.getName());
	    }		

	    @Override		
	    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
	      		
	    }		

	    @Override		
	    public void onTestFailure(ITestResult arg0) {					
	         		
	    }		

	    @Override		
	    public void onTestSkipped(ITestResult arg0) {					
	         		
	    }		

	    @Override		
	    public void onTestStart(ITestResult result) {					
	    //	System.out.println("The test is started" + result.getName());
	    }		

	    @Override		
	    public void onTestSuccess(ITestResult arg0) {					
	        // TODO Auto-generated method stub				
	        		
	    }
}
