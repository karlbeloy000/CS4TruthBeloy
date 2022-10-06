/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex04truthbeloy;

import java.util.Scanner;

/**
 *
 * @author Karl
 */
public class Singer {
    Scanner sc= new Scanner(System.in);
    
    private String name;
    private int noOfPerformances;
    private double earnings;
    private double splitEarnings;
    private Song favoriteSong;
    private static int totalPerformances;
    
    public Singer(String n, int np, double e, Song fs) {
       name = n;
       noOfPerformances = np;
       earnings = e;
       favoriteSong = fs;
    }
    
    public void performForAudience(int audi) {
        earnings += audi*100;
        noOfPerformances++;
        totalPerformances++;
        
        System.out.printf("%s performed with an audience of %d people.%n"
                + "He earned %.2f and his total number of performances is %d.%n", 
                name, audi, earnings, noOfPerformances);
    }
    
    public void performForAudience(int audi, Singer singer1, Singer singer2) {
        earnings += audi*100;
        splitEarnings = earnings/2;
        noOfPerformances++;
        totalPerformances += 2;
        
        System.out.printf("%s and %s performed with an audience of %d people.%n"
                + "They've earned %.2f (%.2f each) and the total number of performances for all singers is %d.%n", 
                singer1.name, singer2.name, audi, earnings, splitEarnings, totalPerformances);
    }
    public void changeFavSong(Song favSong) { //
        favoriteSong = favSong;
        System.out.printf("%s has a new favorite song! It is %s by %s.%n%n", name, favoriteSong.getTitle(), favoriteSong.getArtist());
    }
}
