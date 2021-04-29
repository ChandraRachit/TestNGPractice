package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(commons.ListnersClassExample.class)

public class ExampleCLass2_Enabled {
	@BeforeTest
	public void beforeTest(){
		System.out.println("Before Test in ExampleClass2");
		System.out.println();
	}
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("Before Method in ExampleClass2");
	}
	
	
	@Test(enabled=false)
	public void testMethod21() {
		System.out.println("Under testMethod21");
	}
	
	@Test(enabled=true)
	public void testMethod22() {
		System.out.println("Under testMethod22");
	}
	
	@Test
	public void testMethod23() {
		System.out.println("Under testMethod23");
	}
	
	
	

	@AfterTest
	public void afterTest(){
		System.out.println("After Test in ExampleClass2");
		System.out.println();
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("After Method in ExampleClass2");
		System.out.println();
	}
}
