/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testblooddata;

/**
 *
 * @author Aaron
 */
public class TestBloodData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Aaron Ireland
        //April 3, 2018
        //Java Programming - Exercise 4
        
        //new BloodData's, first uses default, second passes values
        BloodData test1 = new BloodData();
        BloodData test2 = new BloodData("B", "-");
        
        //Displays the blood types of test1 and test2
        System.out.println("This blood type is: " + test1.getBloodType() + "" + test1.getRh());
        System.out.println("This blood type is: " + test2.getBloodType() + "" + test2.getRh());
        
        //sets test1's blood type and rh factor to a new value
        test1.setBloodType("AB");
        test1.setRH("+");
        
        //displays the new blood type of test1
        System.out.println("This blood type is: " + test1.getBloodType() + "" + test1.getRh());
        System.out.println("\n-------------------");
        
        //the line above simply separates parts a. and b.
        //Below is the TestPatient portion of problem #4
        
        //new patient variable, one with default, one with values
        //test3 BloodData variable used for changing person1's blood data
        Patient person1 = new Patient();
        Patient person2 = new Patient(6491, 25, "A", "-");
        BloodData test3 = new BloodData("AB", "+");
        
        //method calls to display person1 and person2's data
        PatientDisplay(person1);
        PatientDisplay(person2);
        
        //sets person1's id, age, and blood data to new values
        person1.setID(3207);
        person1.setAge(37);
        person1.setPatientBlood(test3);
        
        //displays the new blood data of person1
        PatientDisplay(person1);
    }
    
    //method to properly display patient's blood data
    public static void PatientDisplay(Patient p){
        
        //new blood data variable that properly calls getBloodType and getRH
        BloodData forPatient = p.getPatientBlood();
        
        //display of patient's id, age, blood type, and rh factor
        System.out.println("\nPatient ID: " + p.getID() + 
                "\nPatient age: " + p.getAge() + 
                "\nBlood Type: " + forPatient.getBloodType() + forPatient.getRh());
    }
}
