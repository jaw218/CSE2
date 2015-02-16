//James Waring
//2/16/15
//Banking
//allows users to make banking actions

import java.util.Scanner; //imports scanner

//creates class
public class Banking
{
    
    //creates main method
    public static void main(String[] args)
    {
        
        Scanner myScanner = new Scanner(System.in);
        int response;
        int amount = (int) (Math.random() * 4000 + 1001);
        int x;
        System.out.print("Would you like to check your balance (1), withdraw money (2), or deposit money (3)? ");
        response = myScanner.nextInt();
        switch(response)
        {
            case 1:
                System.out.println("You have a balance of $" + amount);
                break;
                
            case 2:
                System.out.print("How much would you like to withdraw? ");
                x = myScanner.nextInt();
                if(x <= amount)
                {
                    amount -= x;
                    System.out.println("Your new balance is $" + amount);
                }
                else
                {
                    System.out.println("You either do not have enough money for this transaction");
                    System.out.println("or you did not enter a proper input.");
                }
                break;
                
            case 3:
                System.out.print("How much would you like to deposit? ");
                x = myScanner.nextInt();
                if(x > 0)
                {
                    amount += x;
                    System.out.println("Your new balance is $" + amount);
                }
                else
                {
                    System.out.println("You must enter a positive integer.");
                }
                break;
                
            default:
                System.out.println("You did not enter a valid input.");
                break;
        }
    }
}