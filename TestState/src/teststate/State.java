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
public class State {
    
    //attributes for State class, including state name, state population, 
    //and composition for capital and high population city
    private String stateName;
    private int statePop;
    private City highPop;
    private City capital;
    
    //constructor that sets names of each city, population, sate name, and state population
    public State(String hName, int hPop, String capName, int capPop, String sName, int sPop){
        
        highPop = new City(hName, hPop);
        capital = new City(capName, capPop);
        stateName = sName;
        statePop = sPop;
    }
        //method for displaying each attribute of information
        public void display(){
            
            System.out.println("\n\nHigh Population City");
            highPop.display();
            System.out.println("Capital City");
            capital.display();
            System.out.print("State Name: " + stateName + "\nState Population: " + statePop + "\n------------");
        }
    /*public String getName(){
        return stateName;
        }
        
        public int getPopulation(){
        return statePop;
        }
        
        public String getCapName(){
        return capital.getName();
        }
        
        public int getCapPop(){
        return capital.getPopulation();
        }
        
        public String getPopName(){
        return highPop.getName();
        }
        
        public int getPopPop();{
        return highPop.getPopulation();
        }
*/}
