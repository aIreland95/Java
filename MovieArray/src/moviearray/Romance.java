/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviearray;

/**
 *
 * @author Aaron
 */
public class Romance extends Movie{
    
    protected final String TYPE = "Romance";
    
    //constructor for Romance movies
    public Romance(String t, String r){
        
        super(t, r);
        setPrice();
    }
    
    //setPrice method
    public void setPrice(){
        
        price = 17.99;
    }
}
