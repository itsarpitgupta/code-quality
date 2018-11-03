package org.arpitjava.com.exp2;

public class LineStyleDecorator extends ShapeDecorator {

	public LineStyle lineStyle;
	
	public LineStyleDecorator(Shape shape, LineStyle lineStyle) {
		super(shape);
		this.lineStyle = lineStyle;
	}
	
	public void draw() {
		super.draw();
		addLineStyle();
	}

	private void addLineStyle() {
		System.out.println("LineStyle"+lineStyle);
	}
	

}
