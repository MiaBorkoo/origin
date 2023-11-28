package com.example.calculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Calculatortest {
    @Test 
    public void testAdd(){
        assertEquals(13, Calculator.add(4, 9));

    }
    
}
