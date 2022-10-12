package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

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
		int red = in.nextInt();
		int green = in.nextInt();
		int blue = in.nextInt();
		boolean isFilled=in.nextBoolean();
		if(shape.equals("rectangle")) {
			double x=in.nextDouble();
			double y=in.nextDouble();
			double halfWidths=in.nextDouble();
			double halfHeight=in.nextDouble();
			StdDraw.setPenColor(red, green, blue);
			if (isFilled) {
				
				StdDraw.filledRectangle(x,y,halfWidths,halfHeight);
			}
			else {
				StdDraw.rectangle(x,y,halfWidths,halfHeight);
			}
		}
		else if(shape.equals("ellipse")) {
			double x=in.nextDouble();
			double y=in.nextDouble();
			double halfWidths=in.nextDouble();
			double halfHeight=in.nextDouble();
			StdDraw.setPenColor(red, green, blue);
			if (isFilled) {
				
				StdDraw.filledEllipse(x,y,halfWidths,halfHeight);
			}
			else {
				StdDraw.ellipse(x,y,halfWidths,halfHeight);
			}
		}
		else if(shape.equals("triangle")) {
			double[] x= new double[3];
			double[] y=new double [3];
			x[0]=in.nextDouble();
			y[0]=in.nextDouble();
			x[1]=in.nextDouble();
			y[1]=in.nextDouble();
			x[2]=in.nextDouble();
			y[2]=in.nextDouble();
			StdDraw.setPenColor(red, green, blue);
			if (isFilled) {
				
				StdDraw.filledPolygon(x,y);
			}
			else {
				StdDraw.polygon(x,y);
			}
		}
		
	}
}
