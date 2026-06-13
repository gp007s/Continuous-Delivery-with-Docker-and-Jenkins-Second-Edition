package com.leszko.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorControllerTest {

    @Autowired
    private CalculatorController calculatorController;

    @Test
    public void testSum() {
        assertEquals("10", calculatorController.sum(7, 3));
    }
}
