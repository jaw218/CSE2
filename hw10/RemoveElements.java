// James Waring
// 4/6/15
// hw10


import java.util.Scanner;


public class RemoveElements
{
    public static void main(String [] arg)
    {
    	Scanner scan=new Scanner(System.in);
        int num[]=new int[10];
        int newArray1[];
        int newArray2[];
        int index,target;
	    String answer="";
    	do{
  	        System.out.print("Random input 10 ints [0-9]");
          	num = randomInput();
      	    String out = "The original array is:";
      	    out += listArray(num);
          	System.out.println(out);
 
          	System.out.print("Enter the index ");
          	index = scan.nextInt();
          	newArray1 = delete(num,index);
          	String out1="The output array is ";
          	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
          	System.out.println(out1);
 
            System.out.print("Enter the target value ");
            target = scan.nextInt();
          	newArray2 = remove(num,target);
          	String out2="The output array is ";
          	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
          	System.out.println(out2);
      	 
          	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
          	answer=scan.next();
    	}
        	while(answer.equals("Y") || answer.equals("y"));
    }
 
    public static String listArray(int num[])
    {
    	String out="{";
    	for(int j=0;j<num.length;j++)
    	{
          	if(j>0){
    	    out+=", ";
      	}
  	    out+=num[j];
    	}
    	out+="} ";
	    return out;
    }
    
    public static int[] randomInput()
    {
        int[] x = new int[10];
        for(int y = 0; y < x.length; y++)
        {
            x[y] = (int)(Math.random() * 10);
        }
        return x;
    }
    
    public static int[] delete(int[] list, int pos)
    {
        int[] y;
        int[] x = list;
        int g = pos;
        if((g > x.length-1) || (g<0))
        {
            System.out.println("Your choice is out of range, nothing will be changed.");
            y = x;
        }
        else
        {
            boolean removed = false;
            y = new int[(x.length -1)];
            for(int z = 0; z < x.length; z++)
            {
                if(removed == false)
                {
                    if(z != g)
                    {
                        y[z] = x[z];
                    }
                    else
                    {
                        removed = true;
                        System.out.println("Index " + g + " was removed.");
                    }
                }
                else
                {
                    y[(z-1)] = x[z];
                }
            }
        }
        return y;
    }
    
    public static int[] remove(int[] list, int target)
    {
        int[] x = list;
        int g = target;
        int size = 0;
        for(int y = 0; y < x.length; y++)
        {
            if(x[y] != g)
            {
                size += 1;
            }
        }
        int[] y = new int[size];
        int f = 0;
        boolean removed = false;
        for(int z = 0; z < x.length; z++)
        {
            if(x[z] != g)
            {
                y[f] = x[z];
                f++;
            }
            else
            {
                removed = true;
            }
        }
        if(removed == true)
        {
            System.out.println("The target " + g + " was found and removed.");
        }
        else
        {
            System.out.println("The target " + g + " was not found.");
        }
        return y;
    }
}
