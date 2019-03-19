/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcertificateofdeposit;
import java.lang.Math;
/**
 *
 * @author Aaron
 */
public class CertificateOfDeposit {
    
    //attributes for certificates of deposit
    public double certificateNum;
    public String lastName;
    public double balance;
    public double issueDate;
    public double matureDate;
    
    //method that accepts user-input values and calculates the maturity date
    public double CertificateOfDeposit(double certNum, String lN, double bal, double issue){
        
        certificateNum = certNum;
        lastName = lN;
        balance = bal;
        issueDate = issue;
        
        double matureDate = Math.floor(++issue);
        return matureDate;
    }
    
    //set method for certificate ID
    public void setCartificate(double certNum){
        
        certificateNum = certNum;
    }
    
    //get method for certificate ID
    public double getCertificate(){
        
        return certificateNum;
    }
    
    //set method for last name
    public void setLastName(String lN){
        
        lastName = lN;
    }
    
    //get method for last name
    public String getLastName(){
        
        return lastName;
    }
    
    //set method for balance
    public void setBalance(double bal){
        
        balance = bal;
    }
    
    //get method for balance
    public double getBalance(){
        
        return balance;
    }
    
    //set method for issue date
    public void setIssue(double issue){
        
        issueDate = issue;
    }
    
    //get method for issue date
    public double getIssue(){
        
        return issueDate;
    }
    
    //set method for maturity date
    public void setMature(double mature){
        
        matureDate = mature;
    }
    
    //get method for maturity date
    public double getMature(){
        
        return matureDate;
    }
}
