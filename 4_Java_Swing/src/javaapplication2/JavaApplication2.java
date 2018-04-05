/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import javax.swing.JFrame;
/**
 *
 * @author mligeza6
 */
public class JavaApplication2 extends JFrame{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GUISwing frame = new GUISwing();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
