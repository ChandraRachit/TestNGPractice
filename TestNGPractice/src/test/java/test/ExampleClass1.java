package test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Listeners(commons.ListnersClassExample.class)

public class ExampleClass1 {
	
	
	
	@BeforeTest
	public void beforeTest(){
		System.out.println("Before Test in ExampleClass1");
		System.out.println();
	}
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("Before Method in ExampleClass1");
	}
	
	@Test(priority=6)
	public void testMethod11() {
		System.out.println("Under testMethod11");
	}
	
	@Test
	public void testMethod12() {
		System.out.println("Under testMethod12");
	}
	
	@Test
	public void testMethod13() {
		System.out.println("Under testMethod13");
	}
	
	@Test
	public void testMethod14() {
		System.out.println("Under testMethod14");
	}
	
	@Test(priority=5)
	public void testMethod15() {
		System.out.println("Under testMethod15");
	}
	
	@Test(priority=4)
	public void testMethod16() {
		System.out.println("Under testMethod16");
	}
	
	@Test(priority=3,dependsOnMethods="testMethod19")
	public void testMethod17() {
		System.out.println("Under testMethod17");
	}
	
	@Test(priority=2)
	@Parameters("Browser")
	public void testMethod18(String Browser) {
		System.out.println("Under testMethod18 and Browser = "+Browser);
	}
	
	@Test(priority=1,timeOut=1000)
	public void testMethod19() {
		try {
			Thread.sleep(10000);//Forcefully delaying to verify timeOut
		} catch (InterruptedException e) {
		}
		System.out.println("Under testMethod19");
	}
	
	@AfterTest
	public void afterTest(){
		System.out.println("After Test in ExampleClass1");
		System.out.println();
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("After Method in ExampleClass1");
		System.out.println();
	}
}
