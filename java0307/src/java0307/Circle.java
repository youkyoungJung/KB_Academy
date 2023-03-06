package java0307;

public class Circle extends Shape {
	private int radius;

	public Circle(int x2, int y2, int radius) {
		super(x2,y2);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return super.toString() + ", radius="+ radius;
	}

	@Override
	public void draw() {
		System.out.println("원그리기");
	}

	

}
