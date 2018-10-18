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
 
public class Shapes2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the side length of the cube to calculate its volume:");
        double userSideLength = scan.nextDouble();
        double returnedVolume = calcVolumeOfCube(userSideLength);
        System.out.println("The volume of a cube with side length " + userSideLength + " is " + returnedVolume);
    }
       
    public static double calcVolumeOfCube(double u) {
        double cubeVolume = Math.pow(u, 3);
        return cubeVolume;
    } //close calcVolumeofCube method

} //close class 
