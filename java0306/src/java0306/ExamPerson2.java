package java0306;

public class ExamPerson2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		p1.setName("홍길동");
		p1.setAge(30);
		p1.printInfo();
//		System.out.println(p1);
//		System.out.println(p1.getName()+"의 나이는 "+p1.getAge());
		
		Person p2 = new Person();
		p2.setAge(32);
		p2.setName("김길동");
		System.out.println(p2);
		System.out.println(p2.toString());
		
	}

}
