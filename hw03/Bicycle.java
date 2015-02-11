// James Waring
// 2/10/15
// CSE2
//hw03-bicycle

import java.util.Scanner;   //importing the scanner
public class Bicycle 
{
    
    //main method required for every java program
    public static void main(String[] args)
    {
        
        Scanner myScanner;  //instantiating the scanner
        myScanner = new Scanner(System.in);
        
        //user inputs
        System.out.print("Enter the number of seconds: ");
        int secsTrip = myScanner.nextInt();   //number of seconds for trip
        
        System.out.print("Enter the number of counts: ");
        int countsTrip = myScanner.nextInt();   //number of rotations for trip
        
        //declaring and intializing varibles and useful constants
        double wheelDiameter = 27.0;    //size of wheel
        double minutes = secsTrip / 60;   //calculating seconds to minutes
        double hours = minutes / 60;   //calculating minutes to hours
        double distanceTrip;        //distance of the trip
        double  PI = 3.14159; //value of pi
        double averageMPH;
        int  feetPerMile = 5280;   //number of feet in a mile
        int inchesPerFoot = 12;  //number of inches in a  foot
        
        //arithmetic
        distanceTrip = countsTrip * wheelDiameter * PI; //calculates distance in inches
        distanceTrip /= (inchesPerFoot * feetPerMile); //Distance in miles
        averageMPH = distanceTrip / hours; //calculates average miles per hour
        
        //Prints out the output data
        System.out.println(hours);
        System.out.println("The distance in miles was " + distanceTrip + " and took " + minutes + " minutes");
        System.out.println("The average MPH was: " + averageMPH);
        
    }
}