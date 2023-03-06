package java0307;

public class Student extends Person{

	private String jeongong;
	
	public Student(String name, int age, String jeongong) {
		super(name, age);
		this.jeongong = jeongong;
	}
	public String getJeongong() {
		return jeongong;
	}
	public void setJeongong(String jeongong) {
		this.jeongong = jeongong;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+ ",jengong="+jeongong;
	}

}
