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
public class TruckLand {
    public static void main (String[] args){
        //create a new instance of a Truck object with the keyword:new
        Truck chevy = new Truck();
        //set member variables on the instance of Truck stored in chevy
        chevy.year = 1972;
        chevy.makeModel = "Black Chevy Pickup: Back to the Future Edition";
      
    //test its methods
    chevy.startEngine();
    chevy.accelerate(42);
    chevy.decelerate(10);
    //check status again
    displayTruckStats(chevy);
    chevy.stopEngine();
    displayTruckStats(chevy);
} //close main method

    public static void displayTruckStats(Truck anyTruckObject){
        System.out.println("****STATS****");
        System.out.println(anyTruckObject.year + " " + anyTruckObject.makeModel);
        System.out.println("Engine running? " + anyTruckObject.checkEngineStatus());
        System.out.println("Current Speed " + anyTruckObject.getCurrentSpeed());
        System.out.println("**************");
    } // close displayTruckStats 
}//close class   

