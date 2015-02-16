//James Waring
//2/16/15
//Which Number
//asks user multiple questions to discern a number

import java.util.Scanner; //import scanner
//create class
public class WhichNumber
{
    
    //main method
    public static void main(String[] args)
    {
        
        String answer;
        Scanner myScanner = new Scanner(System.in); //creates scanner to take input
        System.out.println("Think of an answer between 1 and 10 inclusively.");
        System.out.println("Answer the following set of questions with 'y' for yes and 'n' for no.");
        
        System.out.print("Is your number even? ");
        answer = myScanner.next(); //records answer for conditionals (in every occurence)
        if((answer.equals("y")) ||(answer.equals("Y"))) //looks for a yes answer (in every occurence)
        {
            System.out.print("Is your number divisible by three? ");
            answer = myScanner.next();
            if((answer.equals("y")) ||(answer.equals("Y")))
            {
                System.out.println("Your number is six.");
            }
            else if((answer.equals("n")) || (answer.equals("N"))) //looks for a no answer (in every occurence)
            {
                System.out.print("Is your answer divisible by four? ");
                answer = myScanner.next();
                if((answer.equals("y")) ||(answer.equals("Y")))
                {
                    System.out.print("If you divide it by four is your number greater than two? ");
                    if((answer.equals("y")) ||(answer.equals("Y")))
                    { 
                        System.out.println("Your number is eight.");
                    }
                    else if((answer.equals("n")) || (answer.equals("N")))
                    {
                    System.out.println("Your number is four.");
                    }
                    else //if input is invalid (in every occurence)
                    {
                        System.out.println("Please enter a valid answer.");
                    }
                }
                else if((answer.equals("n")) || (answer.equals("N")))
                {
                    System.out.print("Is your number divisible by five? ");
                    answer = myScanner.next();
                    if((answer.equals("y")) ||(answer.equals("Y")))
                    {
                        System.out.println("Your number is ten.");
                    }
                    else if((answer.equals("n")) || (answer.equals("N")))
                    {
                        System.out.println("Your number is two.");
                    }
                    else
                    {
                        System.out.println("Please enter a valid input.");
                    }
                }
                else
                {
                    System.out.println("Please enter a valid input.");
                }
            }
            else
            {
                System.out.println("Please enter a valid input.");
            }
        }
        else if((answer.equals("n")) || (answer.equals("N")))
        {
            System.out.print("Is your number divisible by three? ");
            answer = myScanner.next();
            if((answer.equals("y")) ||(answer.equals("Y")))
            {
                System.out.print("If you divide your number by three is it greater than one? ");
                answer = myScanner.next();
                if((answer.equals("y")) ||(answer.equals("Y")))
                {
                    System.out.println("Your number is nine.");
                }
                else if((answer.equals("n")) || (answer.equals("N")))
                {
                    System.out.println("Your answer is three.");
                }
                else
                {
                    System.out.println("Please enter a valid input");
                }
            }
            else if((answer.equals("n")) || (answer.equals("N")))
            {
                System.out.print("Is your number greater than six?");
                answer = myScanner.next();
                if((answer.equals("y")) ||(answer.equals("Y")))
                {
                    System.out.println("Your number is seven.");
                }
                else if((answer.equals("n")) || (answer.equals("N")))
                {
                    System.out.print("Is your number less than three?");
                    answer = myScanner.next();
                    if((answer.equals("y")) ||(answer.equals("Y")))
                    {
                        System.out.println("Your number is one.");
                    }
                    else if((answer.equals("n")) || (answer.equals("N")))
                    {
                        System.out.println("Your number is five.");
                    }
                    else
                    {
                        System.out.println("Please enter a valid input.");
                    }
                }
                else
                {
                    System.out.println("Please enter a valid input.");
                }
            }
            else
            {
                System.out.println("Please enter a valid input.");
            }
        }
        else
        {
            System.out.println("Please enter a valid input.");
        }
    }
}