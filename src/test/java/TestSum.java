package test.java;


import static org.junit.Assert.assertEquals;

import  org.junit.jupiter.api.Test;

import main.java.App;


public class TestSum {
	
	@Test
	public void testSum() {
		App app = new App();
		
		assertEquals(10 , app.sum(9, 1)); 
	}

}
