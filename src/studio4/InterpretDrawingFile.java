package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//
import javax.swing.JFileChooser;
//import javax.swing.SwingUtilities;
//
import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String shape = in.next();
		int r = in.nextInt();
		int g = in.nextInt();
		int b = in.nextInt();
		boolean status = in.nextBoolean();
		double x = in.nextDouble();
		double y = in.nextDouble();
		double xdist = in.nextDouble();
		double ydist = in.nextDouble();
		
	    Color color = new Color(r, g, b);
		StdDraw.setPenColor(color);
		
		if (shape.equals("rectangle"))
		{
			if (status == true)
			{
				StdDraw.filledRectangle(x, y, xdist, ydist);
			}
			else
			{
				StdDraw.rectangle(x, y, xdist, ydist);
			}
		}
			
		if (shape.equals("ellipse"))
			if (status == true)
			{
				StdDraw.filledEllipse(x, y, xdist, ydist);
			}
			else
			{
				StdDraw.ellipse(x, y, xdist, ydist);
			}
		
		if (shape.equals("triangle"))
		{
			double p1 = in.nextDouble();
			double p2 = in.nextDouble();
			
			double [] xarray = {x,xdist, p1};
			double [] yarray = {y,ydist, p2};
			if (status == true)
			{
				StdDraw.filledPolygon(xarray, yarray);
			}
			else
			{
				StdDraw.polygon(xarray,yarray);
			}
		}
		
		
		
		

		
	}
}
