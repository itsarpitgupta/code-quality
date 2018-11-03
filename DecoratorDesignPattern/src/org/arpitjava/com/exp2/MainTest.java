package org.arpitjava.com.exp2;

public class MainTest {

	public static void main(String[] args) {
		Shape circle = new Circle();
		
		
		Shape coloredWithLineStyle = new LineStyleDecorator(new FillColorDecorator(circle, Color.BLUE), LineStyle.DOTED);
		coloredWithLineStyle.draw();
		
	}
}
