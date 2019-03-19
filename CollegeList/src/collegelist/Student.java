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
public class Student extends Person {
    
    //attributes for students, including major and gpa
    protected String major;
    protected double gradePA;
    
    public void setMajor(String m){
        this.major = m;
    }
    public String getMajor(){
        return major;
    }
    
    public void setGPA(double gpa){
        this.gradePA = gpa;
    }
    public double getGPA(){
        return gradePA;
    }
}
