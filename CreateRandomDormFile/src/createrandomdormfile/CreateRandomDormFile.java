/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createrandomdormfile;

/**
 *
 * @author Aaron
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class CreateRandomDormFile extends JFrame implements ActionListener{

    //Aaron Ireland
    //May 24, 2018
    //Exercise 9a
    
    //creation of JLabels, JTextFields, and a JButton
    JLabel prompt = new JLabel("Enter the room number");
    JTextField room = new JTextField(4);
    JTextField first = new JTextField(14);
    JTextField last = new JTextField(14);
    JLabel room_num = new JLabel("Room");
    JLabel first_name = new JLabel("First name");
    JLabel last_name = new JLabel("Last name");
    JButton submit = new JButton("Submit");
    
    //code for creating a file of names and room numbers
    DataOutputStream ostream;
    RandomAccessFile dormFile;
    final int RECORD_SIZE = 24;
    final int NUM_RECORDS = 100;
    StringBuffer blankName = new StringBuffer(10);
    
    //constructor for CreateRandomDormFile
    public CreateRandomDormFile(){
        
        super("Dorm File");
        
        //try-catches that create and alter the data file
        try
     {
        dormFile = new RandomAccessFile("RoomAssignments.dat","rw"); 
        for(int x = 0; x < NUM_RECORDS; ++x)

        {
           dormFile.writeInt(0);
           dormFile.writeUTF(blankName.toString());
           dormFile.writeUTF(blankName.toString());
        }
           dormFile.writeUTF(blankName.toString());
     }

     catch(IOException e)
     {
       System.err.println("File not opened");
       System.exit(1);
     }
        //adds labels and text fields to the frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new FlowLayout());
        add(prompt);
        add(room_num);
        add(room);
        add(first_name);
        add(first);
        add(last_name);
        add(last);
        add(submit);
        submit.addActionListener(this);
    }
    
    //action performed method, for when a room number and fisrt/last name are submitted
    public void actionPerformed(ActionEvent e){
        
        final int MAXNUM = 99;
        int num;
        try
        {
            num = Integer.parseInt(room.getText());
            if(num > MAXNUM){
                num = MAXNUM;
            }
            dormFile.seek((num - 1) * RECORD_SIZE);
            dormFile.writeInt(num);
            dormFile.writeUTF(first.getText());
            dormFile.writeUTF(last.getText());
            room.setText("");
            last.setText("");
            first.setText("");
        }    
        catch(NumberFormatException e2)
        {

         System.err.println("Invalid room number");
        }

        catch(IOException e3)
        {
          System.err.println("Error writing file");
          System.exit(1);
        }
    }
    
    //main method that creates a new CreateRandomDormFile and sets the size
    public static void main(String[] args) {
        
        CreateRandomDormFile frame = new CreateRandomDormFile();
        final int WIDTH = 300;
        final int HEIGHT = 300;
        frame.setSize(WIDTH, HEIGHT);
    }
}