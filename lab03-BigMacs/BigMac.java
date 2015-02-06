//James Waring
//
//Lab 3 Big macs
//February 6th 2015

import java.util.Scanner;
//creates class
public class BigMac
{
    //main method
    public static void main(String[] args)
    {
        //creates scanner and asks for user input
        //then assigns input to approriate variables
        Scanner myScanner = new Scanner (System.in);
        
        System.out.print("Enter the number of BigMacs here (int > 0): ");
        int bigMacs = myScanner.nextInt();
        System.out.println();
        
        System.out.print("Enter the cost of a BigMac (##.##): ");
        double bigMacCost = myScanner.nextDouble();
        System.out.println();
        
        System.out.print("Enter the sales tax as a whole number: ");
        double taxRate = myScanner.nextDouble();
        taxRate /= 100;
        System.out.println();
        
        //calculates cost
        double cost = bigMacs * bigMacCost * (1 + taxRate);
        
        //turns cost into three variables
        int dollars;
        dollars = (int) cost;
        int dimes;
        dimes = (int) ((cost * 10) % 10); 
        int pennies;
        pennies = (int) ((cost * 100) % 10);
        
        //prints output
        System.out.println("The total cost cost of " + bigMacs + " BigMacs at a price of " + bigMacCost);
        System.out.print("with a tax rate of " + ((int)(taxRate * 100)) + " percent is $" + dollars + "." + dimes + pennies);
        
    }
}