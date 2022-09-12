/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex02truthbeloy;

import java.util.Scanner;

/**
 *
 * @author Karl
 */
public class Ex02TruthBeloy {

    /**
     * @param args the command line arguments
     */
    
    static int uppL;
    static int lowL;
    static int guesses;
    
    // how do i do this change settings part,,,,,,,, sir tarcy if ur reading this pls hel,pekfosdfsdifnvsnfdnfsdifsdibfsdhfbhsdbfsdgvf
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //boolean overrr = false;
        //while(overrr == false); {
        
            String start1 = "Start game";
            String start2 = "Change settings";
            String start3 = "End application";
            System.out.printf("Welcome to Higher or Lower! What will you do?"
                    + "%n-%s%n-%s%n-%s%n%n", start1, start2, start3);
            String startInput = sc.nextLine();

            /* if(startInput.equalsIgnoreCase(start2)) {
                System.out.print("What is the upper limit of the random number?  ");
                int uppL = sc.nextInt();
                System.out.print("What is the lower limit of the random number?  ");
                int lowL = sc.nextInt();
                System.out.print("How many guesses are allowed?  ");
                int guess = sc.nextInt();
                
                startInput = start1;
            } */

            if(startInput.equalsIgnoreCase(start1)) {
                boolean over = false;

                while(over == false) {
                    int range = uppL; //def 10
                    int min = lowL; //def 1
                    int atts = guesses; //def 3
                    int random = (int) Math.floor(Math.random()*range) + min;

                    System.out.printf("%nGuess the correct number from %d-%d! You have %d attemps left. What is your guess?%n", min, range, atts);
                    int guess = sc.nextInt();
                    boolean done = false;

                    while(done == false) {
                        atts--;

                        if(guess > random) {
                            if(atts > 1) {
                                System.out.printf("%nGuess lower! You have %d attempts left. What is your guess?%n", atts);
                                guess = sc.nextInt();
                            }
                            else if(atts == 1) {
                                System.out.printf("%nGuess lower! You have %d attempt left. What is your guess?%n", atts);
                                guess = sc.nextInt();
                            }
                            else {
                                System.out.printf("You have run out of attempts!%nPlay again? (y/n)  ");
                                done = true;
                            }
                        }
                        else if(guess < random) {
                            if(atts > 1) {
                                System.out.printf("%nGuess higher! You have %d attempts left. What is your guess?%n", atts);
                                guess = sc.nextInt();
                            }
                            else if(atts == 1) {
                                System.out.printf("%nGuess higher! You have %d attempt left. What is your guess?%n", atts);
                                guess = sc.nextInt();
                            }
                            else {
                                System.out.printf("You have run out of attempts!%nPlay again? (y/n)  ");
                                done = true;
                            }
                        }
                        else if(guess == random) {
                            System.out.printf("%nYou got it!%nPlay again? (y/n)%n");
                            done = true;
                        }

                        String endChoice = sc.nextLine();

                        if(endChoice.equalsIgnoreCase("n")) {
                            //done = true;
                            over = true;
                            //overrr = true;
                        }
                        else if(endChoice.equalsIgnoreCase("y")) {
                            //done = true;
                            over = false;
                            //overrr = false;
                        }
                    }
                }
            }
            if(startInput.equalsIgnoreCase(start3)) {
                System.out.print("\nThank you for playing!");
            }
        }
    }
//}
    

