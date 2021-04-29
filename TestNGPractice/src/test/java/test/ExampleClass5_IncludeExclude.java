package test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Listeners(commons.ListnersClassExample.class)

public class ExampleClass5_IncludeExclude {
	
	
	
	@BeforeTest
	public void beforeTest(){
		System.out.println("Before Test in ExampleClass5_IncludeExlude");
		System.out.println();
	}
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("Before Method in ExampleClass5_IncludeExlude");
	}
	
	@Test
	public void testMethod51() {
		System.out.println("Under testMethod51");
	}
	
	@Test
	public void testMethod52() {
		System.out.println("Under testMethod52");
	}
	
	@Test
	public void testMethod53() {
		System.out.println("Under testMethod53");
	}
	
	@Test
	public void testMethod54() {
		System.out.println("Under testMethod54");
	}
	
	@Test
	public void testMethod55() {
		System.out.println("Under testMethod55");
	}
	
	
	@AfterTest
	public void afterTest(){
		System.out.println("After Test in ExampleClass5_IncludeExlude");
		System.out.println();
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("After Method in ExampleClass5_IncludeExlude");
		System.out.println();
	}
}
