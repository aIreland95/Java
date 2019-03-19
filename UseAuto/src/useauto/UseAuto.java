/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package useauto;

/**
 *
 * @author Aaron
 */
public class UseAuto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Aaron Ireland
        //Aprill 24, 2018
        //In Class Inheritance
        
        //four new auto objects, two ford, two chevy
        Ford fusion = new Ford("Ford Fusion");
        Ford focus = new Ford("Ford Focus");
        Chevy malibu = new Chevy("Chevrolet Malibu");
        Chevy cruze = new Chevy("Chevrolet Cruze");
        
        //calls display methods for each auto
        fusion.display();
        focus.display();
        malibu.display();
        cruze.display();
    }
    
}
