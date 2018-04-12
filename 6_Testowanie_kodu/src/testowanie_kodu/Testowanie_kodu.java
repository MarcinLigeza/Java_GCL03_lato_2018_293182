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


import java.util.Scanner;

import static testowanie_kodu.BasicCalculator.*;
import static testowanie_kodu.FieldCalculator.*;

public class Testowanie_kodu {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double a;
        double b;

        System.out.print("Podaj pierwszą liczbę: ");
        a = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Podaj druga liczbę: ");
        b = scanner.nextDouble();
        scanner.nextLine();


        System.out.println("suma \t" + calculateSum(a,b));
        System.out.println("różnica \t" + calculateDifference(a,b));
        System.out.println("mnożenie \t" + calculateMultiplication(a,b));
        System.out.println("dzielenie \t" + calculateDivision(a,b));
        System.out.println("potęgowanie \t" + calculatePow(a,b));
        System.out.println("pierwiastek \t" + calculateSqlr(a));
        System.out.println("");
        System.out.println("kwadrat \t" + calculateSquare(a));
        System.out.println("koło \t" + calculateCircle(a));
        System.out.println("trójkąt \t" + calculateTriangle(a,b));
        System.out.println("prostokąt \t" + calculateRectangle(a,b));

    }
    
}
