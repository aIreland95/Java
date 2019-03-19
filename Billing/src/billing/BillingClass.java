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
//Class BillingClass that contains all bill computing methods
public class BillingClass {
    
    double price;
    double quantity;
    double coupon;
    double total;
    
    //Method used when no parameters or values are specified
    public double computeBill(){
        price = 39.99;
        quantity = 3;
        coupon = 9.99;
        
        total = ((price * quantity) - coupon) * 1.08;
        return total;
    }
    
    //method using one parameter, bookPrice
    public double computeBill(double bookPrice){
        price = bookPrice;
        
        //calculates total price by multiplying bookPrice by 8% tax
        total = bookPrice * 1.08;
        return total;
    }
    
    //method using two parameters, bookPrice and bookQuantity
    public double computeBill(double bookPrice, double bookQuantity){
        price = bookPrice;
        quantity = bookQuantity;
        
        //calculates total price by multiplying bookPrice by bookQuantity, then multiplying by 8% tax
        total = (bookPrice * bookQuantity) * 1.08;
        return total;
    }
    
    //method using three parameters, bookPrice, bookQuantity, and bookCoupon
    public double computeBill(double bookPrice, double bookQuantity, double bookCoupon){
        price = bookPrice;
        quantity = bookQuantity;
        coupon = bookCoupon;
        
        //calculates total price by multiplying bookPrice by bookQuantity,
        //subtracting the bookCoupon value, then multiplying by 8% tax
        total = ((bookPrice * bookQuantity) - bookCoupon) * 1.08;
        return total;
    }
}
