package org.arpitjava.com.exp2;

public class FillColorDecorator extends ShapeDecorator {

	public Color color;

	public FillColorDecorator(Shape shape, Color color) {
		super(shape);
		this.color = color;
	}

	public void draw() {
		super.draw();
		addColor();
	}

	private void addColor() {
		System.out.println(color);
	}

}
