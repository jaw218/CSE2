// James Waring
// 4/17/15
// Matrices Lab

import java.util.Scanner;

public class Matrices
{
    public static void main(String[] args)
    {
        int h1 = (int)(Math.random() * 6 + 1);
        int h2 = (int)(Math.random() * 6 + 1);
        int w1 = (int)(Math.random() * 6 + 1);
        int w2 = (int)(Math.random() * 6 + 1);
        int[][] matrixA = increasingMatrix(w1, h1, true);
        int[][] matrixB = increasingMatrix(w1, h1, false);
        int[][] matrixC = increasingMatrix(w2, h2, true);
        System.out.println("Matrix A: ");
        printMatrix(matrixA, true);
        
        System.out.println("Matrix B: ");
        printMatrix(matrixB, false);
        
        System.out.println("Matrix C: ");
        printMatrix(matrixC, true);
        
        System.out.println("Matrix A translated: ");
        int[][] matrixAT = translate(matrixA);
        printMatrix(matrixAT, true);
        
        System.out.println("Matrix B translated: ");
        int[][] matrixBT = translate(matrixA);
        printMatrix(matrixBT, true);
        
        System.out.println("Matrix C translated: ");
        int[][] matrixCT = translate(matrixC);
        printMatrix(matrixCT, true);
        
        System.out.println("Adding:");
        printMatrix(matrixA, true);
        System.out.println("to:");
        printMatrix(matrixB, false);
        System.out.println("Equals:");
        add(matrixA, true, matrixB, false);
        
        System.out.println("Adding:");
        printMatrix(matrixA, true);
        System.out.println("to:");
        printMatrix(matrixC, false);
        System.out.println("Equals:");
        add(matrixA, true, matrixC, false);
    }
    
    public static int[][] increasingMatrix(int h1, int w1, boolean rM1)
    {
        int w = w1;
        int h = h1;
        boolean rM = rM1;
        int[][] matrix = new int[h][w];
        int z = 0;
        if(rM)
        {
            for(int x = 0; x < matrix.length; x++)
            {
                for(int y = 0; y < matrix[x].length; y++)
                {
                    matrix[x][y] = z;
                    z++;
                }
            }
        }
        if(!rM)
        {
            int d = 1;
            for(int x = 0; x < matrix.length; x++)
            {
                for(int y = 0; y < matrix[x].length; y++)
                {
                    matrix[x][y] = z;
                    z += (h);
                }
                z = d++;
            }
        }
        return matrix;
    }
    
    public static void printMatrix(int[][] m, boolean f)
    {
        int[][] matrix = m;
        boolean format = f; //dont need to use by my way of populating array
        for(int x = 0; x < matrix.length; x++)
        {
            for(int y = 0; y < matrix[x].length; y++)
            {
                System.out.print(matrix[x][y] + "\t");
            }
            System.out.println();
        }
    }
    
    public static int[][] translate(int[][] matrix)
    {
        //[h][w]
        int[][] matrix1 = matrix;
        int w = matrix1.length;
        int h = matrix1[0].length;
        int[][] matrix2 = new int[h][w];
        for(int x = 0; x < matrix1.length; x++)
        {
            for(int y = 0; y < matrix1[x].length; y++)
            {
                matrix2[y][x] = matrix1[x][y];
            }
        }
        return matrix2;
    }
    
    public static void add(int[][] m1, boolean formata, int[][] m2, boolean formatb)
    {
        int[][] matrixa = m1;
        int[][] matrixb = m2;
        int h1 = matrixa.length;
        int h2 = matrixb.length;
        int w1 = matrixa[0].length;
        int w2 = matrixb[0].length;
        
        if((h1 == h2) && (w1 == w2))
        {
            int[][] matrixc = new int[h1][w1];
            for(int x = 0; x < matrixa.length; x++)
            {
                for(int y = 0; y < matrixa[x].length; y++)
                {
                    matrixc[x][y] = (matrixa[x][y] + matrixb[x][y]);
                }
            }
            printMatrix(matrixc, true);
        }
        else
        {
            System.out.println("Can not add matrices");
        }
    }
}