

package zaj_java_2;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Zaj_Java_2 {

    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        
        double r;
        double l;
        
        Menu();
        choice = scanner.nextInt();
       // ConeCalculator cone = new ConeCalculator();
        ExtendedTetrahedronCalculator tetra = new ExtendedTetrahedronCalculator();
        
        ExtendedConeCalculator cone = new ExtendedConeCalculator();
        
        switch(choice)
        {
            case 1:
                cone.calculateBaseArea();
                break;
            case 2:
                cone.calculateBasePerimeter();
                break;
            case 3:
                tetra.calculateBaseArea();
                break;
            case 4:
                tetra.calculateBasePerimeter();
                break;
            case 5:
                System.out.print("Podaj promień: ");
                r = scanner.nextDouble();
                System.out.print("Podaj długość tworzącej: ");
                l = scanner.nextDouble();
                {
                    try {
                        cone.CalculateArea(r, l);
                    } catch (Exception ex) {
                        Logger.getLogger(Zaj_Java_2.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
                
            case 6:
                
                System.out.print("Podaj promień: ");
                r = scanner.nextDouble();
                System.out.print("Podaj wysokosc: ");
                l = scanner.nextDouble();
                {
                    try {
                        cone.CalculateVolume(r, l);
                    } catch (Exception ex) {
                        Logger.getLogger(Zaj_Java_2.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
            
            case 7:
                System.out.print("Podaj dlugosc boku: ");
                r = scanner.nextDouble();
                l = 0.0;
                {
                    try {
                        tetra.CalculateArea(r, l);
                    } catch (Exception ex) {
                        Logger.getLogger(Zaj_Java_2.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
            case 8:
                System.out.print("Podaj dlugosc boku: ");
                r = scanner.nextDouble();
                l = 0.0;
                {
                    try {
                        tetra.CalculateVolume(r, l);
                    } catch (Exception ex) {
                        Logger.getLogger(Zaj_Java_2.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
            default:
                System.out.println("Nie ma takiej opcji");
        }
        
        
    }
    
    
    public static void Menu()
    {
        System.out.print("Wybierz opcje:\n"
                + "1 - Cone - base area\n"
                + "2 - Cone - base perimeter\n"
                + "3 - Tetrahedron - base area\n"
                + "4 - Tetrahedron - base perimeter\n"
                + "5 - Cone - Area\n"
                + "6 - Cone - Volume\n"
                + "7 - Tetrahedron - Area\n"
                + "8 - Tetrahedron - Volume\n");
        
    }
}
