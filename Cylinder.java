/**
 * Hayden Ross
 * M1.4 Programming Assignment 1 
 * intake two variables of a Cylinder - radius and length
 * calculate the Cylinder area and volume
 * output radius, length, area, and volume
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Cylinder 
 {
     public static void main(String[] args) 
     {
       //Define Variables//
       double radius;
       double length;
       
       //Get Variables from user//
       Scanner inputDevice = new Scanner(System.in);
       System.out.print("Enter Radius >> ");
       radius = inputDevice.nextDouble();
       System.out.print("Enter Length >> ");
       length = inputDevice.nextDouble();
       inputDevice.close();
      
       //Create and calculate rest of variables//
       double bottomArea = radius * radius * 3.14159;
       double cylinderVolume = bottomArea * length;
       double cylinderArea = (2 * radius * 3.14159 * length) + (2 * bottomArea);
       
       //Define Decimal Format//
       DecimalFormat df = new DecimalFormat(".##");
       
       //Display variables to user//
       System.out.printf("Radius = " + radius + " Length = " + length + " Cylinder Area = " + df.format(cylinderArea) + " Cylinder Volume = " + df.format(cylinderVolume));
     }
}
