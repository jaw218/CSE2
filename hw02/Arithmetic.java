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
        
        //calculates cost with and without tax for each object
        double s = socks * sCost;
        double g = glasses * gCost;
        double e = envelopes * eCost;
        double sT = socks * sCost * (1 + tax);
        double gT = glasses * gCost * (1 + tax);
        double eT = envelopes * eCost * (1 + tax);
        
        //subtotal without tax
        double sub = s + g + e;
        
        //The following lines make each price a double and multiply
        //it by 100 and then make them ints. Then we make them doubles
        //and then divide by 100 to end up with 2 decimal numbers 
        double total = sub * (1 + tax);
        
        double ss = sT * 100;
        double gg = gT * 100;
        double ee = eT * 100;
        double tTotal = total * 100;
        
        int j = (int) ss;
        int k = (int) gg;
        int l = (int) ee;
        int y = (int) tTotal;

        //System.out.println(ss + " " + j);
        //System.out.println(gg + " " + k);
        //System.out.println(ee + " " + l);
        //System.out.println(tTotal + " " + y);
        
        double q = j;
        double w = k;
        double r = l;
        double t = y;
        
        sT = q / 100;
        gT = w / 100;
        eT = r / 100;
        total = t / 100;
        
        //printing the final results
        System.out.println("3 socks, at a price of $2.58 each, without tax costs $" + s);
        System.out.println("6 drinking glasses, with a cost of $2.29 each, without tax cost $" + g);
        System.out.println("1 envelope, at a price of $3.25 each, without tax costs $" + e);
        System.out.println("3 socks with tax costs $" + sT + "0"); //ends with 8.20, but the double wont show the second 0
        System.out.println("6 drinking glasses with tax cost $" + gT);
        System.out.println("1 envelope with tax costs $" + eT);
        System.out.println("The subtotal without tax is $" + sub);
        System.out.println("The total cost including tax is $" + total);
    }
}