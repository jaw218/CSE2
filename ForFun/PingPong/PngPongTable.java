//package lowrie_waring;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
import java.awt.Point;
import java.awt.Dimension;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Color;

public class PngPongTable extends JPanel implements GameConstants {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
JLabel label;
public Point point = new Point(0,0);
public int ComputerRacket_X = 15;
private int kidRacket_Y= KID_RACKET_Y_START;
private int ballx = 205;
private int bally = 110;
private int ComputerRacket_Y = COMPUTER_RACKET_Y_START;
Dimension preferredSize = new Dimension(TABLE_WIDTH, TABLE_HEIGHT);
public int colornumber = 1;


	public static void main(String[] args)
	{
		//creates the containers
		JFrame f = new JFrame("Png Pong Red Table");
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		PngPongTable table = new PngPongTable();
		table.addPaneltoFrame(f.getContentPane());
		
		f.pack();
		f.setVisible(true);
	}
	

	public Dimension getPreferredSize()
	{
		return preferredSize;
	}
	
	PngPongTable()
	{
		//constructor
		PngPongGameEngine gameEngine = new PngPongGameEngine(this);
		
		addKeyListener(gameEngine);
		setFocusable(true);
		addMouseMotionListener(gameEngine);
		
		
	
	}
	
	void addPaneltoFrame(Container container)
	{
		//adds panels to frame- bottom label
		container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
		container.add(this);
		label = new JLabel("N for new game; S to serve; Q to quit.");
		container.add(label);
	}
	
	public void paintComponent(Graphics g)
	{
		//paints the board different colors depending on how many points are scored-enhancement
		if (colornumber == 1)
		{
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.fillRect(0, 0, TABLE_WIDTH,  TABLE_HEIGHT);
		
			g.setColor(Color.yellow);
			g.fillRect(KID_RACKET_X_START, kidRacket_Y, 5, 30);
		
			g.fillRect(ComputerRacket_X, ComputerRacket_Y, 5, 30);
		
			g.fillOval(ballx, bally, 10, 10);
		
			g.drawRect(10, 10, 400, 200);
		
			g.drawLine(210, 10, 210, 210);
		}
		else if(colornumber == 2)
		{
			super.paintComponent(g);
			g.setColor(Color.lightGray);
			g.fillRect(0, 0, TABLE_WIDTH,  TABLE_HEIGHT);
		
			g.setColor(Color.magenta);
			g.fillRect(KID_RACKET_X_START, kidRacket_Y, 5, 30);
			
			g.fillRect(ComputerRacket_X, ComputerRacket_Y, 5, 30);
		
			g.fillOval(ballx, bally, 10, 10);
		
			g.drawRect(10, 10, 400, 200);
		
			g.drawLine(210, 10, 210, 210);
		}
		else if(colornumber == 3)
		{
			super.paintComponent(g);
			g.setColor(Color.blue);
			g.fillRect(0, 0, TABLE_WIDTH,  TABLE_HEIGHT);
		
			g.setColor(Color.orange);
			g.fillRect(KID_RACKET_X_START, kidRacket_Y, 5, 30);
			
			g.fillRect(ComputerRacket_X, ComputerRacket_Y, 5, 30);
		
			g.fillOval(ballx, bally, 10, 10);
		
			g.drawRect(10, 10, 400, 200);
		
			g.drawLine(210, 10, 210, 210);
		}
		else if(colornumber == 4)
		{
			super.paintComponent(g);
			g.setColor(Color.cyan);
			g.fillRect(0, 0, TABLE_WIDTH,  TABLE_HEIGHT);
		
			g.setColor(Color.pink);
			g.fillRect(KID_RACKET_X_START, kidRacket_Y, 5, 30);
			
			g.fillRect(ComputerRacket_X, ComputerRacket_Y, 5, 30);
		
			g.fillOval(ballx, bally, 10, 10);
		
			g.drawRect(10, 10, 400, 200);
		
			g.drawLine(210, 10, 210, 210);
		}
		else if(colornumber == 5)
		{
			super.paintComponent(g);
			g.setColor(Color.black);
			g.fillRect(0, 0, TABLE_WIDTH,  TABLE_HEIGHT);
		
			g.setColor(Color.yellow);
			g.fillRect(KID_RACKET_X_START, kidRacket_Y, 5, 30);
			
			g.fillRect(ComputerRacket_X, ComputerRacket_Y, 5, 30);
		
			g.fillOval(ballx, bally, 10, 10);
		
			g.drawRect(10, 10, 400, 200);
		
			g.drawLine(210, 10, 210, 210);
		}
		else if(colornumber == 6)
		{
			super.paintComponent(g);
			g.setColor(Color.white);
			g.fillRect(0, 0, TABLE_WIDTH,  TABLE_HEIGHT);
		
			g.setColor(Color.black);
			g.fillRect(KID_RACKET_X_START, kidRacket_Y, 5, 30);
			
			g.fillRect(ComputerRacket_X, ComputerRacket_Y, 5, 30);
		
			g.fillOval(ballx, bally, 10, 10);
		
			g.drawRect(10, 10, 400, 200);
		
			g.drawLine(210, 10, 210, 210);
		}
		else if(colornumber == 7)
		{
			super.paintComponent(g);
			g.setColor(Color.black);
			g.fillRect(0, 0, TABLE_WIDTH,  TABLE_HEIGHT);
		
			g.setColor(Color.white);
			g.fillRect(KID_RACKET_X_START, kidRacket_Y, 5, 30);
			
			g.fillRect(ComputerRacket_X, ComputerRacket_Y, 5, 30);
		
			g.fillOval(ballx, bally, 10, 10);
		
			g.drawRect(10, 10, 400, 200);
		
			g.drawLine(210, 10, 210, 210);
		}
		if (colornumber == 8)
		{
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.fillRect(0, 0, TABLE_WIDTH,  TABLE_HEIGHT);
		
			g.setColor(Color.yellow);
			g.fillRect(KID_RACKET_X_START, kidRacket_Y, 5, 30);
			
			g.fillRect(ComputerRacket_X, ComputerRacket_Y, 5, 30);
		
			g.fillOval(ballx, bally, 10, 10);
		
			g.drawRect(10, 10, 400, 200);
		
			g.drawLine(210, 10, 210, 210);
		}
		else if(colornumber == 9)
		{
			super.paintComponent(g);
			g.setColor(Color.lightGray);
			g.fillRect(0, 0, TABLE_WIDTH,  TABLE_HEIGHT);
		
			g.setColor(Color.magenta);
			g.fillRect(KID_RACKET_X_START, kidRacket_Y, 5, 30);
			
			g.fillRect(ComputerRacket_X, ComputerRacket_Y, 5, 30);
		
			g.fillOval(ballx, bally, 10, 10);
		
			g.drawRect(10, 10, 400, 200);
		
			g.drawLine(210, 10, 210, 210);
		}
		else if(colornumber == 10)
		{
			super.paintComponent(g);
			g.setColor(Color.blue);
			g.fillRect(0, 0, TABLE_WIDTH,  TABLE_HEIGHT);
		
			g.setColor(Color.orange);
			g.fillRect(KID_RACKET_X_START, kidRacket_Y, 5, 30);
			
			g.fillRect(ComputerRacket_X, ComputerRacket_Y, 5, 30);
		
			g.fillOval(ballx, bally, 10, 10);
		
			g.drawRect(10, 10, 400, 200);
		
			g.drawLine(210, 10, 210, 210);
		}
		else if(colornumber == 11)
		{
			super.paintComponent(g);
			g.setColor(Color.cyan);
			g.fillRect(0, 0, TABLE_WIDTH,  TABLE_HEIGHT);
		
			g.setColor(Color.pink);
			g.fillRect(KID_RACKET_X_START, kidRacket_Y, 5, 30);
			
			g.fillRect(ComputerRacket_X, ComputerRacket_Y, 5, 30);
		
			g.fillOval(ballx, bally, 10, 10);
		
			g.drawRect(10, 10, 400, 200);
		
			g.drawLine(210, 10, 210, 210);
		}
		else if(colornumber == 12)
		{
			super.paintComponent(g);
			g.setColor(Color.black);
			g.fillRect(0, 0, TABLE_WIDTH,  TABLE_HEIGHT);
		
			g.setColor(Color.yellow);
			g.fillRect(KID_RACKET_X_START, kidRacket_Y, 5, 30);
			
			g.fillRect(ComputerRacket_X, ComputerRacket_Y, 5, 30);
		
			g.fillOval(ballx, bally, 10, 10);
		
			g.drawRect(10, 10, 400, 200);
		
			g.drawLine(210, 10, 210, 210);
		}
		else if(colornumber == 13)
		{
			super.paintComponent(g);
			g.setColor(Color.white);
			g.fillRect(0, 0, TABLE_WIDTH,  TABLE_HEIGHT);
		
			g.setColor(Color.black);
			g.fillRect(KID_RACKET_X_START, kidRacket_Y, 5, 30);
			
			g.fillRect(ComputerRacket_X, ComputerRacket_Y, 5, 30);
		
			g.fillOval(ballx, bally, 10, 10);
		
			g.drawRect(10, 10, 400, 200);
		
			g.drawLine(210, 10, 210, 210);
		}
		else if(colornumber == 14)
		{
			super.paintComponent(g);
			g.setColor(Color.black);
			g.fillRect(0, 0, TABLE_WIDTH,  TABLE_HEIGHT);
		
			g.setColor(Color.white);
			g.fillRect(KID_RACKET_X_START, kidRacket_Y, 5, 30);
			
			g.fillRect(ComputerRacket_X, ComputerRacket_Y, 5, 30);
		
			g.fillOval(ballx, bally, 10, 10);
		
			g.drawRect(10, 10, 400, 200);
		
			g.drawLine(210, 10, 210, 210);
		}
		
	}
	//all these methods are to edit things in this class from the engine
	public void setLabel (String x)
	{
		label.setText(x);
	}
	
	public void setKidRacket_Y(int yCoordinate)
	{
		this.kidRacket_Y = yCoordinate;
	}
	
	public int getKidRacket_Y(int yCoordinate)
	{
		return kidRacket_Y;
	}
	
	public void setComputerRacket_Y(int yCoordinate)
	{
		this.ComputerRacket_Y = yCoordinate;
	}
	
	public int getComputerRacket_Y(int yCoordinate)
	{
		return ComputerRacket_Y;
	}
	
	public void setBallx(int xCoordinate)
	{
		this.ballx = xCoordinate;
	}
	
	public int getBallx(int xCoordinate)
	{
		return ballx;
	}
	
	public void setBally(int yCoordinate)
	{
		this.bally = yCoordinate;
	}
	
	public int getBally(int yCoordinate)
	{
		return bally;
	}
	
	public void setColorNumber(int x)
	{
		colornumber = x;
	}
}