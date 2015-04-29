// James Waring
// 4/27/15
// hw13

import java.util.Scanner;

public class FourDwin
{
    public static void main(String[] args)
    {
        System.out.print("Enter an int: ");
        int X = input();
        System.out.print("Please enter a second int larger than the first: ");
        boolean notDone = true;
        int Y = 0;
        while(notDone)
        {
            Y = input();
            if(Y > X)
            {
                notDone = false;
            }
            else
            {
                System.out.print("Error~ please enter an int larger than the first: ");
            }
        }
        double[][][][] myArray = makeArray(X,Y);
        myArray = populateArray(myArray);
        System.out.println("Original Array:");
        printArray(myArray);
        myArray = sort4DArray(myArray);
        myArray = sort3DArray(myArray);
        System.out.println("Sorted Array:");
        printArray(myArray);
        statArray(myArray);
    }
    
    //gets user input
    public static int input()
    {
        Scanner myScanner = new Scanner(System.in);
        boolean notDone = true;
        int x = 0;
        while(notDone)
        {
            if(myScanner.hasNextInt())
            {
                x = myScanner.nextInt();
                if(x < 1)
                {
                    System.out.print("Error~ please enter a positive int: ");
                }
                else
                {
                    notDone = false;
                }
            }
            else
            {
                String garbage = myScanner.next();
                System.out.print("Error~ please enter an integer: ");
            }
        }
        return x;
    }
    
    //creates random number 
    public static int random(int x, int y)
    {
        int z = (int)(Math.random()*(y-x+1) + x);
        return z;
    }
    
    //creates 4D array
    public static double[][][][] makeArray(int x, int y)
    {
        double[][][][] myArray = new double[3][][][];
        for(int a = 0; a < myArray.length; a++)
        {
            myArray[a] = new double[random(x,y)][][];
            for(int b = 0; b < myArray[a].length; b++)
            {
                myArray[a][b] = new double[random(x,y)][];
                for(int c = 0; c < myArray[a][b].length; c++)
                {
                    myArray[a][b][c] = new double[random(x,y)];
                }
            }
        }
        return myArray;
    }
    
    //populates 4D array
    public static double[][][][] populateArray(double[][][][] myArray)
    {
        double[][][][] array = myArray;
        for(int a = 0; a < array.length; a ++)
        {
            for(int b = 0; b < array[a].length; b ++)
            {
                for(int c = 0; c < array[a][b].length; c ++)
                {
                    for(int d = 0; d < array[a][b][c].length; d ++)
                    {
                        double num = (Math.random()*31);
                        int num2 = (int)(num*100);
                        num = (num2/100);
                        array[a][b][c][d] = num;
                    }
                }
            }
        }
        return array;
    }
    
    //prints array stats
    public static void statArray(double[][][][] myArray)
    {
        double[][][][] array = myArray;
        double count = 0;
        double sum = 0;
        double mean = 0;
        for(int a = 0; a < array.length; a ++)
        {
            for(int b = 0; b < array[a].length; b ++)
            {
                for(int c = 0; c < array[a][b].length; c ++)
                {
                    for(int d = 0; d < array[a][b][c].length; d ++)
                    {
                        sum += array[a][b][c][d];
                        count++;
                    }
                }
            }
        }
        mean = sum/count;
        System.out.println("Sum: " + sum);
        System.out.println("Count: " + count);
        System.out.println("Mean: " + mean);
    }
    
    //sorts 4d array by size of 3d arrays
    public static double[][][][] sort4DArray(double[][][][] array)
    {
        double[][][] key;
        double[][][][] myArray = array;
        for(int a = 1; a < array.length; a ++)
        {
            key = myArray[a];
            int b = a-1;
            while((b>-1) && (myArray[b].length > key.length))
            {
                myArray[b+1] = myArray[b];
                b--;
            }
            if((b>-1) && (myArray[b].length == key.length))
            {
                double aa = 40;
                for(int c = 0; c < myArray[a].length; c ++)
                {
                    for(int e = 0; e < myArray[a][c].length; e ++)
                    {
                        for(int d = 0; d < myArray[a][c][e].length; d ++)
                        {
                            if(myArray[a][c][e][d] < aa)
                            {
                                aa = myArray[a][c][e][d];
                            }
                        }
                    }
                }
                double bb = 40;
                for(int c = 0; c < myArray[b].length; c ++)
                {
                    for(int e = 0; e < myArray[b][c].length; e ++)
                    {
                        for(int d = 0; d < myArray[b][c][e].length; d ++)
                        {
                            if(myArray[b][c][e][d] < bb)
                            {
                                bb = myArray[b][c][e][d];
                            }
                        }
                    }
                }
                if(aa < bb)
                {
                    myArray[b+1] = myArray[b];
                    b--;
                }
            }
            else
            {
                myArray[b+1] = key;
            }
        }
        return myArray;
    }
    
    //sorts 3d arrays by element value
    public static double[][][][] sort3DArray(double[][][][] array)
    {
        double[][][][] myArray = array;
        for(int a = 0; a < myArray.length; a ++)
        {
            for(int b = 0; b < myArray[a].length; b ++)
            {
                for(int c = 0; c < myArray[a][b].length; c ++)
                {
                    for(int d = 0; d < myArray[a][b][c].length-1; d ++)
                    {
                        int index = d;
                        for (int j = d + 1; j < myArray[a][b][c].length; j++)
                        {
                            if (myArray[a][b][c][j] < myArray[a][b][c][index])
                            {
                                index = j;
                            }
                        }
                        double smallerNumber = myArray[a][b][c][index]; 
                        myArray[a][b][c][index] = myArray[a][b][c][d];
                        myArray[a][b][c][d] = smallerNumber;
                    }
                }
            }
        }
        return myArray;
    }
    
    public static void printArray(double[][][][] array)
    {
        double[][][][] myArray = array;
        System.out.println("{");
        for(int a = 0; a < myArray.length; a++)
        {
           System.out.println("\t{");
           for(int b = 0; b < myArray[a].length; b++)
           {
               System.out.print("\t\t{");
               for(int c = 0; c < myArray[a][b].length; c++)
               {
                   System.out.print("{");
                   for(int d = 0; d < myArray[a][b][c].length; d++)
                   {
                       System.out.print(myArray[a][b][c][d] + ", ");
                   }
                   System.out.print("}");
               }
               System.out.println("},");
           }
           System.out.println("\t},");
        }
        System.out.println("}");
    }
}