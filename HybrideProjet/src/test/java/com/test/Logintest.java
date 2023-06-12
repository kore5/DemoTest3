package com.test;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeSuite;

import com.base.Baseclass;

public class Logintest extends Baseclass {

	@BeforeSuite
	public void setup() throws Exception {

		initialization();
		reportInit();

	}

	@Test
	public void test01() {
		Assert.assertEquals(driver.getTitle(), "123");

	}

	@Test
	public void test02() {
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Log in");

	}

	@Test
	public void test03() {
		throw new SkipException("skiping a test");
	}
}