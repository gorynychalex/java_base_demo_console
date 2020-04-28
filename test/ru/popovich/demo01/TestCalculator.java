package ru.popovich.demo01;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestCalculator { 

	@Test 
	public void evaluatesExpression() { 
		Calculator calculator = new Calculator(); 
		int sum = calculator.add(3,4); 
		assertEquals(7, sum); 
	}
}
