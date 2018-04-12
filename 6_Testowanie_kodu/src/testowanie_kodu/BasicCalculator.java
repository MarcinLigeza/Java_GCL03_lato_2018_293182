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
public class BasicCalculator {
    public static double calculateSum(double a, double b){
        return a+b;
    }

    public static double calculateDifference(double a, double b){
        return a-b;
    }

    public static double calculateMultiplication(double a, double b){
        return a*b;
    }

    public static double calculateDivision(double a, double b) throws IllegalArgumentException {
        if(b==0)
            throw new IllegalArgumentException("Nie można dzielić przez 0");
        else
            return a/b;
    }

    public static double calculatePow(double a, double b){
        return Math.pow(a,b);
    }

    public static double calculateSqlr(double a) throws IllegalArgumentException{
        if(a<0)
            throw new IllegalArgumentException("Nie można pierwiastkować liczb mniejszych od 0");
        else
            return Math.sqrt(a);
    }
}
