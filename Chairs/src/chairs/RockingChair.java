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
public class RockingChair extends Chair{
    
    //data members of rocking chairs only
    protected int curves;
    
    //rocking chair constructor
    public RockingChair(int l, String m, int c){
        
        super(l, m);
        curves = c;
    }
   //canRoll method for rocking chairs
    public void canRoll(){
        
        System.out.println("Rocking Chair:\nLegs - " + legs + "\nMaterial - " + 
                material + "\nCurves - " + curves + "\nThis chair rolls "
                + "in place on it's curves...or rocks in place\n");
    }
}
