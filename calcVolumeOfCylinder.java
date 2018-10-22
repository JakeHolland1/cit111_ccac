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
public class calcVolumeOfCylinder {
     public static void main(String[] args){
         System.out.println("Volume of a Cylinder Calculator");
         Scanner s= new Scanner(System.in);
         System.out.println("Enter the radius:");
         double r=s.nextDouble();
         System.out.println("Enter the height:");
         double h=s.nextDouble();
 
            double  volume=((22*r*r*h)/7);
 
            System.out.println("volume of Cylinder is: " +volume);
     }
     
}   
     
     
