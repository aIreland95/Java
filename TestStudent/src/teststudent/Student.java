/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teststudent;

/**
 *
 * @author Aaron
 */
public class Student {
    
    //attributes for the student class, includes NameAndAddress as an object
    private int studentID;
    private double GPA;
    private String major;
    private NameAndAddress nameAddress;
    
    //constructor for Student class
    public Student(int studID, double gradePoint, String collegeMajor, 
            String fName, String lName, String streetName, 
            String cityName, int zipCode){
        
        studentID = studID;
        GPA = gradePoint;
        major = collegeMajor;
        nameAddress = new NameAndAddress(fName, lName, streetName,
                cityName, zipCode);
    }
    
    //display method that calls NameAndAddress display method, outputs all info
    public void display(){
        
        nameAddress.display();
        System.out.println("Student ID: " + studentID);
        System.out.println("GPA: " + GPA);
        System.out.println("Major: " + major);
    }
}
