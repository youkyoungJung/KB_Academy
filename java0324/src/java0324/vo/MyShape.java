package java0324.vo;

public class MyShape {

	private int i, j;
	
	public MyShape() {}
	
	public MyShape(int i, int j) {
		this.i = i;
		this.j = j;
	}

	public int getX() {
		return i;
	}

	public void setX(int i) {
		this.i = i;
	}

	public int getY() {
		return j;
	}

	public void setY(int j) {
		this.j = j;
	}

	@Override
	public String toString() {
		return "i=" + i + ", j=" + j;
	}
	

}
