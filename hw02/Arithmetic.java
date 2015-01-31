//James Waring
//
//hw02 1/31/15
//Arithmetic
//

//create class
public class Arithmetic
{
    //main method
    public static void main(String[] args)
    {
        //variables
        int socks = 3;
        int glasses = 6;
        int envelopes = 1;
        
        double sCost = 2.58;
        double gCost = 2.29;
        double eCost = 3.25;
        
        double tax = 0.06;
        
        //math
        double s = socks * sCost;
        double g = glasses * gCost;
        double e = envelopes * eCost;
        double sT = socks * sCost * (1 + tax);
        double gT = glasses * gCost * (1 + tax);
        double eT = envelopes * eCost * (1 + tax);
        
        double sub = s + g + e;
        
        double total = sub * (1 + tax);
        
        int ss = (int) (s * 100);
        int gg = (int) (g * 100);
        int ee = (int) (e * 100);
        int tTotal = (int) (total * 100);
        
        sT = ss / 100;
        gT = gg / 100;
        eT = ee / 100;
        total = tTotal / 100;
        
        //printing
        System.out.println("3 socks with tax costs $" + sT);
        System.out.println("6 drinking glasses with tax cost $" + gT);
        System.out.println("1 envelope with tax costs $" + eT);
        System.out.println("The subtotal without tax is $" + sub);
        System.out.println("The total cost including tax is $" + total);
    }
}