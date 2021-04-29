package test;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(commons.ListnersClassExample.class)

public class ExampleCLass3_Exception {
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test in ExampleClass1");
		System.out.println();
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method in ExampleClass1");
	}

	@Test(expectedExceptions = IOException.class)
	public void testMethod31() throws IOException {
		System.out.println("Under testMethod31");
		throw new IOException();
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
}