/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testowanie_kodu;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marci
 */
public class FieldCalculatorTest {
    
    public FieldCalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Rozpoczęcie testów");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Zakończenie testów");
    }
    
    @Before
    public void setUp() {
        System.out.println("Test rozpoczyna się");
    }
    
    @After
    public void tearDown() {
        System.out.println("Test kończy się");
    }

    /**
     * Test of calculateSquare method, of class FieldCalculator.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testCalculateSquare() {
        System.out.println("calculateSquare");
        double a = 0.0;
        double expResult = 0.0;
        double result = FieldCalculator.calculateSquare(a);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testCalculateSquare1() {
        System.out.println("calculateSquare");
        double a = 4.0;
        double expResult = 16.0;
        double result = FieldCalculator.calculateSquare(a);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }


    /**
     * Test of calculateCircle method, of class FieldCalculator.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testCalculateCircle() {
        System.out.println("calculateCircle");
        double r = 0.0;
        double expResult = 0.0;
        double result = FieldCalculator.calculateCircle(r);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateTriangle method, of class FieldCalculator.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testCalculateTriangle() {
        System.out.println("calculateTriangle");
        double a = 0.0;
        double h = 0.0;
        double expResult = 0.0;
        double result = FieldCalculator.calculateTriangle(a, h);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateRectangle method, of class FieldCalculator.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testCalculateRectangle() {
        System.out.println("calculateRectangle");
        double a = 0.0;
        double b = 0.0;
        double expResult = 0.0;
        double result = FieldCalculator.calculateRectangle(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
