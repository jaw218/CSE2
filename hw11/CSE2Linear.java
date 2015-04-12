// James Waring
// 4/11/15
// HW11

import java.util.Scanner;

public class CSE2Linear
{
    public static void main(String[] args)
    {
        int[] finalArray = new int[15];
        finalArray = makeArray();
        System.out.println("Your inputs...");
        printArray(finalArray);
        searchBinary(finalArray);
        finalArray = scramble(finalArray);
        System.out.println("After scrambling...");
        printArray(finalArray);
        searchLinear(finalArray);
    }
    
    public static int[] makeArray()
    {
        Scanner myScanner = new Scanner(System.in);
        int[] array = new int[15];
        boolean done = false;
        System.out.println("Enter 15 ints for CSE2 final grades: ");
        int x = 0;
        int last = 0;
        while(x < array.length)
        {
            if(myScanner.hasNextInt())
            {
                int input = myScanner.nextInt();
                if((input >= 0) && (input < 101))
                {
                    if(input >= last)
                    {
                        array[x] = input;
                        last = array[x];
                        x++;
                    }
                    else
                    {
                        System.out.println("Your input must be bigger than the previous int.");
                    }
                }
                else
                {
                    System.out.println("The int is not within the proper range.");
                }
            }
            else
            {
                String garb = myScanner.next();
                System.out.println("You must enter an int.");
            }
        }
        return array;
    }
    
    public static void printArray(int array1[])
    {
        int[] array2 = array1;
        System.out.print("Array: ");
        for(int x = 0; x < array2.length; x++)
        {
            System.out.print(array2[x] + " ");
        }
        System.out.println();
    }
    
    public static void searchBinary(int[] array1)
    {
        int[] array2 = array1;
        Scanner myScanner = new Scanner(System.in);
        boolean done = false;
        int search = 0;
        System.out.print("Enter an int: ");
        while(done == false)
        {
            if(myScanner.hasNextInt())
            {
                search = myScanner.nextInt();
                if((search >= 0) && (search < 101))
                {
                    done = true;
                }
                else
                {
                    System.out.println("You did not enter an int greater than 0.");
                }
            }
            else
            {
                String garb = myScanner.next();
                System.out.println("You did not enter an int.");
            }
        }
        done = false;
        int high = (array2.length - 1);
        int low = 0;
        int middle = (int)(((high + low)/2));
        int key;
        int count = 0;
        while(done == false)
        {
            count++;
            key = array2[middle];
            if(key == search)
            {
                count++;
                System.out.println("" + search + " was found in the list with " + count + " iterations.");
                done = true;
            }
            else
            {
                if(high == (low + 1))
                {
                    count++;
                    if(array2[high] == search)
                    {
                        System.out.println("" + search + " was found in the list with " + count + " iterations.");
                        done = true;  
                    }
                    else if(array2[low] == search)
                    {
                        System.out.println("" + search + " was found in the list with " + count + " iterations.");
                        done = true;  
                    }
                    else
                    {
                        System.out.println("" + search + " was not found in the list with " + count + " iterations.");
                        //System.out.println("The number above the key was " + array2[high] + ".");
                        //System.out.println("The number below the key was " + array2[low] + ".");
                        done = true;
                    }
                }
                if(key < search)
                {
                    low = middle;
                }
                else
                {
                    high = middle;
                }
                middle = (int)(((high + low)/2));
            }
            
        }
    }
    
    public static int[] scramble(int[] array1)
    {
        int[] array2 = array1;
        for(int i = 0; i < array2.length; i++)
        {
            int target = (int)(array2.length*Math.random());
            int temp = array2[target];
            array2[target] = array2[i];
            array2[i] = temp;
        }
        return array2;
    }
    
    public static void searchLinear(int[] array1)
    {
        int[] array2 = array1;
        Scanner myScanner = new Scanner(System.in);
        boolean done = false;
        int search = 0;
        System.out.print("Enter an int: ");
        while(done == false)
        {
            if(myScanner.hasNextInt())
            {
                search = myScanner.nextInt();
                if((search >= 0) && (search < 101))
                {
                    done = true;
                }
                else
                {
                    System.out.println("You did not enter an int greater than 0.");
                }
            }
            else
            {
                String garb = myScanner.next();
                System.out.println("You did not enter an int.");
            }
        }
        int count = 0;
        int num = 0;
        boolean notDone = true;
        int finalNum = 0;
        while(num < array2.length)
        {
            count++;
            if(array2[num] == search)
            {
                notDone = false;
                finalNum = count;
            }
            num++;
        }
        if(notDone)
        {
            System.out.println(search + " was not found in " + count + " iterations.");
        }
        else
        {
            System.out.println(search + " was found in " + finalNum + " iterations.");
        }
    }
}