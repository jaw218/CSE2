//James Waring
//2/26/15
//hw06 program2

import java.util.Scanner;

public class RunFactorial
{
    
    public static void main(String[] args)
    {
        
        //declaring and intializing variables and scanner
        Scanner myScanner = new Scanner(System.in);
        double input = 0;
        int inputx = 0;
        int inputMemory = 0;
        int answer = 0;
        boolean done = false;
        String garbage;
        
        //runs until valid input is obtained
        while(done == false)
        {
            System.out.println("Please enter an int between 9 and 16 inclusively.");
            if(myScanner.hasNextDouble())
            {
                //assigns input to variable
                input = myScanner.nextDouble();
                
                //checks validity of input
                if((8 < input) && (input < 17) && (input%1 == 0))
                {
                    //casts input to int
                    inputx = (int) input;
                    inputMemory = inputx;
                    done = true; //switches because valid input
                }
                else
                {
                    //if not in range or int
                    System.out.println("Invalid input.");
                    
                }
            }
            else
            {
                //if not double
                System.out.println("Invalid input.");
                garbage = myScanner.next(); //gets rid of bad input
                
            }
            
        }   
        answer = inputx;
        
        //does the math
        while(input > 0)
        {
            answer *= inputx--;
            input--;
        }
        
        System.out.println(inputMemory + "! = " + answer);
    }
}