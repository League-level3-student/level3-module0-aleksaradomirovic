package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.text.GapContent;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		boolean raceFinished = false;
		Random rnd = new Random();
		//2. create an array of 5 robots.
		Robot[] robotArmy = new Robot[5];
				//3. use a for loop to initialize the robots.
		for(int i = 0; i < robotArmy.length; i++) {
			robotArmy[i] = new Robot();
			//4. make each robot start at the bottom of the screen, side by side, facing up
			robotArmy[i].setX(100+i*100);
			robotArmy[i].setY(500);
			robotArmy[i].setAngle(0);
			robotArmy[i].setSpeed(10);
		}
					
			
				//5. use another for loop to iterate through the array and make each robot move 
			    //   a random amount less than 50.
		    	
				//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
		while(!raceFinished) {
			for(int i = 0; i < robotArmy.length; i++) {
				robotArmy[i].move(rnd.nextInt(50));
			}
			for(int i = 0; i < robotArmy.length; i++) {
				if(robotArmy[i].getY() < 25) {
					raceFinished = true;
				}
			}
		}
		int winner = 0;
		for(int i = 0; i < robotArmy.length; i++) {
			if(robotArmy[i].getY() < robotArmy[winner].getY()) {
				winner = i;
			}
		}
		
		JOptionPane.showMessageDialog(null, "RACE FINISHED\n 1st place: Robot "+winner+"!");
		    	
				//8. try different races with different amounts of robots.
		    	
			    //9. make the robots race around a circular track.
		//told to skip 8 & 9
	}
}
