/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chairs;

/**
 *
 * @author Aaron
 */
public abstract class Chair {
    
    //generic data members for a chair
    protected int legs;
    protected String material;
    
    //chair constructor, using legs and material
    public Chair(int l, String m){
        
        legs = l;
        material = m;
    }
    
    //abstacrt method to be used by children
    public abstract void canRoll();
}
