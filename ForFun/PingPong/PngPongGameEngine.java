//package lowrie_waring;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class PngPongGameEngine implements MouseMotionListener, GameConstants, Runnable, KeyListener {
private PngPongTable table;
public int kidRacket_Y = KID_RACKET_Y_START;
public int kidRacket_X = KID_RACKET_X_START;
public boolean isServed = false;
public boolean canBounce = false;
public int ballx = 25;
public int bally = 110;
public boolean moveRight = true;
public boolean moveDown = true;
public int ComputerRacket_Y = COMPUTER_RACKET_Y_START;
private int verticalSlide = 2;
private boolean newGameFlag;
private boolean serveFlag;
private int playerScore = 0;
private int compScore = 0;
public int countcomp = 0;
public boolean threadStart = false;
Thread x = new Thread(this);
public int color = 1;
public int random = 1;
public int sleep = 20;
//enhancement 1 = thread speeds up each hit
//enhancement 2 = board is longer
//enhancement 3 = use arrow keys
//enhancement 4 = board changes color
//enhancement 5 = computer stops hitting ball at random time

PngPongGameEngine(PngPongTable table)
{
	this.table = table;		
}


public void mouseMoved(MouseEvent e)
{
	
	
}
@Override
public void mouseDragged(MouseEvent arg0) 
{
	
}

@Override
//for when a keyboard button is pressed
public void keyPressed(KeyEvent k)
{
	//System.out.println(k.getKeyCode());
	switch(k.getKeyCode())
	{
	//enhancement - down arrowkey is pressed
	case KeyEvent.VK_DOWN:
	//moves paddle down
		if(kidRacket_Y+21 < TABLE_BOTTOM)
		{
			kidRacket_Y += RACKET_INCREMENT;
		}
		table.setKidRacket_Y(kidRacket_Y);
		table.repaint();
		try {
			Thread.sleep(5);
		} catch (InterruptedException f) {
			f.printStackTrace();
		}
		break;
	//up arrowkey is pressed
	case KeyEvent.VK_UP:
	//moves paddle up
		if(kidRacket_Y > TABLE_TOP)
		{
			kidRacket_Y -= RACKET_INCREMENT;
		}
		table.setKidRacket_Y(kidRacket_Y);
		table.repaint();
		try {
			Thread.sleep(5);
		} catch (InterruptedException f) {
			// TODO Auto-generated catch block
			f.printStackTrace();
		}
		break;
		//s key is pressed
	case KeyEvent.VK_S:
		{
			
			
			if((isServed == false) && (newGameFlag == true) && (serveFlag == true))
			{
				//for every other serve
				isServed = true;
				table.setBally(kidRacket_Y + 11);
				bally = kidRacket_Y + 11;
				table.setBallx(kidRacket_X - 15);
				ballx = kidRacket_X -15;
				moveRight = false;
			}
			
			if ((serveFlag == false) && (newGameFlag == true))
			{
				//for first serve
				if(threadStart == false)
				{
				x.start();
				threadStart = true;
				}
				serveFlag = true;
				isServed = true;
				table.setBally(kidRacket_Y + 11);
				bally = kidRacket_Y + 11;
				table.setBallx(kidRacket_X - 15);
				ballx = kidRacket_X -15;
				moveRight = false;
				
			}
		}
		break;
	case KeyEvent.VK_N:
		//starts a new game
		{
			if(newGameFlag == false)
			{
				newGameFlag = true;
				compScore = 0;
				countcomp = 0;
				sleep = 20;
				playerScore = 0;
				ballx = 205;
				table.setBallx(205);
				bally = 110;
				table.setBally(110);
				table.setKidRacket_Y(100);
				table.setComputerRacket_Y(100);
				displayScore();
				table.repaint();
			}
		}
		break;
	case KeyEvent.VK_Q:
		{
			//quits the game
			System.exit(0);
		}
		break;
		default:
		{
		
		}
		break;
	
	}

	
}

@Override
public void keyReleased(KeyEvent arg0) 
{
		
}

@Override
public void keyTyped(KeyEvent arg0) 
{
	
}

public void displayScore()
{

	if(compScore >= WINNING_SCORE)
	//if the computer scores 5, they win
	{
		table.setLabel("The Computer Wins!!!");
		newGameFlag = false;
		table.setColorNumber(1);
	}
	else if(playerScore >= WINNING_SCORE)
	{
	//if player scores 5, they win
		table.setLabel("You Win!!!");
		newGameFlag = false;
		table.setColorNumber(1);
	}
	else
	{
		//displays the score at the bottom
		table.setLabel("Comp: " + compScore + "   Player: " + playerScore);
	}
	
}

public void run()
{
	//runs the game
	while(true){
	//while game is being run and ball is in bounds
		while(ballx >= 15 && ballx <= 396)
		{
		//if the ball has been served
		if(isServed){
			
			if(moveRight == true)
			{
				//ball moves to the right
				ballx += BALL_INCREMENT;
				table.setBallx(ballx);
				//random shows when the computer stops moving its paddle-enhancement
				random = 5 + (int) (Math.random() * 4);
				
				
				if((ballx >= 395 && ballx <= 397) &&(bally <= kidRacket_Y+RACKET_LENGTH && bally >= kidRacket_Y-5))
				{
					//checks to see if the ball is hitting the player's paddle
					canBounce = true;
					
				}
				if(canBounce == true && ballx >= 395)
				{
					//if it hits the paddle, ball starts to go left
					moveRight = false;
					canBounce = false;
					
				}
				
			}
			else if(moveRight == false)
			{
				//ball moves right
				ballx -= BALL_INCREMENT;
				table.setBallx(ballx);
				
				if((ballx <= 18 && ballx >= 16) &&((bally <= ComputerRacket_Y+RACKET_LENGTH) && (bally >= ComputerRacket_Y)))
				{
					//checks to see if the ball is hitting the computer's paddle
					canBounce = true;
				}
				if(canBounce == true && ballx <= 18)
				{
					//if it hits the computer's paddle, starts to go right
					moveRight = true;
					canBounce = false;
					countcomp += 1;
					
					
				}
				//the enhancement that randomly stops the computer paddle after a random amount of hits
				if(countcomp < random)
				{
				if(bally > ComputerRacket_Y+15)
				{
					ComputerRacket_Y += 2;
					
				}
				else if(bally < ComputerRacket_Y+15)
				{
					ComputerRacket_Y -= 2;
				}
				table.setComputerRacket_Y(ComputerRacket_Y);
				}				
			}
			
			if(moveDown == true)
			{
				//moves the ball along the y axis
				bally += verticalSlide;
				table.setBally(bally);
				
				if(bally <= TABLE_TOP)
				{
					//bounces the ball off the bottom
					moveDown = true;
				}
				else if(bally >= TABLE_BOTTOM)
				{
					//bounces the ball off the top
					moveDown = false;
				}
			}
			else if(moveDown == false)
			{
				//moves the ball along the y axis
				bally -= verticalSlide;
				table.setBally(bally);
				if(bally <= TABLE_TOP-4)
				{
					moveDown = true;
				}
				else if(bally >= TABLE_BOTTOM)
				{
					moveDown = false;
				}
			}						
			
			try {
				Thread.sleep(sleep);
			} catch (InterruptedException e) {
			e.printStackTrace();
			}
			table.repaint();
		
			if(ballx < 15)
			{
			//player scores
			playerScore += 1;
			//countcomp is amt of times computer hit the ball - NOT THE COMPUTER SCORE
			countcomp = 0;
			color += 1;
			table.setColorNumber(color);
			//enhancement, makes it faster as you score
				if(sleep >= 5)
				{
					sleep -= 3;
				}
			}
			if(ballx > 396)
			{
			//computer scores
			compScore += 1;
			countcomp = 0;
			color += 1;
			table.setColorNumber(color);
			//enhancement, makes it faster as you score
			if(sleep >= 5)
			{
				sleep -= 3;
			}
			}
		
			if((ballx < 15 )||( ballx >396))
			{
				//checks to see if the ball is out of bounds, resets serve
				isServed = false;
			}		
		}
		displayScore();
	}	
	}	
}
}

