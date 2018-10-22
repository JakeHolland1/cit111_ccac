/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlStructures;

import java.util.Scanner;

/**
 *
 * @author jacob.holland
 */
public class geometricshapes {
    public static void main(String[] args){
      
      Scanner scan = new Scanner (System.in);
      System.out.println("Type the side length of the cube to get its volume");
         double userSideLength = scan.nextDouble();
         double returnedVolume = calcVolumeOfCube(userSideLength);
         System.out.println("The Volume of a cube with that specfic length: "    
         + returnedVolume);
       
    }
      public static double calcVolumeOfCube(double sideLength){
      // implements the cube area formulas: side^3
      double cubeVolume = Math.pow(sideLength, 3);
      // return the area back to the calling method
        return cubeVolume; 
      }// close method 
}// close class

