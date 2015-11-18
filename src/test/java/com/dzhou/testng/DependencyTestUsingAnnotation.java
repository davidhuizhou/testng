package com.dzhou.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTestUsingAnnotation {
	String message = "Manisha";
	MessageUtil messageUtil = new MessageUtil(message);

	@Test
	public void testPrintMessage() {
		System.out.println("Inside testPrintMessage()");
		message = "Manisha";
		Assert.assertEquals(message, messageUtil.echoMessage());
	}

	@Test(dependsOnMethods = { "initEnvironmentTest" })
	public void testSayHi() {
		System.out.println("Inside testSalutationMessage()");
		message = "Hi!" + "Manisha";
		Assert.assertEquals(message, messageUtil.sayHi());
	}

	@Test
	public void initEnvironmentTest() {
		System.out.println("This is initEnvironmentTest");
	}
}
