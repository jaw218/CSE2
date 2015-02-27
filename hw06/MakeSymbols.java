//James Waring
//2/26/15
//hw06 program 3

public class MakeSymbols
{
    public static void main(String[] args)
    {
        //creates rando int between 0 and 100
        int x = (int) (Math.random() * 101);
        String y;
        
        if(x % 2 == 1) //checks if odd
        {
            y = "&";
        }
        else // if even
        {
            y = "*";
        }
        System.out.println("Random number generated: " + x);
        //prints correct amount of either * or &
        do
        {
            System.out.print(y);
            x--;
        }
        while(x > 0);
        System.out.println();
    }
}