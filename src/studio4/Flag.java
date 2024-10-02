package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag 
{
	public static void main(String[] args) 
	{
		
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledRectangle(0.5,0.5,0.1,0.3);
		
		StdDraw.setPenColor(Color.GREEN);
		StdDraw.filledRectangle(.3, 0.5, 0.1, 0.3);
		
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledRectangle(.7, 0.5, 0.1, 0.3);
		
		double[] x = {0.5, 0.525, 0.475};
	    double[] y = {0.525,0.475,0.475};
	    StdDraw.filledPolygon(x, y);
		
		
		
		
	}
}