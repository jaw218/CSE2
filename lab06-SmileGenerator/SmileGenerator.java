//James Waring
//2/27/15
//lab06 - printing smiley faces different ways using loops

public class SmileGenerator
{
    public static void main(String[] args)
    {
        //prints 5 smileys on one line
        System.out.println("Step 1");
        for(int x=0;x<5;x++)
        {
            System.out.print(":) ");
        }
        System.out.println("");
        
        System.out.println("Step 2");
        //random int between 1 and 100
        int rand = (int) (Math.random() * 100) + 1;
        int rand2 = rand;
        //prints smileys until number is incremented to zero
        while(rand > 0)
        {
            System.out.print(":)");
            rand--; //increments rand
        }
        System.out.println("");
        System.out.println("Step 3");
        int z = rand2;
        //runs until z is counted down
        while(z>0)
        {
            //prints smileys in lines of 30
            for(int y=0;y<30;y++)
            {
                System.out.print(":)");
                z--; //increments z
                if(z<1)
                {
                    break; //if z hits zero inside loop, breaks to ensure correct number printed
                }
            }
            System.out.println();
        }
        System.out.println("");
        System.out.println("Step 4");
        int amount = 1; //amount per each line
        int counter = 0; //counter for eachnline
        //prints pyramid
        while(rand2>0)
        {
            while(counter<amount)
            {
                System.out.print(":) ");
                counter++; //increments counter to print correct number per line
                rand2--; //increments total amount to be printed
                if(rand2 < 1)
                {
                    break; //if its zero in middle of line, exits loop
                }
            }
            System.out.println();
            amount++; //at end of each line, increments amount per each line
            counter = 0;
        }
    }
}