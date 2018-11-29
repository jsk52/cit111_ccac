/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backtothefuture;

/**
 *
 * @author julie.kurtzman
 */
public class CarLand {
    public static void main (String[] args){
        //create a new instance of a Car object with the keyword:new
        Car deLorean = new Car();
        //set member variables on the instance of Car stored in deLorean
        deLorean.year = 1983;
        deLorean.makeModel = "DeLorean DMC-12";
    
     
    //test its methods
    deLorean.startEngine();
    deLorean.accelerate(88);
    deLorean.decelerate(12);
    //check status again
    displayCarStats(deLorean);
    deLorean.stopEngine();
    displayCarStats(deLorean);
} //close main method

    public static void displayCarStats(Car anyCarObject){
        System.out.println("****STATS****");
        System.out.println(anyCarObject.year + " " + anyCarObject.makeModel);
        System.out.println("Engine running? " + anyCarObject.checkEngineStatus());
        System.out.println("Current Speed " + anyCarObject.getCurrentSpeed());
        System.out.println("**************");
    } // close displayCarStats 
}//close class   

