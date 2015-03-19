// James Waring
// 3/17/15
// Methods lab

import java.util.Scanner;

public class methods
{
    public static void main(String[] args)
    {
        boolean done = false;
        int sum = 0;
        int number = 0;
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Please enter an int: ");
        while(done == false)
        {
            if(myScanner.hasNextDouble())
            {
                int z = (int) myScanner.nextDouble();
                if(z % 1 == 0)
                {
                    number = z;
                    done = true;
                }
                else
                {
                    System.out.println("Invalid.");
                }
            }
            else
            {
                System.out.println("Invalid.");
                String garbage = myScanner.next();
            }
        }
        
        for(int x = number; x > 0; x--)
        {
            sum += factorial(x);
        }
        print(number, sum);
    }
    
    public static int factorial(int input)
    {
        int y = 1;
        
        for(int x = input; x > 0; x--)
        {
            y *= x;
        }
        
        return y;
    }
    
    public static void print(int input, int sum)
    {
        System.out.println("The super factorial of " + input + " is " + sum + ".");
    }
}