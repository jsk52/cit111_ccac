/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8_methods2;

/**
 *
 * @author julie.kurtzman
 */
public class GeometricShapes {

    public static void main(String[] args) {
        double returnedVolume = calcVolumeOfCube(50.0);
        System.out.println("Volume of a cube: " + returnedVolume);
    } //close main method

    public static double calcVolumeOfCube(double sideLength) {
        double cubeVolume = Math.pow(sideLength, 3);
        return cubeVolume;
    } //close calcVolumeofCube method

} //close class 

