// James Waring
// 3/26/15
// Lab 9

public class Methods
{
    public static void main(String[] args)
    {
        int a = (int)(Math.random() * 10);
        int b = (int)(Math.random() * 10);
        int c = (int)(Math.random() * 10);
        int d = (int)(Math.random() * 10);
        int e = (int)(Math.random() * 10);
        int f = (int)(Math.random() * 10);
        
        System.out.println("The "+wordOne(a)+" "+wordOne(b)+" "+wordTwo(c)+" "+wordThree(d)+" the "+wordOne(e)+" "+wordFour(f)+"."); 
    }
    
    //adjective
    public static String wordOne(int x)
    {
        String result = "";
        int w = x;
        switch(w)
        {
            case 0:
                result = "awesome";
                break;
            case 1:
                result = "lame";
                break;
            case 2:
                result = "slow";
                break;
            case 3:
                result = "boring";
                break;
            case 4:
                result = "serious";
                break;
            case 5:
                result = "flamboyant";
                break;
            case 6:
                result = "loud";
                break;
            case 7:
                result = "dope";
                break;
            case 8:
                result = "ominous";
                break;
            case 9:
                result = "colorful";
                break;
    
        }
        return result;
    }
    
    //subject
    public static String wordTwo(int x)
    {
        String result = "";
        int w = x;
        switch(w)
        {
            case 0:
                result = "pig";
                break;
            case 1:
                result = "cow";
                break;
            case 2:
                result = "construction worker";
                break;
            case 3:
                result = "ballerina";
                break;
            case 4:
                result = "truck";
                break;
            case 5:
                result = "basketball";
                break;
            case 6:
                result = "professor";
                break;
            case 7:
                result = "child";
                break;
            case 8:
                result = "chicken";
                break;
            case 9:
                result = "airplane";
                break;
        }
        return result;
    }
    
    //verb
    public static String wordThree(int x)
    {
        String result = "";
        int w = x;
        switch(w)
        {
            case 0:
                result = "passed";
                break;
            case 1:
                result = "swallowed";
                break;
            case 2:
                result = "drank";
                break;
            case 3:
                result = "elevated";
                break;
            case 4:
                result = "pumped-up";
                break;
            case 5:
                result = "enraged";
                break;
            case 6:
                result = "struck";
                break;
            case 7:
                result = "smote";
                break;
            case 8:
                result = "electrocuted";
                break;
            case 9:
                result = "pummeled";
                break;
        
        }
        return result;
    }
    
    //object
    public static String wordFour(int x)
    {
        String result = "";
        int w = x;
        switch(w)
        {
            case 0:
                result = "dragon";
                break;
            case 1:
                result = "lobster";
                break;
            case 2:
                result = "house";
                break;
            case 3:
                result = "university";
                break;
            case 4:
                result = "ruit table";
                break;
            case 5:
                result = "TA";
                break;
            case 6:
                result = "computer";
                break;
            case 7:
                result = "floss";
                break;
            case 8:
                result = "toilet paper";
                break;
            case 9:
                result = "bazooka";
                break;
        }
        return result;
    }
}