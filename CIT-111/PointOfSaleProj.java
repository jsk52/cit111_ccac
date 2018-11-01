/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniproject;

/**
 *
 * @author julie.kurtzman
 */
import java.util.Random;

public class PointOfSaleProj {

    public static int numOfYinzPizzas = 0;
    public static int numOfPumpkingBeers = 0;
    public static final int PIZZA_COST = 10;
    public static final int BEER_COST = 6;

    public static void main(String[] args) {
        System.out.println("Hello, welcome! What would you like to order today?");
        displayOrderTotal();

        orderYinzPizzas(5);
        orderPumpkingBeers(10);
        displayOrderTotal();
    } //closes main method

    public static void orderYinzPizzas(int numPies) {
        numOfYinzPizzas = numOfYinzPizzas + numPies;
    }//close orderYinzPizzas method

    public static void orderPumpkingBeers(int numBeers) {
        numOfPumpkingBeers = numOfPumpkingBeers + numBeers;
    }//close orderPumpkingBeers method

    public static void displayOrderTotal() {
        System.out.println("******Order Total*****");
        System.out.println("Total Number of Yinz Pizzas: " + numOfYinzPizzas);
        System.out.println("Total Number of Pumpking Beers: " + numOfPumpkingBeers);
        System.out.println("Your bill today will be $" + numOfYinzPizzas * PIZZA_COST);
        System.out.println("**********************\n");
    }//close displayOrderTotal method
}//close class 
