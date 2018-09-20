package fundamentals;

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
        int responseOutdoors;
        int responseReliable;
        int responseQuiet;
        int responseHappyHour;
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

        System.out.println("Question 2: Do you like the outdoors? (0 = no, 1 = yes)");
        responseOutdoors = keyboardReader.nextInt();
        if (responseOutdoors == 1) {
            compScore = compScore + 20;
            System.out.println("Great, me too!");
            System.out.println("Our compatibility score is: " + compScore);
        } else {
            System.out.println("Uh oh this isn't looking good.");
        }

        System.out.println("Question 3: Are you a reliable person? (0 = no, 1 = yes)");
        responseReliable = keyboardReader.nextInt();
        if (responseReliable == 1) {
            compScore = compScore + 20;
            System.out.println("Great, me too!");
            System.out.println("Our compatibility score is: " + compScore);
        } else {
            System.out.println("Uh oh this really isn't looking good.");
        }
        System.out.println("Question 4: Do you also emjoy some quiet time? (0 = no, 1 = yes)");
        responseQuiet = keyboardReader.nextInt();
        if (responseQuiet == 1) {
            compScore = compScore + 10;
            System.out.println("Great, me too!");
            System.out.println("Our compatibility score is: " + compScore);
        } else {
            System.out.println("Uh oh this really  really isn't looking good.");
        }
        System.out.println("Question 5: Do you like going to happy hours? (0 = no, 1 = yes)");
        responseHappyHour = keyboardReader.nextInt();
        if (responseHappyHour == 1) {
            compScore = compScore + 25;
            System.out.println("Great, me too!");
            System.out.println("Our compatibility score is: " + compScore);
        } else {
            System.out.println("Uh oh this really  really isn't looking good.");
        }
        System.out.println("**************************");
        System.out.println("FINAL FRIEND DETERMINATION");
        System.out.println("**************************");
        // final check of compatibility score
        if(compScore > 5){
            System.out.println("Based on our compatability score, we might\n"
                    + "indeed make good friends");
        } else {
            System.out.println("Yikes, according to my \ndecision tree,"
                    + "we probably wouldn't make good friends.");
        } //closing if/else
    } //closing main method
} // closing the class 

