/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathtest;
import java.lang.Math;
/**
 *
 * @author Aaron
 */
public class MathCalc {
    
    //declarations for every variable that is passed through calculations
    public double squareRoot;
    public double sineValue;
    public double rounding;
    public char character;
    public int largeSmall;
    public int max;
    public int min;
    
    //constructor with parameters that calculates and prints out each value
    public MathCalc(double sR, double sV, double r, char chara, int lS, int mx, int mn){
        
        //display/calculation for square root of 37
        squareRoot = sR;
        System.out.println("Square root of 37 is: " + Math.sqrt(sR));
        
        //display/calculations for the sine and cosine of 300
        sineValue = sV;
        System.out.println("\nSine of 300 is: " + Math.sin(sV));
        System.out.println("\nCosine of 300 is: " + Math.cos(sV));
        
        //displays/claculations for the floor, ceiling, and rounding of 22.8
        rounding = r;
        System.out.println("\nFloor value of 22.8 is: " + Math.floor(r));
        r = 22.8;
        System.out.println("\nCeiling value of 22.8 is: " + Math.ceil(r));
        r = 22.8;
        System.out.println("\n Rounding 22.8 results in: " + Math.round(r));
        
        //display/calculation for larger and smaller of character D and int 71
        character = chara;
        largeSmall = lS;
        System.out.println("\nThe larger of D and 71 is: " + Math.max(chara, lS));
        System.out.println("\nThe smaller of D and 71 is " + Math.min(chara, lS));
        
        //display/calculation for a random number between 0 and 20
        max = mx;
        min = mn;
        System.out.println("\nRandom number between 0 an 20: " + Math.round(Math.random() * (mx - mn) + mn) + "\n\n");
    }
}
