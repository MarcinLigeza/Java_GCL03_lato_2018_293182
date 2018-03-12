
package zaj_java_2;

import java.util.Scanner;
import java.lang.Math;

public class ConeCalculator implements Calculator{
    
    Scanner scanner = new Scanner(System.in);
    
    private double r;
    //private double h;
    
    ConeCalculator(){
        r = 0.0;
        //h = 0.0;
    }
            
    
    @Override
    public double calculateBaseArea()
    {
        //double r;
        System.out.print("Podaj promień: ");
        r = scanner.nextDouble();
        //double h;
        double base = Math.PI * r * r;
        System.out.println("Pole podstawy tego stożka = " + base);
        
        return base;
    }

    @Override
    public double calculateBasePerimeter() 
    {
        //double r;
        System.out.print("Podaj promień: ");
        r = scanner.nextDouble();
        
        double perimeter = Math.PI * 2 * r;
        System.out.println("Obwod podstawy tego stożka = " + perimeter);

        return perimeter;
    }
}
