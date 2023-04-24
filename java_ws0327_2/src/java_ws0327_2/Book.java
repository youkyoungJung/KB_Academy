package java_ws0327_2;

public class Book extends Rental{
	String author;
	int page;
	
	public Book() {
	}
	
	public Book(int num, String author, String title, int page, int price, boolean state) {
		super(num, title, price, state);
		this.author = author;
		this.page = page;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	@Override
	public String toString() {
		return super.toString() +"author=" + author + ", page=" + page;
	}

	public void remove() {
		// TODO Auto-generated method stub
		
	}
	
	
}
