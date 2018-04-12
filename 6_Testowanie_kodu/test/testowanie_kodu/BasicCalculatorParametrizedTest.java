/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testowanie_kodu;

import java.util.Arrays;
import java.util.Collection;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;


/**
 *
 * @author marci
 */
@RunWith(value = Parameterized.class)
public class BasicCalculatorParametrizedTest {
    
    @Parameter(value = 0)
    public double A;
    
    @Parameter(value = 1)
    public double B;
    
    @Parameter(value = 2)
    public double expected;
    
    
    
    @Parameters(name = "{index}: calculateSum({0},{1})= {2}")
    public static Collection<Double[]>data(){
        return Arrays.asList( new Double[][]{
            {-2.0,0.0,-2.0},
            {3.0,1.0,4.0},
            {12.0,5.0,17.0}
        });
    }
    
    @Test
    public void testCalculateSum(){
        assertThat(BasicCalculator.calculateSum(A, B), is(expected));
    }
}
