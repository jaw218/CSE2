// James Waring
// 4/2/15
// Lab 10, arrays

import java.util.Scanner;

public class Arrays
{
    public static void main(String[] args)
    {
        int[] array;
        System.out.println("Time to choose the size of your array.");
        array = new int[getInput()];
        array = populateArray(array);
        System.out.println("And here is your array.");
        printArray(array);
    }
    
    public static int getInput()
    {
        double l = 0;
        boolean notDone = true;
        String garbage = "";
        Scanner myScanner = new Scanner(System.in);
        int input = 0;
        System.out.print("Please enter a non-negative integer: ");
        while(notDone)
        {
            if(myScanner.hasNextDouble())
            {
                l = myScanner.nextDouble();
                    
                //checks to see if non-negative and int
                if((l >= 1) && (l%1 == 0))
                {
                    input = (int)l;
                    notDone = false;
                }
                else
                {   
                    System.out.println("Not valid.");
                    System.out.print("Please enter a non-negative integer: ");
                }
            }
            else
            {
                System.out.println("Not valid.");
                System.out.print("Please enter a non-negative integer: ");
                garbage = myScanner.next();
            }
        }
        return input;
    }
    
    public static int[] populateArray(int[] x)
    {
        int[]z = x;
        System.out.println("Now it is time to populate your array.");
        for(int y = 0; y < x.length; y++)
        {
            z[y] = getInput();
        }
        return z;
    }
    
    public static void printArray(int[] x)
    {
        int[] z = x;
        for(int y = 0; y < x.length; y++)
        {
            System.out.print(z[y] + " ");
        }
        System.out.println();
    }
}