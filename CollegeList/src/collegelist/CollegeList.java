/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collegelist;
import java.util.Scanner;
/**
 *
 * @author Aaron
 */
public class CollegeList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Aaron Ireland
        //April 18, 2018
        //Java - Exercise 10
        
        //declaration of four arrays for each class, a scanner, and counts for each person type
        Person[] people = new Person[14];
        CollegeEmployee[] employees = new CollegeEmployee[4];
        Faculty[] faculty = new Faculty[3];
        Student[] students = new Student[7]; 
        Scanner scan = new Scanner(System.in);
        String type;
        int employeeCount = 0;
        int facultyCount = 0;
        int studentCount = 0;
        int index = 0;
        
        //initial prompt, displays letter options
        System.out.println("Please enter the corresponding letter to enter "
                + "information on the person:\n(C) - College Employee\n(F) "
                + "- Faculty\n(S) - Student\n(Q) - Quit\n");
        type = scan.next();
        
        while (!type.equals("Q") && (facultyCount <= 3) && (studentCount <= 7)
            && (employeeCount <= 4) && (index < 14))
    {
        if(type.equals("S") && !type.equals("Q")) //user specifies "S"
        {
            people[index] = new Student();
            students[studentCount] = new Student();

            //sets the student info
            personInfo(people[index]);
            studentInfo((Student)people[index]);
            System.out.println("\n");

            //increment the counts
            studentCount++;
            index++;
        }

        else if(type.equals("C") && !type.equals("Q")) //user specifies "C"
        {    
            people[index] = new CollegeEmployee();
            employees[employeeCount] = new CollegeEmployee();

            //sets the college employee info
            personInfo(people[index]);
            employeeInfo((CollegeEmployee)people[index]);
            System.out.println("\n");

            //increment the counts
            employeeCount++;
            index++;
        }

        else if(type.equals("F") && !type.equals("Q")) //user enters "F"
        {
            people[index] = new Faculty();
            faculty[facultyCount] = new Faculty();

            //sets the faculty info
            personInfo(people[index]);
            employeeInfo((CollegeEmployee)people[index]);
            facultyInfo((Faculty)people[index]);
            System.out.println("\n");

            //increment the counts
            facultyCount++;
            index++;
        }

        //prompt for entering next letter
        System.out.print("Please enter the next person type (S, C, F, or Q): ");
        type = scan.next();
    }
           // Displays error message then closes program if there was overflow
        if ((facultyCount > 3) || (studentCount > 7) || (employeeCount > 4))
        {
            System.out.println("Too much data for one type of person!");
            System.exit(0);
        }

    //output for college employee data
    System.out.println("\n\n");
    System.out.println("THE COLLEGE EMPLOYEES");
    for (int i = 0; i < employeeCount; i++)
    {
        System.out.println(employees[i]);
        System.out.println("\n");
    }
    //output if college employee array was not filled
    if (employeeCount != 4)
    {
        System.out.println("There are " + (4 - employeeCount) + " employees"
                + " who are not recorded.");
    }

    //output for faculty data
    System.out.println("\n\n");
    System.out.println("THE FACULTY");
        for (int i = 0; i < facultyCount; i++)
    {
        System.out.println(faculty[i]);
        System.out.println("\n");
    }
    //output if faculty array was not filled
    if (facultyCount != 3)
    {
        System.out.println("There are " + (3 - facultyCount) + " faculty "
                + "members who are not recorded.");
    }

    //output for students data
    System.out.println("\n\n");
    System.out.println("THE STUDENTS");
    for (int i = 0; i < studentCount; i++)
    {
        System.out.println(students[i]);
        System.out.println("\n");
    }
    //output if student array is not filled
    if (studentCount != 7)
    {
        System.out.println("There are " + (7 - studentCount) + " students "
                + "who are not recorded.");
    }
}
    //method for inputing a person's basic information
    public static void personInfo(Person p){
        
    Scanner input = new Scanner(System.in);

    System.out.println("First name: ");
    String fName = input.nextLine();
    System.out.println();

    System.out.print("Last name: ");
    String lName = input.nextLine();
    System.out.println();

    System.out.print("Street address: ");
    String address = input.nextLine();
    System.out.println();

    System.out.print("Zipcode: ");
    double zipcode = input.nextDouble();
    System.out.println();

    System.out.print("Phone number: ");
    String phone = input.nextLine();
    System.out.println();

    //set methods called to properly set data to the new array item
    p.setFirstName(fName);
    p.setLastName(lName);
    p.setAddress(address);
    p.setZipCode(zipcode);
    p.setPhoneNum(phone);
}

    //method for inoputing a student's information
    public static void studentInfo(Student s){
        
    Scanner input = new Scanner(System.in);

    System.out.print("Grade point average: ");
    double gpa = input.nextDouble();
    System.out.println();

    System.out.print("Major: ");
    String major = input.next();
    System.out.println();

    //set methods called to properly set data to the new array item
    s.setGPA(gpa);
    s.setMajor(major);
    }
    
    //method for inputing a faculty member's info
    public static void facultyInfo(Faculty f){
        
    Scanner input = new Scanner(System.in);

    System.out.println("Is the faculty tenured (\"yes\" or \"no)\"?");
    String tenured = input.next();

    //switch statement for whether the tenure is true or false
        switch (tenured)
        {
            case "yes" :
                f.setTenure(true);
                break;
            case "no" :
                f.setTenure(false);
                break;
        }
    }
    
    //method for inputing a college employee's info
    public static void employeeInfo(CollegeEmployee c){
        
    Scanner input = new Scanner(System.in);

    System.out.print("Social security number: ");
    double socialSecurity = input.nextDouble();
    System.out.println();

    System.out.print("Salary: ");
    double salary = input.nextDouble();
    System.out.println();

    System.out.print("Department name: ");
    String department = input.next();
    System.out.println();

    //set methods called to properly set data to the new array item
    c.setSocial(socialSecurity);
    c.setAnnual(salary);
    c.setDepartment(department);
    }
}
