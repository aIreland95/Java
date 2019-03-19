/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elementarray;

/**
 *
 * @author Aaron
 */
//derived class
public class MetalElement extends Element {
    
    //constructor for metal element
    public MetalElement(String symbol, int number, double weight){
        
        super(symbol, number, weight);
    }
    
    //method for describeElement, required
    public void describeElement(){
        
        System.out.println("Element: " + symbol + "\nNumber: " + number +
                "\nWeight: " + weight + "\nThis element is a good conductor "
                + "of electricity\n");
    }
}