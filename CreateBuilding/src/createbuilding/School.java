/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createbuilding;

/**
 *
 * @author Aaron
 */
public class School extends building{
    
    protected int classrooms;
    protected String gradeLevel;
    
    //school coonstructor
    public School(double f, int s, int c, String g){
        
        super(f, s);
        classrooms = c;
        gradeLevel = g;
    }
    
    //get methods for school attributes
    public int getClassrooms(){
        return classrooms;
    }
    public String getGradeLevel(){
        return gradeLevel;
    }
    
    //Blueprint method, displays information about a school
    public void Blueprint(){
        
        System.out.println("School features:\nSquare Footage - " + footage + 
                "\nStories - " + stories + "\nClassrooms - " + classrooms + 
                "\nGrade Level - " + gradeLevel + "\n");
    }
}