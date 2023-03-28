package java_ws0327_2;

public class Video extends Rental{
	String publisher;
	int runningTime;
	
	public Video() {
	}
	public Video(int num, String publisher, String title, int runningTime, int price, boolean state) {
		super(num, title, price, state);
		this.runningTime = runningTime;
		this.publisher = publisher;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getRunningTime() {
		return runningTime;
	}
	public void setRunningTime(int runningTime) {
		this.runningTime = runningTime;
	}
	@Override
	public String toString() {
		return super.toString()+"publisher=" + publisher + ", runningTime=" + runningTime;
	}
	
	
}
