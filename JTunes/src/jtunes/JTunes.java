/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtunes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Aaron
 */
public class JTunes extends JFrame implements ActionListener{

    //Aaron Ireland
    //May 12, 2018
    //JTunes part a
    
    //string array for each song title
    String[] songArray = {"Livin' on a Prayer", "Down Under", "I Want To Know What Love Is",
                          "Eye of the Tiger", "Jump", "Tainted Love", "Sweet Child O' Mine",
                          "Money for Nothing", "Every Breath You Take", "Take On Me",
                          "Billie Jean", "Don't Stop Believin'"};
    
    //JComboBox that uses the values from the songArray
    JComboBox songs = new JComboBox(songArray);
    double songPrice = 0;
    
    //creates the labels and text field provided to user
    JLabel songPick = new JLabel("Select a song from the drop down list");
    JLabel price = new JLabel("This song costs");
    JTextField total = new JTextField(5);
    
    //JTunes constructor, adds items to frame and characteristics
    public JTunes(){
        
        super("Song Drop Down List");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new FlowLayout());
        add(songPick);
        add(songs);
        add(price);
        add(total);
        
        //sets text field to the song's price, action listener used for combo box
        total.setText("$" + songPrice);
        songs.addActionListener(this);
    }
    
    //method for when an action is performed within the combo box
    public void actionPerformed(ActionEvent e){
        
        String data = "";
        
        //if containing nested ifs, changes price based on the selected song
        if (songs.getSelectedIndex() != -1){
            data = "Song Selected: " +songs.getItemAt(songs.getSelectedIndex());
            
            if (songs.getSelectedIndex() == 0){
                songPrice = 3.99;
                total.setText("$" + songPrice);
            }
            else if (songs.getSelectedIndex() == 1){
                songPrice = 4.99;
                total.setText("$" + songPrice);
            }
            else if (songs.getSelectedIndex() == 2){
                songPrice = 5.99;
                total.setText("$" + songPrice);
            }
            else if (songs.getSelectedIndex() == 3){
                songPrice = 6.99;
                total.setText("$" + songPrice);
            }
            else if (songs.getSelectedIndex() == 4){
                songPrice = 7.99;
                total.setText("$" + songPrice);
            }
            else if (songs.getSelectedIndex() == 5){
                songPrice = 8.99;
                total.setText("$" + songPrice);
            }
            else if (songs.getSelectedIndex() == 6){
                songPrice = 9.99;
                total.setText("$" + songPrice);
            }
            else if (songs.getSelectedIndex() == 7){
                songPrice = 10.99;
                total.setText("$" + songPrice);
            }
            else if (songs.getSelectedIndex() == 8){
                songPrice = 11.99;
                total.setText("$" + songPrice);
            }
            else if (songs.getSelectedIndex() == 9){
                songPrice = 12.99;
                total.setText("$" + songPrice);
            }
            else if (songs.getSelectedIndex() == 10){
                songPrice = 13.99;
                total.setText("$" + songPrice);
            }
            else if (songs.getSelectedIndex() == 11){
                songPrice = 14.99;
                total.setText("$" + songPrice);
            }
        }
    }
    
    //main method, which creates a JTunes item, and sets the size
    public static void main(String[] args) {
        
        JTunes songList = new JTunes();
        final int WIDTH = 300;
        final int HEIGHT = 150;
        songList.setSize(WIDTH, HEIGHT);
    }
    
}
