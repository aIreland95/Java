/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createbuilding;

/**
 *
 * @author Aaron
 */
public abstract class building {
    
    protected double footage;
    protected int stories;
    
    //building constructor
    public building(double f, int s){
        
        footage = f;
        stories = s;
    }
    
    //get methods for footage and stories
    public double getFootage(){
        return footage;
    }
    public int getStories(){
        return stories;
    }
    
    //abstract method for display method, Blueprint
    public abstract void Blueprint();
}

