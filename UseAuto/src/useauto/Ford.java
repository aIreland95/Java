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
public class Ford extends Auto {
    
    //constructor for Ford, calls super first
    public Ford(String make){
        
        super(make);
        setPrice();
    }
    
    //setPrice required for child
    public void setPrice(){
        
        price = 20000;
    }
}
