// James Waring
// 4/24/15
// Lab 13

public class RaggedSort
{

    public static void main(String[] args)
    {
        int[][] myArray = create();
        myArray = populate(myArray);
        System.out.println("Before sorting:");
        print(myArray);
        myArray = sort(myArray);
        System.out.println("After sorting:");
        print(myArray);
        myArray = copy(myArray);
        System.out.println("After copying:");
        print(myArray);
    }

    public static int[][] create()
    {
        int[][] myArray = new int[5][];
        for(int x = 0; x < myArray.length; x++)
        {
            myArray[x] = new int[x*3+5];
        }
        return myArray;
    }

    public static int[][] populate(int[][] array)
    {
        int[][] myArray = array;
        for(int x = 0; x < myArray.length; x++)
        {
            for(int y = 0; y < myArray[x].length; y++)
            {
                myArray[x][y] = (int)(Math.random() * 40);
            }
        }
        return myArray;
    }

    public static void print(int[][] array)
    {
        int[][] myArray = array;
        for(int x = 0; x < myArray.length; x++)
        {
            int z = x + 1;
            System.out.print("Row" + z + ": \t");
            for(int y = 0; y < myArray[x].length; y++)
            {
                System.out.print(myArray[x][y] + "\t");
            }
            System.out.println();
        }
    }
    
    public static int[][] sort(int[][] array)
    {
        int[][] myArray = array;
        int temp;
        for(int x = 0; x < myArray.length; x++)
        {
            for(int y = 1; y < myArray[x].length; y++)
            {
                for(int z = y; z > 0; z--)
                {
                    if(myArray[x][z] < myArray[x][z-1])
                    {
                        temp = myArray[x][z];
                        myArray[x][z] = myArray[x][z-1];
                        myArray[x][z-1] = temp;
                    }
                }
            }
        }
        return myArray;
    }
    
    public static int[][] copy(int[][] array)
    {
        int[][] myArray = array;
        int[][] newArray = new int[5][17];
        for(int x = 0; x < myArray.length; x++)
        {
            for(int y = 0; y < myArray[x].length; y++)
            {
                newArray[x][y] = myArray[x][y];
            }
        }
        return newArray;
    }
}