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
public class Patient {
    
    //variables for patient, including id, age, and BloodData
    public int idNum;
    public int patientAge;
    public BloodData patientBlood;
    
    //default constructor, sets age and id to 0, blood data to O+
    public Patient(){
        
        idNum = 0;
        patientAge = 0;
        patientBlood = new BloodData();
    }
    
    //overloaded method for passing parameters
    public Patient(int id, int age, String blood, String rh){
        
        idNum = id;
        patientAge = age;
        patientBlood = new BloodData(blood, rh);
    }
    
    //set method for id number
    public void setID(int id){
        
        idNum = id;
    }
    
    //get method for id number
    public int getID(){
        
        return idNum;
    }
    
    //set method for age
    public void setAge(int age){
        
        patientAge = age;
    }
    
    //get method for age
    public int getAge(){
        
        return patientAge;
    }
    
    //set method for the patient's blood type
    public void setPatientBlood(BloodData bD){
        
        patientBlood = bD;
    }
    
    //get method for the patient's blood type
    public BloodData getPatientBlood(){
        
        return patientBlood;
    }
}
