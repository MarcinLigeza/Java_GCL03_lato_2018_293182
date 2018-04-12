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
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author marci
 */
public class BasicCalculatorTest {
    
    public BasicCalculatorTest() {
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
     * Test of calculateSum method, of class BasicCalculator.
     */
    @Test
    public void testCalculateSum() {
        System.out.println("calculateSum");
        double a = 0.0;
        double b = 0.0;
        double expResult = 0.0;
        double result = BasicCalculator.calculateSum(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testCalculateSum1() {
        System.out.println("calculateSum");
        double a = 7.0;
        double b = 3.0;
        double expResult = 10.0;
        double result = BasicCalculator.calculateSum(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testCalculateSum2() {
        System.out.println("calculateSum");
        double a = 8.2;
        double b = 4.0;
        double expResult = 12.2;
        double result = BasicCalculator.calculateSum(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    
   

    /**
     * Test of calculateDifference method, of class BasicCalculator.
     */
    @Test
    public void testCalculateDifference() {
        System.out.println("calculateDifference");
        double a = 0.0;
        double b = 0.0;
        double expResult = 0.0;
        double result = BasicCalculator.calculateDifference(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of calculateMultiplication method, of class BasicCalculator.
     */
    @Test
    public void testCalculateMultiplication() {
        System.out.println("calculateMultiplication");
        double a = 0.0;
        double b = 0.0;
        double expResult = 0.0;
        double result = BasicCalculator.calculateMultiplication(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of calculateDivision method, of class BasicCalculator.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testCalculateDivision() {
        System.out.println("calculateDivision");
        double a = 0.0;
        double b = 0.0;
        double expResult = 0.0;
        double result = BasicCalculator.calculateDivision(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of calculatePow method, of class BasicCalculator.
     */
    @Test
    public void testCalculatePow() {
        System.out.println("calculatePow");
        double a = 0.0;
        double b = 0.0;
        double expResult = 1.0;
        double result = BasicCalculator.calculatePow(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of calculateSqlr method, of class BasicCalculator.
     */
    @Test
    public void testCalculateSqlr() {
        System.out.println("calculateSqlr");
        double a = 0.0;
        double expResult = 0.0;
        double result = BasicCalculator.calculateSqlr(a);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.

    }
    
}
