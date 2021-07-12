package com.csw.hellojenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HelloJenkinsTest {

	@Test
	public void sayHelloJenkinsTest() {
		HelloJenkins helloJenkins = new HelloJenkins();
		assertEquals("Hello Jenkins", helloJenkins.sayHelloJenkins());
	}
}
