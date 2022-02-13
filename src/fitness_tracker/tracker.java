/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitness_tracker;

import java.util.Scanner;

/**
 * @author Mayar-PC
 */
public class tracker {
    public static void main(String[] args) {

        Fitness_Tracker Obj[] = new Fitness_Tracker[4];
        Obj[0] = new Fitness_Tracker("swimming", 4, (float) 0.002);
        Obj[1] = new Fitness_Tracker("running", 5, (float) 0.003);
        Obj[2] = new Fitness_Tracker("kickboxing", 3, (float) 0.005);
        Obj[3] = new Fitness_Tracker("strength training", 5, (float) 0.006);


        Gui_Tracker G = new Gui_Tracker(Obj);
        G.setVisible(true);

    }


}
     

    
    
