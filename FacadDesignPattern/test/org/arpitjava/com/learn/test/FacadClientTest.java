package org.arpitjava.com.learn.test;

import static org.junit.jupiter.api.Assertions.*;

import org.arpitjava.com.learn.FacadClient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FacadClientTest {

	FacadClient client;
	
	@BeforeEach
	void setUp() throws Exception {
		client = new FacadClient();
	}

	@Test
	void testIPhoneBuildWithNotNull() {
		String result = "build on top of IOS 11";
		assertEquals(result,client.buildIPhone());
	}
	
	@Test
	void testIPhoneBuildWithNull(){
		String result = null;
		assertEquals(result,client.buildIPhone());
	}
}
