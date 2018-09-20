package friendpackage;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author julie.kurtzman
 */
public class Score {

    public static void main(String[] args) {
        System.out.println("Can we be friends?");
        int responsePizza;
        int compScore = 0;
        
        System.out.println("Question 1: Do you like Hawaiian pizza? (0 = no, 1 = yes)");
        
        Scanner keyboardReader = new Scanner(System.in);
        responsePizza = keyboardReader.nextInt();
        
        if (responsePizza == 1){
            compScore = compScore + 10;
            System.out.println("Awesome, looks like we can be friends!");
            System.out.println("Our compatibility score is: " + compScore);
        } else {
            System.out.println("You have bad taste in pizza");
        } //close of if/else
    } //closing main method
} // closing the class 
        
      
