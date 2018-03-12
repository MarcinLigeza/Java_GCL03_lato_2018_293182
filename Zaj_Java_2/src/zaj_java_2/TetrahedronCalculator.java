
package zaj_java_2;

import java.util.Scanner;

public class TetrahedronCalculator implements Calculator {

    Scanner scanner = new Scanner(System.in);
    
    public double a;
    
    TetrahedronCalculator() {
        a = 0.0;
    }
    
    @Override
    public double calculateBaseArea() {
        //double a;
        System.out.print("Podaj długośc boku podstawy: ");
        a = scanner.nextDouble();
        
        double base = (a * Math.sqrt(3)/2);
        System.out.print("Pole podstawy równa się: " + base);
        return base;
    }

    @Override
    public double calculateBasePerimeter() 
    {
        //double a;
        System.out.print("Podaj długośc boku podstawy: ");
        a = scanner.nextDouble();
        
        double perimeter = (a * 3);
        System.out.print("Pole podstawy równa się: " + perimeter);
        return perimeter;   
    }
    
}
