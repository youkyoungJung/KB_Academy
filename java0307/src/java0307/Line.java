package java0307;

public class Line extends Shape {

	private int x2;
	private int y2;

	public Line(int x, int y, int x2, int y2) {
		super(x,y);
		this.x2 = x2;
		this.y2 = y2;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}

	@Override
	public String toString() {
		return super.toString() + ", x2=" + x2 + ", y2=" + y2;
	}
	
	//컴파일시에 검사하세요. 의미
	//@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("선그리기");
	}

}
