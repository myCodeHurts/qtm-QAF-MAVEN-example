package com.testheadlessmaven;

import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;

public class TestSample {
	@Test(groups = {"testEntityKey=SAM-TC-1" })
	public void sample() {
		PhantomJSDriver driver = new PhantomJSDriver();
		driver.get("http://www.infostretch.com");
	}
}
