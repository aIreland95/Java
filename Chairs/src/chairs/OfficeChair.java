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
public class OfficeChair extends Chair{
    
    //data member of office chairs only
    protected int wheels;
    
    //office chair constrcutor
    public OfficeChair(int l, String m, int w){
        
        super(l, m);
        wheels = w;
    }
    
    //canRoll method for office chairs
    public void canRoll(){
        
        System.out.println("Office Chair:\nLegs - " + legs + "\nMaterial - " + 
                material + "\nWheels - " + wheels + "\nThis chair rolls "
                + "around on it's wheels\n");
    }
}
