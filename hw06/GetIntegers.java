//James Waring
//2/26/15
//hw06 program1

import java.util.Scanner;

public class GetIntegers
{
    
    public static void main(String[] args)
    {
         //initialize variables for later use
        Scanner myScanner = new Scanner(System.in);
        int sum = 0;
        double x = 0;
        int y = 0;
        
        System.out.println("Please enter 5 non-negative integers.");
        
        //for loop to obtain 5 ints
        for(int count = 0; count < 5; count++)
        {
            
            if(myScanner.hasNextDouble())
            {
                x = myScanner.nextDouble();
                
                //checks to see if non-negative and int
                if((x >= 0) && (x%1 == 0))
                {
                    y = (int)x;
                    sum += y; //adds input to final sum
                }
                else
                {
                    System.out.println("Not valid.");
                    count--; //decreases count if invalid to make sure 5 valid ints are entered
                }
            }
            else
            {
                System.out.println("Not valid.");
                count--; //decreases count if invalid to make sure 5 valid ints are entered
            }
        }
        System.out.println("Your sum is " + sum); //prints sum
    }
}