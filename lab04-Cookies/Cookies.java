//James Waring
//
// 2/13/15
//
//Cookies


import java.util.Scanner;   //importing the scanner
//creating class
public class Cookies
{
    //main method
    public static void main(String[] args)
    {
        
        //instantiating scanner
        Scanner myScanner = new Scanner(System.in);
        
        int nPeople;
        int nBought;
        int nGet;
        
        System.out.print("The number of people at the party: ");
        
        if(!myScanner.hasNextInt())
        {
            System.out.println("You did not enter an int.");
        }
        else
        {
            nPeople = myScanner.nextInt(); //sets nPeople to user input
            System.out.print("The number of cookies you are buying: ");
            
            if(!myScanner.hasNextInt())
            {
                System.out.println("You did not enter an int.");
            }
            else
            {
                nBought = myScanner.nextInt(); //sets nBought
                System.out.print("How many cookies should each person get: ");
                
                if(!myScanner.hasNextInt())
                {
                    System.out.println("You did not enter an int.");
                }
                else
                {
                    nGet = myScanner.nextInt(); // sets nGet
                
        
        int nNeed = (nPeople * nGet);
        
        if(nNeed > nBought)
        {
            System.out.println("You do not have enough cookies.");
            System.out.println("You will need " + (nNeed - nBought) + " more.");
        }
        else
        {
             if((nBought % nPeople) != 0)
             {
                 System.out.println("You have enough cookies, but they will not divide evenly.");
             }
             else
             {
                 System.out.println("You have enough cookies and they will divide evenly.");
         
             }
        }
        }
        }
        }
    }
}
