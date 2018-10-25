/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ls3_classStructure;

/**
 *
 * @author julie.kurtzman
 */
import java.util.Random;

public class KennywoodRideTracker {
    private static int totalRiders = 0;
    private static int totalFailedRideAttempt = 0;
    private static int totalSickRiders = 0;
    private static final int THRILL_MIN = 60;
    private static final int THEME_MIN = 48;
    
public static void main(String[] args){
    System.out.println("Let's start this ride simulation!");
    printRiderStatus();
    
    rideBlackWidow(5, 58);
    printRiderStatus();
    
    rideMerryGoRound (9,59);
    printRiderStatus();
    
    rideBlackWidow (13, 70);
    printRiderStatus();
    
    rideMerryGoRound (2, 35);
    printRiderStatus();
    
    rideBlackWidow (8, 61);
    printRiderStatus();
} // close main method

public static void rideBlackWidow(int riders, int avgHeight){
if (avgHeight >= THRILL_MIN){    
    System.out.println("Riding black widow!");
    totalRiders = totalRiders + riders;
    Random rand = new Random();
    int numSickRiders = rand.nextInt(riders);
    totalSickRiders = totalSickRiders + numSickRiders;
} //end if
else {
    totalFailedRideAttempt = totalFailedRideAttempt + riders;
    System.out.println(riders + " riders turned away sad: too short!\n");  
} // end else 
}//close rideBlackWidow method

public static void rideMerryGoRound(int riders, int avgHeight){
if (avgHeight >= THEME_MIN){    
    System.out.println("Riding Merry-GO Round!!!!");
    totalRiders = totalRiders + riders;
    Random rand = new Random();
    int numSickRiders = rand.nextInt(riders);
    totalSickRiders = totalSickRiders + numSickRiders;
} //end if
else {
    totalFailedRideAttempt = totalFailedRideAttempt + riders;
    System.out.println(riders + " riders turned away cause they're too short! Sad day\n");  
}    
}//close rideMerryGoRound method

public static void printRiderStatus(){
   System.out.println("******RIDER STATS*****");
   System.out.println("Total Riders: " + totalRiders);
   System.out.println("Total Failed Ride Attempts: " + totalFailedRideAttempt);
   System.out.println("Total Sick Riders: " + totalSickRiders);
   System.out.println("**********************\n");
}//close printRiderStatus 
}//close class 

