package commons;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnersClassExample implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println("#####ListnersClassExample - OnTestStart#####");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("#####ListnersClassExample - OnTestSuccess#####");
	}

	public void onTestFailure(ITestResult result) {
	}

	public void onTestSkipped(ITestResult result) {
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	public void onTestFailedWithTimeout(ITestResult result) {
	}

	public void onStart(ITestContext context) {
		System.out.println("#####ListnersClassExample - OnStart#####");
	}

	public void onFinish(ITestContext context) {
		System.out.println("#####ListnersClassExample - OnFinish#####");
	}

}
