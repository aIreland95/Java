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
public class BloodData {
    
    //variables for blood type and rh factor of blood
    public String bloodType;
    public String rhFactor;
    
//default constructor, sets blood to O+
public BloodData(){

    bloodType = "O";
    rhFactor = "+";
}

//overloaded method for passing parameters
public BloodData(String blood, String rh){
    
    bloodType = blood;
    rhFactor = rh;
}

//set method for blood type
public void setBloodType(String blood){

    bloodType = blood;
}

//get method for blood type
public String getBloodType(){

    return bloodType;
}

//set method for rh factor
public void setRH(String rh){

    rhFactor = rh;
}

    //get method for rh factor
public String getRh(){

    return rhFactor;
}

}