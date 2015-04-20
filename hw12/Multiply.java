// James Waring
// HW 12
// 4/19/15

import java.util.Scanner;

public class Multiply
{
    public static void main(String[] args)
    {
        int h1 = 0;
        int h2 = 0;
        int w1 = 0;
        int w2 = 0;
        
        boolean done = false;
        while(!done)
        {
            System.out.println("Input a height for matrix A: ");
            h1 = input();
            System.out.println("Input a height for matrix B: ");
            h2 = input();
            System.out.println("Input a width for matrix A: ");
            w1 = input();
            System.out.println("Input a width for matrix B: ");
            w2 = input();
        
            if((h1 == w2) && (h2 == w1))
            {
                done = true;
            }
            else
            {
                System.out.println("These values cannot be used to multiply matrices, please try again.");
            }
        }
        
        int[][] arrayA = randomMatrix(h1,w1);
        int[][] arrayB = randomMatrix(h2,w2);
        System.out.println("Matrix A:");
        printMatrix(arrayA);
        System.out.println("Matrix B:");
        printMatrix(arrayB);
        int[][] arrayC = multiply(arrayA, arrayB);
        System.out.println("Multiplied matrix:");
        printMatrix(arrayC);
    }
    
    public static int[][] randomMatrix(int height, int width)
    {
        int h = height;
        int w = width;
        int[][] matrix = new int[h][w];
        
        for(int x = 0; x < matrix.length; x++)
        {
            for(int y = 0; y < matrix[x].length; y++)
            {
                matrix[x][y] = (int)((Math.random() * 21) - 10);
            }
        }
        return matrix;
    }
    
     public static void printMatrix(int[][] m)
    {
        int[][] matrix = m;
        for(int x = 0; x < matrix.length; x++)
        {
            for(int y = 0; y < matrix[x].length; y++)
            {
                System.out.print(matrix[x][y] + "\t");
            }
            System.out.println();
        }
    }
    
    public static int input()
    {
        Scanner myScanner = new Scanner(System.in);
        int in = 0;
        boolean done = false;
        while(done == false)
        {
            if(myScanner.hasNextInt())
            {
                in = myScanner.nextInt();
                if(in >= 0)
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
        return in;
    }
    
    public static int[][] multiply(int[][] a, int[][] b)
    { 
        int[][] arrayA = a;
        int[][] arrayB = b;
        int[][] arrayC = new int[arrayA.length][arrayB[0].length];
        int sum = 0;
        for(int x = 0; x < arrayA.length; x++)
        {
            for(int y = 0; y < arrayB[0].length; y++)
            {   
               for(int z = 0; z < arrayB.length; z++)
               {
                  sum = sum + arrayA[x][z] * arrayB[z][y];
               }
 
               arrayC[x][y] = sum;
               sum = 0;
            }
        }
        return arrayC;
    }
}