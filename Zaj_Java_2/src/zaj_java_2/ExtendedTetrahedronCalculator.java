/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zaj_java_2;

/**
 *
 * @author mligeza6
 */
public class ExtendedTetrahedronCalculator extends TetrahedronCalculator implements ExtendedCalculator  {

    
    ExtendedTetrahedronCalculator(){}
    
    @Override
    public void CalculateArea(double r, double h) throws Exception {
        if(r<0)
        {
           throw new UnsupportedOperationException("Nieprawidlowe dane");
        }
        System.out.println("Pole tego czworoscianu = " + (r*r*Math.sqrt(3)));
    }

    @Override
    public void CalculateVolume(double r, double h) throws Exception {
         if(r<0)
        {
           throw new UnsupportedOperationException("Nieprawidlowe dane");
        }
        System.out.println("Objętość tego czworoscianu = " + (r*r*r*Math.sqrt(2)/12));
    }
    
}
