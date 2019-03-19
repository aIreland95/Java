/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teststate;

/**
 *
 * @author Aaron
 */
public class TestState { 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Aaron Ireland
        //April 5, 2018
        //Java - State Composition
        
        //declares three new objects that accept parameters for citiy names, populations, and the state name
        State PA = new State("Philadelphia", 1567442, "Harrisburg", 49081, "Pennsylvania", 12802503);
        State NC = new State("Charlotte", 827097, "Raleigh", 451066, "North Carolina", 10273419);
        State KY = new State("Louisville", 1269702, "Frankfort", 27885, "Kentucky", 4213497);
        
//        System.out.println("Name: " + PA.getName() + "\nPopulation: " + PA.getPopulation());
//        System.out.println("Name: " + PA.getCapName() + "\nPopulation: " + PA.getCapPop());
//        System.out.println("Name: " + PA.getPopName() + "\nPopulation: " + PA.getPopPop());
        
//        calls display methods for each state object
        PA.display();
        NC.display();
        KY.display();
    }
    
}
