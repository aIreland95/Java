/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle_class_example;

import java.util.*; //import for the Scanner utility
import javax.swing.*; //import for 

/**
 *
 * @author Aaron
 */
public class Circle_class_example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("Please, enter a radius of your circle");
        //Scanner scan = new Scanner(System.in);
        //double rad = scan.nextDouble();
        String rad = JOptionPane.showInputDialog(null, "Enter the radius");
        //double radius = Double.parseDouble(rad);
        double radius = Double.parseDouble(rad);
        Circle circle = new Circle(radius);
        //System.out.println(circle.getArea());
        JOptionPane.showMessageDialog(null, "The Area is " + circle.getArea());
        
    }
    
}
