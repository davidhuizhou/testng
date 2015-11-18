package com.dzhou.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupTestExample {
	String message = ".com";
	MessageUtil messageUtil;

	@Test(groups = { "functest", "checkintest" }, expectedExceptions = ArithmeticException.class)
	public void testPrintMessage() {
		System.out.println("Inside testPrintMessage()");
		message = ".com";
		messageUtil = new MessageUtil(message);
		Assert.assertEquals(message, messageUtil.printMessage());
	}

	@Test(groups = { "checkintest" })
	public void testSalutationMessage() {
		System.out.println("Inside testSalutationMessage()");
		message = "tutorialspoint" + ".com";
		messageUtil = new MessageUtil(message);
		Assert.assertEquals("tutorialspoint" + message, messageUtil.salutationMessage());
	}

	@Test(groups = { "functest" })
	public void testingExitMessage() {
		System.out.println("Inside testExitMessage()");
		message = "tutorialspoint" + ".com";
		messageUtil = new MessageUtil(message);
		Assert.assertEquals("www." + message, messageUtil.exitMessage());
	}
}
