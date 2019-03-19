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
//derived class from CollegeEmployee
public class Faculty extends CollegeEmployee {
    
    //single attribute for faculty, whether they are tenured or not
    protected boolean tenure;
    
    //set/get for tenure
    public void setTenure(boolean t){
        this.tenure = t;
    }
    public boolean getTenure(){
        return tenure;
    }
}
