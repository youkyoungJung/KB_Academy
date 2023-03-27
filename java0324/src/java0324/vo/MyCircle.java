package java0324.vo;

public class MyCircle extends MyShape{

	private int r;

	public MyCircle(int x1, int y1, int r) {
		super(x1, y1);
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
		return super.toString() + "MyCircle [r=" + r + "]";
	}
	

}
