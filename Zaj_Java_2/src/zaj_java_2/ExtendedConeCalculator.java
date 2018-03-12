
package zaj_java_2;

public class ExtendedConeCalculator extends ConeCalculator implements ExtendedCalculator {

    ExtendedConeCalculator () {}
    
    @Override
    public void CalculateArea(double r, double l) throws Exception {
        if(r<0 || l< 0)
        {
           throw new UnsupportedOperationException("Nieprawidlowe dane");
        }
        System.out.println("Pole tego stozka = " + (Math.PI*r*r + Math.PI*r*l));
    }
    @Override
    public void CalculateVolume(double r, double h) throws Exception {
        if(r<0 || h< 0)
        {
           throw new UnsupportedOperationException("Nieprawidlowe dane");
        }
        System.out.println("Pole tego stozka = " + (Math.PI*r*r*h/3));
        
    }    
    
}
