/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demohorses;

/**
 *
 * @author Aaron
 */
//child class of Horse
public class RaceHorse extends Horse{
    
    //attribute specifically for RaceHorse, other attributes inherited from Horse
    protected int races;
    
    //constructor for RaceHorse, calls superclass for attributes
    public RaceHorse(String horseName, String horseColor, int horseBirth, int horseRaces){
        
        super(horseName, horseColor, horseBirth);
        races = horseRaces;
    }
    
    //display method for RaceHorse, calls superclass display method
    public void display(){
        
        super.display();
        System.out.println("This horse has competed in " + races + " races");
    }
}
