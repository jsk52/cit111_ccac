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
public class Truck {
    public int year;
    public String makeModel;
    public boolean doesTruckHavePickUpBed;
    
    private boolean isEngineRunning;
    private double speed;
    private double howManyDoors;
    
     public void startEngine(){
        isEngineRunning = true;
        System.out.println("...crank...crank...vroom!");
    }
    /**
     * simulates stopping this car instances engine 
     */
    public void stopEngine(){
        isEngineRunning = false;
        System.out.println("...grbllll....shldunk");
    }
    /**
     * Allows access to our private engine status boolean member variable called
     * isEngineRunning @return status of the engine: true means on, false means off
     */
    public boolean checkEngineStatus(){
        return isEngineRunning;
    }
    /**
     * Allows access to our private speed variable @return this car object's current speed
     */
    public double getCurrentSpeed(){
        return speed;
    }
    /**
     * Controls the car's increases in speed @param mphIncrease 
     * @return the current speed of the car after the acceleration has been taken into account
     */
    public double accelerate(int mphIncrease){
        speed = speed + mphIncrease;
        return speed;
    }
    
    public double decelerate(int mphDecrease){
        speed = speed - mphDecrease;
        return speed;
    }
    
    public double askHowManyDoors(){
        return howManyDoors;
    }
    public boolean askForPickUpBed(){
        return doesTruckHavePickUpBed;
}
}//close class

