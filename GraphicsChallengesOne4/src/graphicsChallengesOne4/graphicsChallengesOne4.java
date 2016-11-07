package graphicsChallengesOne4;
import java.awt.*;
import javax.swing.*;
public class graphicsChallengesOne4 extends Canvas 
	{
	private static final long	serialVersionUID	= 1L;
 
    	public static void main(String[] args) 
    		{
	        graphicsChallengesOne4 canvas = new graphicsChallengesOne4();
	        JFrame frame = new JFrame();
	        frame.setSize(1000, 1000);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().add(canvas).setBackground(Color.white);
	        frame.setLocationRelativeTo(null);
	        frame.setResizable(false);
	        frame.setVisible(true);
    		}
 
    	public void paint(Graphics graphics) 
    		{
    			
	
	        graphics.setColor(Color.blue);
	        graphics.drawRect(700,600,200,200);
	        
	        graphics.setColor(Color.yellow);
	        graphics.fillRect(701, 601, 199, 199);
	        
    		}
    	
    		public void delay()
    			{
    	        try
    					{
    					Thread.sleep(50);
    					} catch (InterruptedException e)
    					{
    					e.printStackTrace();
    					}
    			}
    	}
