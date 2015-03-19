// James Waring
// 3/19/15
// Hw 08 Game

import java.util.Scanner;

public class HW8
{
    //main method, runs entire game
    public static void main(String[] args) 
    {
        char option;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        String input = getInput(scan, "Cc");
        System.out.println("You are in a dead valley.");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You walked and walked and walked and you saw a cave!");
        cave();
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You entered a cave!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("Unfortunately, you ran into a GIANT!");
        giant();
        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
        input = getInput(scan, "AaEe", 10);
        System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
        System.out.println("There are three 3 treasure boxes in front of you! Enter the box number you want to open!");
        box();
        input = getInput(scan);
        System.out.println("Hero! Have a good day!");
    }
    
    public static String getInput(Scanner scan, String string)
    {
        String x;
        //checks conditions to take appropriate action based on user input
        if(scan.hasNext())
        {
            String in = scan.next();
            if((in.equals("c")) || (in.equals("C")))
            {
                x = "";
            }
            else
            {
                x = "Yeah right LOSER";
                System.out.println(x);
                System.exit(0);
            }
        }
        else
        {
            x = "Yeah right LOSER";
            System.out.println(x);
            System.exit(0);
        }
        return x;
    }
    
    public static String getInput(Scanner scan, String string, int trial)
    {
        String result = "";
        int x = trial;
        //runs until 10 crit hits or escape or quit
        while(x > 0)
        {
            //checks for char and then takes appropriate action for input
            if(scan.hasNext())
            {
                String in = scan.next();
                if((in.equals("a")) || (in.equals("A")))
                {
                    int y = (int)(Math.random() * 2);
                    if(y == 1)
                    {
                        x--;
                        System.out.println("Critical Hit!!!");
                    }
                    else
                    {
                        System.out.println("You missed.");
                    }
                }
                else if((in.equals("e")) || (in.equals("E")))
                {
                    int y = (int)(Math.random() * 10 + 1);
                    if(y == 10)
                    {
                        x = 0;
                        System.out.println("You escaped!");
                    }
                    else
                    {
                        System.out.println("You couldn't escape.");
                    }
                }
                else
                {
                    result= "You were executed by the giant.";
                    System.out.println(result);
                    System.exit(0);
                }
            }
            else
            {
                result = "You were executed by the giant.";
                System.exit(0);
            }
            if(x>0)
            {
                System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
            }
        }
        return result;
    }
    
    public static String getInput(Scanner scan)
    {
        double l = 0;
        String garbage;
        String ugh;
        int choice = 0;
        boolean notDone = true;
        while(notDone)
        {
            if(scan.hasNextDouble())
            {
                l = scan.nextDouble();
                    
                //checks to see if valid
                if(((l == 1) || (l == 2) || (l == 3)) && (l%1 == 0))
                {
                    choice = (int)l;
                    notDone = false;
                    
                }
                else
                {   
                    choice = 5;
                    notDone = false;
                }
            }
            else
            {
                choice = 5;
                garbage = scan.next();
                notDone = false;
            }
        }
        //switches for choice of box
        switch(choice)
        {
            case 1:
                System.out.println("You received an A in CSE 002.");
                ugh = "I dont see the point of these returns if we never use the variable input";
                break;
            case 2:
                System.out.println("You received 50 Dining Dollars.");
                ugh = "I dont see the point of these returns if we never use the variable input";
                break;
            case 3:
                System.out.println("You received a Ferrari.");
                ugh = "I dont see the point of these returns if we never use the variable input";
                break;
            default:
                System.out.println("A Wrong Number! You get nothing! Better restart the game LOL");
                ugh = "seriously...";
        }
        return ugh;
    }
    
    //prints cave
    public static void cave()
    {
        System.out.println("                              *****   * * * * * * * *");
        System.out.println("                        ***          ***");
        System.out.println("                     ***                ***");
        System.out.println("                 |   ***                ***");
        System.out.println("                 |   ***                ***");
        System.out.println("             O __|__ ***                ***");
        System.out.println("           ******l   ***                ***");
        System.out.println("            * *      ***                ***");
        System.out.println("           *   *     ********************** * * * * * *");
    }
   
    
    //prints giant
    public static void giant()
    {
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");
    }
    
    //prints boxes
    public static void box()
    {
        System.out.println("                     *********************     *********************    *********************             ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************               "); 
    }
}