//James Waring
//3/7/15
//waves

import java.util.Scanner;

public class waves
{
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        boolean notDone = true;
        String garbage;
        int finishN = 0;
        int finish2 = 0;
        int finish3 = 0;
        double l;
        System.out.print("Please enter an int between 1 and 30: ");
        while(notDone)
        {
            if(myScanner.hasNextDouble())
            {
                l = myScanner.nextDouble();
                    
                //checks to see if non-negative and int
                if((l >= 1) && (l%1 == 0) && (l <=30))
                {
                    finishN = (int)l;
                    finish2 = finishN;
                    finish3 = finishN;
                    notDone = false;
                }
                else
                {   
                    System.out.println("Not valid.");
                    System.out.print("Please enter an int between 1 and 30: ");
                }
            }
            else
            {
                System.out.println("Not valid.");
                System.out.print("Please enter an int between 1 and 30: ");
                garbage = myScanner.next();
            }
        }
        System.out.println();
        System.out.println("While Loops");
        System.out.println();
        int x = 1;
        while(x <= finishN)
        {
            String t;
            t = Integer.toString(x);
            if(x % 2 == 0)
            {
                int many = 1;
                int row = 1;
                while(row <= x)
                {
                    while(many <= row)
                    {
                        System.out.print(t);
                        many++;
                    }
                    System.out.println();
                    many = 1;
                    row++;
                }
                row = 1;
            }
            else
            {
                int count1 = x;
                boolean going = true;
                while(going)
                {
                    int many = count1;
                    int row = count1;
                    while(row > 0)
                    {
                        while(many > 0)
                        {
                            System.out.print(t);
                            many--;
                        }
                        row--;
                    }
                    System.out.println();
                    count1--;
                    if(count1 <= 0)
                    {
                        going = false;
                    }
                }
            }
            x++;
        }
        System.out.println();
        System.out.println("Do-While Loops");
        System.out.println();
        x = 1;
        do
        {
            String t;
            t = Integer.toString(x);
            if(x % 2 == 0)
            {
                int many = 1;
                int row = 1;
                do
                {
                    do
                    {
                        System.out.print(t);
                        many++;
                    }
                    while(many <= row);
                    System.out.println();
                    many = 1;
                    row++;
                }
                while(row <= x);
                row = 1;
            }
            else
            {
                int count1 = x;
                boolean going = true;
                do
                {
                    int many = count1;
                    int row = count1;
                    do
                    {
                        do
                        {
                            System.out.print(t);
                            many--;
                        }
                        while(many > 0);
                        row--;
                    }
                    while(row < 0);
                    System.out.println();
                    count1--;
                    if(count1 <= 0)
                    {
                        going = false;
                    }
                }
                while(going);
            }
            x++;
        }
        while(x <= finish2);
        System.out.println();
        System.out.println("For Loops");
        System.out.println();
        for(int z = 1; z <= finish3; z++)
        {
            String t;
            t = Integer.toString(z);
            if(z % 2 == 0)
            {
                for(int r = 1; r <= z; r++)
                {
                    for(int m = 1; m <= r; m++)
                    {
                        System.out.print(t);
                    }
                    System.out.println();
                }
            }
            else
            {
                int count1 = z;
                for(int r = count1; r > 0; r--)
                {
                    for(int m = count1; m > 0; m--)
                    {
                        System.out.print(t);
                    }
                    System.out.println();
                    count1--;
                }
            }
        }
    }
}