/*
 * To change this license header, choose License Headers in Project Properties
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teststudent;

/**
 *
 * @author Aaron
 */
public class TestStudent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Aaron Ireland
        //April 10, 2018
        //Java CLass Exam - Essay 1.
        
        //new student object with 8 values passed through
        Student Fred = new Student(3856, 3.7, "Information Technologies", 
                "Fred", "Douglas", "123 Apple St.", "Bloomsburg, CA", 48290);
        
        //displays all information about the student Fred
        Fred.display();
    }
    
}
