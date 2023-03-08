package java0308;

public class Circle extends Shape
{

	private int r;

	public Circle(int x, int y, int r) {
		super(x,y);
		this.r = r;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	@Override
	public String toString() {
		return super.toString()+" ,r=" + r;
	}
	

}
