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
    public static void main(String[] args) {
        Scanner Start= new Scanner(System.in);
        
        String start1 = "Start game";
        String start2 = "Change settings";
        String start3 = "End application";
        int range = 10;
        int min = 1;
        int atts = 3;
        
        while(true) {
            System.out.printf("Welcome to Higher or Lower! What will you do?"
                + "%n-%s%n-%s%n-%s%n%n", start1, start2, start3);
            String startInput = Start.nextLine();
            
            if(startInput.equalsIgnoreCase(start1)) {
                Scanner att = new Scanner(System.in);
                int random = (int) Math.floor(Math.random()*range) + min;

                System.out.printf("%nGuess the correct number from %d-%d! You have %d attemps left. What is your guess?%n", min, range, atts);
                int guess = att.nextInt();
                boolean done = false;

                while(done == false) {
                    atts--;

                    if(guess > random) {
                        if(atts > 1) {
                            System.out.printf("%nGuess lower! You have %d attempts left. What is your guess?%n", atts);
                            guess = att.nextInt();
                        }
                        else if(atts == 1) {
                            System.out.printf("%nGuess lower! You have %d attempt left. What is your guess?%n", atts);
                            guess = att.nextInt();
                        }
                        else {
                            System.out.printf("You have run out of attempts!%nPlay again? (y/n)  ");
                            done = true;
                        }
                    }
                    else if(guess < random) {
                        if(atts > 1) {
                            System.out.printf("%nGuess higher! You have %d attempts left. What is your guess?%n", atts);
                            guess = att.nextInt();
                        }
                        else if(atts == 1) {
                            System.out.printf("%nGuess higher! You have %d attempt left. What is your guess?%n", atts);
                            guess = att.nextInt();
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
                }
                
                String endChoice = att.nextLine();

                if(endChoice.equalsIgnoreCase("n")) {
                    break;
                }
                else if(endChoice.equalsIgnoreCase("y")) {
                    continue;
                }
            }
            
            if(startInput.equalsIgnoreCase(start2)) {
                System.out.println("What is the lower limit of the random number?:  ");
                Scanner ll= new Scanner(System.in);
                min = ll.nextInt();

                System.out.println("What is the upper limit of the random number?:  ");
                Scanner ul = new Scanner(System.in);
                range = ul.nextInt();

                System.out.println("How many guesses are allowed?:  ");
                Scanner gl= new Scanner(System.in);
                atts = gl.nextInt();
            }
            
            if(startInput.equalsIgnoreCase(start3)) {
                System.out.print("\nThank you for playing!");
                break;
            }   
        }
    }
}
    

