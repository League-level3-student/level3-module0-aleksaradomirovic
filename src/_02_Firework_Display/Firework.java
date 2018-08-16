package _02_Firework_Display;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

/*
 * 
 * You can think of a fire work as an array of sparks. Run the demo jar to see the finished product
 * then complete the steps. 
 *
 */

public class Firework{
	Random r = new Random();
	public static final int GRAVITY = 1;
	
	//1. Create an array of Spark objects called sparks. Don't initialize it.
	Spark[] sparks;
	public boolean dead = false;
	
	public Firework() {
		//2. Initialize the Spark array to contain 100 Sparks. 
		sparks = new Spark[100];
		
		//3. Iterate through the sparks and initialize each one to a new Spark.
		//   Make each spark start at the middle bottom of the screen.
		for(int i = 0; i < sparks.length; i++) {
			sparks[i] = new Spark(400, 600);
		}
	
	}
	
	public void launch() {
		for(int i = 0; i < sparks.length; i++) {
			sparks[i].x = 400;
			sparks[i].y = 600;
		}
	}
	
	public void updateSparks() {
		//8. Uncomment this code. See if you can understand what it is doing.
		
		for(int i = 0; i < sparks.length; i++) {

			//this changes position based on velocity, and changes velocity based on gravity.
			Spark s = sparks[i];
			s.x += s.xVelocity;
			s.y += s.yVelocity;
			s.yVelocity += GRAVITY;
			
			//initially randomizes scatter
			if(s.yVelocity >= 0 && !s.fire) {
				s.xVelocity = r.nextInt(40) - 20;
				s.yVelocity += -r.nextInt(10) - 5;
				s.size = r.nextInt(7) + 2;
				s.fire = true;
			}
			
			if(s.y >= FireworkDisplay.HEIGHT) {
				s.dead = true;
			}
		}
		
		for(int i = 0; i < sparks.length; i++) {
			if(!sparks[i].dead) {
				dead = false;
				break;
			}
			dead = true;
		}
	}
	
	public void drawSparks(Graphics g) {
		for(int i = 0; i < sparks.length; i++) {
			Spark s = sparks[i];
			g.setColor(s.color);
			g.fillOval(s.x, s.y, 5, 5);
		}
	}
}
