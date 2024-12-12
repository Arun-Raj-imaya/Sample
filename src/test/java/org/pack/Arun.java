package org.pack;

import org.testng.annotations.Test;

public class Arun {
	@Test(priority=-6)
	private void bus() {
		System.out.println("orange");

	}
	@Test(priority=-7)
private void car() {
	System.out.println("kia");

}
	@Test(priority=-8)
	private void bike() {
		System.out.println("ktm");

	}

}
