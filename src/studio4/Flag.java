package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(Color.GREEN);
		StdDraw.filledRectangle(0.15, 0.5, 0.15, 0.5);
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledRectangle(0.45, 0.5, 0.15, 0.5);
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledRectangle(0.75, 0.5, 0.15, 0.5);
	}
}