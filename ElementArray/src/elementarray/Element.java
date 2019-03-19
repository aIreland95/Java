/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elementarray;

/**
 *
 * @author Aaron
 */
//abstract base class
public abstract class Element {
    
    //attributes for element, including the symbol, number, and weight
    protected String symbol;
    protected int number;
    protected double weight;
    
    //constructor for all attributes of element
    public Element(String s, int n, double w){
        
        symbol = s;
        number = n;
        weight = w;
    }
    
    //get methods for each attribute
    public String getSymbol(){
        return symbol;
    }
    public int getNumber(){
        return number;
    }
    public double getWeight(){
        return weight;
    }
    
    //abstract method, must be used by child classes
    public abstract void describeElement();
}