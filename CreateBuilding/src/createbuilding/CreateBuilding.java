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
public class CreateBuilding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //new array of buildings, houses and schools
        building[] place = new building[6];
        
        place[0] = new House(500, 2, 3, 2);
        place[1] = new House(350, 2, 2, 1);
        place[2] = new House(450, 3, 3, 2);
        place[3] = new School(750, 2, 32, "High School");
        place[4] = new School(600, 2, 24, "Junior High");
        place[5] = new School(800, 2, 28, "Elementary");
        
        //for loop that displays info about each place
        for (int i = 0; i < 7; ++i){
            
        place[i].Blueprint();
        }
    } 
}