//James Waring
//2/26/15
//hw06 program 3

public class MakeSymbols
{
    public static void main(String[] args)
    {
        int x = (int) (Math.random() * 101);
        String y;
        
        if(x % 2 == 1)
        {
            y = "&";
        }
        else
        {
            y = "*";
        }
        System.out.println("Random number generated: " + x);
        do
        {
            System.out.print(y);
            x--;
        }
        while(x > 0);
        System.out.println();
    }
}