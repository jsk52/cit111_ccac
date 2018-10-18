/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8_methods2;

import java.util.Scanner;

/**
 *
 * @author julie.kurtzman
 */
public class Exercise2Cylinder {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the cylinder radius:");
        double userRadius = scan.nextDouble();
        System.out.println("Enter the cylinder height:");
        double userHeight = scan.nextDouble();
        double returnedCylVolume = calcVolumeOfCylinder(userRadius, userHeight);
        System.out.println("The volume of a cylinder with radius: " + userRadius 
                + "and height of " + userHeight + " is " + returnedCylVolume);
    }
       
    public static double calcVolumeOfCylinder(double radius, double height) {
        final double PI = 3.1416;
        double CylVol = PI * (radius * radius) * height;
        return CylVol;
    } //close method

} //close class 

