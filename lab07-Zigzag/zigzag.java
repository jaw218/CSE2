//James Waring
//3/5/15
//makes a zig zag of asterisks
import java.util.Scanner;

public class zigzag
{
    public static void main(String[] args)
    {
        boolean cont = true;
        while(cont)
        {
            int nStars = 0;
            boolean notDone = true;
            String garbage;
            double l;
            System.out.print("Please enter an integer between 3 and 33 inclusively: ");
            Scanner myScanner = new Scanner(System.in);
            while(notDone)
            {
                if(myScanner.hasNextDouble())
                    {
                        l = myScanner.nextDouble();
                    
                        //checks to see if non-negative and int
                        if((l >= 3) && (l%1 == 0) && (l <=33))
                        {
                            nStars = (int)l;
                            notDone = false;
                        }
                        else
                        {   
                        System.out.println("Not valid.");
                        }
                    }
                    else
                    {
                        System.out.println("Not valid.");
                        garbage = myScanner.next();
                    }
                }
            int x = 0;
            int y = 0;
            while(x < nStars)
            {
                System.out.print("*");
                x++;
            }
            System.out.println();
            x = 0;
            while(x < nStars-2)
            {
                while(y < x)
                {
                    System.out.print(" ");
                    y++;
                }
                System.out.println(" *");
                y = 0;
                x++;
            }
            x = 0;
            while(x < nStars)
            {
                System.out.print("*");
                x++;
            }
            System.out.println();
            System.out.println("Do you want to go again? (Y/N)");
            boolean notDone2 = true;
            String m;
            while(notDone2)
            {
                if(myScanner.hasNext())
                {
                    m = myScanner.next();
                
                    //checks to see if non-negative and int
                    if((m.equals("Y")) || (m.equals("y")))
                    {
                        cont = true;
                        notDone2 = false;
                    }
                    else if((m.equals("N")) || (m.equals("n")))
                    {
                        cont = false;
                        notDone2 = false;
                    }
                    else
                    {   
                        System.out.println("Not valid.");
                    }
                }
                else
                {
                    System.out.println("Not valid.");
                    garbage = myScanner.next();
                }
            }
        }
    }
}