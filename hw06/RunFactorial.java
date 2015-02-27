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
        
        System.out.println("Please enter an int between 9 and 16 inclusively.");
        while(done == false)
        {
            
            if(myScanner.hasNextDouble())
            {
                input = myScanner.nextDouble();
            
                if((8 < input) && (input < 17) && (input%1 == 0))
                {
                    inputx = (int) input;
                    inputMemory = inputx;
                    done = true;
                }
                else
                {
                    System.out.println("Invalid input.");
                    System.out.println("Please enter an int between 9 and 16 inclusively.");
                    break;
                }
            }
            else
            {
                System.out.println("Invalid input.");
                System.out.println("Please enter an int between 9 and 16 inclusively.");
                break;
            }
        }   
        answer = inputx;
        //answer = 5;
        //System.out.println(answer);
        
        while(input > 0)
        {
            answer *= inputx--;
        }
        
        System.out.println(inputMemory + "! = " + answer);
    }
}