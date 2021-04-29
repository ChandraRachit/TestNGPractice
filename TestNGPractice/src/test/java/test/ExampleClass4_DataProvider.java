package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(commons.ListnersClassExample.class)

public class ExampleClass4_DataProvider {
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test in ExampleClass1");
		System.out.println();
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method in ExampleClass1");
	}

	@Test(dataProvider="data")
	public void testMethod17(int a,int b) {
		System.out.println("Under testMethod41");
		System.out.println("a="+a+" b="+b);
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test in ExampleClass1");
		System.out.println();
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method in ExampleClass1");
		System.out.println();
	}
	
	@DataProvider(name="data")
	public Object[][] getData(){
		Object[][] obj=new Object[3][2];
		obj[0][0]=1;
		obj[0][1]=2;
		obj[1][0]=3;
		obj[1][1]=4;
		obj[2][0]=5;
		obj[2][1]=6;
		return obj;
	}
}
