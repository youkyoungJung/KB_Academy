package java0307;

public class ExamInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		S s1 = new S("홍",20,"컴공");
		
//		s1.name = "홍";
//		s1.age = 20;
//		s1.jeongong = "캄겅";
		System.out.println(s1);
	}

}//end class

class P{
	private String name;
	private int age; //같은 클래스 내에서만 접근 가능
	//protected : 상속관계에서는 접근이 가능함.
	public P(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	public String toString() {
		return name + "," +age;
	}
	
}
class S extends P{
	String jeongong;
	
	public S(String name, int age, String jeongong) {
		super(name, age);
		this.jeongong = jeongong;
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+jeongong;
	}
}
