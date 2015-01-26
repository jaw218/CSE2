
public class Card {

	public int v;
	public String n;
	
	public void makeCard(int v, String n)
	{
		this.v = v;
		this.n = n;
	}
	
	public String getName()
	{
		return n;
	}
	
	public int getValue()
	{
		return v;
	}
}
