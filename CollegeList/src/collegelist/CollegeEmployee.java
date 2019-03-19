/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collegelist;

/**
 *
 * @author Aaron
 */
//derived class from Person
public class CollegeEmployee extends Person {
    
    //college employee attributes, social security, annual salary, and department
    protected double socialSec;
    protected double annualSal;
    protected String department;
   
    //set/get for social security
   public void setSocial(double ss){
       this.socialSec = ss;
   }
   public double getSocial(){
       return socialSec;
   }
   
   //set/get for annual salary
   public void setAnnual(double as){
       this.annualSal = as;
   }
   public double getAnnual(){
       return annualSal;
   }
   
   //set/get for department
   public void setDepartment(String d){
       this.department = d;
   }
   public String getDepartment(){
       return department;
   }
}
