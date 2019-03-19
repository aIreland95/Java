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
//derived class
public class Chevy extends Auto {
    
    //constructor for Chevy class, calling super first
    public Chevy(String make){
        
        super(make);
        setPrice();
    }
    
    //setPrice method required for child
    public void setPrice(){
        
        price = 22500;
    }
}
