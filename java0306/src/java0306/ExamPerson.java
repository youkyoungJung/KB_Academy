package java0306;

public class ExamPerson {

	public static void main(String[] args) {
//		Person p = new Person();//오른쪽이 먼저 실행 후 p 에 저장
//		p.name = "홍길동";
//		p.age = 30;
//		p.printInfo();
//		//System.out.println(p.name+"의 나이는 "+p.age);                                                                                                                                 
		
		Person p2 = new Person();//오른쪽이 먼저 실행 후 p 에 저장
		p2.setName("김길동");
		p2.setAge(32);
		p2.printInfo();
		System.out.println(p2.getName()+"의 나이는 "+p2.getAge());                                                                                                                                 
		
		
	}

}
