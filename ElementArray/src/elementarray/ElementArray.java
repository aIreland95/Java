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
public class ElementArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Aaron Ireland
        //April 24, 2018
        //ElementArray Exercise
        
        //creates a new rray of elements, able to hold 4 objects
        Element[] table = new Element[4];
        
        //new objects placed into table array
        table[0] = new MetalElement("Co", 27, 58.933195);
        table[1] = new MetalElement("Ti", 22, 47.867);
        table[2] = new NonMetalElement("N", 7, 14.0067);
        table[3] = new NonMetalElement("Ar", 18, 39.948);
        
        //for loop that describes each element within the array
        for(int i = 0; i < 5; i++){
            
            table[i].describeElement();
        }
    }
}