/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billing;

/**
 *
 * @author Aaron
 */
public class Billing {

    //Aaron Ireland
    //March 28, 2018
    //Java - Billing Exercise 
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creates a new object from the BillingClass class
        BillingClass bill = new BillingClass();
        
        //System.out.printlns for each method, based on the number of parameters they use
        System.out.println("Test 1 book pricing - $" + bill.computeBill());
        System.out.println("\nWhen one book is $19.99 - $" + bill.computeBill(19.99));
        System.out.println("\nWhen 4 books are $19.99$" + bill.computeBill(19.99, 4));
        System.out.println("\nWhen 4 books are $19.99 with a $5.99 coupon - $" + bill.computeBill(19.99, 4, 5.99));
    }
    
}
