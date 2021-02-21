package week2.randomcircles;

import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class RandomCircles extends GraphicsProgram {

	public void run() {
		
		// to add the object circle on to GCanvas 10 times
			for(int i=0;i<10;i++) {
				GOval circle = createRandomCircle();
				add (circle);
			}
	}
	
	private  GOval createRandomCircle() {
		
			RandomGenerator rgen = RandomGenerator.getInstance(); 
			
			/*to get random coordinates not going beyond canvas width and height.Also 
			 the maximum radius of circle 50 pixels is considered so that
			 entire circle fit inside the canvas without extending past the edge*/
			
			double posX = (double)rgen.nextDouble(50,(getWidth()-50));
			double posY = (double)rgen.nextDouble(50,(getHeight()-50));
			
			//to get random radius between 5 and 50 pixels
			double radius = (double)rgen.nextDouble(5.0,50.0);
			
			//to get random colors getting random integer values between 0 & 255 for r,g,b values
			Color randomColor= new Color(rgen.nextInt(0,255),rgen.nextInt(0,255),rgen.nextInt(0,255)) ;
			
			//creating and returning the circle object
			GOval circles = new GOval(posX,posY,radius,radius);
			circles.setFilled(true);
			circles.setColor(randomColor);
			return circles;
	}
		
}