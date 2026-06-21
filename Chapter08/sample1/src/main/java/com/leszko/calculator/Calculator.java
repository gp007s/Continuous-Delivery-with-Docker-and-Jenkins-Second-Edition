package com.leszko.calculator;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
/**
 * Calculator service that performs basic arithmetic operations.
 */
@Service
public class Calculator {
        final static int umlNUMBER1 = 3;
	@Cacheable("sum")
	public int sum(int a, int b) {
        // Adding a comment to test java changeset conditional - Week 5
		return a + b;
	}
}
