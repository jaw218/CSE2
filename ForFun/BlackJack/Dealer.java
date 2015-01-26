import java.util.*;

public class Dealer extends Player {

	ArrayList hand2 = new ArrayList();
	int count = 0;
	int cardcount = 0;
	
	public Dealer()
	{
		
	}
	
	public void takeCard(Card e)
	{
		String i = null;
		hand2.add(e);
		String q = e.getName();
		int s = e.getValue();
		if((q.charAt(0) == 'a') && (q.charAt(1) == 's'))
				{
					i = "ace of spades";
				}
		else if((q.charAt(0) == 'a') && (q.charAt(1) == 'd'))
				{
					i = "ace of diamonds";
				}
		else if((q.charAt(0) == 'a') && (q.charAt(1) == 'h'))
				{
					i = "ace of hearts";
				}
		else if((q.charAt(0) == 'a') && (q.charAt(1) == 'c'))
				{
					i = "ace of clubs";
				}
		
		else if((q.charAt(0) == '1') && (q.charAt(1) == 's'))
				{
					i = "one of spades";
				}
		else if((q.charAt(0) == '1') && (q.charAt(1) == 'd'))
				{
					i = "one of diamonds";
				}
		else if((q.charAt(0) == '1') && (q.charAt(1) == 'h'))
				{
					i = "one of hearts";
				}
		else if((q.charAt(0) == '1') && (q.charAt(1) == 'c'))
				{
					i = "one of clubs";
				}
		
else if((q.charAt(0) == '2') && (q.charAt(1) == 's'))
		{
			i = "two of spades";
		}
else if((q.charAt(0) == '2') && (q.charAt(1) == 'd'))
		{
			i = "two of diamonds";
		}
else if((q.charAt(0) == '2') && (q.charAt(1) == 'h'))
		{
			i = "two of hearts";
		}
else if((q.charAt(0) == '2') && (q.charAt(1) == 'c'))
		{
			i = "two of clubs";
		}
		
else if((q.charAt(0) == '3') && (q.charAt(1) == 's'))
{
	i = "three of spades";
}
else if((q.charAt(0) == '3') && (q.charAt(1) == 'd'))
{
	i = "three of diamonds";
}
else if((q.charAt(0) == '3') && (q.charAt(1) == 'h'))
{
	i = "three of hearts";
}
else if((q.charAt(0) == '3') && (q.charAt(1) == 'c'))
{
	i = "three of clubs";
}
		
else if((q.charAt(0) == '4') && (q.charAt(1) == 's'))
{
	i = "four of spades";
}
else if((q.charAt(0) == '4') && (q.charAt(1) == 'd'))
{
	i = "four of diamonds";
}
else if((q.charAt(0) == '4') && (q.charAt(1) == 'h'))
{
	i = "four of hearts";
}
else if((q.charAt(0) == '4') && (q.charAt(1) == 'c'))
{
	i = "four of clubs";
}
		
else if((q.charAt(0) == '5') && (q.charAt(1) == 's'))
{
	i = "five of spades";
}
else if((q.charAt(0) == '5') && (q.charAt(1) == 'd'))
{
	i = "five of diamonds";
}
else if((q.charAt(0) == '5') && (q.charAt(1) == 'h'))
{
	i = "five of hearts";
}
else if((q.charAt(0) == '5') && (q.charAt(1) == 'c'))
{
	i = "five of clubs";
}
		
else if((q.charAt(0) == '6') && (q.charAt(1) == 's'))
{
	i = "six of spades";
}
else if((q.charAt(0) == '6') && (q.charAt(1) == 'd'))
{
	i = "six of diamonds";
}
else if((q.charAt(0) == '6') && (q.charAt(1) == 'h'))
{
	i = "six of hearts";
}
else if((q.charAt(0) == '6') && (q.charAt(1) == 'c'))
{
	i = "six of clubs";
}
		
else if((q.charAt(0) == '7') && (q.charAt(1) == 's'))
{
	i = "seven of spades";
}
else if((q.charAt(0) == '7') && (q.charAt(1) == 'd'))
{
	i = "seven of diamonds";
}
else if((q.charAt(0) == '7') && (q.charAt(1) == 'h'))
{
	i = "seven of hearts";
}
else if((q.charAt(0) == '7') && (q.charAt(1) == 'c'))
{
	i = "seven of clubs";
}
		
else if((q.charAt(0) == '8') && (q.charAt(1) == 's'))
{
	i = "eight of spades";
}
else if((q.charAt(0) == '8') && (q.charAt(1) == 'd'))
{
	i = "eight of diamonds";
}
else if((q.charAt(0) == '8') && (q.charAt(1) == 'h'))
{
	i = "eight of hearts";
}
else if((q.charAt(0) == '8') && (q.charAt(1) == 'c'))
{
	i = "eight of clubs";
}

else if((q.charAt(0) == '9') && (q.charAt(1) == 's'))
{
	i = "nine of spades";
}
else if((q.charAt(0) == '9') && (q.charAt(1) == 'd'))
{
	i = "nine of diamonds";
}
else if((q.charAt(0) == '9') && (q.charAt(1) == 'h'))
{
	i = "nine of hearts";
}
else if((q.charAt(0) == '9') && (q.charAt(1) == 'c'))
{
	i = "nine of clubs";
}
		
else if((q.charAt(0) == 't') && (q.charAt(1) == 's'))
{
	i = "ten of spades";
}
else if((q.charAt(0) == 't') && (q.charAt(1) == 'd'))
{
	i = "ten of diamonds";
}
else if((q.charAt(0) == 't') && (q.charAt(1) == 'h'))
{
	i = "ten of hearts";
}
else if((q.charAt(0) == 't') && (q.charAt(1) == 'c'))
{
	i = "ten of clubs";
}		
		
else if((q.charAt(0) == 'j') && (q.charAt(1) == 's'))
{
	i = "jack of spades";
}
else if((q.charAt(0) == 'j') && (q.charAt(1) == 'd'))
{
	i = "jack of diamonds";
}
else if((q.charAt(0) == 'j') && (q.charAt(1) == 'h'))
{
	i = "jack of hearts";
}
else if((q.charAt(0) == 'j') && (q.charAt(1) == 'c'))
{
	i = "jack of clubs";
}
	
		
else if((q.charAt(0) == 'q') && (q.charAt(1) == 's'))
{
	i = "queen of spades";
}
else if((q.charAt(0) == 'q') && (q.charAt(1) == 'd'))
{
	i = "queen of diamonds";
}
else if((q.charAt(0) == 'q') && (q.charAt(1) == 'h'))
{
	i = "queen of hearts";
}
else if((q.charAt(0) == 'q') && (q.charAt(1) == 'c'))
{
	i = "queen of clubs";
}
	
		
else if((q.charAt(0) == 'k') && (q.charAt(1) == 's'))
{
	i = "king of spades";
}
else if((q.charAt(0) == 'k') && (q.charAt(1) == 'd'))
{
	i = "king of diamonds";
}
else if((q.charAt(0) == 'k') && (q.charAt(1) == 'h'))
{
	i = "king of hearts";
}
else if((q.charAt(0) == 'k') && (q.charAt(1) == 'c'))
{
	i = "king of clubs";
}
		
		
else if((q.charAt(0) == 'a') && (q.charAt(1) == 's'))
{
	i = "ace of spades";
}
else if((q.charAt(0) == 'a') && (q.charAt(1) == 'd'))
{
	i = "ace of diamonds";
}
else if((q.charAt(0) == 'a') && (q.charAt(1) == 'h'))
{
	i = "ace of hearts";
}
else if((q.charAt(0) == 'a') && (q.charAt(1) == 'c'))
{
	i = "ace of clubs";
}
		System.out.println("The dealer drew a " + i + ".");
		if((q.charAt(0) == 'a') && (count >10))
		{
			count += 1;
		}
		else
		{
			count += s;
		}
		
			cardcount ++;
			
			
	}
	
	public int getCount()
	{
		return count;
	}
	
	public int getCardCount()
	{
		return cardcount;
	}
	public void setCount(int count)
	{
		this.count = count;
	}
	
	public void setCardCount(int cardcount)
	{
		this.cardcount = cardcount;
	}
	public void clearHand()
	{
		while(hand2.size() != 0)
		{
		int x = ((int) (Math.random() * (hand2.size()) - 1));
		hand2.remove(x);
		}
	}
}
