//
//James Waring
//lab02
//Cyclometer program
//
//
//define a class
public class Cyclometer
{
    
    //add a main method
    public static void main(String[] args)
    {
        //declare and initialize variables
        int t1 = 480;  //time in seconds
        int t2 = 3220;
        int c1 = 1561;  //revolutions
        int c2 = 9037;
        double d1;
        double d2;
        double dc;
    
        //useful constants
        double wd = 27.0;
        double PI = 3.14159;
        int fpm = 5280;
        int ipf = 12;
        int spm = 60;
        
        //printing initial values
        System.out.println("Trip one had " + c1 + "counts and " + (t1/spm) + " minutes.");
        System.out.println("Trip two had " + c2 + "counts and " + (t2/spm) + " minutes.");
        
        d1 = c1*PI*wd;  //converts to inches
        d2 = c2*PI*wd;
        d1 /= ipf;  //converts to feet
        d2 /= ipf;
        d1 /= fpm;  //converts to miles
        d2 /= fpm;
        dc = d1 + d2;
        
        //printing final values
        System.out.println("Number of miles in trip 1 was " + d1 + " miles");
        System.out.println("Number of miles in trip 1 was " + d2 + " miles");
        System.out.println("Total distance travelled was " + dc + " miles");
        
    }
}