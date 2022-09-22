package ex01truthbeloy;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TRUTH
 */
public class HelloWorld {
    public static void main(String [] args) {
        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        // hello worl
        System.out.print("What is your name? ");
        String name = sc.nextLine();
        System.out.printf("Hi, %s." , name);
        // input name
        int age = Integer.parseInt(sc.nextLine());
        // input age
    }
    
}