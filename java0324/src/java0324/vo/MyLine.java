package java0324.vo;

public class MyLine extends MyShape{

	private int x2;
	private int y2;

	public MyLine() {	}

	public MyLine(int x1, int y1, int x2, int y2) {
		super(x1, y1);
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
		return "MyLine [x2=" + x2 + ", y2=" + y2 + "]";
	}
	

}
