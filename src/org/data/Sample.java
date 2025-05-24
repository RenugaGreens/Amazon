package org.data;

import org.testng.annotations.Test;

public class Sample {

	@Test(priority = 30)
	private void tc1() {

		System.out.println("Test-1");
	}

	@Test(priority = -45,invocationCount = 3)
	private void tc2() {

		System.out.println("Test-2");
	}
    
	@Test(priority = 24,enabled = false)
	private void tc3() {

		System.out.println("Test-3");
	}

	@Test(priority = -30)
	private void tc4() {

		System.out.println("Test-4");
	}

	@Test(priority = 20)
	private void tc5() {

		System.out.println("Test-5");
	}

}
