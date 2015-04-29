// James Waring
// 4/9/15
// lab 11

import java.util.Scanner;

public class Search
{
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        int[] array1 = new int[50];
        int[] array2 = new int[50];
        boolean done = false;
        for(int x = 0; x < array1.length; x++)
        {
            array1[x] = (int)(Math.random() * 101);
        }
        int last = 0;
        for(int x = 0; x< array2.length; x++)
        {
            int num = (int)(Math.random() * 101);
            array2[x] = last + num;
            last = array2[x];
        }
        int min1 = 100;
        int max1 = 0;
        for(int x = 0; x < array1.length; x++)
        {
            if(array1[x] > max1)
            {
                max1 = array1[x];
            }
            if(array1[x] < min1)
            {
                min1 = array1[x];
            }
        }
        int min2 = 10000;
        int max2 = 0;
        for(int x = 0; x < array2.length; x++)
        {
            if(array2[x] > max2)
            {
                max2 = array2[x];
            }
            if(array2[x] < min2)
            {
                min2 = array2[x];
            }
        }
        System.out.println("The minimum of array1 is " + min1 + ".");
        System.out.println("The maximum of array1 is " + max1 + ".");
        System.out.println("The minimum of array2 is " + min2 + ".");
        System.out.println("The maximum of array2 is " + max2 + ".");
        int search = 0;
        System.out.print("Enter an int: ");
        if(myScanner.hasNextInt())
        {
            search = myScanner.nextInt();
            if(search >= 0)
            {
                
            }
            else
            {
                System.out.println("You did not enter an int greater than 0.");
                System.exit(0);
            }
        }
        else
        {
            System.out.println("You did not enter an int.");
            System.exit(0);
        }
        int high = (array2.length - 1);
        int low = 0;
        int middle = (int)(((high + low)/2) + 1);
        int key;
        while(done == false)
        {
            key = array2[middle];
            if(key == search)
            {
                System.out.println("" + search + " was found in the list.");
                done = true;
            }
            else
            {
                if(high == (low + 1))
                {
                    if(array2[high] == search)
                    {
                        System.out.println("" + search + " was found in the list.");
                        done = true;  
                    }
                    else if(array2[low] == search)
                    {
                        System.out.println("" + search + " was found in the list.");
                        done = true;  
                    }
                    else
                    {
                        System.out.println("" + search + " was not found in the list.");
                        System.out.println("The number above the key was " + array2[high] + ".");
                        System.out.println("The number below the key was " + array2[low] + ".");
                        done = true;
                    }
                }
                if(key < search)
                {
                    low = middle+1;
                }
                else
                {
                    high = middle-1;
                }
                middle = (int)(((high + low)/2));
            }
            
        }
    }
}