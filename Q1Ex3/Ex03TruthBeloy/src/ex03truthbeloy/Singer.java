/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex03truthbeloy;

import java.util.Scanner;

/**
 *
 * @author Karl
 */
public class Singer {
    Scanner sc= new Scanner(System.in);
    
    String name;
    int noOfPerformances;
    double earnings;
    Song favoriteSong;
    
    public Singer(String n, int np, double e, Song fs) {
       name = n;
       noOfPerformances = np;
       earnings = e;
       favoriteSong = fs;
    }
    
    public void performForAudience(int audi) {
        earnings += audi*100;
        noOfPerformances++;
        
        System.out.printf("%s performed with an audience of %d people.%n"
                + "They've earned %.2f and their total number of performances is %d.%n"
                , name, audi, earnings, noOfPerformances);
    }
    public void changeFavSong(Song favSong) { //
        favoriteSong = favSong;
        System.out.printf("%s has a new favorite song! It is %s by %s.", name, favoriteSong.title, favoriteSong.artist);
    }
}
