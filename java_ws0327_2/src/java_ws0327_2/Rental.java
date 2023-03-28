package java_ws0327_2;

public class Rental {
	int num;
	//String author;
	String title;
	int price;
	boolean state;
	
	public Rental() {
	}
	public Rental(int num, String title, int price, boolean state) {
		this.num = num;
		this.title = title;
		this.price = price;
		this.state = state;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "num=" + num + ", title=" + title + ", price=" + price + ", state=" + state +" ,";
	}

	

}
