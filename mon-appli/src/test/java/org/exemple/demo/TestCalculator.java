package org.exemple.demo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.exemple.demo.Calculator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class TestCalculator {
	
	private Calculator cal;
	
	Calculator service = Mockito.mock(Calculator.class);

	@Before
	public void setUp() {
		cal = new Calculator();
	}
	
	@After
	public void tearDown() {
		cal = null;
	}
	
	@Test
	public void testAdd() {
		assertEquals(5, cal.add(3, 2));
		when(service.add(4,  8)).thenReturn(5);
		assertEquals(5, service.add(4, 8));
		verify(service).add(4,8);
	}
}
