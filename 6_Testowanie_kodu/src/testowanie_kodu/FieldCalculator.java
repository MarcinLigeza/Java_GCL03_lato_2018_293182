/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testowanie_kodu;

/**
 *
 * @author marci
 */
public class FieldCalculator {
    public static double calculateSquare(double a) throws IllegalArgumentException {
        if(!(a>0))
            throw new IllegalArgumentException("Długość boku kwadratu musi być większa od 0.");
        else
            return a*a;
    }

    public static double calculateCircle(double r) throws IllegalArgumentException
    {
        if(!(r>0))
            throw new IllegalArgumentException("Długość promienia okręgu musi być większa od 0.");
        else
            return r*r*Math.PI;
    }

    public static double calculateTriangle(double a, double h)throws IllegalArgumentException{
        if((a<=0)||(h<=0))
            throw new IllegalArgumentException("Długość podstawy i wysokość muszą być większe od 0.");
        else
            return a*h/2;
    }

    public static double calculateRectangle(double a, double b) throws IllegalArgumentException{
        if((a<=0)||(b<=0))
            throw new IllegalArgumentException("Długości boków muszą być większe od 0.");
        else
            return a*b;
    }
}
