/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcertificateofdeposit;
import java.util.Scanner;
/**
 *
 * @author Aaron
 */
public class TestCertificateOfDeposit {

    /** 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Aaron Ireland
        //April 4, 2018
        //Java - Exercise 10
        
        //declares two CertificateOfDeposit objects and a scanner
        CertificateOfDeposit test1 = new CertificateOfDeposit();
        CertificateOfDeposit test2 = new CertificateOfDeposit();
        Scanner cert = new Scanner(System.in);
        
        //prompt for test1 certificate ID
        System.out.println("Please enter your first certificate ID: ");
        double certificateNum = cert.nextDouble();
        
        //prompt for test1 lastName
        System.out.println("Please enter your last name: ");
        String lastName = cert.next();
        
        //prompt for test1 balance
        System.out.println("Please enter the balance of your certificate: ");
        double balance = cert.nextDouble();
        
        //prompt for test1 issue date
        System.out.println("Now, plese enter the year that your certificate was issued: ");
        double issueDate = cert.nextDouble();
        
        //test1 printout
        System.out.println("Your certificate's maturity year will be: " + 
                test1.CertificateOfDeposit(certificateNum, lastName, balance, issueDate));
        
        //prompt for test2 certificate ID
        System.out.println("Please enter your first certificate ID: ");
        certificateNum = cert.nextDouble();
        
        //prompt for test2 lastName
        System.out.println("Please enter your last name: ");
        lastName = cert.next();
        
        //prompt for test2 balance
        System.out.println("Please enter the balance of your certificate: ");
        balance = cert.nextDouble();
        
        //prompt for test2 issue date
        System.out.println("Now, plese enter the year that your certificate was issued: ");
        issueDate = cert.nextDouble();
        
        //test2 printout
        System.out.println("Your certificate's maturity year will be: " + 
                test2.CertificateOfDeposit(certificateNum, lastName, balance, issueDate));
    }
}
