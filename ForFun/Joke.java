//James Waring
//
//Joke.java
//
public class Joke
{
    
    int x = 0;
    
    public static void main(String[] args)
    {
        Joke joke = new Joke();
        int x = ((int) (Math.random() * 9));
        joke.pickJoke(x);
    }
    
    public void pickJoke(int joke)
    {
        if(joke == 0)
        {
            System.out.println("Where does a suicide bomber go after he dies?");
            System.out.println();
            System.out.println("Everywhere.");
        }
        else if(joke == 1)
        {
            System.out.println("If I had a dollar for every time a girl found me attractive eventually they'd find me attractive.");
        }
        else if(joke == 2)
        {
            System.out.println("My wife left me for an Indian guy, but it's okay I know he'll treat her well.");
            System.out.println("I heard they worship cows.");
        }
        else if(joke == 3)
        {
            System.out.println("Gabe's work ethic.");
        }
        else if(joke == 4)
        {
            System.out.println("Joe is the realest nigga... Sike!");
        }
        else if(joke == 5)
        {
            System.out.println("Matt Rothberg's apparent over-compensation for his small dick.");
        }
        else if(joke == 6)
        {
            System.out.println("Shmegma.");
        }
        else if(joke == 7)
        {
            System.out.println("There will only be 7 planets left after I destroy Uranus.");
        }
        else if(joke == 8)
        {
            System.out.println("Choice Housing.");
        }
    }
}