//James Waring
//CSE2
//2/10/15
//hw03


import java.util.Scanner;   //importing Scanner

//defining class
public class FourDigits
{
    //main method
    public static void main(String[] args)
    { 
        
        //instantiating scanner
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        //user input
        System.out.print("Please enter a double with four digits after the decimal point: " );
        double number = myScanner.nextDouble();
        
        //arithmetic to get 4 decimals alone
        int numberOne = (int) number;  //cast to int to get whole number
        double numberTwo = numberOne * 10000;   //multiple by 10000 to get to correct place value
        double numberThree = number * 10000;    //take original number by 10000 to get to correct place value while holding accuracy
        double numberFour = numberThree % numberTwo;    //take modulus to get remainder of both products
        int numberFive = (int) numberFour;     //cast back to int to remove extra decimal place while printing
        
        //print of the first four digits
        System.out.println("The four digits to the right of the decimal are: " + numberFive);
        
    }
    
}
        